import { Component, OnInit } from '@angular/core';
import { Videojuego } from '../../model/videojuego';
import { ServiceVideojuego } from '../../service/service-videojuego';

@Component({
  selector: 'app-favoritos',
  standalone: false,
  templateUrl: './favoritos.html',
  styleUrl: './favoritos.css',
})
export class Favoritos implements OnInit {
  listaFavorita: Videojuego[] = [];
  constructor(private serviceVideojuegos: ServiceVideojuego) {}
  ngOnInit(): void {
    this.listaFavorita = this.serviceVideojuegos.listaFavoritosApi;
  }
  vaciarCarrito() {
    this.serviceVideojuegos.vaciarCarrito();
  }
}
