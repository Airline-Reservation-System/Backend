
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-welcome-passenger',
  templateUrl: './welcome-passenger.component.html',
  styleUrls: ['./welcome-passenger.component.css']
})
export class WelcomePassengerComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit(): void {
  }
  

  viewScheduledFlight(): void{
    this.router.navigate(['scheduledFlight/show']);
  }

  searchScheduledFlight(): void{
      this.router.navigate(['scheduledFlight/search']);
  }

  
  viewFlight(): void{
    this.router.navigate(['flights']);
  }

  
  viewAirport(): void{
    this.router.navigate(['airports']);
  }
  createBooking(): void{
    this.router.navigate(['addBooking']);
  }
  updateBooking(): void{
    this.router.navigate(['bookings']);
  }
  deleteBooking():void{
    this.router.navigate(['bookings']);
  }
  getBooking():void{
    this.router.navigate(['bookings']);
  }
  
}