import { NgModule, provideBrowserGlobalErrorListeners } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing-module';
import { App } from './app';
import { ImagenesLibrosPipe } from './pipes/imagenes-libros-pipe';
import { LibrosComponente } from './components/libros-componente/libros-componente';
import { CarritoComponente } from './components/carrito-componente/carrito-componente';
import { VerDetalleComponente } from './components/ver-detalle-componente/ver-detalle-componente';
import { RouterLink } from '@angular/router';
import { CommonModule } from '@angular/common';

@NgModule({
  declarations: [
    App,
    ImagenesLibrosPipe,
    LibrosComponente,
    CarritoComponente,
    VerDetalleComponente,
  ],
  imports: [BrowserModule, AppRoutingModule, RouterLink, CommonModule],
  providers: [provideBrowserGlobalErrorListeners()],
  bootstrap: [App],
})
export class AppModule {}
