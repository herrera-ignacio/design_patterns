# Strategy Java Example: Ducks Simulator

* Take the parts that vary and encapsulate them, so that later you can alter or extend them without affecting those that don't change.

* We know that `fly()` and `quack()` are the parts of the `Duck` class that vary across ducks. To separate these behaviors from the `Duck` class, we'll pull both methods out and create a new set of classes to represent each behavior.

* The `Duck` subclasses won't need to know any of the implementation details for their own behaviors.

* With this design, other types of objects can reuse our fly and quack behaviors without modifying any of our existing behavior classes or touching any of the Duck classes that use flying/quacking behaviors.

* The key is that a Duck will now *delegate* its flying and quacking behavior.

* You can change a duck's behavior at runtime by calling its setter method for that behavior.