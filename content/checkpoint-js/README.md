## Checkpoint JS

### Overview

- **Group1**: This group focuses on fundamental JavaScript syntax, covering simple data types, loops, and basic functions.
  - Exercises : Factorial, Fibonacci, Even Sum, Divisor Finder, Perfect Num
- **Group2**: This group focuses on Nested loops, string manipulation, arrays.
  - Exercises : Array Chunk Reversal, Palindromic Chains, Grid word Finder, Sentence Pyramid, Nested Array Reverser
- **Group3**: This group focuses on Nested loops, string manipulation, arrays.
  - Exercises : Bubble Sort Analyzer, Insertion Sort Analyzer, Grid Word Finder2, SnakePath Validator
- **Group4**: This group focuses on Advanced object manipulation, functional programming concepts.
  - Exercises : Object Lab , Election Mix, Flat Object, Character Maker , Pipeline
- **Group5**: This group focuses on Asynchronous programming, promises, advanced API interactions.
  - Exercises : Sleep Breaker, Final Attempt, Exam Grader, Zoo Race Exercise
- **Group6**: This group focuses on Advanced object traversal, Recursion.
  - Exercises : Deep Clone, Deep Find, Deep Equal, Deep Freeze
- **Group7**: This group focuses on Advanced object concepts, deep copying, prototype manipulations.
  - Exercises : Flatten Object, Swappable Object, Transform Keys, Trap Object

### Content

#### Factorial

The goal of this exercise is to write a program that calculates the factorial of a given number. The factorial of a number **n** (denoted as **n!**) is the product of all positive integers less than or equal to **n**. For example, 5!= 5 × 4 × 3 × 2 × 1 = 120. This exercise helps you practice working with loops or recursion, as well as handling mathematical calculations in your chosen programming language.

#### Fibonacci

The goal of this exercise is to write a program that calculates and outputs the Fibonacci sequence up to a given number or term. The Fibonacci sequence starts with 0 and 1, and each subsequent term is the sum of the two preceding terms (e.g., 0, 1, 1, 2, 3, 5, 8, ...). This task will help you practice working with loops or recursion, managing variables, and understanding algorithmic problem-solving.

#### Even Sum

The goal of this exercise is to write a program that calculates the sum of all even numbers up to a given input number **n**. For example, if the input is 6 , the output would be 2 + 4 + 6 = 12. This problem helps you practice using conditional statements to identify even numbers and iterating through a range of values to perform cumulative calculations.

#### Divisor Finder

The goal of this exercise is to write a program that finds and outputs all divisors of a given number. A divisor of a number **n** is any integer d such that n \% d = 0. For example, the divisors of 12 are 1, 2, 3, 4, 6, 12 . This problem helps you practice using loops and conditional statements to check divisibility.

#### Perfect Num

The goal of this exercise is to write a program that determines whether a given number is a _perfect number_. A perfect number is a positive integer equal to the sum of its proper divisors (excluding itself). For example, 6 is a perfect number because its divisors are 1, 2, 3 , and 1 + 2 + 3 = 6. This exercise helps you practice working with loops, conditions, and summing values in a specific range.

#### Array Chunk Reversal

The goal of this exercise is to write a program that takes an array and an integer representing the chunk size, then reverses the elements within each chunk of the array. If the last chunk is smaller than the given chunk size, it should reverse all remaining elements. For example, given the array [1, 2, 3, 4, 5, 6, 7] with a chunk size of 3, the output would be [3, 2, 1, 6, 5, 4, 7]. This exercise helps you practice array manipulation, working with slicing, and managing conditions for incomplete chunks.

#### Palindromic Chains

The goal of this exercise is to write a program that transforms an array of integers into palindromes. For each number, the program checks if it is a palindrome. If not, it repeatedly adds the number to its reverse until a palindrome is formed or 100 iterations are reached. For example, given the array [87, 12, 123], the output would be [4884, 33, 444]. This exercise helps you practice working with numbers, string manipulation, and iterative processes.

#### Grid word Finder

The goal of this exercise is to write a program that identifies words from a given list that can be found horizontally or vertically in a 2D grid of characters. This task helps you practice working with grid-based data structures and implementing search algorithms.

#### Sentence Pyramid

The goal of this exercise is to write a program that generates a sentence pyramid from a given string, adding one word per line until the full sentence is displayed. This task helps you practice string manipulation and creating structured outputs.

#### Nested Array Reverser

The goal of this exercise is to write a program that reverses the order of both inner arrays and their elements in a 2D array, then joins all words into a single string separated by spaces. This task helps you practice nested array manipulation and string processing.

#### Bubble Sort Analyzer

The goal of this exercise is to implement the `bubble sort` algorithm while tracking its performance. Your program will sort an array using a custom comparator function and return details about the sorting process, including the sorted array, total iterations, and swaps performed. This exercise helps you practice sorting algorithms and performance analysis.

#### Insertion Sort Analyzer

The goal of this exercise is to implement the `insertion sort` algorithm while tracking its performance. Your program will sort an array using a custom comparator function and return details about the sorting process, including the sorted array, total iterations, and swaps performed. This exercise helps you practice sorting algorithms and performance analysis.

#### Grid Word Finder2

The goal of this exercise is to write a program that finds all occurrences of a given word in a 2D grid of characters, identifying its starting coordinates and direction (horizontal or vertical). The challenge requires solving the problem recursively or functionally without using loops. This exercise helps you practice recursion and grid-based problem-solving.

#### SnakePath Validator

The goal of this exercise is to determine if the 1s in a 2D grid form a single connected snake-like path, where connections are only horizontal or vertical. The path must be continuous without isolated 1s or separate clusters. The challenge must be solved recursively or functionally without using loops, helping you practice grid traversal and recursion.

#### Object Lab

The goal of this exercise is to merge an array of objects into one while tracking added and overwritten keys, then apply a series of transformation functions sequentially. The final output includes the transformed object, the number of transformations applied, and key tracking metrics. This challenge helps you practice object manipulation, functional programming, and tracking changes in data structures.

#### Election Mix

The goal of this exercise is to create a curried function that filters an object's key-value pairs based on a given condition and transforms the values of the retained keys. The function returns the filtered and transformed object, along with counts of kept and filtered-out keys. This challenge helps you practice currying, functional programming, and object manipulation.

#### Flat Object

The goal of this exercise is to flatten a deeply nested object using dot notation for keys while applying a transformation function to each value. The program returns the transformed flat object, along with counts of original and transformed keys. This challenge helps you practice recursion, object manipulation, and functional programming.

#### Character Maker

The goal of this exercise is to create a curried function that builds a character object dynamically by merging new attributes or applying transformations. The function should handle deep merging of nested properties and allow functional modifications. Calling it with no arguments finalizes and returns the character. This challenge helps you practice currying, functional updates, and deep object merging.

#### Pipeline

The goal of this exercise is to apply a sequence of functions to an initial value, transforming it step by step while tracking each transformation. The program should return the final value along with a breakdown of each step, including the input, output, and step index. This challenge helps you practice function composition, transformation pipelines, and structured data tracking.

#### Sleep Breaker

The goal of this exercise is to implement a sleep function that can be interrupted by an asynchronous breaker function. The function should resolve after a given delay unless the breaker resolves first, in which case it should wake up immediately. This challenge helps you practice working with Promises, asynchronous control flow, and cancellation mechanisms.

#### Final Attempt

The goal of this exercise is to create a function wrapper that retries an asynchronous operation up to a given limit before failing. The function should keep attempting the callback until it succeeds or reaches the maximum retry count, returning `"Final Attempt Fail"` if all attempts fail. This challenge helps you practice error handling, retries, and working with asynchronous functions.

#### Exam Grader

The goal of this exercise is to process an array of asynchronous exam exercises, summing up the grades of only those that complete within a given timeout. If the total execution time exceeds the timeout, further exercises should be ignored. This challenge helps you practice working with Promises, handling time constraints, and managing asynchronous workflows efficiently.

#### Zoo Race Exercise

The goal of this exercise is to simulate a race between animals based on their varying speed capacities. Each animal runs in different speed phases, and the total time to complete the race determines the winner. The challenge requires implementing Promises to asynchronously determine race results, helping you practice time-based execution, Promise handling, and competitive simulation logic.

#### Deep Clone

The goal of this exercise is to create a function that performs a **deep clone** of an object, ensuring that all nested objects and arrays are copied independently. The function should handle primitive values, maintain array order, and safely clone circular references. This challenge helps you practice recursion, object manipulation, and deep copying techniques.

#### Deep Find

The goal of this exercise is to write a function that retrieves a deeply nested value from an object using **dot notation**. The function should safely traverse the object and return `undefined` if any part of the path is missing. This challenge helps you practice working with nested objects, string-based path resolution, and safe property access.

#### Deep Equal

The goal of this exercise is to write a function that checks whether two objects are **deeply equal**, ensuring that all nested properties and array elements match in structure and content. The function should account for primitive values, objects, and arrays while maintaining order in arrays. This challenge helps you practice recursion, object comparison, and deep equality checks.

#### Deep Freeze

The goal of this exercise is to create a function that **completely freezes an object**, making it fully immutable at all levels. The function should recursively apply `Object.freeze()` to prevent any modifications to nested objects or arrays. This challenge helps you practice working with immutability, recursion, and JavaScript's object manipulation methods.

#### Flatten Object

The goal of this exercise is to write a function that **flattens a deeply nested object** into a single-level object using **dot notation** to represent the original hierarchy. The function should correctly handle nested objects and arrays, preserving array indices in the key paths. This challenge helps you practice recursion, object traversal, and structured data transformation.

#### Swappable Object

The goal of this exercise is to create an object that allows **key-value swapping dynamically**, enabling access to properties using either their original keys or values. This can be efficiently implemented using a **Proxy** to handle property lookups. This challenge helps you practice JavaScript Proxies, dynamic property access, and bidirectional mappings.

#### Transform Keys

The goal of this exercise is to write a function that **recursively transforms all object keys** using a provided transformation function while preserving the values. This allows for flexible modifications like converting keys to **snake_case, camelCase, or uppercase**. The challenge helps you practice recursion, object traversal, and functional transformations.

#### Trap Object

The goal of this exercise is to create an object that **traps property access and modifications**, logging or executing a callback function whenever a property is read or changed. This can be implemented using a **Proxy** to intercept `get` and `set` operations. This challenge helps you practice JavaScript Proxies, dynamic property handling, and event-driven programming.
