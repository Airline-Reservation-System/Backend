import { Component, OnInit } from '@angular/core';
import { Flight } from '../model/flight.component';
import { FlightService } from '../services/flight.service';
import { Router } from '@angular/router';
import { FormControl, FormGroup, Validators } from '@angular/forms';
@Component({
  selector: 'app-create-flight',
  templateUrl: './create-flight.component.html',
  styleUrls: ['./create-flight.component.css']
})
export class CreateFlightComponent implements OnInit {
flight : Flight =new Flight();
carrierName:any=['Indigo','Divyam','AirIndia']
form =new FormGroup({carrierName:new FormControl('',Validators.required)});
get f()
{
  return this.form.controls;
}
submitted=false;
  constructor(private flightService: FlightService,
    private router: Router) { }

  ngOnInit(){
  }
  newFlight(): void{
    this.submitted=false;
    this.flight=new Flight();
  }
  save() {
    this.flightService.addFlight(this.flight)
      .subscribe(data => console.log(data), error => console.log(error));
    this.flight= new Flight();
    this.gotoList();
  }

  onSubmit() {
    this.submitted=true;
    this.save();
  }

  gotoList() {
    this.router.navigate(['/flights']);
  }
}

