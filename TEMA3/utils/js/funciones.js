//PARA DEFINIR FUNCIONES
function realizarCalculo(op1,op2) {
    console.log(`la suma de los dos parametros es: ${op1+op2}`);
}
function realizarCalculoRetorno(op1,op2) {
    return op1+op2
}

function realizarCalculoDefecto(op1,op2=7) {
    return op1+op2
}

function realizarCalculoFantasma(op1) {
    console.log("calculo fantasma");
    console.log(op1 + "es parametro requerido");
    //arguments -> argumentos fantasmas que son pasados adicionalmente..es array
    console.log(`el numero de argumentos fantasma es de ${arguments.length}`);
    //hacer suma de todos los argumentos que me pasan por parametros indicando cuantos son pasados y cuantos fantasma
    let suma=0 
    arguments.forEach(element,indexedDB,data => {
        suma+=element
    });  
}
realizarCalculoFantasma(1,2,3,4)
console.log(`el resultado de la operacion con retorno es: ${realizarCalculoRetorno(4,5)}`);
