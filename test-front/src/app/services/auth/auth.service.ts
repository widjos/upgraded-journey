import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, catchError, shareReplay, take, tap, throwError } from 'rxjs';

import { Route } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  documentoGarantiaRootUrl: string = "http://localhost:9595" + '/auth';
  constructor(private http: HttpClient,
   ) { }

  consumirPost(url: string, parametro: any) {
    let httpOptions = {
      headers: new HttpHeaders(
        { 'Content-Type': 'application/json' },
       
      )
    };
   
    
    return this.http.post<any>(this.documentoGarantiaRootUrl + url, parametro, httpOptions)
  }

  onSignIn(dto:any){
    return this.consumirPost('/authenticate',dto)
      .pipe(
         tap(res => this.setSession),
         shareReplay()
         
      )

  }


  saveToken(token:any){
    localStorage.setItem('token', token);
  }

  isLogIn(): boolean {
    if(localStorage.getItem('token'))
      return true;
    return false;
  }

  localSignOut(){
    localStorage.clear()
  }

  private setSession(autHResult:any){
    localStorage.setItem('id_token',autHResult.sub)
  }


}
