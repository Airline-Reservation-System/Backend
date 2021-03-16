import { ComponentFixture, TestBed, waitForAsync } from '@angular/core/testing';

import { UpdateAirportComponent } from './update-airport.component';

describe('UpdateAirportComponent', () => {
  let component: UpdateAirportComponent;
  let fixture: ComponentFixture<UpdateAirportComponent>;

  beforeEach(waitForAsync(() => {
    TestBed.configureTestingModule({
      declarations: [ UpdateAirportComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UpdateAirportComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
