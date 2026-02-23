import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LibrosComponente } from './libros-componente';

describe('LibrosComponente', () => {
  let component: LibrosComponente;
  let fixture: ComponentFixture<LibrosComponente>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [LibrosComponente]
    })
    .compileComponents();

    fixture = TestBed.createComponent(LibrosComponente);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
