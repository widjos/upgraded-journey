import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, catchError, throwError } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class NoticiaService {

  agenciaRootUrl:string = "http://localhost:9595"  + "/noticia";

  constructor(private http: HttpClient) { }


  consumir(url:string, parametro:any):Observable<any>{
    let httpOptions = {
      headers : new HttpHeaders(
        {'Content-Type': 'application/json'}
      )
    };
    return this.http.post<any>(this.agenciaRootUrl+url, parametro, httpOptions).pipe(
      catchError((e)=> throwError( e))
    );
  }

  getManyNoticias(parametro:any){
    return this.consumir('/buscar',parametro);
  }
}
