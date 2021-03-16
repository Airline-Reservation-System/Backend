import { ComponentFixture, TestBed, waitForAsync } from '@angular/core/testing';

import { ModifyScheduledFlightComponent } from './modify-scheduled-flight.component';

describe('ModifyScheduledFlightComponent', () => {
  let component: ModifyScheduledFlightComponent;
  let fixture: ComponentFixture<ModifyScheduledFlightComponent>;

  beforeEach(waitForAsync(() => {
    TestBed.configureTestingModule({
      declarations: [ ModifyScheduledFlightComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ModifyScheduledFlightComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
