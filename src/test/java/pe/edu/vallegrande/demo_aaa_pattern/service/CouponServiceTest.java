package pe.edu.vallegrande.demo_aaa_pattern.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class CouponServiceTest {

    @Test
    void deberiaAceptarCuponVerano2026() {
        // Arrange
        CouponService servicio = new CouponService();
        String cupon = "VERANO2026";
        System.out.println("--- Test: deberiaAceptarCuponVerano2026 ---");
        System.out.println("Enviando cupón: '" + cupon + "'");

        // Act
        boolean esValido = servicio.esCuponValido(cupon);
        System.out.println("Resultado de la validación: " + esValido);

        // Assert
        assertTrue(esValido);
        System.out.println("-> ¡Éxito! El sistema validó correctamente el cupón esperado.\n");
    }

    @Test
    void deberiaAceptarCuponAunqueTengaMinusculas() {
        // Arrange
        CouponService servicio = new CouponService();
        String cupon = "verano2026";
        System.out.println("--- Test: deberiaAceptarCuponAunqueTengaMinusculas ---");
        System.out.println("Enviando cupón: '" + cupon + "'");

        // Act
        boolean esValido = servicio.esCuponValido(cupon);
        System.out.println("Resultado de la validación: " + esValido);

        // Assert
        assertTrue(esValido);
        System.out.println("-> ¡Éxito! El sistema validó la versión en minúsculas sin problemas.\n");
    }

    @Test
    void noDeberiaAceptarCuponInvalido() {
        // Arrange
        CouponService servicio = new CouponService();
        String cupon = "INVIERNO2026";
        System.out.println("--- Test: noDeberiaAceptarCuponInvalido ---");
        System.out.println("Enviando cupón: '" + cupon + "'");

        // Act
        boolean esValido = servicio.esCuponValido(cupon);
        System.out.println("Resultado de la validación: " + esValido);

        // Assert
        assertFalse(esValido);
        System.out.println("-> ¡Éxito! El sistema rechazó correctamente un cupón no válido.\n");
    }
}
