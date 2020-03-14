## Object-oriented programming concepts

* Class (Concrete Class)
* Abstract Class
* Inheritance (subclasses)
* Mixin Class
* Encapsulation
* Interface
* Type
* Polymorphism
* Class versus Interface Inheritance
* Inheritance versus Composition
* Inheritance versus Parameterized Types
* Delegation

### Class (Concrete Class)

Defines object's internal data and representation, and defines the operations the
object can perform.

Objects are created by __instantiating__ a class, which allocates storage for the object's
internal data (made up of instance variables) and associates the operations with these data.

We can use OMT-based notation to represent classes.

![OMT Notation](https://upload.wikimedia.org/wikipedia/commons/9/9d/OMT_object_diagram.png)

### Abstract Class

One whose main purpose is to define a common interface for its subclasses.

An abstract class will defer some or all of its implementation to operations
defined in subclasses, hence an abstract class cannot be instantiated.

The operations that an abstract class declares but doesn't implement
are called abstract operations.

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

### Mixin Class

Class that is intended to provide an optional interface or functionality to other classes.

It's similar to an abstract class in that it's not intended to be instantiated.

Mixin classes require multiple inheritance.

![Mixin](https://www.oreilly.com/library/view/learning-javascript-design/9781449334840/httpatomoreillycomsourceoreillyimages1547815.png)

### Encapsulation

An object packages both data and the methods that operate on that data. It performs
and operation when it receives a request from a client.

Requests are the only way to get an object to execute an operation, and operations
are the only way to change an object's internal data. Because of this, the object's
internal state is said to be __encapsulated__, it cannot be accessed directly, and its
representation is invisible from outside the object.

### Interface

The set of all signatures defined by an object's operations is called the interface.
An object's interface characterizes the complete set of requests that can be sent
to the target.

Objects are known only through their interfaces.

An object's interface says nothing about its implementation, different objects
are free to implement requests differently. Two objects with completely different
implementations can have identical interfaces.

The run-time association of a request to an object and one of its operations
is known as __dynamic binding__.

### Type

Name used to denote a particular interface. We speak of an object as having the type
"Window" if it accepts all requests for the operations defined in the interface named
"Window". An object may have many types, and widely different objects can share a type.

Part of an object's interface may be characterized by one type, and other parts by
other types. Two objects of the same type need only share parts of their interfaces.

We say that a type is a __subtype__ of another if its interface contains the interface
of its supertype. Often we speak of a subtype _inheriting_ the interface of its supertype.

### Polymorphism

Issuing a request doesn't commit you to a particular implementation until run-time,
this we defined as __dynamic binding__.

Consequently, you can write programs that expect an object with a particular interface,
knowing that any object that has the correct interface will accept the request.

This __substitutability__ is known as _Polymorphism_.

It lets a client object make few assumptions about other objects beyond
supporting a particular interface. It decouples objects from each other and lets
them vary their relationships to each other at run-time.
