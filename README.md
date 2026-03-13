# PSW_TEAM - Pruebas Unitarias con Patrón AAA

## Descripción
Proyecto educativo que demuestra la implementación del patrón AAA (Arrange-Act-Assert) en pruebas unitarias.

## Contenido del Proyecto

### Clases Implementadas
- `Calculadora`: Operaciones matemáticas básicas
- `Usuario`: Gestión de información de usuarios
- `CarritoCompras`: Sistema de carrito de compras
- `Cupon`: Validador de cupones con código fijo "VERANO2026"
- `Streaming`: Control de acceso a películas según la edad del usuario

### Pruebas Unitarias
- 9 pruebas unitarias en total (3 por cada clase)
- Todas implementan el patrón AAA
- Cobertura completa de funcionalidades

## Instalación

```bash
npm install
```

## Ejecutar Pruebas

```bash
# Ejecutar todas las pruebas
npm test

# Ejecutar con cobertura
npm run test:coverage

# Modo watch (desarrollo)
npm run test:watch
```

## Estructura del Proyecto

```
.
├── src/
│   ├── calculadora.js      # Clase Calculadora
│   ├── usuario.js          # Clase Usuario
│   ├── carrito.js          # Clase CarritoCompras
│   ├── cupon.js            # Clase Cupon (validador de cupones)
│   └── streaming.js        # Clase Streaming (control de acceso)
├── __tests__/
│   ├── calculadora.test.js # Pruebas de Calculadora
│   ├── usuario.test.js     # Pruebas de Usuario
│   ├── carrito.test.js     # Pruebas de CarritoCompras
│   ├── cupon.test.js       # Pruebas de Cupon
│   └── streaming.test.js   # Pruebas de Streaming
├── DOCUMENTACION_PATRON_AAA.md  # Documentación completa
├── jest.config.js          # Configuración de Jest
└── package.json
```

## Documentación

Lee el archivo `DOCUMENTACION_PATRON_AAA.md` para entender:
- Qué es el patrón AAA
- Cómo se implementó
- Cómo se utilizó
- Lecciones aprendidas
- Por qué es bueno
- Cómo te ayuda

## Tecnologías
- Node.js
- Jest (Framework de testing)
- JavaScript ES6+