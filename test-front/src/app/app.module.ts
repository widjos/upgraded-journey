import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';

import { TokenInterceptorService } from './services/auth/token-interceptor.service';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MyHomeComponent } from './shared/my-home/my-home.component';
import { MyNabvarComponent } from './shared/my-nabvar/my-nabvar.component';
import { MyFooterComponent } from './shared/my-footer/my-footer.component';
import { MySigninComponent } from './shared/my-signin/my-signin.component';

import { DataViewModule } from 'primeng/dataview';
import { CardModule } from 'primeng/card';
import { ButtonModule } from 'primeng/button';
import { ToastModule } from 'primeng/toast';
import { ConfirmDialogModule } from 'primeng/confirmdialog';
import { ConfirmationService, MessageService } from 'primeng/api';
import { HTTP_INTERCEPTORS, HttpClient, HttpClientModule } from '@angular/common/http';
import { MyNoticiaComponent } from './shared/my-noticia/my-noticia.component';
import { MyCategoriaComponent } from './shared/my-categoria/my-categoria.component';


@NgModule({
  declarations: [
    AppComponent,
    MyHomeComponent,
    MyNabvarComponent,
    MyFooterComponent,
    MySigninComponent,
    MyNoticiaComponent,
    MyCategoriaComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ButtonModule,
    FormsModule,
    ToastModule,
    HttpClientModule,
    ConfirmDialogModule,
    CardModule,
    DataViewModule
  ],
  providers: [
    ConfirmationService, 
    MessageService, 
    HttpClient, 
    { provide: HTTP_INTERCEPTORS, useClass: TokenInterceptorService, multi: true }
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
