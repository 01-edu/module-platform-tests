## Checkpoint 03-java

### Overview

- You will demonstrate knowledge of date manipulation by creating the
  `DayOfWeekFinder` and `MonthlyPeriod` classes. You should handle valid and
  invalid date formats correctly and return appropriate error messages.

- For the `AgeFinder` class, you will show your ability to parse a date and
  calculate age accurately. You must return an integer for age and handle errors
  properly.

- In `HTMLValidator`, you will validate HTML strings by checking basic tags.
  This will help you enhance your skills in string manipulation and data
  validation.

- You will practice using regular expressions in `BreakdownURL` and
  `ConfigProtector` classes to parse URLs and hide sensitive data, respectively.

- You will learn about design patterns by implementing `SingletonBlueprint`,
  `BuilderBlueprint`, and `FactoryBlueprint`. Understand class structure and
  object creation in these patterns.

- In `TopFrequents`, you will apply data structures like hash maps and heaps to
  find frequent elements in an array.

- You will solve problems using string manipulation in `LongestCommonPrefix`,
  `FirstUnique`, and validate a Sudoku board in `ValidSudoku`.

- You will practice mathematical concepts in `ArmstrongNumber` and
  `PerfectNumber` by implementing methods to check number properties.

### Content

#### DayOfWeek

The goal of this exercise is to create a Java class called `DayOfWeekFinder`
that includes a method for finding the next occurrence of a specified day of the
week from a given date. You will need to handle valid date formats and invalid
inputs, returning "Error" for any mistakes. This helps reinforce your
understanding of date manipulation and error handling in Java.

#### MonthlyPeriod

The goal of this exercise is to create a Java class called `MonthlyPeriod` that
calculates the time difference in months and years between two specific dates.
You will implement a method called `calculatePeriod` that takes two date
strings, processes them, and returns the difference. If there is an error, the
method should return "Error". This exercise enhances your skills in working with
date formats and time calculations in Java.

#### AgeFinder

The goal of the exercise is to create a Java class called `AgeFinder` that
calculates the age based on a provided date in the format `yyyy-MM-dd`. The
method `calculateAge` should return the age as an integer and return `-1` if
there is an error in parsing the date. You will also test this class using
example dates.

#### HTMLValidator

The goal of this exercise is to create a class called `HTMLValidator` that
checks if an HTML string is correctly formatted. You will implement a method to
validate basic HTML tags. Additionally, you will test the class using different
HTML examples to ensure it returns true for valid HTML and false for invalid
HTML. This exercise enhances your understanding of string manipulation and data
validation in programming.

#### BreakdownURL

The goal of this exercise is to create a Java class called `BreakdownURL` that
parses a valid URL using regular expressions. You will extract components such
as `protocol`, `domain`, `port`, `path`, and `query`, and return them in a map.
The map should only include components that exist in the URL. You will implement
this functionality in the `parseURL` method.

#### ConfigProtector

The goal of this exercise is to create a class named `ConfigProtector` that uses
regular expressions to hide sensitive data in a configuration file. You will
write a method that takes a configuration string and a list of sensitive keys,
replacing the values associated with those keys with asterisks. This practice
will help you understand data protection in coding and improve your skills with
string manipulation and regular expressions.

#### SingletonBlueprint

The goal of this exercise is to complete the `Singleton` class to show your
understanding of the Singleton design pattern. You will implement a private
constructor and a method to access the single instance of the class. This
ensures only one instance exists and can be accessed globally. You will then
test your implementation using the `ExerciseRunner` class to confirm that it
produces the expected output.

#### BuilderBlueprint

The goal of this exercise is to help you understand the Builder design pattern
by completing an incomplete implementation in Java. You will fix and complete
the Regex, RegexBuilder, ConcreteRegexBuilder, and RegexDirector classes. This
will demonstrate your ability to create flexible and reusable code for
constructing regular expressions using specific components. Completing this
exercise enhances your programming skills and understanding of design patterns.

#### FactoryBlueprint

The goal of this exercise is to help you learn and apply the Factory design
pattern by completing and fixing an incomplete implementation. You will create
classes for products and a factory that produces those products based on input
type. This will enhance your understanding of object creation and design
patterns in programming. You will also test your implementation to ensure it
works correctly, producing expected outputs.

#### TopFrequents

The goal of this exercise is to implement a method that finds the k most
frequent elements in an array of integers. You will use a hash map to count
occurrences and a heap to retrieve elements efficiently. The result will be
sorted by frequency, and in the case of ties, elements will be ordered by their
first appearance in the original array.

#### LongestCommonPrefix

The goal of this exercise is to write a function that determines the longest
common prefix shared among an array of strings using a case-sensitive
comparison. You will create a class called LongestCommonPrefix and implement a
method to identify the prefix. If no prefix exists, the function will return an
empty string. Testing will validate the implementation through various test
cases.

#### FirstUnique

The goal of this exercise is to write a function that identifies the first
character in a string that does not repeat. If all characters repeat, the
function should return an underscore. This task helps you practice string
manipulation and problem-solving skills in Java. You will also learn to
implement a method and test it with different input cases.

#### ValidSudoku

The goal of this exercise is to determine if a 9x9 Sudoku board is valid based
on specific rules. You will implement a method that checks each row, column, and
the nine 3x3 sub-boxes to ensure they contain the digits 1-9 without any
repetition. You will use test cases to validate your implementation.

#### ArmstrongNumber

The goal of the exercise is to write a Java program that checks if a given
number is an Armstrong number. You will implement a method that calculates the
sum of the digits raised to the power of the number of digits and compares it to
the original number. This helps you practice mathematical concepts and Java
programming skills.

#### PerfectNumber

The goal of this exercise is to create a Java program that checks if a given
number is a perfect number. You will implement the method `isPerfectNumber` to
determine if the input number equals the sum of its proper divisors, excluding
itself. You will test your program using the `ExerciseRunner` class to confirm
its functionality with different numbers.
