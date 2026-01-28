console.log("esta ejecucion se llama desde js independientemente")

//TIPOS DE DATOS

//string
let nombre="jorge"      //variable que guarda el ambito
let datos="pagina JS"   

//number (agrupa todo, int, float y double)
let edad = 41   
let edad2 = 42.6

//bool
let experiencia = false    

//object -> Array
let elemento = []   

//object -> null
let cosa = null 

//undefined
let dato;

//NaN -> not a number -> isNan()

//SACAR COSAS POR CONSOLA
console.log("Mi nombre es: "+nombre+" y tengo experiencia en "+experiencia);
console.log(`Mi nombre es ${nombre} y tengo experiencia en ${experiencia}`);

//PARA COMENTAR VARIAS COSAS ALT + SHIFT + A


//METODOS PARA INTERACTUAR CON EL USUARIO
//PARA SACAR ALERTAS
alert(`Bienvenido ${nombre}, vamos a realizar interacciones`)

//PARA SACAR UN CUADRO DE DIALOGO EN EL QUE EL USUARIO PUEDA CONFIRMA O DENEGAR
let respuesta = confirm("Estas seguro que quieres continuar vv??")
if(respuesta){
    alert("Has contestado ate")
}else{
    alert("Has contestado flop :(")
}

/* //PARA QUE EL USUARIO ESCRIBA
let respuestaPromp = prompt("Por favor introduce tu nombre")
console.log(`La repsuesta es ${respuestaPromp}`); */
let respuestaCalcular
let nombrePromp = prompt("Introduce nombre")
do {
    

let primerOperando = Number(prompt ("Introduce el primer operando"))
if (!isNaN(primerOperando)){
    let segundoOperando = Number (prompt ("Introduce el segundo operando"))
    if (!isNaN(segundoOperando)){
        let suma =primerOperando+segundoOperando
        let resta =primerOperando-segundoOperando
        let multiplicacion =primerOperando*segundoOperando
        let division =primerOperando/segundoOperando
        alert(`Suma: ${suma}\nResta:${resta}\nMulti:${multiplicacion}\nDivision:${division}`)
        respuestaCalcular=prompt("quieres repetir la accion")
    }else{
        alert("Ek dato es incorrecto")
    }
}else{
    alert("El dato es incorrecto")
}
} while (respuestaCalcular=="si");
let confirmarTodo = confirm("¿Estas seguro que quiere continuar?")



if(true){
    var asignatura= "DI"    //estas variables son de ambito global
    const DNI = "1234A"     //variable que guarda el ambito
    console.log(nombre)
    console.log(DNI)
}
//no salen porque el ambito es el if excepto asignatura
//console.log(nombre)
//console.log(DNI)
console.log(asignatura)

//para saber el tipo del dato
console.log(typeof datos);

