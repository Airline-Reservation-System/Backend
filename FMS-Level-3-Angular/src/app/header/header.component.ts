import {Component, OnInit} from '@angular/core';
//import { AuthenticationService } from './_service/app.authenticationservice';
import { Router } from '@angular/router';
@Component({
    selector: 'app-header',
    templateUrl: './header.component.html',
    styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit{
     role:string=""
    buttonFlag:boolean;
    username:string;
    user:boolean;
    admin:boolean;

   
    constructor(public router:Router) { }

    ngOnInit(){
        // this.user=false;
        
        // this.admin=false;
        // if(sessionStorage.getItem('role')==='user'){
        //     this.user=true;
        // }else if(sessionStorage.getItem('role')==='admin'){
        //     this.admin=true;
        // }
        //  //this.buttonFlag=this.AuthenticationService.isUserLoggedIn();
        // this.username=sessionStorage.getItem('username');
        // if(this.username!=null)
        //     this.username=this.username.toUpperCase();
        this.role = this.readLocalStorageValue('typeofuser');
       
        
    }
    readLocalStorageValue(key) {
        return sessionStorage.getItem(key);
    }
    new()
    {
        if(this.role ==='admin')
        {
            this.router.navigate(["welcomeAdmin"]);
        }
        else if(this.role ==='passenger')
        {
            this.router.navigate(["welcomePassenger"]);
        }
        else
        {
            this.router.navigate(["home"]);
        }
    }
    logout()
    {   sessionStorage.clear()
        this.router.navigate(["login"]);
        this.ngOnInit();
    }
}
