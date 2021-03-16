import { ComponentFixture, TestBed, waitForAsync } from '@angular/core/testing';

import { AirportDetailsComponent } from './airport-details.component';

describe('AirportDetailsComponent', () => {
  let component: AirportDetailsComponent;
  let fixture: ComponentFixture<AirportDetailsComponent>;

  beforeEach(waitForAsync(() => {
    TestBed.configureTestingModule({
      declarations: [ AirportDetailsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AirportDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
