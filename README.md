#  Proyecto Base de Datos: ICON NAILS

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
