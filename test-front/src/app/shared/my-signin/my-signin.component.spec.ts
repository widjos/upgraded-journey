import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MySigninComponent } from './my-signin.component';

describe('MySigninComponent', () => {
  let component: MySigninComponent;
  let fixture: ComponentFixture<MySigninComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [MySigninComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(MySigninComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
