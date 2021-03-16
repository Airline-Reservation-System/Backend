import { ComponentFixture, TestBed, waitForAsync } from '@angular/core/testing';

import { AddScheduledFlightComponent } from './add-scheduled-flight.component';

describe('AddScheduledFlightComponent', () => {
  let component: AddScheduledFlightComponent;
  let fixture: ComponentFixture<AddScheduledFlightComponent>;

  beforeEach(waitForAsync(() => {
    TestBed.configureTestingModule({
      declarations: [ AddScheduledFlightComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddScheduledFlightComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
