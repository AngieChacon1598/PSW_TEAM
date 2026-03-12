package pe.edu.vallegrande.demo_aaa_pattern.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class StreamingServiceTest {

    @Test
    void deberiaDejarPasarSiEsMayorDeEdad() {
        // Arrange
        StreamingService servicio = new StreamingService();
        int edad = 20;
        System.out.println("--- Test: deberiaDejarPasarSiEsMayorDeEdad ---");
        System.out.println("Preparando validación para usuario con " + edad + " años.");

        // Act
        boolean puedeVer = servicio.puedeVerContenidoAdultos(edad);
        System.out.println("Resultado de la validación: " + puedeVer);

        // Assert
        assertTrue(puedeVer);
        System.out.println("-> ¡Éxito! El sistema permitió correctamente el acceso porque es >= 18.\n");
    }

    @Test
    void noDeberiaDejarPasarSiEsMenorDeEdad() {
        // Arrange
        StreamingService servicio = new StreamingService();
        int edad = 15;
        System.out.println("--- Test: noDeberiaDejarPasarSiEsMenorDeEdad ---");
        System.out.println("Preparando validación para usuario con " + edad + " años.");

        // Act
        boolean puedeVer = servicio.puedeVerContenidoAdultos(edad);
        System.out.println("Resultado de la validación: " + puedeVer);

        // Assert
        assertFalse(puedeVer);
        System.out.println("-> ¡Éxito! El sistema bloqueó correctamente el acceso porque es menor de 18.\n");
    }
    
}
