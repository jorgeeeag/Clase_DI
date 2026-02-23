import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'imagenesLibros',
  standalone: false,
})
export class ImagenesLibrosPipe implements PipeTransform {
  transform(value: number, ...args: unknown[]): unknown {
    if (value < 150) {
      return 'https://cdn-icons-png.flaticon.com/512/1945/1945940.png';
    } else if (value < 250) {
      return 'https://cdn-icons-png.flaticon.com/512/8832/8832880.png';
    } else {
      return 'https://cdn-icons-png.flaticon.com/512/3145/3145765.png';
    }
    return 'https://cdn-icons-png.flaticon.com/512/2232/2232688.png;';
  }
}
