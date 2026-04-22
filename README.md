#  Proyecto: ICON NAILS
BASE DE DATOS

Este repositorio contiene el diseño e implementación de la base de datos para el salón de manicura **ICON NAILS**. El objetivo es gestionar los servicios de uñas, las clientas y las citas del centro de forma organizada.

##  Estructura del Proyecto
La base de datos se ha diseñado siguiendo un modelo Entidad-Relación y se ha implementado en MySQL. Consta de 4 tablas principales:
* **SERVICIOS:** Incluye Uñas de Gel, Semipermanentes, Acrílicas, Pedicura y Limpieza.
* **CLIENTES:** Información de contacto de las clientas.
* **ESPECIALISTAS:** Personal técnico del centro.
* **CITAS:** Registro de servicios realizados vinculando clienta y especialista.

##  Archivos incluidos
1. `creacion_tablas.sql`: Código para generar la estructura de la base de datos.
2. `insercion_datos.sql`: Carga de los servicios reales y datos de prueba.
3. `consultas.sql`: Consultas para filtrar servicios por precio y gestión de citas.

##  Consultas de ejemplo
Se ha implementado una consulta específica para mostrar los servicios premium (aquellos con un precio superior a 30€), asegurando una rápida visualización de los tratamientos más rentables del salón.
# Proyecto Icon Nails - Gestión de Centro de Estética

Este proyecto consiste en una aplicación para gestionar un salón de manicura, permitiendo el control de clientes, citas y servicios.

## Tecnologías utilizadas
* **Base de Datos:** MySQL
* **Lenguaje:** Java 
* **Gestión de versiones:** Git y GitHub

## Estructura del repositorio
* `/diagrams`: Contiene los esquemas de la base de datos y clases.
* `README.md`: Descripción del proyecto.

## Funcionalidades
* Registro y gestión de clientes.
* Listado de servicios y productos de manicura.
* Control de pedidos y citas.
  ## SECCIÓN: PROGRAMACIÓN (Java + JDBC)

## 1. Qué hace la aplicación
Esta aplicación permite gestionar de forma integral un salón de manicura. Facilita el registro de citas, la gestión de clientes y servicios, asegurando que los datos se almacenen de forma persistente y se validen correctamente.

## 2. Cómo se ejecuta
1.  **Base de Datos**: Importa el archivo `icon_nails.sql` en tu gestor de bases de datos (MySQL).
2.  **Configuración**: Abre el proyecto en tu IDE (IntelliJ/Eclipse) y asegúrate de añadir el conector JDBC (`mysql-connector-java.jar`) a las librerías.
3.  **Conexión**: Ajusta el usuario y contraseña en la clase `ConexionBD.java`.
4.  **Ejecución**: Ejecuta la clase principal `Main.java`.

## 3. Funcionalidades
* **Gestión de Citas (CRUD)**: Creación, lectura, actualización y borrado de citas en la base de datos.
* **Validación XML/XSD**: La aplicación genera archivos XML de las citas y los valida mediante el esquema `esquema.xsd` incluido.
* **Persistencia**: Uso de JDBC para mantener los datos guardados de forma segura.

## 4. Uso de la Base de Datos
La aplicación utiliza JDBC para conectar con la base de datos `ICON NAILS`. Se encarga de:
* Insertar nuevas citas y clientes.
* Consultar la disponibilidad de servicios.
* Mantener la integridad referencial de los datos.

Demonstración
Interfaz de gestión de citas funcionando correctamente y conectada a la base de datos.
