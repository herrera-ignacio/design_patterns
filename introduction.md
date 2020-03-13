## Introduction

Designing object-oriented software is hard, and designing _reusable_ object-oriented software
is even harder. Your design should be specific to the problem at hand but also general
enough to address future problems and requirements.

Design patterns help you choose design alternatives that make a system reusable and avoid
alternatives that compromise reusability. Design patterns can even improve the documentation
and maintenance of existing systems by furnishing an explicit specification of class and object
interactions and their underlying intent.

GoF book doesn't have patterns dealing with concurrency, distributed programming or real-time programming.
It doesn't tell you how to build user interfaces, how to write device drives, or how to use an object-oriented
database. Each of these areas has its own patterns, and it would be worthwhile for someone to catalog those too.

* What is a Design Pattern?
* Catalog of design patterns
* How design patterns solve design problems
* How to select a design pattern
* How to use a design pattern

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
* Programming to an Interface, not an Implementation
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

### How to select a design pattern

The choice of programming language is important because it influences one's point of view. We assume level
language features, and that choice determines what can and cannot be implemented easily. Some patterns are
supported directly by some object-oriented languages, which lessen the need for some patterns. Some patterns
can be expressed more easily in one language than other.
