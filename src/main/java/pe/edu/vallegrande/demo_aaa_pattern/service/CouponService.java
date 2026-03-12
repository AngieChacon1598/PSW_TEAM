package pe.edu.vallegrande.demo_aaa_pattern.service;

import org.springframework.stereotype.Service;

@Service
public class CouponService {

    public boolean esCuponValido(String nombre) {
        if (nombre == null) {
            return false;
        }
        // Solo aceptamos el cupón "VERANO2026"
        return "VERANO2026".equalsIgnoreCase(nombre.trim());
    }

}
