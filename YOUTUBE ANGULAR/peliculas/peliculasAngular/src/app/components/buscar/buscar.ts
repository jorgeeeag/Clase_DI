import { Component, OnInit } from '@angular/core';
import { Pelicula } from '../../models/pelicula';
import { PeliculasService } from '../../services/peliculasService';

@Component({
  selector: 'app-buscar',
  standalone: false,
  templateUrl: './buscar.html',
  styleUrl: './buscar.css',
})
export class Buscar implements OnInit{
  listaFiltradaPeliculas:Pelicula[]=[]
  busqueda?: string;
  constructor(private peliculasService:PeliculasService){}

  ngOnInit(): void {  
  }

  buscarPorGenero(){
    if(this.busqueda=="Todas"){
      this.listaFiltradaPeliculas=this.peliculasService.peliculas
    }else{
      this.listaFiltradaPeliculas=this.peliculasService.getPeliculas().filter(item=>item.genero===this.busqueda)
    }
  }
}
