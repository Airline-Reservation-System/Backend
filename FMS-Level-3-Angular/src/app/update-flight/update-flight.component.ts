import { Component, OnInit } from '@angular/core';
import { Flight } from '../model/flight.component';
import { ActivatedRoute, Router } from '@angular/router';
import { FlightService } from '../services/flight.service';
import { Airport } from '../model/airport.component';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-update-flight',
  templateUrl: './update-flight.component.html',
  styleUrls: ['./update-flight.component.css']
})
export class UpdateFlightComponent implements OnInit {
  flights: Observable<Flight[]>;
  flightNo: number;
  flight: Flight;
  constructor(private route: ActivatedRoute,private router: Router,
    private flightService: FlightService) { }

  ngOnInit(){
    this.reloadData();
    this.flight=new Flight();
    this.flightNo=this.route.snapshot.params['flightNo'];
    this.flightService.viewFlight(this.flightNo)
      .subscribe(data => {
        console.log(data)
        this.reloadData();
        this.flight = data;
      }, error => console.log(error));
  }
  reloadData()
  {
    this.flights=this.flightService.viewAllFlight();
  }

  modifyFlight() {
    this.flightService.modifyFlight(this.flightNo, this.flight)
      .subscribe(data =>{console.log(data) },  error => console.log(error));
    this.flight = new Flight();
    this.gotoList();
  }

  onSubmit() {
    
    this.modifyFlight();
  }

  gotoList() {
    this.router.navigate(['/flights']);
  }
}

