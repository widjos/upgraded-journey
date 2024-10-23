import { Component } from '@angular/core';
import { NoticiaService } from '../../services/noticia/noticia.service';

@Component({
  selector: 'app-my-noticia',
  templateUrl: './my-noticia.component.html',
  styleUrl: './my-noticia.component.css'
})
export class MyNoticiaComponent {

  constructor(private noticiaServicio:NoticiaService){}

  loadingData:Boolean = true;
  listaPost:any =  [];

  ngOnInit(){
    this.onLoadNoticias()
   
  }

  onLoadNoticias(){
    //Cargar los registros del log que exiten
    this.listaPost = [];
    this.loadingData = true;
    this.noticiaServicio.getManyNoticias({
      "noticia": "Dog"
    }).subscribe({
      next: (res) => {
        if(res){
          this.listaPost= res
          console.log(this.listaPost)
          this.loadingData = false;
        }
      },
      error: (err) => { 
        console.log("ERROR",  err)
      },
      complete: () => {
        this.loadingData = false;
      }
    })
  }

}
