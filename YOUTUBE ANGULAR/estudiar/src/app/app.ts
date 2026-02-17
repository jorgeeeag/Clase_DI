import { Component } from '@angular/core';
import Swal from 'sweetalert2'

@Component({
  selector: 'app-root',
  templateUrl: './app.html',
  standalone: false,
  styleUrl: './app.css'
})
export class App {
  contador = 0
  sumar(){
    this.contador++
  }
}
