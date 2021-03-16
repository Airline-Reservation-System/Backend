import { ComponentFixture, TestBed, waitForAsync } from '@angular/core/testing';

import { SearchScheduledFlightComponent } from './search-scheduled-flight.component';

describe('SearchScheduledFlightComponent', () => {
  let component: SearchScheduledFlightComponent;
  let fixture: ComponentFixture<SearchScheduledFlightComponent>;

  beforeEach(waitForAsync(() => {
    TestBed.configureTestingModule({
      declarations: [ SearchScheduledFlightComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SearchScheduledFlightComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
