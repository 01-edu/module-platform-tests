## design-patterns

### Overview

You will learn several important design patterns by completing this quest.

- **Singleton Pattern**: You will understand how to ensure only one instance of
  a class exists, allowing control over instance creation. You will practice
  creating a method that provides this instance.

- **Factory Pattern**: You will learn how to create objects without specifying
  the exact class. This will help you separate object creation logic from its
  use.

- **Builder Pattern**: You will see how to construct complex objects using
  builder classes, allowing you to manage attributes easily and create different
  types of objects.

- **Decorator Pattern**: You will learn how to enhance existing classes with new
  functionality without modifying their source code. This promotes flexibility
  and reusability.

- **Strategy Pattern**: You will understand how to define a family of
  algorithms, allowing you to choose one at runtime. This promotes clean code
  and makes it easier to change behavior.

- **Observer Pattern**: You will learn to notify multiple objects about state
  changes, managing subscriptions and event updates effectively.

These skills will deepen your understanding of object-oriented programming and
improve your coding practice.

### Content

#### Singleton

The goal of this exercise is to implement the singleton design pattern in the
Excalibur class. You will create a class that ensures only one instance exists,
which can be accessed via the `getInstance` method. This method should always
return the instance of Excalibur with the name "Sword." You will also test this
implementation using the provided ExerciseRunner class, confirming that it
outputs "Sword."

#### Factory

The goal of this exercise is to implement the Factory Design Pattern in Java.
You will create classes based on the provided class diagram. This includes the
Driver, CarDriver, PlaneDriver, Transport, Car, Plane, DriverFactory, and
TransportFactory classes. You will ensure that CarDriver returns a Car with a
distance of 600 and PlaneDriver returns a Plane with a distance of 10000.
Finally, you will test your implementation using ExerciseRunner.java to confirm
that the output is correct.

#### Builder

The goal of this exercise is to implement the Builder Design Pattern using Java.
You will create classes that represent housing types, such as House and
Apartment, along with their builders, HouseBuilder and ApartmentBuilder. You
will also implement methods to set their attributes and build specific housing
instances. Finally, you will test the implementation by creating a house and an
apartment, ensuring they display their details correctly.

#### Decorator

The goal of this exercise is to implement the Decorator Design Pattern using the
Raclette theme. You will create classes that represent the basic raclette and
its decorators, such as WithPickles and WithColdMeats. Each decorator class will
modify the calories and ingredients, demonstrating how to enhance functionality
without changing the original class. You will also implement the `toString`
method for output clarity.

#### Strategy

The goal of this exercise is to implement the Visitor Design Pattern by creating
a `Context` class that uses different strategy classes (AddStrategy,
ConcatStrategy, MaxStrategy) to perform various operations on two integers. You
will set up the classes according to the provided diagram, enabling dynamic
changes in the strategy used for execution. This promotes clean code and
flexibility in choosing operations. You will also test your implementation with
the `ExerciseRunner` class to see the results.

#### Observer

The goal of this exercise is to implement the Observer Design Pattern. You will
create classes that allow a `ValuePublisher` to notify multiple observers
(`BinaryBaseObserver`, `DecimalBaseObserver`, and `HexaBaseObserver`) of state
changes. Each observer will store and return its events in different numerical
bases. You will learn how to manage subscriptions and event updates effectively.
