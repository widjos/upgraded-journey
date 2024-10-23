import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MyNabvarComponent } from './my-nabvar.component';

describe('MyNabvarComponent', () => {
  let component: MyNabvarComponent;
  let fixture: ComponentFixture<MyNabvarComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [MyNabvarComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(MyNabvarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
