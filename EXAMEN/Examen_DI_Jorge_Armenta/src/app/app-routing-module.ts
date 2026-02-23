import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { Libros } from './components/libros/libros';
import { Carrito } from './components/carrito/carrito';

const routes: Routes = [
  {
    path:'Libros',component:Libros
    },
    {
      path:'Carrito',component:Carrito
    }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
