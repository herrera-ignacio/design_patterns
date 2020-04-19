# Mediator

### Intent

Encapsulate how a set of objects interact. Mediator promotes loose coupling by keeping objects from referring to each other explicitly, and it lets you vary their interaction independently.

### Applicability

Use the __Mediator__ pattern:
* define an interface for communicating with set of objects that interact with each other.
* define an interface for managing operations that involve multiple objects request.
* decouple objects that collaborate to perform a set of operations.

### Motivation

The Mediator pattern provides central authority over a group of objects by encapsulating how these objects interact. This model is useful for scenarios where there is a need to manage complex conditions in which every object is aware of any state change in any other object in the group.

The Mediator patterns are useful in the development of complex forms. Take for example a page in which you enter options to make a flight reservation. A simple Mediator rule would be: you must enter a valid departure date, a valid return date, the return date must be after the departure date, a valid departure airport, a valid arrival airport, a valid number of travelers, and only then the Search button can be activated.

![mediator example](./mediator-example)

### Structure

![iterator structure](./iterator-structure.png)

### Consequences

1. decouples objects from explicit references to each other.
2. let orchestation and interaction between objects change more easy.
3. adding new operations that involve interactions between a set of objects or modifying them more easy.