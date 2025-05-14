## Checkpoint 02-java

### Overview

To achieve the checkpoint for your exercises, you will need to demonstrate the
following skills:

- **Object-Oriented Programming**: Understand classes, objects, attributes,
  methods, inheritance, and encapsulation.
- **Class Design**: Create classes with appropriate attributes and methods,
  including constructors.
- **Method Implementation**: Write methods for adding, updating, and retrieving
  data.
- **Data Structures**: Implement linked lists, arrays, and matrix manipulations
  effectively.
- **Error Handling**: Ensure methods handle various inputs, including invalid
  ones.
- **Abstract Classes and Interfaces**: Utilize abstract classes and interfaces
  for design and structure.
- **Algorithm Design**: Create efficient algorithms for sorting, searching, and
  processing data.
- **String Manipulation**: Handle and manipulate string data, including
  comparisons and substring searches.
- **Mathematical Calculations**: Perform calculations, such as areas and
  factorials, using both iterative and recursive methods.
- **Testing**: Write test cases to ensure each part of your code works as
  expected.

By mastering these skills, you will successfully complete the todo list
application and other exercises.

### Content

#### TodoList

The goal of this exercise is to create a simple to-do list application using
Java. You will write a `Task` class with a description and status, and a
`TodoList` class to manage multiple tasks. You will implement methods to add
tasks, update their status and descriptions, and display all tasks neatly. This
will enhance your understanding of object-oriented programming concepts, such as
classes, methods, and arrays.

#### TimeTracker

The goal of the TimeTracker exercise is to create a `ProjectTime` class that
manages project durations by tracking start and end times. You will implement
getter and setter methods for these attributes. You must calculate and format
the logged hours based on specific time ranges, ensuring the hours logged cannot
be negative except to indicate an error.

#### DateFormatter

The goal of this exercise is to create a `DateFormatter` class that formats UNIX
time into specified date formats in the UTC timezone. You will handle three
private attributes: `date`, `format`, and `formattedDate`. You will implement
getters and setters, ensuring the date converts appropriately when either `date`
or `format` is set, provided the format is valid. You will also create multiple
constructors, including a default one that uses the current date and the default
format `DD/MM/YYYY`. The exercise helps you practice class design, attribute
management, and date formatting in Java.

#### AreaCalculator

The goal of the Area Calculator exercise is to create a class called
`AreaCalculator` with an overloaded `calculate` method that computes the area of
different shapes: circle, rectangle, triangle, and square. You will implement
specific formulas for each shape using parameters that represent their
dimensions. This exercise enhances your understanding of method overloading and
object-oriented programming concepts in Java.

#### FactorialMaster

The goal of this exercise is to create an abstract class for calculating the
factorial of a number, using both iterative and recursive methods. You will
implement an abstract method in the base class and then create two child classes
that define the calculation method. This helps you learn about inheritance,
methods, and different programming approaches.

#### Flexisort

The goal of this exercise is to create a framework for sorting algorithms using
an abstract class called `Sorter`. You will implement two specific sorting
methods: bubble sort and insertion sort in separate classes. This will help you
understand object-oriented programming, inheritance, and abstract methods while
practicing algorithm implementation. You will also learn how to set and get an
array to be sorted and test your classes using a main program.

#### DoubleLinkedList

The goal of this exercise is to implement a double linked list data structure in
Java. You will create methods to access, add, remove elements, and get the size
of the list. Additionally, you will define an interface for these methods and
utilize helper methods to navigate between nodes. This exercise enhances your
understanding of linked lists and object-oriented programming.

#### CircularLinkedList

The goal of this exercise is to create a circular linked list data structure in
Java. You will implement the `LinkedList` interface with methods to access, add,
remove, and get the size of elements. You will also create a private
`next(Node node)` method that helps traverse the list and prints "Go to next
node" each time it is used. This will enhance your understanding of linked lists
and object-oriented programming.

#### SingleLinkedList

The goal of this exercise is to create a single linked list data structure using
Java. You will implement the methods to access, add, remove elements, and
retrieve the size of the list. You will also learn to define an interface and a
class, and utilize a private method for traversing the nodes while printing a
message. This exercise enhances your understanding of data structures and
object-oriented programming.

#### HarmoniousFusion

The goal of this exercise is to create a Java class called `HarmoniousFusion`
that merges two pre-sorted integer arrays into one sorted array. You will
implement the `merge` method to combine the two arrays while maintaining order.
You will also test your class with different input arrays to ensure it works
correctly and produces the expected sorted output.

#### DistinctSubstringLength

The goal of this exercise is to create a Java class called
`DistinctSubstringLength` that includes a method `maxLength`. This method will
determine the length of the longest substring in a given string that does not
have repeating characters, considering case sensitivity. You will practice
string manipulation and algorithm development.

#### IsAnagram

The goal of this exercise is to create a class called `AnagramChecker` that can
determine if two strings are anagrams. You will implement a method that compares
two strings, ensuring the comparison is case insensitive. This will help you
practice string manipulation and class design in Java while enhancing your
coding skills.

#### SpiralMatrix

The goal of this exercise is to create a `SpiralMatrix` class that generates a
matrix filled with numbers in a spiral order, based on a given integer n. You
will implement the method `generateMatrix(int n)` which will produce a
two-dimensional array containing numbers from 1 to n\*n arranged in a spiral
pattern, and you will test your implementation using `ExerciseRunner.java`.

#### MaximalSquare

The goal of the Maximal Square exercise is to create a class that calculates the
area of the largest square formed by 1's in a 2D binary matrix. You will
implement a method that processes the matrix, evaluates the possible squares,
and returns the area of the largest square found. This helps you practice using
arrays and algorithm design in Java.

#### SteadySequence

The goal of the exercise is to create the `SteadySequence` class with a method
that finds the longest consecutive sequence of integers in any order from an
unsorted array. You will implement logic to determine which elements form the
longest sequence that increases by 1. After coding, you will test the method
with various arrays to ensure it works as expected.
