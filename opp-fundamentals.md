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
* Composition
* Inheritance versus Composition
* Delegation
* Inheritance versus Parameterized Types

# Principles of object-oriented design

* Programming to an Interface, not an Implementation
* Favor object composition over class inheritance

### Class (Concrete Class)

Defines object's internal data and representation, and defines the operations the
object can perform. Defines _how the object is implemented_.

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

### Class versus Interface Inheritance (sub-typing)

Class inheritance defines an object's implementation in terms of another object's implementation.
In short, its a mechanism for code and representation sharing.

Interface inheritance or _sub-typing_ describes when an object can be used in place of another.

### Composition

Object composition is an alternative to class inheritance. Here, new functionality is obtained
by assembling or _composing_ objects to get more complex functionality. This requires that
the objects being composed have well-defined interfaces, no internal details of objects are visible.

### Inheritance versus Composition

Class inheritance is defined statically at compile-time and is straightforward to use. It also makes
it easier to modify the implementation being reused. When a subclass overrides some but not all
operations, it can affect the operations it inherits as well. But class inheritance has its disadvantages
too. First, you can't change implementations inherited at run-time, second, and generally worse,
parent classes often define at least part of their subclasses' physical representation.
Because inheritance exposes a subclass to details of its parent's implementation, it's often said that
"_inheritance breakes encapsulation_", as implementation of a subclass becomes so bound up with
the implementation of its parent class that any change in the parent's implementation will force
the subclass to change.

Object composition is defined dynamically at run-time through objects acquiring references to another
objects, which requires objects to respect each others' interfaces, which in turn requires carefully
designed interfaces that don't stop you from using one object with many others. Because objects
are accessed solely through their interfaces, we don't break encapsulation, there are substantially
fewer implementation dependencies. Object composition helps you keep each class encapsulated and
focused on one task. Your classes and class hierarchies will remain small.

### Delegation

Make composition as powerful for reuse as inheritance. In delegation, _two_ objects are involved in
handling a request: __a receiving object relegates operations to its delegate__. This is analogous
to subclasses deferring requests to parent classes, but with inheritance, an inherited operation can
always refer to the receiving object through the `this` member in C++ for example. To achieve the
same effect with delegation, the receiver passes itself to the delegate to let the delegated operation
refer to the receiver.

For example, instead of making class Window a subclass of Rectangle (because windows happen to be
rectangular), the Window class might reuse the behavior of Rectangle by keeping a Rectangle instance
variable and _delegating_ Rectangle-specific behavior to it. Window must now forward requests to its
Rectangle instance explicitly, whereas before it would have inherited those operations.

The main advantage of delegation is that it makes it easy to compose behaviors at runtime and to
change the way they're composed. Our window can become circular at run-time simply by replacing
its Rectangle instance with a Circle instance, assuming they have the same type.

Delegation has a disadvantage it shartes with other techniques that make software more flxible
through object composition: __dynamic, highly parameterized software is harder to understand
than more static software__. There are also run-time inefficiencies, but the human  inefficiencies
are more important in the long run. Delegation is only a good design choice when it simplifies more
than it complicates.

### Inheritance versus Parameterized Types

Parameterized types, also known as _generics_ (Ada, Eiffel) and _templates_ (C++) is a technique that
lets you define a type without specifying all the other types it uses. The unspecified types are
supplied as parameters at the point of use. The language implementation will create a customized version
of the class template for each type of element.

Parameterized types give us a third way (in addition to class inheritance and object composition)
to compose behavior in object-oriented designs, letting you change the types that a class can use (compile-time).

Parameterized types aren't needed at all in a language that doesn't have complile-time type checking.

## Principles of object-oriented design

### Programming to an Interface, not an Implementation

Implementation reuse is only half the story. Inheritance's ability to define families of
objects with _identical_ interfaces (usually by inheriting from an abstract class) is also
important. Why? Because __polymorphism depends on it__.

When inheritance is used _properly_, all classes derived from an
abstract class will share its interface. This implies that a subclass merely
adds or overrides operations, and does not hide operations of the parent class.

All subclasses can then respond to the requests in the interface of the abstract parent class,
making them __subtypes of the abstract class__.

There are two benefits to manipulating objects solely in terms of the interface defined by
abstract classes:

1. Clients remain unaware of the specific types of objects they use, as long as the
objects adhere to the interface that client expect.
2. Clients remain unaware of the classes that implement these objects, they only know
about the abstract class(es) defining the interface.

This so __greatly reduces implementation dependencies__ between subsystems that it leads
to the principle: _Program to an interface, not an implementation_.

### Favor object composition over class inheritance

Ideally, you shouldn't have to create new components to achieve reuse. You should be able to
get all functionality you need just by assembling existing components through object composition.
This is rarely the case, because the set of available components is never quite rich enough in
practice. Reuse by inheritance makes it easier to make new components that can be composed with
old ones. Inheritance and object composition thus work together.

Nevertheless, designs are often made more reusable (and simpler) by depending more on object
composition.
