import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CarritoComponente } from './carrito-componente';

describe('CarritoComponente', () => {
  let component: CarritoComponente;
  let fixture: ComponentFixture<CarritoComponente>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [CarritoComponente]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CarritoComponente);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
