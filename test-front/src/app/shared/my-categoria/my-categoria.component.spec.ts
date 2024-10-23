import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MyCategoriaComponent } from './my-categoria.component';

describe('MyCategoriaComponent', () => {
  let component: MyCategoriaComponent;
  let fixture: ComponentFixture<MyCategoriaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [MyCategoriaComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(MyCategoriaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
