package pe.edu.vallegrande.demo_aaa_pattern.service;

import org.springframework.stereotype.Service;

@Service
public class StreamingService {

    public boolean puedeVerContenidoAdultos(int edad) {
        return edad >= 18;
    }
}
