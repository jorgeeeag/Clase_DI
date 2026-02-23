import { NgModule, provideBrowserGlobalErrorListeners } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing-module';
import { App } from './app';
import { RouterLink } from '@angular/router';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { LibrosImagenesPipe } from './pipes/libros-imagenes-pipe';
import { Libros } from './components/libros/libros';
import { Carrito } from './components/carrito/carrito';

@NgModule({
  declarations: [
    App,
    LibrosImagenesPipe,
    Libros,
    Carrito
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterLink,
    CommonModule,
    FormsModule
  ],
  providers: [
    provideBrowserGlobalErrorListeners(),
  ],
  bootstrap: [App]
})
export class AppModule { }
