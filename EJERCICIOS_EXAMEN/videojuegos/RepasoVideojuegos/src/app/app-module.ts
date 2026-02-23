import { NgModule, provideBrowserGlobalErrorListeners } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing-module';
import { App } from './app';
import { ImagenesVideojuegoPipe } from './pipes/imagenes-videojuego-pipe';
import { Main } from './components/main/main';
import { Favoritos } from './components/favoritos/favoritos';
import { Buscar } from './components/buscar/buscar';
import { RouterLink } from '@angular/router';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Detalle } from './components/detalle/detalle';

@NgModule({
  declarations: [App, ImagenesVideojuegoPipe, Main, Favoritos, Buscar, Detalle],
  imports: [BrowserModule, AppRoutingModule, RouterLink, CommonModule, FormsModule],
  providers: [provideBrowserGlobalErrorListeners()],
  bootstrap: [App],
})
export class AppModule {}
