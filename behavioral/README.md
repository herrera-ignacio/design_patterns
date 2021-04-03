# Behavioral Patterns

Behavioral patterns are concerned with algorithms and the assignment of responsibilities between objects, they describe patterns ofcommunication between them. These patterns characterize complex control flow that's difficult to follow at run-time. They shift your focus away from flow of control to let you concentrate just on the way objects are interconnected.

Behavioral _class_ patterns use _inheritance_ to distribute behavior between classes (_Template Method_ and _Interpreter_).

Behavioral _object_ patterns use _object composition_ rather than inheritance. Some describe how a group of peer objects cooperate to perform a task that no single object can carry out by itself. An important issue here is how peer objects know about each other. Peers could maintain explicit references to each other, but that would increasse their coupling (_Mediator, Chain of Responsibility, Observer_).

Other behavioral _object_ patterns are concerned with _encapsulating behavior_ in an object and delegating requests to it (_Strategy, Command, State, Visitor, Iterator_).
