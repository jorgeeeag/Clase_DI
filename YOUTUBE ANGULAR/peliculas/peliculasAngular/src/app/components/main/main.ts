import { Component, OnInit } from '@angular/core';
import { PeliculasService } from '../../services/peliculasService';
import { Pelicula } from '../../models/pelicula';
import { ImagenesGeneroPipe } from '../../pipes/imagenes-genero-pipe';


@Component({
  selector: 'app-main',
  standalone: false,
  templateUrl: './main.html',
  styleUrl: './main.css',
})
export class Main implements OnInit{
  peliculas: Pelicula[]=[]

  constructor(private perliculasServices:PeliculasService){
  }
  
  agregarFavoritos(pelicula:Pelicula){
    this.perliculasServices.agregarFavoritos(pelicula)
  }
  ngOnInit(): void {
    this.peliculas=this.perliculasServices.getPeliculas()

  }
}
