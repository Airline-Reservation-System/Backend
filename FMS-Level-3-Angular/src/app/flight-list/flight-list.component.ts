import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Flight } from '../model/flight.component';
import { FlightService } from '../services/flight.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-flight-list',
  templateUrl: './flight-list.component.html',
  styleUrls: ['./flight-list.component.css']
})
export class FlightListComponent implements OnInit {
  flights:Observable<Flight[]>;
  constructor(private flightService: FlightService, private router: Router) { }
role:string=""
  ngOnInit(){
    this.reloadData();
    this.role = this.readLocalStorageValue('typeofuser');
  }
  reloadData()
  {
    this.flights=this.flightService.viewAllFlight();
    console.log(this.flights)
  }
  removeFlight(flightNo: number)
  {
    this.flightService.removeFlight(flightNo)
    .subscribe(
      data=>{
        console.log(data);
        this.reloadData();
      },
      error=> console.log(error));
  }
  flightDetails(flightNo:number)
  {
    this.router.navigate(['flightDetails',flightNo]);
  }
  modifyFlight(flightNo: number)
  {
    this.router.navigate(['updateFlight',flightNo]);
  }
  readLocalStorageValue(key) {
    return sessionStorage.getItem(key);
}
}
