## oop1

### Overview

You will learn several important concepts by completing the quests related to
the `CelestialObject` class and its extensions:

- **Class Structure**: Creating properties in a class helps you understand how
  to organize data in Java.
- **Constructors**: You will learn how to create default and parameterized
  constructors to initialize objects.
- **Getters and Setters**: Implementing these methods allows safe access and
  modification of property values.
- **Static Methods**: You will practice creating methods that belong to the
  class itself, which can perform operations like distance calculations.
- **Class Methods**: Adding methods like `toString`, `equals`, and `hashCode`
  will enhance the usability of your classes.
- **Inheritance**: You will understand how one class can extend another, reusing
  properties and methods.
- **Method Overriding**: You will learn to customize inherited methods for
  specific needs.
- **Encapsulation**: Managing lists and properties in classes teaches you data
  hiding and access control.
- **Data Aggregation**: You will learn to compile data, improving your skills in
  handling collections and maps.

By working through these exercises, you will gain practical experience in Java
programming and object-oriented concepts.

### Content

#### StarProperties

The goal of this exercise is to create a Java class called `CelestialObject`
with four properties: x, y, z as doubles for coordinates, and name as a String.
You will practice declaring properties and using them in another class,
`ExerciseRunner`, to test their default values. This helps you understand class
structure in Java.

#### StarConstructors

In this exercise, you will create two constructors for the `CelestialObject`
class. The default constructor initializes the properties `x`, `y`, and `z` to
`0.0` and sets `name` to `"Soleil"`. The second constructor allows you to set
all four values with parameters. You will use the provided `ExerciseRunner.java`
code to test your constructors and verify that the objects are created
correctly.

#### StarGetters

The goal of the exercise is to implement getters and setters for the properties
of the `CelestialObject` class. This will allow you to access and modify the
`x`, `y`, `z`, and `name` properties safely. You will create methods `getX`,
`setX`, `getY`, `setY`, `getZ`, `setZ`, `getName`, and `setName` to enhance the
class's functionality, ensuring proper management of its data.

#### StarStatic

The goal of this exercise is to compute the distance between celestial objects
using their coordinates in the Astronomical Unit (AU). You will create two
static methods, `getDistanceBetween` and `getDistanceBetweenInKm`, to calculate
the distance in both AU and kilometers. Additionally, you will define a
constant, `KM_IN_ONE_AU`, for conversion between AU and km. This will enhance
your understanding of static methods and mathematical operations in Java.

#### StarUtils

The goal of this exercise is to enhance the functionality of the
`CelestialObject` class by adding useful methods. You will implement the
`toString` method to provide a formatted output of the object's properties, the
`equals` method to compare two objects for equality, and the `hashCode` method
to ensure that equal objects produce the same hash code. This will improve the
class's usability and compatibility within collections.

#### StarInheritance

The goal of this exercise is to create a new class `Star` that extends the
existing class `CelestialObject`. You will add a private double property named
`magnitude`, and implement public getter and setter methods for it. This will
enhance your understanding of inheritance and how subclasses work in Java,
allowing you to access and display properties of the `Star` class.

#### StarOverride

The goal of this exercise is to enhance the `Star` class by adding a new
constructor that initializes its properties, such as `name`, positions, and
`magnitude`. You will also override the `hashCode`, `equals`, and `toString`
methods, ensuring the use of `magnitude` for comparisons and formatting the
string output appropriately. This exercise helps you practice object-oriented
programming and method overriding in Java.

#### StarPlanet

The goal of this exercise is to create a `Planet` class that inherits from
`CelestialObject`. You will define properties and constructors, including
handling a `centerStar`. You will implement methods to get and set the
`centerStar`, override `hashCode` and `equals`, and create a custom `toString`
method to format its output. This helps you practice object-oriented programming
concepts in Java.

#### StarGalaxy

The goal of this exercise is to create a `Galaxy` class that manages a list of
`CelestialObject` instances. You will implement a private property to hold the
list, a constructor to initialize it, a getter to access the list, and a method
to add celestial objects. This helps you practice object-oriented programming,
encapsulation, and list management in Java.

#### StarMass

The goal of this exercise is to compute the mass of celestial objects in a
galaxy based on their types (Star, Planet, Other). You will add a mass property
to the relevant classes, including getters and setters. Then, you will implement
a method called `computeMassRepartition` in the Galaxy class to return a map
containing the total masses for each type of object. This strengthens your
understanding of object-oriented programming and data aggregation in Java.
