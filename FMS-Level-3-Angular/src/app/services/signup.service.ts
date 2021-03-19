import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class SignupService {
  constructor(public httpClient:HttpClient) { }
  storeUsersInfo(userRef:any):Observable<string>{
    return this.httpClient.post("http://localhost:9092/users/createUser",userRef,{responseType:'text'})
  }
}