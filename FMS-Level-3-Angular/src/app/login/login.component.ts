import { Component, OnInit } from '@angular/core';
// import { FormControl, FormGroup, NgForm } from '@angular/forms';

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
  check:Boolean=false
  constructor(public loginSer:LoginService,public router:Router) { }

  ngOnInit(): void {
  
  }

  
  checkUser(userInfo:any){
    console.log(userInfo)
   let user = userInfo.username;
   let pass = userInfo.password;
   let type = userInfo.typeofuser;
 
   this.loginSer.loadProductDetails().subscribe(data=>{
     this.user=data;
    
     for(let var1 of this.user)
     {

       if(var1.userName==user && var1.userPassword==pass && var1.userType==type)
       {
        this.check=true
        break
        
      
        }
        
     }
     if(this.check)
     {
       sessionStorage.setItem('username',user)
       sessionStorage.setItem('typeofuser',type)
       if(type==="admin")
       {
        this.router.navigate(["welcomeAdmin"]);
       }
       else
       {
        this.router.navigate(["welcomePassenger"]);
       }
      
     } 
     else
     {
       alert("Username or password not valid")
     }
   }); 

  }
  
  signuplink()
  {
    this.router.navigate(["signup"]);
  }
}

