import { Component, OnInit } from '@angular/core';
import { Videojuego } from '../../model/videojuego';
import { ServiceVideojuego } from '../../service/service-videojuego';

@Component({
  selector: 'app-buscar',
  standalone: false,
  templateUrl: './buscar.html',
  styleUrl: './buscar.css',
})
export class Buscar implements OnInit {
  plataforma: string = '';
  listaVideojuegosBuscar: Videojuego[] = [];
  constructor(private serviceVideojuegos: ServiceVideojuego) {}
  ngOnInit(): void {
    this.listaVideojuegosBuscar = this.serviceVideojuegos.listaVideojuegoAPI;
  }
}
