import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Login } from '../login';
import { HttpClient } from '@angular/common/http';
import { HttpParams } from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(public httpClient:HttpClient) { }

  loadProductDetails():Observable<Login[]>{
    
    return this.httpClient.get<Login[]>("http://localhost:9090/users/readAllUsers"); 
    
   
    
  }
 
}
