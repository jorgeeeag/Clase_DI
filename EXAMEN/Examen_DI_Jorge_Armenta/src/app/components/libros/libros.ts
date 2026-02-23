import { Component, OnInit } from '@angular/core';
import { LibrosService } from '../../services/libros-service';
import { Libro } from '../../models/libro';

@Component({
  selector: 'app-libros',
  standalone: false,
  templateUrl: './libros.html',
  styleUrl: './libros.css',
})
export class Libros implements OnInit{
  listalibros:Libro[]=[]
  listaFavoritos:Libro[]=[]
  constructor(private librosService:LibrosService){
  }
  ngOnInit(): void {
    this.listalibros=this.librosService.getTotalLibros
    }
}
