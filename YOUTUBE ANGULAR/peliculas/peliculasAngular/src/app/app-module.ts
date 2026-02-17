import { NgModule, provideBrowserGlobalErrorListeners } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing-module';
import { App } from './app';
import { ImagenesGeneroPipe } from './pipes/imagenes-genero-pipe';
import { Main } from './components/main/main';
import { Favoritos } from './components/favoritos/favoritos';
import { Buscar } from './components/buscar/buscar';
import { Premium } from './components/premium/premium';
import { Perfil } from './components/perfil/perfil';
import { RouterLink } from '@angular/router';
import { CommonModule } from '@angular/common';
import { FormControl, FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    App,
    ImagenesGeneroPipe,
    Main,
    Favoritos,
    Buscar,
    Premium,
    Perfil,
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
