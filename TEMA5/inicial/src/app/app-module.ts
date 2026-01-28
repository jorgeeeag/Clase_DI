import { NgModule, provideBrowserGlobalErrorListeners } from '@angular/core';
import { BrowserModule, provideClientHydration, withEventReplay } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';

import { App } from './app';
import { Decisiones } from './components/decisiones/decisiones';
import { Selecciones } from './components/selecciones/selecciones';
import { Repeticiones } from './components/repeticiones/repeticiones';

@NgModule({
  declarations: [
    App,
    Decisiones,
    Selecciones,
    Repeticiones
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [
    provideBrowserGlobalErrorListeners(),
    provideClientHydration(withEventReplay()),
  ],
  bootstrap: [App]
})
export class AppModule { }
