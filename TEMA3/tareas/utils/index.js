let botonAgregar = document.querySelector("#btnAgregar");
let inputNombre = document.querySelector("#inputNombre");
let inputFecha = document.querySelector("#inputFecha");
let selectPrioridad = document.querySelector("#selectPrioridad");
let lista = document.querySelector("#listaTareas");

let tareas = [];

botonAgregar.addEventListener("click", () => {
  let nombre = inputNombre.value;
  let fecha = inputFecha.value;
  let prioridad = selectPrioridad.value;

  if (nombre.length == 0 || fecha.length == 0 || prioridad == 0) {
    // saltar un cuadro
    alert("No hay datos");
  } else {
    let tarea1 = new tarea(
      inputNombre.value,
      new Date(inputFecha.value),
      selectPrioridad.value
    );

    tareas.push(tarea1);

    lista.innerHTML = `<li class='form-control'>${
      tareas[tareas.length - 1].nombre
    }</li>`;
    inputNombre.value = "";
    inputFecha.value = "";
    selectPrioridad.value = "0";
  }
  });

  botonBuscar.addEventListener("click",()=>{
    let seleccion = selectPrioridad.value
    let listaFiltrada = tareas.filter((item)=> { return item.prioridad==seleccion})
  })

  let imagen
  switch(seleccion){
    case 1:
        imagen = ""
        break
    case 2:
        imagen = ""
        break
    case 3:
        imagen = ""
        break
  }

  Swal.fire({
  position: "center",
  icon: "success",
  title: `El numero de resultados es ${listaFiltrada.length}`,
  showConfirmButton: false,
  timer: 3000
});
