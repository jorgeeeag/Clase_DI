import { Injectable } from '@angular/core';
import { Pelicula } from '../models/pelicula';
import Swal from 'sweetalert2';

@Injectable({
  providedIn: 'root',
})
export class PeliculasService {
  contadorPeliculas=9
  favoritos:Pelicula[]=[]
  peliculas:Pelicula[]=[
    {
    "id": 1,
    "titulo": "El Padrino",
    "director": "Francis Ford Coppola",
    "genero": "Drama",
    "anio": 1972,
    "duracion": 175,
    "descripcion": "La historia de la familia Corleone, una de las más poderosas del crimen organizado en Nueva York."
  },
  {
    "id": 2,
    "titulo": "Pulp Fiction",
    "director": "Quentin Tarantino",
    "genero": "Crimen",
    "anio": 1994,
    "duracion": 154,
    "descripcion": "Las vidas de dos mafiosos, un boxeador, la esposa de un gángster y dos bandidos se entrelazan en cuatro historias de violencia y redención."
  },
  {
    "id": 3,
    "titulo": "El Caballero de la Noche",
    "director": "Christopher Nolan",
    "genero": "Acción",
    "anio": 2008,
    "duracion": 152,
    "descripcion": "Batman se enfrenta al Joker, un criminal que busca sumir a Gotham en la anarquía."
  },
  {
    "id": 4,
    "titulo": "Blade Runner",
    "director": "Ridley Scott",
    "genero": "Ciencia Ficción",
    "anio": 1982,
    "duracion": 117,
    "descripcion": "En un futuro distópico, un ex policía persigue a unos replicantes rebeldes en Los Ángeles."
  },
  {
    "id": 5,
    "titulo": "Matrix",
    "director": "Lana Wachowski, Lilly Wachowski",
    "genero": "Ciencia Ficción",
    "anio": 1999,
    "duracion": 136,
    "descripcion": "Un programador descubre que la realidad es una simulación y se une a la resistencia para liberar a la humanidad."
  },
  {
    
  "id": 6,
  "titulo": "Interestelar",
  "director": "Christopher Nolan",
  "genero": "Ciencia Ficción",
  "anio": 2014,
  "duracion": 169,
  "descripcion": "Un grupo de exploradores viaja a través de un agujero de gusano en busca de un nuevo hogar para la humanidad."
 },
 {
    "id": 7,
    "titulo": "Toy Story",
    "director": "John Lasseter",
    "genero": "Animación",
    "anio": 1995,
    "duracion": 81,
    "descripcion": "Los juguetes de Andy cobran vida y viven aventuras cuando los humanos no están presentes."
  },
  {
    "id": 8,
    "titulo": "Buscando a Nemo",
    "director": "Andrew Stanton",
    "genero": "Animación",
    "anio": 2003,
    "duracion": 100,
    "descripcion": "Un pez payaso cruza el océano para rescatar a su hijo que ha sido capturado por un buceador."
  }
] 

getPeliculas():Pelicula[]{
  return this.peliculas
}

getPeliculaId(id:number):Pelicula|undefined{
  return this.peliculas.find(item => item.id==id)
}

agregarPelicula(pelicula:Pelicula){
  pelicula.id=this.contadorPeliculas
  this.peliculas.push(pelicula)
  this.contadorPeliculas++
}

agregarFavoritos(pelicula:Pelicula){
  this.favoritos.push(pelicula)
  Swal.fire({
  title: "Añadiste a favoritos",
  text: "Agregada correctamete",
  icon: "success"
});
}
}
