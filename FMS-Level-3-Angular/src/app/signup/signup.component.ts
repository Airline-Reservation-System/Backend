import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup ,Validators} from '@angular/forms';
import { Router } from '@angular/router';
import { User } from '../model/user.component';

import { SignupService } from '../services/signup.service';
@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {
  usersInfo = new FormGroup({
    userId:new FormControl('', [Validators.required]),
    userName:new FormControl('', [Validators.required]),
    userPassword: new FormControl('', [Validators.required]),
    userEmail:new FormControl('', [ 
      Validators.required,
      Validators.pattern("[^ @]@[^ @]")]),
    userPhone:new FormControl('', [Validators.required]),
    userType:new FormControl('', [Validators.required])
   
    
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