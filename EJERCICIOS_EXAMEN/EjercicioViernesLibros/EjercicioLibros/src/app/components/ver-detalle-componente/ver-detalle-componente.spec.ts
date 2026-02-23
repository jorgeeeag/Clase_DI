import { ComponentFixture, TestBed } from '@angular/core/testing';

import { VerDetalleComponente } from './ver-detalle-componente';

describe('VerDetalleComponente', () => {
  let component: VerDetalleComponente;
  let fixture: ComponentFixture<VerDetalleComponente>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [VerDetalleComponente]
    })
    .compileComponents();

    fixture = TestBed.createComponent(VerDetalleComponente);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
