import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { PassengerDashboardComponent } from './passenger-dashboard/passenger-dashboard.component';

const routes: Routes = [
  {path:"login",component:LoginComponent},
  {path:"passenger",component:PassengerDashboardComponent},
  {path:"",redirectTo:"\login",pathMatch:"full"}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
