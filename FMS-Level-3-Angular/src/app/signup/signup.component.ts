import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { SignupService } from '../services/signup.service';
@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {
  usersInfo = new FormGroup({
    userId:new FormControl(),
    userName:new FormControl(),
    userPassword: new FormControl(),
    userEmail:new FormControl(),
    userPhone:new FormControl(),
    userType:new FormControl()
   
    
  })
  msg:string="";
  constructor(public signupService:SignupService,public router:Router) { }
  ngOnInit(): void {
  }
  storeUsersDetails(){
    let userRef=this.usersInfo.value
    console.log(userRef)
    
    this.signupService.storeUsersInfo(userRef).subscribe(result=>this.msg=result)
    
    this.router.navigate(['/login']);
  }
  }