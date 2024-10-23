import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { MyHomeComponent } from './shared/my-home/my-home.component';
import { MySigninComponent } from './shared/my-signin/my-signin.component';
import { MyNoticiaComponent } from './shared/my-noticia/my-noticia.component';
import { MyCategoriaComponent } from './shared/my-categoria/my-categoria.component';

const routes: Routes = [
  {
    path: '', component: MyHomeComponent,
  },
  {
    path: 'signin', component: MySigninComponent
  },
  {
    path: 'noticias', component: MyNoticiaComponent
  },
  {
    path: 'categoria', component: MyCategoriaComponent
  },
]

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
