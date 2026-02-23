import { Component, OnInit } from '@angular/core';
import { ServicioLibros } from '../../services/servicio-libros';
import { libro } from '../../model/libro';

@Component({
  selector: 'app-ver-detalle-componente',
  standalone: false,
  templateUrl: './ver-detalle-componente.html',
  styleUrl: './ver-detalle-componente.css',
})
export class VerDetalleComponente implements OnInit {
  verDetalle?: libro;
  constructor(private servicioLibros: ServicioLibros) {}

  ngOnInit(): void {
    this.verDetalle = this.servicioLibros.libroDetalle;
  }
}
