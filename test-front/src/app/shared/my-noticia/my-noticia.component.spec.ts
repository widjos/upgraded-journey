import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MyNoticiaComponent } from './my-noticia.component';

describe('MyNoticiaComponent', () => {
  let component: MyNoticiaComponent;
  let fixture: ComponentFixture<MyNoticiaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [MyNoticiaComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(MyNoticiaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
