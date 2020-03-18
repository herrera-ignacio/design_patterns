# Abstract Factory

### Intent

Provide an interface for __creating families of related or dependent objects__
without specifying their concrete classes.

### Motivation

Consider a user interface toolkit that supports multiple look-and-feel standards, which
define different appearances and behaviors for user interface "widgets" like scroll bars,
windows, and buttons. To be portable across look-and-feel standards, an application should not
hard-code its widgets for a particular look-and-feel. Instantiating look-and-feel-specific
classes or widgets throughout the application makes it hard to change the look-and-feel later.

We can solve this problem by defining an abstract `WidgetFactory` class that declares an interface
for creating each basic kind of widget. There's also an abstract class for each kind of widget,
and concrete subclasses implement widgets for specific look-and-feel standards.

`WidgetFactory`'s interface has an operation that returns new widget object for each abstract widget
class. Clients call these operations to obtain widget instances, but clients aren't aware of the
concrete classes they're using. Thus clients stay independent of the prevailing look-and-feel.

![abstract-factory-example](https://drive.google.com/file/d/1GG93CO5CphQF6GRoaBD2qGQFhNQ3nAST/view?usp=sharing)

There is a concrete subclass of `WidgetFactory` for each look-and-feel standard. Each subclass
implements the operations to create the appropriate widget for the look-and-feel.

For example, the `CreateScrollBar` operation on the `MotifWidgetFactory` instantiates and
returns a `MotifScrolLBar`, while the corresponding operation on the `PMWidgetFactory`
returns a scroll bar for `PM` look-and-feel. Clients create widgets solely through the
`WidgetFactory` interface and have no knowledge of the classes that implement widgets for
a particular look-and-feel. In other words, clients only have to commit to an interface defined
by an abstract class, not a particular concrete class.

A `WidgetFactory` also enforces dependencies between the concrete widget classes. A `MotifScrollBar`
should be used with a `MotifButton` and a `MotifTextEditor`, and that constraint is enforced
automatically as a consequence of using a `MotifWidgetFactory`.

### Applicability

Use the _Abstract Factory_ pattern when:

* system should be independent of how its products are created, composed and represented.
* system should be configured with one of multiple families of products have no knowledge of the classes that implement widgets for
a particular look-and-feel. In other words, clients only have to commit to an interface defined
by an abstract class, not a particular concrete class.

A `WidgetFactory` also enforces dependencies between the concrete widget classes. A `MotifScrollBar`
should be used with a `MotifButton` and a `MotifTextEditor`, and that constraint is enforced
automatically as a consequence of using a `MotifWidgetFactory`.

### Applicability

Use the _Abstract Factory_ pattern when:

* System should be independent of how its products are created, composed and represented.
* System should be configured with one of multiple families of products.
* Family of related product objects is designed to be used together, and you need to enforce
this constraint. 
* You want to provide a library of products, and you want to reveal just their interfaces.

### Structure

![abstract-factory-structure](https://drive.google.com/open?id=17ZNK3Ky2UlhlwYy8j0h6iVuzW9TndSeI)

* Normally a single instance of a `ConcreteFactory` class is created at run-time. This
concrete factory creates product objects having a particular implementation. To create
different product objects, clients should use a different concrete factory.
* `AbstractFactory` defers creation of product objects to its `ConcreteFactory` subclass. 

### Consequences

1. Isolates concrete classes (implementation).
2. Makes exchanging product families easy.
3. Promotes consistency among products.
4. Supporting new kinds of products is difficult (involves changing `AbstractFactory` class and all of its subclasses).




	
