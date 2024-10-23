import { HttpErrorResponse, HttpEvent, HttpHandler, HttpInterceptor, HttpRequest } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { MessageService } from 'primeng/api';
import { Observable, catchError, map, throwError } from 'rxjs';
import { AuthService } from './auth.service';

@Injectable({
  providedIn: 'root'
})
export class TokenInterceptorService implements HttpInterceptor {

  constructor(private router: Router,
    private authService: AuthService,
    private messageService: MessageService) { }

  intercept(req: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {
    console.log(`AddTOkenInterceptor - ${req.url}`);

    let jsonReq: HttpRequest<any> = req.clone({
      setHeaders: {
        Authorization:  req.url === "http://localhost:9595/auth/authenticate" ? `${localStorage.getItem("token")}` : `Bearer ${localStorage.getItem("token")}` ,
      
      }
    });

    return next.handle(jsonReq)
      .pipe(
        map(res => {
          //console.log("------------##### Se esta usando el interceptor");
          return res
        }),
        catchError((error: HttpErrorResponse) => {
          let errorMsg = '';
          if (error.error instanceof ErrorEvent) {
            console.log('This is client side error');
            errorMsg = `Error: ${error.error.message}`;
            this.messageService.add({ severity: 'warn', summary: 'Registro', detail: `Error: ${error.error.message}` });
          } else {
            console.log('This is server side error');
            errorMsg = `Error Code: ${error.status},  Message: ${error.message}`;

            if (error.status === 500) {
              console.log('El registro  ya existe y no se puede crear')
              this.messageService.add({ severity: 'warn', summary: 'Registro', detail: `Server Error., ${error.statusText} ` });

              //  alert("EL documento ya existe y puede estar asociado")
            } else if (error.status === 404) {
              console.log('Error page not  found')

            }

            else if (error.status === 401) {
              this.messageService.add({ severity: 'warn', summary: 'Registro', detail: `Su sesion ha terminado., ${error.statusText} ` });

              this.router.navigate(['/', 'signin'])
                .then(() => {
                  this.authService.localSignOut();

                  window.location.reload();
                });
            }


          }
          console.log(errorMsg);
          return throwError(errorMsg);
        })
      )
  }

}