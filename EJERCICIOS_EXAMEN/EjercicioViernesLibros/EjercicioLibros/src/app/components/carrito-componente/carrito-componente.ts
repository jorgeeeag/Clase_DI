import { Component, OnInit } from '@angular/core';
import { libro } from '../../model/libro';
import { ServicioLibros } from '../../services/servicio-libros';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-carrito-componente',
  standalone: false,
  templateUrl: './carrito-componente.html',
  styleUrl: './carrito-componente.css',
})
export class CarritoComponente implements OnInit {
  listaCarrito: libro[] = [];
  constructor(private servicioLibros: ServicioLibros) {}
  ngOnInit(): void {
    this.listaCarrito = this.servicioLibros.listaCarritoAPI;
  }
  comprarCarrito() {
    this.servicioLibros.vaciarDelCarrito();
    Swal.fire({
      title: 'Gracias por comprar',
      text: 'Carrito eliminado',
      icon: 'success',
    });
  }
}
