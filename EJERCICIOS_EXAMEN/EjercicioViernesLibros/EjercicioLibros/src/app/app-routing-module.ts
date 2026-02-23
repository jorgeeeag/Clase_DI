import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LibrosComponente } from './components/libros-componente/libros-componente';
import { CarritoComponente } from './components/carrito-componente/carrito-componente';

const routes: Routes = [
  {
    path: 'libros',
    component: LibrosComponente,
  },
  {
    path: 'carrito',
    component: CarritoComponente,
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
