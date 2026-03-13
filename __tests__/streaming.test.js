const puedeVerPelicula = require('../src/streaming');

describe('Streaming - puedeVerPelicula', () => {
  test('devuelve true cuando la edad es exactamente 18', () => {
    // Arrange: Preparo los datos
    const edad = 18;

    // Act: Ejecuto la lógica
    const resultado = puedeVerPelicula(edad);

    // Assert: Verifico el resultado
    expect(resultado).toBe(true);
  });

  test('devuelve true cuando la edad es mayor a 18', () => {
    // Arrange: Preparo los datos
    const edad = 25;

    // Act: Ejecuto la lógica
    const resultado = puedeVerPelicula(edad);

    // Assert: Verifico el resultado
    expect(resultado).toBe(true);
  });

  test('devuelve false cuando la edad es menor a 18', () => {
    // Arrange: Preparo los datos
    const edad = 17;

    // Act: Ejecuto la lógica
    const resultado = puedeVerPelicula(edad);

    // Assert: Verifico el resultado
    expect(resultado).toBe(false);
  });

  test('devuelve false para valores no numéricos', () => {
    // Arrange: Preparo los datos
    const edad = '18';

    // Act: Ejecuto la lógica
    const resultado = puedeVerPelicula(edad);

    // Assert: Verifico el resultado
    expect(resultado).toBe(false);
  });
});

