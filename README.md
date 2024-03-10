# Patrones de Diseño en Java.
Contiene un listado de los patrones de diseño con diagramas UML y ejemplos de código en Java.




## Introducción.
Los patrones de diseño son soluciones elegantes, comprobadas y estándares a problemas comunes en el desarrollo de software que permiten generar un vocabulario común a la hora de colaborar con otras personas.


## <a name="lista-de-patrones">Lista de Patrones de Diseño.</a>
A continuación se muestran los patrones agrupados por su clasificación.

### Patrones Creacionales (Creational Patterns)

Proporcionan mecanismos de creación de objetos que incrementan la flexibilidad y la reutilización de código existente.

* [Factory o Factory Method](#factory)
* [Abstract Factory](#abstract-factory)
* [Builder](#builder)

### Patrones Estructurales (Structural Patterns)

Permiten ensamblar objetos y clases en estructuras más grandes a la vez que se mantiene la flexibilidad y eficiencia de la estructura.

* [Composite](#composite)
* [Decorator](#decorator)
* [Facade](#facade)

### Patrones de Comportamiento (Behavioral Patterns)

Se encargan de la comunicación efectiva y la asignación de responsabilidades entre objetos.

* [Observer](#observer)
* [Template method](#template)
* [Iterator](#iterator)

## <a name="observer">Observer</a> [&#8593;](#lista-de-patrones)

**Propósito:** Definir una dependencia de uno a muchos entre los objetos de manera que cuando un objeto cambia de estado, todos los que dependen de él son notificados y se actualizan automáticamente.

Los *Observers* se registran con el *Subject*  a medida que se crean. Siempre que el Subject cambie, difundirá a todos los Observers registrados que ha cambiado, y cada Observer consulta al Subject que supervisa para obtener el cambio de estado que se haya generado.

En Java tenemos acceso a la clase Observer mediante [java.util.Observer](http://docs.oracle.com/javase/8/docs/api/java/util/Observer.html)

**Aplicación:** Usamos el patrón Observer cuando...
* Un cambio en un objeto requiere cambiar los demás, pero no sabemos cuántos objetos hay que cambiar.
* Configurar de manera dinámica un componente de la Vista, envés de estáticamente durante el tiempo de compilación.
* Un objeto debe ser capaz de notificar a otros objetos sin que estos objetos estén fuertemente acoplados.

**Estructura**

![UML Patrón Observer](https://github.com/JuanPardoPrdo/software-design-patterns/blob/main/src/observer/pattern/structure.png)

**Ejemplos:**

En este ejemplo usaremos una clase *Evento* para controlar los sucesos a los que los *Observers* responderan.

* [Subasta](https://github.com/JuanPardoPrdo/software-design-patterns/tree/main/src/observer/examples/auction)

## <a name="factory">Factory o Factory Method</a> [&#8593;](#lista-de-patrones)

**Propósito:** Definir una interface para crear un objeto, dejando a las subclases decidir de que tipo de clase se realizará la instancia en tiempo de ejecución. Reducir el uso del operador *new*.

Crear objetos en una clase usando un método factory es más flexible que crear un objeto directamente. Es posible conectar la generación de familias de clases que tienen comportamientos en común. Elimina la necesidad de estar haciendo binding (casting) hacia clases específicas dentro del código, ya que éste sólo se entiende con las clases abstractas.

**Aplicación:** Usamos el patrón Factory...
* Cuando una clase no puede anticipar que clase de objetos debe crear, esto se sabe durante el tiempo de ejecución.
* Cuando un método regresa una de muchas posibles clases que comparten carecterísticas comunes a través de una superclase.
* Para encapsular la creación de objetos.

**Estructura**

![UML Patrón Factory](https://github.com/JuanPardoPrdo/software-design-patterns/blob/main/src/factory/pattern/structure.png)

**Ejemplos:**

* [Carros](https://github.com/JuanPardoPrdo/software-design-patterns/tree/main/src/factory/examples/cars)

## <a name="abstract-factory">Abstract Factory</a> [&#8593;](#lista-de-patrones)

**Propósito:** Proveer una interfaz para la creación de familias u objetos dependientes relacionados, sin especificar sus clases concretas.

Es una jerarquía que encapsula muchas *familias* posibles y la creación de un conjunto de *productos*. El objeto "fábrica" tiene la responsabilidad de proporcionar servicios de creación para toda una familia de productos. Los "clientes" nunca crean directamente los objetos de la familia, piden la fábrica que los cree por ellos.

**Aplicación:** Usamos el patrón Abstract Factory...
* Cuando tenemos una o múltiples familias de productos.
* Cuando tenemos muchos objetos que pueden ser cambiados o agregados durante el tiempo de ejecución.
* Cuando queremos obtener un objeto compuesto de otros objetos, los cuales desconocemos a que clase pertenecen.
* Para encapsular la creación de muchos objetos.

**Estructura**

![UML Patrón Abstract Factory](https://github.com/JuanPardoPrdo/software-design-patterns/blob/main/src/abstractfactory/pattern/structure.png)

**Ejemplos:**

* [El Reino](https://github.com/JuanPardoPrdo/software-design-patterns/tree/main/src/abstractfactory/examples/kingdom)

## <a name="composite">Composite</a> [&#8593;](#lista-de-patrones)

**Propósito:** Componer objetos en estructuras de árbol que representan jerarquías de un *todo* y sus *partes.* El Composite provee a los *clientes* un mismo trato para todos los objetos que forman la jerarquía.

Pensemos en nuestro sistema de archivos, este contiene *directorios* con *archivos* y a su vez estos *archivos* pueden ser otros *directorios* que contenga más *archivos*, y así sucesivamente. Lo anterior puede ser representado facilmente con el patrón Composite.

**Aplicación:** Usamos el patrón Composite...
* Cuando queremos representar jerarquías de objetos
compuestas por un todo y sus partes.
* Se quiere que los *clientes* ignoren la diferencia
entre la composición de objetos y su uso
individual.

**Estructura**

![UML Patrón Composite](https://github.com/JuanPardoPrdo/software-design-patterns/blob/main/src/composite/pattern/structure.png)

**Ejemplos:**
* [Menu](https://github.com/JuanPardoPrdo/software-design-patterns/tree/main/src/composite/examples/menu)


## <a name="builder">Builder</a> [&#8593;](#lista-de-patrones)

**Propósito:** Separar la construcción de un objeto complejo de su representación para que el mismo proceso de construcción puede crear diferentes representaciones.

Nos permite crear un objeto que está compuesto por muchos otros objetos. Sólo el "*Builder*" conoce a detalle las clases concretas de los objetos que serán creados, nadie más.

En este patrón intervienen un "*Director*" y un "*Builder*". El "*Director*" invoca los servicios del "*Builder*" el cual va creando las partes de un objeto complejo y al mismo tiempo guardo un estado intermedio de la construcción del objeto. Cuando el producto se ha construido por completo el *cliente* recupera el resultado.

A diferencia de otros patrones creacionales que construyen productos de una sola vez, el patrón "*Builder*" construye paso a paso los productos bajo el control del "*Director*".

**Aplicación:** Usamos el patrón Builder cuando queremos...
* Construir un objeto compuesto de otros objetos.
* Que la creación de las partes de un objeto sea independiente del objeto principal.
* Ocultar la creación de las partes de un objeto del *cliente*, de esta manera no existe dependencia entre el *cliente* y las partes.

**Estructura**

![UML Patrón Builder](https://github.com/JuanPardoPrdo/software-design-patterns/blob/main/src/builder/pattern/structure.png)

**Ejemplos:**
* [Robots](https://github.com/JuanPardoPrdo/software-design-patterns/tree/main/src/builder/examples/robots)


## <a name="decorator">Decorator</a> [&#8593;](#lista-de-patrones)

Extender la funcionalidad de los objetos se puede hacer de forma estática en nuestro código (tiempo de **compilación**) mediante el uso de la herencia, sin embargo, podría ser necesario extender la funcionalidad de un objeto de manera dinámica.

**Propósito:** Adjuntar responsabilidades adicionales a un objeto de forma **dinámica**. Los *decoradores* proporcionan una alternativa flexible para ampliar la funcionalidad.

**Aplicación:** Usamos el patrón [Decorator...](https://github.com/JuanPardoPrdo/software-design-patterns/tree/main/src/decorator/pattern)
* Cuando necesitamos añadir o eliminar dinámicamente las responsabilidades a un objeto, sin afectar a otros objetos.
* Cuando queremos tener las ventajas de la *Herencia* pero necesitemos añadir funcionalidad durante el tiempo de ejecución. Es más flexible que la *Herencia*,
* Simplificar el código agregando funcionalidades usando muchas clases diferentes.
* Evitar sobreescribir código viejo agregando, envés, código nuevo.

**Estructura**

![UML Patrón Decorator](https://github.com/JuanPardoPrdo/software-design-patterns/blob/main/src/decorator/pattern/structure.png)

**Ejemplos:**
* [Pizzas](https://github.com/JuanPardoPrdo/software-design-patterns/tree/main/src/decorator/examples/pizzas)

## <a name="facade">Facade</a> [&#8593;](#lista-de-patrones)

**Propósito:** Proporcionar una interfaz unificada para un conjunto de interfaces de un subsistema. *Facade* define una interfaz de alto nivel que hace que el subsistema sea más fácil de usar.

**Detalles:**
* Este patrón protege los clientes de los componentes del subsistema, propiciando el menor uso de componentes para que el subsistema pueda ser utilizado.
* Además, promueve un bajo acoplamiento entre subsistemas y clientes.
* Este patrón no evita que los clientes usen las clases internas del subsistema, si es que es necesario.
* Es importante mencionar que el objeto *Facade* debe ser extremadamente simple. **No** debe convertirse en un **objeto "dios".**

**Aplicación:** Usamos el patrón [Facade...](https://github.com/JuanPardoPrdo/software-design-patterns/tree/main/src/facade/pattern)
* Cuando queremos encapsular un subsistema complejo con una interface más simple.
* Para crear una interface simplificada que ejecuta muchas acciones "detŕas del escenario".
* Existen muchas dependencias entre clientes y la implementación de clases de una abstracción. Se introduce el facade para desacoplar el subsistema de los clientes y otros subsistemas.
* Necesitamos *desacoplar* subsistemas entre sí, haciendo que se comuniquen únicamente mediante *Facades*.
* Para definir un punto de entrada a cada nivel del subsistema.

**Estructura**

![UML Patrón Facade](https://github.com/JuanPardoPrdo/software-design-patterns/blob/main/src/facade/pattern/structure.png)

**Ejemplos:**
* [Banco](https://github.com/JuanPardoPrdo/software-design-patterns/tree/main/src/facade/examples/bank)


## <a name="template">Template Method</a> [&#8593;](#lista-de-patrones)

**Propósito:** Define el esqueleto de programa de un algoritmo en un método, llamado método de plantilla, el cual difiere algunos pasos a las subclases.

Permite redefinir ciertos pasos seguros de un algoritmo sin cambiar la estructura del algoritmo.

**Aplicación:** Usamos el patrón Template Method cuando ...
* Se desea dejar que las subclases que se implementan (a través del método primordial) tengan un comportamiento que puede variar.
* Evitar duplicación en el código: la estructura general de flujo de trabajo, está implementada una vez en el algoritmo de clase abstracta, y variaciones necesarias son implementadas en cada de las subclases.
* Controlar en qué punto(s) la subclassing está permitida. En oposición a una sencilla sobrecarga polimórfica, donde el método de base sería enteramente reescrito, permitiendo un cambio radical en el flujo. Sólo los detalles específicos del flujo se pueden cambiar.

**Estructura**

![UML Patrón Template](https://github.com/JuanPardoPrdo/software-design-patterns/blob/main/src/template/pattern/structure.png)

**Ejemplos:**
* [Order Managing](https://github.com/JuanPardoPrdo/software-design-patterns/tree/main/src/template/examples/ordermanaging)

## <a name="iterator">Iterator</a> [&#8593;](#lista-de-patrones)

**Propósito:** Define una interfaz que declara los métodos necesarios para acceder secuencialmente a un grupo de objetos de una colección.

Algunos de los métodos que podemos definir en la interfaz Iterador son:

Primero(), Siguiente(), HayMas() y ElementoActual().

**Aplicación:** Usamos el patrón Iterator cuando ...
* Se desea acceder a los elementos de un contenedor de objetos (por ejemplo, una lista) sin exponer su representación interna.

**Estructura**

![UML Patrón Iterator](https://github.com/JuanPardoPrdo/software-design-patterns/blob/main/src/iterator/pattern/structure.png)

**Ejemplos:**
* [Vectors](https://github.com/JuanPardoPrdo/software-design-patterns/tree/main/src/iterator/examples/vectors)