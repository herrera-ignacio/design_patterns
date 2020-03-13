## Object-oriented programming concepts

* Encapsulation
* Interface
* Type
* Polymorphism
* Class versus Interface Inheritance
* Inheritance versus Composition
* Inheritance versus Parameterized Types
* Delegation

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
