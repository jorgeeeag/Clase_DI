import { Component, OnInit } from '@angular/core';
import { Pelicula } from '../../models/pelicula';
import { PeliculasService } from '../../services/peliculasService';

@Component({
  selector: 'app-favoritos',
  standalone: false,
  templateUrl: './favoritos.html',
  styleUrl: './favoritos.css',
})
export class Favoritos implements OnInit{
  favoritos:Pelicula[]=[]

  constructor(private peliculasService:PeliculasService){
  
  }

  ngOnInit(): void {
      this.favoritos=this.peliculasService.favoritos
  }
}
