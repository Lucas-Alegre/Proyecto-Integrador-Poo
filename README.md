🚍 **Proyecto Transporte Rutas S.A.**

Sistema de gestión de transporte de pasajeros, desarrollado con enfoque en Programación Orientada a Objetos (POO) y arquitectura por capas. Permite administrar viajes, choferes, vehículos y generar reportes, simulando un repositorio en memoria y una interfaz por consola.

---

👥 **Integrantes del grupo**

- Alegre Lucas
- Aquino Benjamín
- Latour Carolina

---

📦 **Estructura del Proyecto**

```
Proyecto-Integrador-Poo/
├── .gitignore
├── pom.xml
└── src
    └── main
        └── java
            └── com
                └── mycompany
                    └── transportesa
                        ├── entidades
                        │   ├── Categoria.java
                        │   ├── CategoriaEnum.java
                        │   ├── Chofer.java
                        │   ├── ChoferCategoria.java
                        │   ├── Ciudad.java
                        │   ├── Colectivo.java
                        │   ├── Minibus.java
                        │   ├── Persona.java
                        │   ├── ProvinciaEnum.java
                        │   ├── Vehiculo.java
                        │   └── Viaje.java
                        ├── excepciones
                        │   ├── ChoferNoDisponibleExcepcion.java
                        │   ├── CiudadesIgualesExcepcion.java
                        │   ├── ICategoriaInvalidaException.java
                        │   ├── VehiculoNoDisponibleExcepcion.java
                        ├── servicios
                        │   ├── ChoferService.java
                        │   ├── CiudadService.java
                        │   ├── InformeCantidadViajesService.java
                        │   ├── VehiculoService.java
                        │   └── ViajeService.java
                        └── TransporteSa.java
```

---

⚙️ **Cómo ejecutar el proyecto**

1. **Clonar** el repositorio:
   ```bash
   git clone https://github.com/Lucas-Alegre/Proyecto-Integrador-Poo.git
   ```
2. **Abrir** en un IDE (IntelliJ IDEA, Eclipse, NetBeans).
3. **Ejecutar** la clase principal de arranque:
   ```bash
   mvn exec:java -Dexec.mainClass="com.mycompany.transportesa.TransporteSa"
   ```
   o bien ejecutar directamente `TransporteSa.main(...)` desde el IDE.

---

✅ **Funcionalidades implementadas**

- Registro y gestión de choferes y vehículos.
- Planificación de viajes entre ciudades (asociando chofer y vehículo).
- Validación de superposición de viajes 
- Reportes de viajes programados, por chofer o vehículo.
- Simulación de almacenamiento en memoria (repositorio simple).
- Interfaz de consola para navegar por el sistema.

---

📄 **Licencia**

Este proyecto es solo para fines educativos.

---

📝 **Nota**: Este proyecto fue desarrollado como trabajo práctico de la materia Programación Orientada a Objetos (POO).
