## oop2

### Overview

- You will learn how to create a `Character` class in Java, managing properties
  like health and name.
- You will practice implementing constructors and methods, enhancing your
  understanding of object-oriented programming.
- You will learn to manage character fights and track statuses using a static
  list.
- You will understand how to use inheritance by creating a `Monster` class that
  extends `Character`.
- You will create and use interfaces in Java to improve code organization,
  focusing on the `Tank` and `Healer` interfaces.
- You will implement a `Sorcerer` class that utilizes the `Healer` interface,
  learning about healing abilities and method overriding.
- You will explore abstract classes by making `Character` abstract, practicing
  inheritance and polymorphism.
- You will learn to create a `Weapon` class and modify the `Character` class to
  include weapon attributes.
- You will practice creating custom exceptions and handling them effectively in
  your game scenario.

### Content

#### AdventureCharacter

The goal of this exercise is to create a `Character` class in Java that manages
a character's health and name. You will implement properties such as
`maxHealth`, `currentHealth`, and `name`, including a constructor and methods to
handle taking damage and attacking another character. You will also override the
`toString` method to display character status effectively. This will help you
practice key object-oriented programming concepts.

#### AdventureUtils

The goal of this exercise is to enhance the `Character` class by adding methods
for managing characters involved in fights. You will create a private static
list to track all characters and a method to print their status. Additionally,
you will implement a `fight` method to simulate combat between two characters,
determining the winner based on health.

#### AdventureMonster

The goal of this exercise is to create a new class `Monster` that inherits from
the `Character` class. You will implement a constructor for `Monster` and
override the `toString` method to display the monster's status. This helps you
understand inheritance and method overriding in Java.

#### AdventureInterface

The goal of this exercise is to teach you how to create and use interfaces in
Java. You will define the `Tank` interface with a `getShield` method and the
`Healer` interface with `heal` and `getHealCapacity` methods. This will help you
understand how to structure code using interfaces for better organization and
modularity.

#### AdventureSorcerer

The goal of this exercise is to create a `Sorcerer` class that implements the
`Healer` interface and inherits from the `Character` class. You will add a
healing ability and implement a method to display the sorcerer's status,
focusing on two formats depending on the health. This teaches you about
interfaces, inheritance, and class properties in Java.

#### AdventureTemplar

The goal of this exercise is to implement a `Templar` class in Java that follows
the `Healer` and `Tank` interfaces while inheriting from the `Character` class.
You will define two attributes: `healCapacity` and `shield`, and create a
constructor to initialize these values. You will implement methods to manage
healing and shielding, and override the `toString` method to provide a formatted
status output for the `Templar` character. The exercise helps you understand
interfaces and inheritance in Java.

#### AdventureAbstract

The goal of this exercise is to learn how to use abstract classes and methods in
Java. You will make the `Character` class abstract, preventing direct
instantiation. You will also create abstract methods for `attack` and
`takeDamage`, requiring subclasses to implement their behavior. This will
enhance your understanding of inheritance and polymorphism as you modify the
subclasses `Monster`, `Sorcerer`, and `Templar` with specific attack and
damage-taking behaviors. Additionally, you will ensure that `currentHealth`
remains at or above zero after receiving damage.

#### AdventureWeapon

The goal of this exercise is to create a `Weapon` class that includes attributes
for weapon name and damage, along with a custom `toString` method. You will
modify the `Character` class to include a weapon attribute and use this weapon's
damage in the attack method. Finally, you will update the `toString` method in
subclasses to include the weapon's description, enabling a complete display of
character status during combat.

#### AdventureException

The goal of this exercise is to create a custom exception class named
`DeadCharacterException` that inherits from the `Exception` class in Java. You
will implement a constructor that takes a `Character` as a parameter and a
`getMessage` method that returns a specific message when a character is dead.
You will practice handling exceptions effectively by testing your class with the
`ExerciseRunner` to demonstrate its functionality.

#### AdventureCatch

The goal of this exercise is to implement exception handling in a game scenario.
You will create a `DeadCharacterException` to manage actions for character
subclasses when they are dead. The methods `attack`, `takeDamage`, and `heal`
will throw this exception, while the `fight` method will catch it. This practice
helps you understand error handling in programming.
