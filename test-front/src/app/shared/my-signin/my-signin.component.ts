import { Component } from '@angular/core';
import { MessageService } from 'primeng/api';
import { Router } from '@angular/router'
import { AuthService } from '../../services/auth/auth.service';

@Component({
  selector: 'app-my-signin',
  templateUrl: './my-signin.component.html',
  styleUrl: './my-signin.component.css'
})
export class MySigninComponent {

  credentials: any = {}

  constructor(
    private authService: AuthService,
    private messageService: MessageService,
    private router:Router,

    ){}

    

    signUp(){
      let formularioAuth: any = document.getElementById('signinForm');
        if (formularioAuth.reportValidity()) {       
            this.authService.onSignIn(this.credentials).
            subscribe(
              {
                next: (e) =>  {
                 
         
                  this.messageService.add({ severity: 'success', summary: 'Credenciales validas puede ingresar' });
                  this.authService.saveToken(e.jwt)
                  this.router.navigate(['/', 'noticias'])
                },
                error: (error) => {
                  console.log(error.status)
                                 
                  this.messageService.add({ severity: 'error',  summary: 'Error', detail: "Credenciales invalidas." });
                  
                  
                }
              }
            )
  
  
       
        }
      
  
    }

}
