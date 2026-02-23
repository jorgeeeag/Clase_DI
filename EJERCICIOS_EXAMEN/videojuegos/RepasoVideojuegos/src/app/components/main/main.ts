import { Component, OnInit } from '@angular/core';
import { Videojuego } from '../../model/videojuego';
import { ServiceVideojuego } from '../../service/service-videojuego';
import { Router } from '@angular/router';

@Component({
  selector: 'app-main',
  standalone: false,
  templateUrl: './main.html',
  styleUrl: './main.css',
})
export class Main implements OnInit {
  listaVideojuegos: Videojuego[] = [];

  constructor(
    private serviceVideojuegos: ServiceVideojuego,
    private router: Router,
  ) {}
  ngOnInit(): void {
    this.listaVideojuegos = this.serviceVideojuegos.listaVideojuegoAPI;
  }
  anadirFavoritos(videojuego: Videojuego) {
    this.serviceVideojuegos.anadirFavoritos(videojuego);
  }
  irAlDetalle(id: number) {
    this.router.navigate(['Detalle', id]);
  }
}
