# Behavioral Patterns

Behavioral patterns are concerned with algorithms and the assignment of responsibilities between objects. They describe not just patterns of objects or classes but also the patterns of communication between them. These patterns characterize complex control flow that's difficult to follow at run-time. They shift your focus away from flow of control to let you concentrate just on the way objects are interconnected.

With a few exceptions, behavioral patterns complement and reinforce each other.

### Discussion on Behavioral Patterns

#### Encapsulating Variation

_Encapsulating Variation_ is a theme for many behavioral patterns.

When an aspect of a program changes frequently, these patterns define an object that encapsulates that aspect. Then other parts of the program can collaborate with the object whenever they depend on that aspect.

The patterns usually define an abstract class that describes the encapsulating object, and the pattern derives its name from that object. For example:

* Strategy object encapsulates an algorithm.
* State object encapsulates a state-dependent behavior.
* Mediator object encapsulates the protocol between objects.
* Iterator object encapsulates the way you access and traverse the components of an aggregate object.

These patterns describe aspects of a program that are likely to change.

#### Objects as Arguments

Several patterns introduce an object that's _always_ used as an argument. One of these is Visitor. A Visitor's object is the argument to a polymorphic Accept operation on the objects it visits.

Other patterns define objects that act as magic tokens to be passed around and invoked at a later time. Both Command and Memento fall into this category.

#### Should Communication be Encapsulated or Distributed?

Mediator and Observer are competing patterns. Observer distrubites communication by introducing Observer and Subject objects, whereas a Mediator object encapsulates the communication between other objects.

In the Observer pattern, there is no single object that encapsulates a constraint. Instead, Observer and Subject must cooperate to maintain the constraint. Mediator centralizes rather than distributes. It places the responsibility for maintaining a constraint squarely in the mediator.

#### Decoupling Senders and Receivers

When collaborating objects refer to each other directly, they come dependent on each other, and that can have an adverse impact on the layering and reusability of a system.

Command, Observer, Mediator, and Chain of Responsibility address how you can decouple senders and receivers but with different trade-offs.