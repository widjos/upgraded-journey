import { Component, Input } from '@angular/core';
import { AuthService } from '../../services/auth/auth.service';


@Component({
  selector: 'app-my-nabvar',
  templateUrl: './my-nabvar.component.html',
  styleUrl: './my-nabvar.component.css'
})
export class MyNabvarComponent {
  @Input()
  isLoggedIn: boolean = false;

  constructor(private auth:AuthService){}

  logOut(){
    this.auth.localSignOut()
  }

}
