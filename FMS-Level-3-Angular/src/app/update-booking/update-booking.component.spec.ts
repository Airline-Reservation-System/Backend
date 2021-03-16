import { ComponentFixture, TestBed, waitForAsync } from '@angular/core/testing';

import { UpdateBookingComponent } from './update-booking.component';

describe('UpdateBookingComponent', () => {
  let component: UpdateBookingComponent;
  let fixture: ComponentFixture<UpdateBookingComponent>;

  beforeEach(waitForAsync(() => {
    TestBed.configureTestingModule({
      declarations: [ UpdateBookingComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UpdateBookingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
