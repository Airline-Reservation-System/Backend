import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class SignupService {
  constructor(public httpClient:HttpClient) { }
  storeUsersInfo(newUser:any):Observable<string>{
    console.log(newUser);
    return this.httpClient.post("http://localhost:9090/users/createUser",newUser,{responseType:'text'})
  }
}