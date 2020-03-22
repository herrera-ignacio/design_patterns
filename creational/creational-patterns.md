# Creational Patterns

Creational design patterns __abstract the instantiation process__. They help make a system independent
of how its objects are created, composed, and represented.

A class creational pattern uses inheritances to vary the class that's instantiated,
whereas an object creational pattern will delegate instantiation to another object.

Creational patterns become important as systems evolve to depend more on object
composition than class inheritance. As that happens, emphasis shifts away from hard-coding
a fixed set of behaviors toward defining a smaller set of fundamental behaviors that can be
composed into any number of more complex ones.

There are two recurring themes in these patterns:

1. Encapsulate all knowledge about which concrete class the system uses.
2. Hide how instances of these classes are created and put together.

All the system at large knows about the objects is their interfaces as defined by abstract classes.

A big barrier to change lies in hard-coding the classes that get instantiated. Creational patterns
provide different ways to remove explicit references to concrete classes from code that needs to
instantiate them.

### Discussion of Creational Patterns

I encourage you to read the following only once you've seen all creational patterns description and examples.

There are two common ways to parameterize a system by the classes of objects it creates:

1. Subclass the class that creates the objects (__Factory Method__). Main drawback is that it
can require creating a new subclass just to change the class of the product. Such changes can cascade.

2. Relying in object composition. Define an object that's responsible for knowing the class of the
product objects, and make it a parameter of the system. This is a key aspect of the __Abstract Factory,
Builder__ and __Prototype__ patterns. All three involve creating a new "factory object" whose responsibility
is to create product objects. __Abstract Factory__ has the factory object producing objects of several classes.
__Builder__ has the factory object building a complex product incrementally using a correspondingly complex
protocol. __Prototype__ has the factory object building a product by copying a prototype object. In this case,
the factory object and the prototype are the same object, because the prototype is responsible for 
returning the product.

People often use __Factory Method__ as the standard way to create objects, but it isn't necessary when
the class that's instantiated never changes or when instantiation takes place in an operation that
subclasses can easily override.

Designs that use __Abstract Factory, Prototype or Builder__ are even more flexible than those that use
__Factory Method__, but they're also more complex. Often, designs start out using __Factory Method__ and
evolve toward the other Creational Patterns as the designer discovers where more flexibility is needed.

Knowing many design patterns gives you more choices when trading off one design criterion against another.