# Ingeniería de sistemas - Parcial

## Parte 1

### Introducción

Usted esta trabajando como profesor de la materia “Introducción a la programación Web” en la universidad. Como primer tema está enseñando HTML. Cada semana los alumnos deben entregar una página web escrita en dicho lenguaje con ciertos criterios. Al ser una clase introductoria los trabajos son relativamente básicos como por ejemplo: “Escribir una pagina de artículos usando los tags correspondientes” o “introducir saltos de text sin usar tag \<br\>”.
 
En los años anteriores la corrección de cada uno de los trabajos era manual. Pero como la cantidad de alumnos incrementó considerablemente usted se decidió en automatizar una parte del proceso. Para esta trabajando en crear un programa que analice automáticamente cada trabajo al momento de entregarlo inspeccionando el HTML e indicando si el mismo cumple con las reglas establecidas para el mismo. Las reglas no deben ser fijas, ya que varían de una consigna a otra, también es importante que se puedan agregar nuevas reglas.

En este momento usted ya cuenta con una mínima estructura creada, sobre la cual a definido algunos tests para probar distintos casos a medida que desarrolla. Ahora deber completar la estructura para poder solucionar el problema. 

Para empezar a decidido implementar las siguientes reglas:
* No deben usarse atributos XML en los tags de HTML. Ej: `xml:lang="ja"`
* El elemento \<html\> debe tener el atributo "lang"
* Los elementos \<link\> deben tener el atributo "type"

La estructura de HTML debera respetar ciertos criterios propios de un HTML. Un caso es que no todos los elementos soportan hijos, por ejemplo los elementos \<img\> y \<br\>. Otro es que no todos los elementos soportan inline styles, por ejemplo \<head\>, \<script\> y \<link\>.

### Consignas
1. Realize un diagrama de clases, extendiendo el inicial, describiendo la solución al problema.
2. Realize un diagrama de secuencia mostrando como el validador ejecuta 2 de las reglas sobre unas estructura de HTML.
3. Implemente la solución descripta en el paquete `edu.austral.ingsis.htmlvalidator`

## Parte 2

### Introducción

Otra de las cuestiones a tener en cuenta es como detectar rápidamente donde hay un error a la hora de crear una estructura de HTMLElement, para esto se quiere poder imprimir dicha estructura en forma de string.

A futuro usted piensa que puede ser interesante la experiencia de crear un segundo validador pero con una nueva interfaz, que permita emitir las violaciones a las reglas a medida que las genera, asi como poder cancelar el proceso de validación en la mitad. Esto es podría ayudar mucho si los trabajos crecen mucho de tamaño.

### Consignas

1. Extienda el diagrama de clases original para que cumpla con los requerimientos de la parte 2.
2. Agregue a la implementación las nuevas clases.

### Notas
* En caso de usar patrones se los debe identificar con una nota en el diagrama de clases y justificar su uso.
* Los diagramas se deben guardar en formato PDF en el directorio `diagrams` presente en el root del repositorio.
* El nombre de los diagramas debe permitir identificarlos.
* El código de los tests no puede ser modificado (En caso de encontrar un error avise del mismo). 
* El repositorio contiene una serie de tests que le permitirán comprobar el correcto funcionamiento de las reglas.
* Para el punto 1 y 2, de la parte 2, se definen la clase `HTMLWriter` y la interfaz `AsyncHTMLValidator`. Una vez implementadas estas clases debe crearse por lo menos un test que pruebe su funcionamiento.
