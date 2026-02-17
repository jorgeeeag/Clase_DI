import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { Main } from './components/main/main';
import { Favoritos } from './components/favoritos/favoritos';
import { Buscar } from './components/buscar/buscar';
import { Premium } from './components/premium/premium';
import { Perfil } from './components/perfil/perfil';

const routes: Routes = [
  {
    path:'Home', component: Main
  },
  {
    path:'VerFavoritos', component: Favoritos
  },
  {
    path:'Buscar', component: Buscar
  },
  {
    path:'Premium', component: Premium
  },
  {
    path:'Perfil', component: Perfil
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
