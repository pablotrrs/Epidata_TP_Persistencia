= Trabajo práctico: Persistencia
Torres, Pablo <ptorres@campus.ungs.edu.ar>;
v1, {docdate}. 	
:title-page:
:numbered:
:source-highlighter: coderay
:tabsize: 4

== Tecnologías

En este trabajo práctico se utilizan tecnologías de bases de datos para almacenar datos y de mapeo objeto-relacional para acceder a los datos desde el programa Java. En particular, se utiliza la base de datos Apache Derby (embebida), y la Hibernate como implementación de JPA.

== Contexto

"_ElLibroDeJava_" es una editorial de libros técnicos sobre programación. Los libros son planeados por los editores del mismo, quienes deciden que capítulos son relevantes para el tema del libro. Cada capítulo es escrito por uno o más expertos en el tema y revisados por un único revisor experto. La misma persona puede actuar como autor de un capítulo, revisor de otro o editor de un libro.

Esta editorial desea crear una base de datos con sus libros (título, año de publicación), los capítulos de dichos libros (nombre del capítulo, cantidad de páginas), y revisores, autores y editores (nombre, apellido, y dirección de email). Así mismo, la base de datos contiene información sobre la relación entre estas entidades. Por ejemplo, “Juan Perez” es el editor de “Introducción a Java”, y que el capítulo “Sentencias de control” está incluido en dicho libro. Además, que dicho capítulo fue escrito por “Romina Laguardia” y “Mariano Gonzales”, y revisado por “James Gosling”.

=== Reportes de personal

La editorial típicamente utiliza reportes de personal para decidir quiénes pueden ser editores, autores, o
revisores. Estos reportes tienen varios campos:

* Cuántos libros editó cada persona en un año dado.
* Cuántas páginas revisó cada persona en un año dado.
* En cuántos libros participó cada persona como autor de capítulo.
