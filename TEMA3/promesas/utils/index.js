//podemos meter el url y otro parametro
//se tiene que pasar a json el resultado pero hay que hacerlo en una segunda promesa en la cual hay que retornar el resultado de la primera
//en la parte superior pondremos los paises (/all_countries.php)

cargarPaises();

async function cargarPaises() {
    try {
        const respuesta = await fetch('https://www.thesportsdb.com/api/v1/json/123/all_countries.php');
        const datos = await respuesta.json();
        
        const select = document.getElementById('paises');
        select.innerHTML = '<option value="">Selecciona un país</option>';
        
        datos.countries.forEach(pais => {
            const opcion = document.createElement('option');
            opcion.value = pais.name_en;
            opcion.textContent = pais.name_en;
            select.appendChild(opcion);
        });
        
        // Ordenar opciones alfabéticamente
        const opciones = Array.from(select.options);
        opciones.sort((a, b) => a.text.localeCompare(b.text));
        select.innerHTML = '';
        opciones.forEach(opcion => select.appendChild(opcion));
        
        
        select.addEventListener('change', function() {
            if (this.value) {
                cargarEquipos(this.value);
            } else {
                document.getElementById('equipos').innerHTML = '';
            }
        });
        
    } catch (error) {
        console.error('Error al cargar países:', error);
        document.getElementById('paises').innerHTML = '<option value="">Error al cargar países</option>';
    }
}

async function cargarEquipos(pais) {
    try {
        const contenedor = document.getElementById('equipos');
        contenedor.innerHTML = '<div class="col-12 text-center"><p>Cargando equipos...</p></div>';
        
        const respuesta = await fetch(`https://www.thesportsdb.com/api/v1/json/123/search_all_teams.php?s=Soccer&c=${encodeURIComponent(pais)}`);
        const datos = await respuesta.json();
        
        contenedor.innerHTML = '';
        
        if (datos.teams && datos.teams.length > 0) {
            datos.teams.forEach(equipo => {
                const col = document.createElement('div');
                col.className = 'col-md-4 col-lg-3 mb-3';
                
                const nombreEquipoEscapado = equipo.strTeam.replace(/'/g, "\\'");
                
                col.innerHTML = `
                    <div class="card h-100">
                        <img src="${equipo.strBadge || equipo.strTeamBadge || 'https://via.placeholder.com/150x150?text=Sin+logo'}" 
                             class="card-img-top p-3" 
                             style="height: 150px; object-fit: contain;"
                             alt="${equipo.strTeam}"
                             onerror="this.src='https://via.placeholder.com/150x150?text=Sin+logo'">
                        <div class="card-body d-flex flex-column">
                            <h5 class="card-title">${equipo.strTeam}</h5>
                            <p class="card-text"><small class="text-muted">${equipo.strLeague || 'Liga no disponible'}</small></p>
                            <div class="mt-auto">
                                <button class="btn btn-primary w-100" 
                                        onclick="cargarJugadores('${equipo.idTeam}', '${nombreEquipoEscapado}')">
                                    Ver Jugadores
                                </button>
                            </div>
                        </div>
                    </div>
                `;
                
                contenedor.appendChild(col);
            });
        } else {
            contenedor.innerHTML = '<div class="col-12 text-center"><p class="text-warning">No se encontraron equipos para este país.</p></div>';
        }
        
    } catch (error) {
        console.error('Error al cargar equipos:', error);
        document.getElementById('equipos').innerHTML = '<div class="col-12 text-center"><p class="text-danger">Error al cargar equipos</p></div>';
    }
}

//cargar jugadores
async function cargarJugadores(idEquipo, nombreEquipo) {
    try {
        const seccionJugadores = document.getElementById('jugadores-section');
        const contenedorJugadores = document.getElementById('jugadores');
        
        seccionJugadores.style.display = 'block';
        document.getElementById('nombre-equipo').textContent = nombreEquipo;
        contenedorJugadores.innerHTML = '<div class="col-12"><p>Cargando jugadores...</p></div>';
        
        const respuesta = await fetch(`https://www.thesportsdb.com/api/v1/json/123/lookup_all_players.php?id=${idEquipo}`);
        const datos = await respuesta.json();
        
        contenedorJugadores.innerHTML = '';
        
        if (datos.player && datos.player.length > 0) {
            datos.player.forEach(jugador => {
                const col = document.createElement('div');
                col.className = 'col-md-6 col-lg-4 mb-2';
                
                col.innerHTML = `
                    <div class="card h-100">
                        <div class="card-body">
                            <div class="row align-items-center">
                                <div class="col-3">
                                    <img src="${jugador.strThumb || jugador.strCutout || 'https://via.placeholder.com/60x60?text=J'}" 
                                         class="rounded-circle img-fluid" 
                                         style="width: 60px; height: 60px; object-fit: cover;"
                                         alt="${jugador.strPlayer}"
                                         onerror="this.src='https://via.placeholder.com/60x60?text=J'">
                                </div>
                                <div class="col-9">
                                    <h6 class="mb-1">${jugador.strPlayer}</h6>
                                    <small class="text-muted d-block">${jugador.strPosition || 'Posición no disponible'}</small>
                                    <small class="text-muted">${jugador.strNationality || ''}</small>
                                </div>
                            </div>
                        </div>
                    </div>
                `;
                
                contenedorJugadores.appendChild(col);
            });
        } else {
            contenedorJugadores.innerHTML = '<div class="col-12 text-center"><p class="text-warning">No se encontraron jugadores para este equipo.</p></div>';
        }
    } catch (error) {
        console.error('Error al cargar jugadores:', error);
        document.getElementById('jugadores').innerHTML = '<div class="col-12 text-center"><p class="text-danger">Error al cargar jugadores</p></div>';
    }
}

function cerrarJugadores() {
    document.getElementById('jugadores-section').style.display = 'none';
}