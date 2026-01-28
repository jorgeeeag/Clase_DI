//CREAR ARRAY
let lista = ["Palabra1","Palabra2","Palabra3"]        //ya es un array

//METER ELEMENTOS AL ARRAY
lista.push("Palabra4","Palabra5","Palabra6")        //se ponen al final del array
lista.unshift("Palabra7","Palabra8")              //se ponen al principio del array
lista[2]="Palabra nueva"                              //sustituye al hola ya que ahora mismo es la posicion 2
lista[100]="Palabra100"                             //en la posicion 100 y las 93 de antes 

//ALTERAR ELEMENTO DEL ARRAY
lista.pop()             //borra el ultimo elemento y me lo devuelve
lista.shift()           //borro el primer elemento y me lo devuelve
lista=lista.filter((element,index)=>{return element!="Palabra 3"})        //me devuelve la lista con los paramtros que yo haya escogido ya sea filtrar por elemento (valor) o posicion (index)
lista=lista.find((element,index)=>{return element!="Palabra 3"})        //me devuelve el primer elemento (SOLO UN ELEMENTO) que cumpla la condicion que haya puesto
console.log(lista);
