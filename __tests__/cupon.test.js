const validarCupon = require('../src/cupon');

describe('Cupon - validarCupon', () => {
  test('devuelve true para el cupón válido exacto', () => {
    // Arrange: Preparo los datos
    const cupon = 'VERANO2026';

    // Act: Ejecuto la lógica
    const resultado = validarCupon(cupon);

    // Assert: Verifico el resultado
    expect(resultado).toBe(true);
  });

  test('ignora mayúsculas y minúsculas', () => {
    // Arrange: Preparo los datos
    const cupon = 'verano2026';

    // Act: Ejecuto la lógica
    const resultado = validarCupon(cupon);

    // Assert: Verifico el resultado
    expect(resultado).toBe(true);
  });

  test('ignora espacios antes y después', () => {
    // Arrange: Preparo los datos
    const cupon = '  VERANO2026  ';

    // Act: Ejecuto la lógica
    const resultado = validarCupon(cupon);

    // Assert: Verifico el resultado
    expect(resultado).toBe(true);
  });

  test('ignora espacios intermedios', () => {
    // Arrange: Preparo los datos
    const cupon = 'VERANO 2026';

    // Act: Ejecuto la lógica
    const resultado = validarCupon(cupon);

    // Assert: Verifico el resultado
    expect(resultado).toBe(true);
  });

  test('devuelve false para un cupón inválido', () => {
    // Arrange: Preparo los datos
    const cupon = 'INVIERNO2026';

    // Act: Ejecuto la lógica
    const resultado = validarCupon(cupon);

    // Assert: Verifico el resultado
    expect(resultado).toBe(false);
  });

  test('devuelve false cuando no es un texto', () => {
    // Arrange: Preparo los datos
    const cupon = 12345;

    // Act: Ejecuto la lógica
    const resultado = validarCupon(cupon);

    // Assert: Verifico el resultado
    expect(resultado).toBe(false);
  });
});

