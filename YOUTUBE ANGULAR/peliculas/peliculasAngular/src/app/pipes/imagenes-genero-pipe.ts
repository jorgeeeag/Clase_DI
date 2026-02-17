import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'imagenesGenero',
  standalone: false,
})
export class ImagenesGeneroPipe implements PipeTransform {

  transform(value: unknown, ...args: unknown[]): string {
    switch (value){
      case "Drama":
        return "https://i.pinimg.com/736x/1b/a1/e7/1ba1e719dfed396bd9102dacbb54dd73.jpg"
      case "Acción":
        return "https://i.pinimg.com/736x/a7/50/7a/a7507a3bb7911dd5b5efe0f0372e8c1f.jpg"
      case "Crimen":
        return "https://i.pinimg.com/736x/2c/e6/05/2ce6051f2409b98bd723061d204e41fd.jpg"
      case "Ciencia Ficción":
        return "https://i.pinimg.com/1200x/f7/1e/0a/f71e0a39ec547cfd8a3666e4899bca1e.jpg"
      case "Animación":
        return "https://i.pinimg.com/736x/34/55/5d/34555de99a729dbb8db108fefc427367.jpg"

    }
    return "https://i.pinimg.com/1200x/54/93/98/549398d7c44dd4eb1e9504bac3c86350.jpg";
  }

}
