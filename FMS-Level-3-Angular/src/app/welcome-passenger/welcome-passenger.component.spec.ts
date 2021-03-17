import { ComponentFixture, TestBed } from '@angular/core/testing';

import { WelcomePassengerComponent } from './welcome-passenger.component';

describe('WelcomePassengerComponent', () => {
  let component: WelcomePassengerComponent;
  let fixture: ComponentFixture<WelcomePassengerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ WelcomePassengerComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(WelcomePassengerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
