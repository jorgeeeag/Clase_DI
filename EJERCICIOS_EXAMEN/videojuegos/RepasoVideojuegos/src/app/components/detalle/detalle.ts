import { Component, OnInit } from '@angular/core';
import { Videojuego } from '../../model/videojuego';
import { ServiceVideojuego } from '../../service/service-videojuego';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-detalle',
  standalone: false,
  templateUrl: './detalle.html',
  styleUrl: './detalle.css',
})
export class Detalle implements OnInit {
  videojuegoDetalle!: Videojuego;
  constructor(
    private serviceVideojuegos: ServiceVideojuego,
    private activatedRoute: ActivatedRoute,
  ) {}
  ngOnInit(): void {
    const id = Number(this.activatedRoute.snapshot.paramMap.get('id'));
    this.videojuegoDetalle = this.serviceVideojuegos.getVideojuegoId(id);
  }
}
