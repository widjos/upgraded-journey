import { Component } from '@angular/core';
import { AuthService } from './services/auth/auth.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'noticias-front';
  
  constructor(private auth:AuthService){}


  logOut(){
    this.auth.localSignOut()
    console.log('Log out succesful')
  }

  isLogIn(): boolean{
    return this.auth.isLogIn()

  }
}
