# 🧪 Demostración del Patrón AAA (Arrange, Act, Assert) en JUnit 5

¡Bienvenido! Este proyecto es una demostración práctica para explicar cómo funciona el **Patrón AAA** en las pruebas unitarias de Java utilizando Spring Boot y **JUnit 5**.

El objetivo es demostrar que escribir pruebas claras y bien organizadas **evita el código espagueti** y permite a cualquier desarrollador comprender el propósito de un método con solo echarle un vistazo.

---

## 📂 Estructura del Proyecto

Nuestro código está separado rigurosamente entre la **lógica de negocio** (`src/main`) y las **pruebas unitarias** (`src/test`), manteniendo nuestro entorno súper limpio y profesional:

```text
📁 demo-aaa-pattern
 ┣ 📂 src
 ┃ ┣ 📂 main/java/pe/edu/vallegrande/demo_aaa_pattern
 ┃ ┃ ┗ 📂 service
 ┃ ┃   ┣ 📄 CouponService.java        # 🎟️ Lógica para validación de cupones
 ┃ ┃   ┗ 📄 StreamingService.java     # 🎬 Lógica para control de edad en streaming
 ┃ ┃
 ┃ ┗ 📂 test/java/pe/edu/vallegrande/demo_aaa_pattern
 ┃   ┗ 📂 service
 ┃     ┣ 📄 CouponServiceTest.java    # ✅ Suite de Pruebas aplicando Patrón AAA
 ┃     ┗ 📄 StreamingServiceTest.java # ✅ Suite de Pruebas aplicando Patrón AAA
 ┗ 📄 pom.xml                             # 📦 Configuración y dependencias (JUnit 5.8)
```

---

## 🧩 ¿Qué es el Patrón AAA?

El Patrón AAA es el estándar de oro para estructurar una prueba unitaria exitosa. Significa que siempre dividiremos nuestra prueba en tres "momentos" o "actos":

### 1️⃣ Arrange (Preparar)
Configuramos todas las variables, dependencias y el estado inicial que necesitamos para realizar nuestra prueba.
> *"¿Qué necesitamos antes de empezar? Instanciemos las clases e inicialicemos los datos."*

### 2️⃣ Act (Actuar)
Ejecutamos la acción principal (generalmente, llamamos al un único método que queremos probar).
> *"Aplastemos el botón. Corramos la validación dentro del sistema."*

### 3️⃣ Assert (Afirmar / Verificar)
Comprobamos que el resultado de la acción anterior sea exactamente el que esperábamos.
> *"¿El método devolvió lo que queríamos? Asegurémonos de ello con los asserts."*

---

## 🚀 Ejemplos Desarrollados

Hemos desarrollado dos escenarios distintos y reales para ponerlo a prueba:

### Ejemplo 1: StreamingService (Validación de Mayoría de Edad) 🎬

Este servicio decide si una persona tiene acceso a contenido restringido basado únicamente en su edad (mayor o igual a 18 años).

**La Prueba (Fragmento de `StreamingServiceTest.java`):**
```java
@Test
void deberiaDejarPasarSiEsMayorDeEdad() {
    // 1️⃣ Arrange - Aquí preparo al usuario maduro y el servicio
    StreamingService servicio = new StreamingService();
    int edad = 20;

    // 2️⃣ Act - Ejecuto la acción (verificar si tiene la edad suficiente)
    boolean puedeVer = servicio.puedeVerContenidoAdultos(edad);

    // 3️⃣ Assert - Verifico que el sistema sí le de acceso
    assertTrue(puedeVer);
}
```

### Ejemplo 2: CouponService (Validación de Reglas de Negocio) 🎟️

El sistema debe aceptar el cupón de descuento **"VERANO2026"**, sin importar si el usuario lo ingresó en mayúsculas o minúsculas. Es estricto: no aceptará cupones en blanco ni cupones de otras épocas.

**La Prueba (Fragmento de `CouponServiceTest.java`):**
```java
@Test
void noDeberiaAceptarCuponInvalido() {
    // 1️⃣ Arrange - Aquí preparamos un cupón incorrecto (y las clases que necesitamos)
    CouponService servicio = new CouponService();
    String cupon = "INVIERNO2026";

    // 2️⃣ Act - Ejecutamos la acción principal del sistema (Validarlo)
    boolean esValido = servicio.esCuponValido(cupon);

    // 3️⃣ Assert - Verificamos que el sistema, en efecto, rechace el cupón
    assertFalse(esValido);
}
```

---

## 💡 ¿Por qué evitamos el "Código Espagueti"?

Es simple: Imagínate que un desarrollador escriba todo mezclado en una misma función masiva... inicialice objetos, llame una función, haga una comprobación sin saber de qué, luego cambie otra variable y llame a la función de nuevo con otro assert en una sola prueba masiva e indescifrable de 100 líneas.

Al aislar nuestros bloques visual y estructuralmente con el patrón **AAA**, cualquier compañero de trabajo puede encontrar, leer, corregir y escalar nuestras pruebas sin dolores de cabeza. La intención de la prueba siempre queda clarísima de un vistazo rápido:

- `// Arrange` 👇 Datos de Entrada inicial ("Given")
- `// Act` 👇 Acción Principal Única ("When")
- `// Assert` 👇 Afirmación del Resultado Esperado ("Then")

¡Y nuestros 6 tests construidos así corrieron exitosamente de forma aislada e independiente en menos de **250ms** en total dentro de IntelliJ! 🎉
