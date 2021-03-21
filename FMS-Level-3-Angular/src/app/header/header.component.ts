import {Component, OnInit} from '@angular/core';
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
