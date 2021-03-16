import { ComponentFixture, TestBed, waitForAsync } from '@angular/core/testing';

import { CreateAirportComponent } from './create-airport.component';

describe('CreateAirportComponent', () => {
  let component: CreateAirportComponent;
  let fixture: ComponentFixture<CreateAirportComponent>;

  beforeEach(waitForAsync(() => {
    TestBed.configureTestingModule({
      declarations: [ CreateAirportComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CreateAirportComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
