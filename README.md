# Design Patterns

## :pushpin: Description

Theory and practical examples of design patterns in multiple programming languages (C++, Javascript and Python).

I want to address the following points in this project:
* What are design patterns and why are they important?
* Real-life working examples

## :books: Bibliography

* :closed_book: [Design Patterns: Elements of Reusable Object-Oriented Software](https://www.amazon.com/Design-Patterns-Elements-Reusable-Object-Oriented/dp/0201633612)
* :closed_book: [Software Design Patterns: Wikipedia](https://en.wikipedia.org/wiki/Software_design_pattern)
* :closed_book: [Gang of Four - Cheatsheet](./GangOfFour-Cheatsheet.pdf)

## :clipboard: Design Pattern Catalog

* [What is a Design Pattern?](./introduction/design-pattern.md)

| [Creational](./creational) | [Structural](./structural) | [Behavioral](./structural/behavioral-patterns) |
|------------------	|------------	|------------	|
| [Abstract Factory](./creational/abstract-factory) | [Adapter](./structural/adapter) | [Chain of Responsibility](./behavioral/chain-of-responsibility/chain-of-responsibility.md) |
| [Builder](./creational/builder) | [Bridge](./structural/bridge/bridge.md) | [Command](./behavioral/command/command.md) |
| [Factory Method](./creational/factory-method) | [Composite](./structural/composite/composite.md) | [Interpreter](./behavioral/interpreter/interpreter.md) |
| [Prototype](./creational/prototype) | [Decorator](./structural/decorator/decorator.md) | [Iterator](./behavioral/iterator/iterator.md) |
| [Singleton](./creational/singleton) | [Facade](./structural/facade/facade.md) | [Mediator](./behavioral/mediator/mediator.md) |
| | [Flyweight](./structural/flyweight/flyweight.md) | [Memento](./behavioral/memento/memento.md) |
| | [Proxy](./structural/proxy/proxy.md) | [Observer](./behavioral/observer/observer.md) |
| | | [State](./behavioral/state/state.md) |
| | | [Strategy](./behavioral/strategy/strategy.md) |
| | | [Template Method](./behavioral/template-method/template-method.md) |
| | | [Visitor](./behavioral/visitor) |

* [Creational Patterns](./creational)
    * [Abstract Factory](./creational/abstract-factory): Provide an interface for creating families of related or dependent objects without specifying their concrete classes.
	* [Builder](./creational/builder): Separate the construction of a complex object from its representation so that the same construction process can create different representations.
	* [Factory Method](./creational/factory-method): Define an interface for creating an object, but let subclasses decide which class to instantiate.
	* [Prototype](./creational/prototype): Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.
	* [Singleton](./creational/singleton): Ensure a class only has one instance, and provide a global point of access to it.
	
* [Structural Patterns](./structural)
    * [Adapter (or Wrapper)](./structural/adapter): Convert the interface of a class into another interface clients expect.
    * Bridge (or Handle/Body)
	* Composite
    * Decorator (or Wrapper)
    * Flyweight
    * Proxy (or Surrogate)

* [Behavioral Patterns](./behavioral/behavioral-patterns.md)
    * Chain of Responsibility
    * Command
    * Interpreter
    * Iterator
    * Mediator
    * Memento
    * Observer
    * State
    * Strategy
    * Template Method
    * Visitor

### Selecting a design pattern

1. Study patterns' intents and how they interrelate.

2. Examine causes of redesign.

3. Consider what should be variable in your design.

#### Causes of redesign

* __Creating an object by specifying a class explicitly__. This commits you to a particular implementation instead of a particular interface. To avoid it, create objects indirectly.
    * Design patterns: _Abstract Factory, Factory Method, Prototype._

* __Dependence on specific operations__.  When you specify a particular operation, you commit to one way of satisfying a request. By avoiding hard-coded requests, you can make it easier to change the way a request gets satisfied both at compile-time and at run-time.
    * Design patterns: _Chain of Responsibility, Command_.

* __Dependence on hardware and software platform__. Software that depends on a particular platform will be harder to port to other platforms. It may even be difficult to keep it up to date on its native platform. It's important therefore to design your system to limit its platform dependencies.
    * Design patterns: _Abstract Factory, Bridge_.

* __Dependence on object representations or implementations__. Clients that know how an object is represented, stored, located, or implemented might need to be changed when the object changes. Hiding this information from clients keeps changes from cascading.
    * Design patterns: _Abstract Factory, Bridge, Memento, Proxy_.

* __Algorithmic dependencies__. Algorithms are often extended, optimized, and replaced during development and reuse. Objects that depend on an algorithm will have to change when the algorithm changes. Therefore algorithms that are likely to change should be isolated.
    * Design patterns: _Builder, Iterator, Strategy, Template Method, Visitor_.

* __Tight coupling__. Classes that are tightly coupled are hard to reuse in isolation, since they depend on each other. Tight coupling leads to monolithic systems, where you can't change or remove a class without understanding and changing many other classes. The system becomes a dense mass that's hard to learn, port, and maintain. Loose coupling increases portabiliy and makes that a system can be learned, ported, modified, and extended more easily.
    * Design patterns: _Abstract Factory, Bridge, Chain of Responsibility, Command, Facade, Mediator, Observer_.

* __Extending functionality by subclassing__. Every new class has a fixed implementation overhead (initialization, finalization, etc.). Defining a subclass also requires an in-depth understanding of the parent class. Subclassing can lead to an explosion of classes, because you might have to introduce many new subclasses for even a simple extension. Object composition in general and delegation in particular provide flexible alternatives to inheritance for combining behavior. On the other hand, heavy use of object composition can make designs harder to understand. Many design patterns produce designs in which you can introduce customized functionality just by defining one subclass and composing its instances with existing ones.
    * Design patterns: _Bridge, Chain of Responsibility, Composite, Decorator, Observer, Strategy_.

* __Inability to alter classes conveniently__. Sometimes you have to modify a class that can't be modified conveniently.
    * Design patterns: _Adapter, Decorator, Visitor_.


#### Aspects that can vary

| Purpose    	| Design Pattern          	| Aspect(s) That Can Vary                                                                     	|
|------------	|-------------------------	|---------------------------------------------------------------------------------------------	|
| Creational 	| Abstract Factory        	| Families of product objects.                                                                	|
|            	| Builder                 	| How a composite object gets created.                                                        	|
|            	| Factory Method          	| Subclass of object that is instantiated.                                                    	|
|            	| Prototype               	| Class of object that is instantiated.                                                       	|
|            	| Singleton               	| The sole instance of a class.                                                               	|
| Structural 	| Adapter                 	| Interface to an object.                                                                     	|
|            	| Bridge                  	| Implementation of an object.                                                                	|
|            	| Composite               	| Structure and composition of an object.                                                     	|
|            	| Decorator               	| Responsibilities of an object without subclassing.                                          	|
|            	| Facade                  	| Interface to a subsystem.                                                                   	|
|            	| Flyweight               	| Storage costs of objects.                                                                   	|
|            	| Proxy                   	| How an object is accessed; its location.                                                    	|
| Behavioral 	| Chain of responsibility 	| Object that can fulfill a request.                                                          	|
|            	| Command                 	| When and how a request is fulfilled.                                                        	|
|            	| Interpreter             	| Grammar and interpretation of a language.                                                   	|
|            	| Iterator                	| How an aggregate's elements are accessed, traversed.                                        	|
|            	| Mediator                	| How and which object interact with each other.                                              	|
|            	| Memento                 	| What private information is stored outside an object, and when.                             	|
|            	| Observer                	| Number of objects that depend on another object, how the dependent objects stay up to date. 	|
|            	| State                   	| States of an object.                                                                        	|
|            	| Strategy                	| An algorithm.                                                                               	|
|            	| Template Method         	| Steps of an algorithm.                                                                      	|
|            	| Visitor                 	| Operations that can be applied to object(s) without changing their class(es).               	|

### :fire: Status

:heavy_check_mark: Completed all Object-Oriented Design Patterns from GoF

:heavy_check_mark: Javascript examples

:point_right: Refactor Javascript examples using Typescript

:point_right: C++ examples

:point_right: Rearrange folder structure
