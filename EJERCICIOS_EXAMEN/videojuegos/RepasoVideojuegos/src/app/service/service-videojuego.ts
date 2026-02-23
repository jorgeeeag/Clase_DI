import { Injectable } from '@angular/core';
import { Videojuego } from '../model/videojuego';
import Swal from 'sweetalert2';

@Injectable({
  providedIn: 'root',
})
export class ServiceVideojuego {
  contadorIdAPI = 9;
  listaFavoritosApi: Videojuego[] = [];
  listaVideojuegoAPI: Videojuego[] = [
    {
      id: 1,
      nombre: 'The Legend of Zelda: Breath of the Wild',
      anio: 2017,
      plataforma: 'Nintendo Switch',
      horas: 120,
    },
    {
      id: 2,
      nombre: 'God of War',
      anio: 2018,
      plataforma: 'PlayStation 4',
      horas: 45,
    },
    {
      id: 3,
      nombre: 'Minecraft',
      anio: 2011,
      plataforma: 'PC',
      horas: 300,
    },
    {
      id: 4,
      nombre: 'Hollow Knight',
      anio: 2017,
      plataforma: 'PC',
      horas: 35,
    },
    {
      id: 5,
      nombre: 'Cyberpunk 2077',
      anio: 2020,
      plataforma: 'PC',
      horas: 60,
    },
    {
      id: 6,
      nombre: 'Stardew Valley',
      anio: 2016,
      plataforma: 'PC',
      horas: 80,
    },
    {
      id: 7,
      nombre: 'Super Mario Odyssey',
      anio: 2017,
      plataforma: 'Nintendo Switch',
      horas: 25,
    },
    {
      id: 8,
      nombre: 'Elden Ring',
      anio: 2022,
      plataforma: 'PlayStation 5',
      horas: 150,
    },
  ];
  getVideojuegoId(id: number | undefined): Videojuego {
    return this.listaVideojuegoAPI.find((item) => item.id == id)!;
  }
  anadirVideojuegos(videojuego: Videojuego) {
    videojuego.id = this.contadorIdAPI;
    this.listaVideojuegoAPI.push(videojuego);
    this.contadorIdAPI++;
  }
  anadirFavoritos(videojuego: Videojuego) {
    this.listaFavoritosApi.push(videojuego);
    Swal.fire({
      title: 'Añadido correctamente',
      text: 'Añadido a favoritos',
      icon: 'success',
    });
  }
  vaciarCarrito() {
    this.listaFavoritosApi = [];
    Swal.fire({
      title: 'Compra realizada',
      text: 'Videojuego comprado',
      icon: 'success',
    });
  }
}
