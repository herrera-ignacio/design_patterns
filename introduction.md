## Introduction

Designing object-oriented software is hard, and designing _reusable_ object-oriented software
is even harder. Your design should be specific to the problem at hand but also general
enough to address future problems and requirements.

Design patterns help you choose design alternatives that make a system reusable and avoid
alternatives that compromise re-usability. Design patterns can even improve the documentation
and maintenance of existing systems by furnishing an explicit specification of class and object
interactions and their underlying intent.

GoF book doesn't have patterns dealing with concurrency, distributed programming or real-time programming.
It doesn't tell you how to build user interfaces, how to write device drives, or how to use an object-oriented
database. Each of these areas has its own patterns, and it would be worthwhile for someone to catalog those too.

* What is a Design Pattern?
* Catalog of design patterns
* How design patterns solve design problems
* Common causes of redesign
* How to select a design pattern

---

### What is a Design Pattern?

> Each pattern describes a problem which occurs over and over again in our environment, and then
describes the core of the solution to that problem.
>

In general, a pattern has four essential elements:

1. The __pattern name__ is a handle. It lets us design at a higher level of abstraction.
Having a vocabulary for patterns lets us talk about them with our colleagues, and even to ourselves.
It makes it easier to think about designs and to communicate them and their trade-offs to others.
2. The __problem__ describes when to apply the pattern.
3. The __solution__ describes the elements that make up the design, their relationships,
responsibilities, and collaborations. The solution doesn't describe a particular concrete design
or implementation, instead, it provides an abstract description of a design problem and how a 
general arrangement of elements solves it.
4. The __consequences__ are the results and trade-offs of applying the pattern. Critical for evaluating
design alternatives and for understanding the costs and benefits of applying the pattern. Often concern
space and time trade-offs. Since reuse is often a factor in object-oriented design, the consequences of a pattern
include its impact on a system's flexibility, extensibility, or portability. 

---

### Catalog of Design Patterns

#### By Purpose

* __Creational__: concern the process of object creation
* __Structural__: deal with the composition of classes or objects
* __Behavioral__: characterize the ways in which classes or objects interact and distribute responsibility.

#### By Scope

Whether pattern applies primarily to classes or to objects.

* __Class__ patterns deal with relationships between classes and their subclasses. Relationships are established
through inheritance, so they are static-fixed at compile-time.

* __Object__ patterns deal with object relationships,
which can be changed at run-time and are more dynamic.

Creational class patterns defer some part of object creation to subclasses, while Creational object patterns defer it
to another object.

Structural class patterns use inheritance to compose classes, while Structural object patterns describe
ways to assemble objects.

Behavioral class patterns use inheritance to describe algorithms and flow of control, where as the Behavioral object
patterns describe how a group of objects cooperate to perform a task that no single object can carry out alone.

#### Relationships

![relationships](https://www.researchgate.net/profile/Seppo_Kuikka/publication/35704344/figure/fig7/AS:669538915991561@1536641925670/Design-Pattern-relationships-from-Gamma-et-al-1995.png)

### How design patterns solve design problems

* Finding Appropriate Objects
* Determining Object Granularity
* Specifying Object Interfaces
* Specifying Object Implementations
* Putting Reuse Mechanisms to Work
* Relating Run-Time and Compile-Time Structures
* Designing for Change

#### Finding Appropriate Objects

The hard part about object-oriented design is decomposing a system into objects.
Many object-oriented designs often end up with classes that have no counterparts
in the real world. Strict modeling of the real world leads to a system that
reflects today's realities but not necessarily tomorrow's. Abstractions that emerge
during design are key to making a design flexible.

Design patterns help you identify less-obvious abstractions and the objects that can
capture them.

#### Determining Object Granularity

How do we decide what should be an object?

#### Specifying Object Interfaces

Design patterns help you define interfaces by identifying their key elements and the
kinds of data that get sent across an interface. A design pattern might also tell you
what _not_ to put in the interface.

Design patterns also specify relationships between interfaces. In particular, they often
require some classes to have similar interfaces, or they place constraints on some of their interfaces.


By abstracting the process of object creation, the design patterns give you
different ways to associate an interface with its implementation transparently at
instantiation. Creational patterns ensure that your system is written in terms of interfaces,
not implementations.

#### Putting Reuse Mechanisms to Work

Most people can understand concepts like objects, interfaces, classes and inheritance.
The challenge lies in applying them to build flexible, reusable software,
and design patterns can show you how.

#### Relating Run-Time and Compile-Time Structures

An object-oriented program's run-time structure often bears little resemblance to its code structure.
The code structure is frozen at compile-time, it consists of classes in fixed inheritance relationships.
A program's run-time structure consists of rapidly changing networks of communicating objects.

The system's run-time structure must be imposed more by the designer than the language. The relationships
between objects and their types must be designed with great care, because they determine how good or bad
the run-time structure is.

Many design patterns capture the distinction between compile-time and run-time structures explicitly.

#### Designing for Change

Key to maximizing reuse lies in anticipating new requirements and changes to existing requirements, and
in designing your systems so that they can evolve accordingly.

To design the system so that it's robust to such changes, you must consider how the system might need to
change over its lifetime.

Design patterns help you by ensuring that a system can change in specific ways. Each design pattern let
some aspect of system structure vary independently of other aspects, thereby making a system more robust
to a particular kind of change.

---

### Common causes of redesign

#### 1. Creating an object by specifying a class explicitly

This commits you to a particular implementation instead of a particular interface, which can
complicate future changes. To avoid it, create objects indirectly.

* Abstract Factory
* Factory Method
* Prototype

#### 2. Dependence on specific operations

This commits you to one way of satisfying a request. By avoiding hard-coded requests, you make it
easier to change the way a request gets satisfied both at compile-time and run-time.

* Chain of Responsibility
* Command

#### 3. Dependence on hardware and software platform

It's important to design your system to limit its platform dependencies.

* Abstract Factory
* Bridge

#### 4. Dependence on object representations or implementations

Clients that know how an object is represented, stored, located, or implemented,
might need to be changed when the object changes. Hiding this information from clients keeps
changes from cascading.

* Abstract Factory
* Bridge
* Memento
* Proxy

#### 5. Algorithmic dependencies

Algorithms are often extended, optimized, and replaced during development and reuse.
Objects that depend on an algorithm will have to change when the algorithm changes.
Therefore algorithms that are likely to change should be isolated.

* Builder
* Iterator
* Strategy
* Template Method
* Visitor

#### 6. Tight coupling

Classes that are tightly coupled are hard to reuse in isolation, since they depend on each other.
Tight coupling leads to monolithic systems, where you can't change or remove a class without
understanding and changing many other classes. The system becomes a dense mass that's hard to learn,
port and maintain.

Loose coupling increases the probability that a class can be reused by itself and that a system can be
learned, ported, modified, and extended more easily.

Design patterns use techniques such as abstract coupling and layering to promote loosely coupled systems.

* Abstract Factory
* Bridge
* Chain of responsibility
* Command
* Facade
* Mediator
* Observer

#### 7. Extending functionality by sub-classing

Defining a subclass requires an in-depth understanding of the parent class. For example, overriding
an operation might require overriding another. Sub-classing can lead to an explosion of classes,
because you might have to introduce many new subclasses for even a simple extension.

Object composition in general and delegation in particular provide flexible alternatives to inheritance
for combining behavior. New functionality can be added by composing existing objects in new ways. On
the other hand, heavy use of object composition can make designs harder to understand.

* Bridge
* Chain of Responsibility
* Composite
* Decorator
* Observer
* Strategy

#### 8. Inability to alter classes conveniently

Sometimes you have to modify a class that can't be modified conveniently. Perhaps you need the
source code and don't have it (as may be the case with third-party class library). Or maybe any change
would require modifying lots of existing subclasses.

* Adapter
* Decorator
* Visitor

---

### How to select a design pattern

The choice of programming language is important because it influences one's point of view. We assume level
language features, and that choice determines what can and cannot be implemented easily. Some patterns are
supported directly by some object-oriented languages, which lessen the need for some patterns. Some patterns
can be expressed more easily in one language than other.

Here are several different approaches to finding the design pattern that's right for your problem.

#### 1. Consider how design patterns solve design problems

Consider discussions about how design patterns help you find appropriate objects, determine object
granularity, specify object interfaces, and several other ways.

#### 2. Scan Intent

Read through each pattern's intent to find one or more that sound relevant to your problem.

#### 3. Study how patterns interrelate

This may guide you to the right pattern or group of patterns

#### 4. Study patterns of like purpose

Patterns from a same categorization (creational, structural or behavioral) share similarities and
differences between patterns of like purpose.

#### 5. Consider what should be variable in your design

This approach is the opposite of focusing on the causes of redesign. Instead of considering what might
_force_ to change to a design, consider what you want to be _able_ to change without redesign. The focus
here is on _encapsulating the concept that varies_.


