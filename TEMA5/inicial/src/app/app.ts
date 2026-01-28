import { Component, signal } from '@angular/core';
import Swal from 'sweetalert2'


@Component({
  selector: 'app-root',
  templateUrl: './app.html',
  standalone: false,
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('inicial');
  nombre:string = 'borja'
  apellido:string ='martin herrera'
  curso:Number = 2
  nombreCurso:string ='Desarrollo de Aplicaciones Multiplataforma'
  nota:number|string=0
  //no hace falta tipar


  pulsarComenzar(notaInput:string){  
    //que ponga la nota introducida por el input
    /*if(isNaN(Number(notaInput))){
      this.nota=notaInput
    }else{

    }*/
   Swal.fire({
  title: 'Error!',
  text: 'Do you want to continue',
  icon: 'error',
  confirmButtonText: 'Cool'
})
  }
}
