import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'imagenesVideojuego',
  standalone: false,
})
export class ImagenesVideojuegoPipe implements PipeTransform {
  transform(value: number, ...args: unknown[]): unknown {
    switch (true) {
      case value < 20:
        return 'https://cdn-icons-png.flaticon.com/512/167/167707.png';
      case value < 50:
        return 'https://cdn-icons-png.flaticon.com/512/616/616490.png';
      case value < 100:
        return 'https://cdn-icons-png.flaticon.com/512/2331/2331943.png';
    }
    return 'https://cdn-icons-png.flaticon.com/512/3616/3616929.png';
  }
}
