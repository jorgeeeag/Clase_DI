import { Component, OnInit } from '@angular/core';
import { libro } from '../../model/libro';
import { ServicioLibros } from '../../services/servicio-libros';
import { ImagenesLibrosPipe } from '../../pipes/imagenes-libros-pipe';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-libros-componente',
  standalone: false,
  templateUrl: './libros-componente.html',
  styleUrl: './libros-componente.css',
})
export class LibrosComponente implements OnInit {
  listaCarrito: libro[] = [];
  listaLibros: libro[] = [];
  $libro: any;
  constructor(private servicioLibros: ServicioLibros) {}

  ngOnInit(): void {
    this.listaLibros = this.servicioLibros.listaLibrosAPI;
  }
  agregarAlCarrito(libro: libro) {
    this.servicioLibros.anadirAlCarrito(libro);
  }
  verDetalle(libro: libro) {
    Swal.fire({
      title: libro.Title,
      html: `
      <p><strong>Año:</strong> ${libro.Year}</p>
      <p><strong>Páginas:</strong> ${libro.Pages}</p>

      <p><strong>Villanos:</strong></p>
      <ul>
        ${
          libro.villains.length > 0
            ? libro.villains.map((v) => `<li>${v.name}</li>`).join('')
            : '<li>No tiene villanos</li>'
        }
      </ul>
    `,
      icon: 'info',
      confirmButtonText: 'Cerrar',
    });
  }
}
