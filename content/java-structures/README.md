## java-structures

### Overview

- You will learn how to create functions in Java that handle lists of integers
  and strings, helping you to understand basic data manipulation.
- You will practice checking for values in lists, comparing lists for equality,
  and searching for positions of elements.
- You will explore sorting techniques for lists and enhance your ability to
  manage data structures efficiently in Java.
- You will gain skills in using maps to store and retrieve data based on unique
  keys, improving your understanding of collections.
- You will learn set operations such as union and intersection, as well as how
  to check equality between sets.
- You will deepen your knowledge of Java Streams, learning how to perform
  operations like mapping, reducing, and filtering data.
- You will develop problem-solving skills by creating algorithms for making
  change and pairing names, boosting your coding abilities and logical thinking.

### Content

#### ListContains

The goal of this exercise is to create a Java function named `containsValue`
that checks if a specified value exists in a list of integers. You will
implement this function in a file called `ListContains.java`. You will also use
an example `ExerciseRunner.java` file to test your function and ensure it
correctly returns true or false based on the input list and value.

#### ListEquals

The goal of this exercise is to create a function in Java that compares two
lists of strings and determines if they are equal. You will implement the
`areListsEqual` method to return true if both lists contain the same elements in
the same order, and false otherwise. You will test this function using a
provided test class, `ExerciseRunner`. This will help you understand how to work
with lists and basic Java functions.

#### ListSearchIndex

The goal of this exercise is to implement three functions in the
`ListSearchIndex` class that search for an integer value in a list. You will
create `findLastIndex` to return the last position of that value,
`findFirstIndex` to return the first position, and `findAllIndexes` to return
all positions as a list. This will help you practice using lists in Java and
enhance your searching skills.

#### SortList

The goal of this exercise is to create a Java class named `SortList` that
contains two functions: `sort` and `sortReverse`. The `sort` function will take
a list of integers and return it sorted in ascending order, while the
`sortReverse` function will return the same list sorted in descending order. You
will practice using lists and implementing sorting logic in Java.

#### MapInventory

The goal of this exercise is to implement a product inventory using Java maps.
You will create a class named `MapInventory` containing two functions. The
`getProductPrice` function will return the price of a product based on its
unique ID, while the `getProductIdsByPrice` function will return a list of
product IDs that match a specified price. This task will help you practice using
maps and lists in Java.

#### MapEquals

The goal of this exercise is to create a Java function called `areMapsEqual`
that checks if two maps with string keys and integer values are equal. You will
implement the logic to compare both maps and return `true` if they are the same
and `false` if they are different. This helps you practice using maps and
understanding how to compare data structures in Java.

#### SetOperations

The goal of this exercise is to create a Java file that defines two functions:
`union` and `intersection`. The `union` function will combine two sets of
integers and return all distinct elements, while the `intersection` function
will return only the common elements from both sets. You will practice using
sets and understanding their operations in Java.

#### SetEquals

The goal of this exercise is to create a Java function that checks if two sets
contain the same elements, regardless of the order. You will implement the
`areSetsEqual` function inside a `SetEquals` class, which takes two sets as
input and returns `true` if they are equal and `false` otherwise. You will also
test your function using a provided `ExerciseRunner` class to ensure it works
correctly with different sets.

#### StreamCollect

The goal of this exercise is to enhance your skills in using Java Streams. You
will create three functions: one to group strings by their first letter, another
to find the maximum integer for each modulo 4 group, and a third to sort and
concatenate strings with a specific format. Completing this will deepen your
understanding of data manipulation in Java.

#### StreamMap

The goal of this exercise is to practice using Java streams to manipulate data.
You will implement three functions: one to calculate the total length of
strings, another to convert all strings in a stream to upper case, and a third
to filter and transform doubles greater than 42 into a unique set of integers.
This will help you understand stream operations and improve your coding skills
in Java.

#### StreamReduce

The goal of this exercise is to create a Java class named `StreamReduce` that
contains two functions, `sumAll` and `divideAndAddElements`. `sumAll` calculates
the total of all integers in a stream, while `divideAndAddElements` divides each
integer in the stream by a specified number and sums the results. You will
practice using Java streams to perform these tasks efficiently.

#### KeepTheChange

The goal of this exercise is to create a Java function that calculates the best
way to make change using the minimum number of coins from a given set. You will
implement the `computeChange` method in the `KeepTheChange` class, which takes
an amount and a set of coin denominations. The solution should return a list of
coins that add up to the specified amount efficiently. This exercise helps you
practice problem-solving and algorithm design in Java.

#### Wedding

The goal of this exercise is to create a Java function called `createCouple`
that randomly pairs names from two sets. You will learn to use data structures
like `Set` and `Map`. By implementing this function, you will practice handling
collections in Java, ensuring proper pairing even when the sets differ in size.

#### WeddingComplex

The goal of this exercise is to implement a function that creates the best
couple pairing based on individual preferences. You will use two maps to
represent the preferences of potential couples. The function must ensure that
each member is matched with their most preferred partner who is also happy with
the match, following the principles of the stable marriage problem. You will
achieve this using Java and the provided example demonstrates the expected
behavior of your function.
