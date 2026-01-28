import { Component } from '@angular/core';
import Swal from 'sweetalert2'


@Component({
  selector: 'app-selecciones',
  standalone: false,
  templateUrl: './selecciones.html',
  styleUrl: './selecciones.css',
})
export class Selecciones {
  seleccion='1'
  nombre=""
  direccionEnvio=""
  direccionFacturacion=""
  coste=""
  tipoDePago='1'
  resolucion=false

  validarBoton(){
    Swal.fire("SweetAlert2 is working!");
  }
}
