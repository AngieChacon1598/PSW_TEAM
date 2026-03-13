/**
 * Clase Streaming - Ejemplo para pruebas unitarias con patrón AAA

 * - Un usuario solo puede ver la película si tiene 18 años o más
 */
const puedeVerPelicula = (edad) => {
  if (typeof edad !== 'number') return false;

  return edad >= 18;
};

module.exports = puedeVerPelicula;

