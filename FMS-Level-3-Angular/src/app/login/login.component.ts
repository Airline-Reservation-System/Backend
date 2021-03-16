import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, NgForm } from '@angular/forms';

import { Router } from '@angular/router';
import { Login } from '../login';
import { LoginService } from '../login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  user:Array<Login>=[]
  
  constructor(public loginSer:LoginService,public router:Router) { }

  ngOnInit(): void {
    
  }

  
  checkUser(userInfo:any){
   let user = userInfo.username;
   let pass = userInfo.password;
   let type = userInfo.typeofuser;
   console.log(userInfo);
   if(type==="admin")
   {
     this.router.navigate(["welcomeAdmin"])
   }
   /*this.loginSer.loadProductDetails(userInfo).subscribe(data=>{
     this.user=data;
     for(let var1 of this.user)
     {
       if(var1.username==user && var1.password==pass && var1.typeofuser==type)
       {
         this.router.navigate(["passenger"]);
       }else{
        alert("Invalid Username or Password") 
       }
     } 
   }); */

  }
  

}

