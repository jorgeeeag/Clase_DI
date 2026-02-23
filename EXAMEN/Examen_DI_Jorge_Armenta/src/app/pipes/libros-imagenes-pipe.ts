import { Pipe, PipeTransform } from '@angular/core';
import { Libro } from '../models/libro';

@Pipe({
  name: 'librosImagenes',
  standalone: false,
})
export class LibrosImagenesPipe implements PipeTransform {

  transform(value: unknown, ...args: unknown[]): string {
    switch(value){
      case 'pages<150':
        return "https://cdn-icons-png.flaticon.com/512/1945/1945940.png"
      case 'pages<250': 
        return "https://cdn-icons-png.flaticon.com/512/8832/8832880.png"
      case 'pages<400':
        return "https://cdn-icons-png.flaticon.com/512/3145/3145765.png"
    }
    return "https://cdn-icons-png.flaticon.com/512/2232/2232688.png";
  }

}
