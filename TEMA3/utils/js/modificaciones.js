//let botonAgregar=document.get    esto es algo que se hacia antes, ahora se hace con el query
//let botonAgregar=document.querySelector("button")     enseña los botones en consola
//let botonAgregar=document.querySelector(".btn-warning")       nos da los que tenga la clase warning asociada a btn
let botonAgregar=document.querySelector("#btnAgregar")     //nos da el elemento que tenga ese id
let botonLimpiar=document.querySelector("#btnLimpiar")     //nos da el elemento que tenga ese id
let botonVaciar=document.querySelector("#btnVaciar")
let inputNombre=document.querySelector("#inputNombre")
let inputApellido=document.querySelector("#inputApellido")
let inputFecha=document.querySelector("#inputFecha")
let listaAgregados=document.querySelector("#divAgregados ul")

let botones = document.querySelectorAll(".btn")   
//podemos hacer que un boton con el mismo id que otro pero en un div con diferente id ponemos 
//let botonAgregar=document.querySelector("div#botones2 #btnLimpiar")     


//HACER QUE FUNCIONE AL HACER CLICK
botonAgregar.addEventListener("click",(ev)=>{
    let nombre = inputNombre.value
    let apellido = inputApellido.value
    let fecha = inputFecha.value

    let cosa=""     //se crea vacio para comprobar
    if(nombre.length==0||apellido.length==0||fecha.length==0){
        lanzarDialogo("Error", 
            "Faltan datos ",
            "warning")
        }else{
        /* agregarLi()
        console.log(`Nombre ${nombre}`);
        console.log(`apellido ${apellido}`);
        console.log(`fecha ${fecha}`); */
        let nodoLI = crearNodo("li",
            `${nombre},${apellido},${fecha}`,
            "animate__animated animate__fadeInRight list-group-item d-flex justify-content-between align-items-start")
        let nodoButton = crearNodo ("button",`Eliminar`,"btn btn-danger", (e) => {
            nodoLI.classList.remove("animate__fadeInRight")
            nodoLI.classList.add("animate__wobble")
            setTimeout(() => {
                nodoLI.classList.remove("animate__wobble")
                nodoLI.classList.add("animate__fadeOutLeft")
                setTimeout(() => {
                    nodoLI.remove()
                }, 600);
            }, 600);
    })
    nodoLI.appendChild(nodoButton)
    listaAgregados.appendChild(nodoLI)
    }
})

botonLimpiar.addEventListener("click",(ev)=>{
    limpiarCampos(inputNombre,inputApellido,inputFecha)
})

function limpiarCampos() {
    for (let index = 0; index < arguments.length; index++) {
        arguments[index].value= ""
        
    }
}

botonVaciar.addEventListener("click",(ev)=>{
    listaAgregados.innerHTML=""
})

function lanzarDialogo(title,text,icon) {
    Swal.fire({
  title: title,
  text: text,
  icon: icon
});
}

function crearNodo(tipo,texto,clases,funcion) {
    let nodo=document.createElement(tipo)
    nodo.innerText=texto
    if (funcion!=undefined) {
        nodo.addEventListener("click",funcion)
    }
    nodo.className = clases
    return nodo
}

/* function agregarLi(nombre,apellido,fecha) {
    listaAgregados.innerHTML += `<li              //mete los valores al html
            class="animate__animate animate__flipOutX list-group-item d-flex justify-content-between align-items-start"
          >
            ${nombre} ${apellido} ${fecha}
            </li>`
    lanzarDialogo("Agregado correctamente", 
            `Usuario con nombre ${nombre} agregado correctamente`,
            "success") 
    let nodoLI = document.createElement("li")
    nodoLI.innerText = `${nombre} ${apellido} ${fecha}`
       nodoLI.className = "animate__animate animate__flipOutX list-group-item d-flex justify-content-between align-items-start" //classname digo el string completo si hago classlist trabajo individualmente sobre ese
       nodoLI.classList.add(
        "animate__animate", 
        "animate__flipOutX",
        "list-group-item",
        "d-flex",
        "justify-content-between",
        "align-items-start")
    listaAgregados.appendChild(nodoLI)
}*/

