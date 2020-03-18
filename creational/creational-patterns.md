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
