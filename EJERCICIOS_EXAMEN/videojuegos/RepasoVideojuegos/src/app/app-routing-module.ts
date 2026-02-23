import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { Main } from './components/main/main';
import { Favoritos } from './components/favoritos/favoritos';
import { Buscar } from './components/buscar/buscar';
import { Detalle } from './components/detalle/detalle';

const routes: Routes = [
  {
    path: 'Main',
    component: Main,
  },
  {
    path: 'Favoritos',
    component: Favoritos,
  },
  {
    path: 'Buscar',
    component: Buscar,
  },
  {
    path: 'Detalle/:id',
    component: Detalle,
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
