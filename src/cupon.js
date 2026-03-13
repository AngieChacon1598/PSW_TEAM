/**
 * Clase Cupon - Ejemplo para pruebas unitarias con patrón AAA

 * - Solo se acepta el cupón "VERANO2026"
 * - No importa si está en mayúsculas, minúsculas o con espacios
 */
const validarCupon = (nombre) => {
  if (typeof nombre !== 'string') return false;

  const codigoNormalizado = nombre.replace(/\s+/g, '').toUpperCase();

  return codigoNormalizado === 'VERANO2026';
};

module.exports = validarCupon;

