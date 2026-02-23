import { TestBed } from '@angular/core/testing';

import { ServiceVideojuego } from './service-videojuego';

describe('ServiceVideojuego', () => {
  let service: ServiceVideojuego;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ServiceVideojuego);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
