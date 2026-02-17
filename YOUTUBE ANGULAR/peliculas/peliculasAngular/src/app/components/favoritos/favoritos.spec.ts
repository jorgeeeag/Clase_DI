import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Favoritos } from './favoritos';

describe('Favoritos', () => {
  let component: Favoritos;
  let fixture: ComponentFixture<Favoritos>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [Favoritos]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Favoritos);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
