// PROGRAMA NORMAL Y CORRIENTE DE TODA LA VIDA

/**
 * Pide un nombre y una acción, se usa un prompt para ambos.
 * Las acciones son 'voy' y 'vengo'
 * Se muestra un mensaje concreto para cada una de esas acciones,
 * y si no, se muestra por defecto otro mensaje.
 * Todo usando alert
 */
function init() {
  const nombre = prompt("introduce tu nombre");
  const accion = prompt("vas o vienes? (responde voy/vengo)");
  const mensaje = saludar(accion);

  alert(mensaje + ", " + nombre);
}

/**
 * FUNCION SALUDAR
 * @param {string} accion 
 * @returns string
 */
function saludar(accion) {
  switch (accion) {
    case "voy":
      return "adios";

    case "vengo":
      return "bienvenido";

    default:
      return "no me cuentes tu vida";
  }
}

init();