# 4 Pillars of OOP

* Abstraction
* Inheritance
* Encapsulation
* Polymorphism

### Abstraction

__Abstraction of data or hiding information__.

Abstraction is the process of showing only essential/necessary features of an entity to the outside world
and hide the other irrelevant information. For example, to turn on your TV we only have a power button,
it is not required to understand how infra-red waves are getting generated in TV remote control.

### Inheritance (subclasses)

New classes can be defined in terms of existing classes using __class inheritance__. When a
__subclass__ inherits from a parent class, it includes the definitions of all the data and
operations that the parent class defines.

Class inheritance lets you define classes simply by extending other classes, making it easy to
define families of objects having related functionality.

A subclass may override an operation defined by its parent class. Overriding gives subclasses a chance
to handle requests instead of their parent class.

Objects that are instances of the subclass will contain all data defined by the subclass and
its parent classes, and they'll be able to perform all operations defined by both.

### Encapsulation

__Binding of data and functions that manipulate the data together__. Keep both safe
from outside interference and misuse.

An object packages both data and the methods that operate on that data. It performs
and operation when it receives a request from a client.

Requests are the only way to get an object to execute an operation, and operations
are the only way to change an object's internal data. Because of this, the object's
internal state is said to be __encapsulated__, it cannot be accessed directly, and its
representation is invisible from outside the object.

### Polymorphism

Issuing a request doesn't commit you to a particular implementation until run-time,
this we defined as __dynamic binding__.

Consequently, you can write programs that expect an object with a particular interface,
knowing that any object that has the correct interface will accept the request.

This __substitutability__ is known as _Polymorphism_.

It lets a client object make few assumptions about other objects beyond
supporting a particular interface. It decouples objects from each other and lets
them vary their relationships to each other at run-time.

