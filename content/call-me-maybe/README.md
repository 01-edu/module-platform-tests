## call-me-maybe

### Overview

You will learn a variety of important concepts in JavaScript through these
exercises:

- Understand and use the `map` method to transform data in arrays, such as
  extracting and formatting strings.
- Practice using the `filter` method to sort and maintain specific data based on
  different criteria.
- Dive into the `reduce` method to implement functions that summarize and
  manipulate arrays of numbers.
- Gain skills in evaluating array elements using `every` and `some`, enhancing
  your ability to check conditions.
- Build your own versions of array methods like `forEach`, `map`, and `filter`,
  increasing your understanding of higher-order functions.
- Explore currying by transforming functions, improving your ability to design
  and apply functions effectively.
- Create functions that execute in a sequence, understanding function flow and
  data handling.

These exercises will greatly enhance your programming skills and understanding
of JavaScript.

### Content

#### using-map

In this exercise, you will create functions that utilize the `map` method to
handle arrays. The tasks include extracting city names, capitalizing state
names, converting Fahrenheit to Celsius, removing spaces in temperature strings,
and formatting temperature forecasts. You will practice how to manipulate and
transform data in arrays effectively. This will enhance your understanding of
the `map` method in JavaScript.

#### using-filter

The goal of this exercise is to practice using the `filter` method in JavaScript
to create functions that sort data according to specific rules. You will learn
how to filter strings based on their length, starting letters, vowel content,
and characteristics of objects in an array. This exercise enhances your ability
to manipulate arrays effectively and understand the logic behind data filtering.

#### using-reduce

The goal of this exercise is to practice using the `reduce` method in
JavaScript. You will create functions that perform specific tasks: summing an
array of numbers, conditionally adding or multiplying the elements based on
whether they are odd or even, and executing an array of functions in sequence.
This exercise will enhance your understanding of functional programming and how
to manipulate arrays effectively.

#### long-words

The goal of this exercise is to strengthen your understanding of functions and
array methods in JavaScript. You will create three functions to check the length
of strings within an array. This will help you practice using
`Array.prototype.every` and `Array.prototype.some`, which are important for
evaluating elements in arrays based on specific conditions.

#### for-each

The goal of this exercise is to build a function named `forEach` that mimics the
behavior of JavaScript's built-in `Array.prototype.forEach` method. You will
take an array and a function as inputs, and apply the function to each element
in the array. This helps you understand how higher-order functions work and
improves your skills in manipulating arrays and functions in JavaScript.

#### mapper

The goal of this exercise is to create your own `map` and `flatMap` functions
that mimic the built-in JavaScript methods. You will take an array and a
function as inputs, then process the array using that function. This will help
you understand how these methods work and enhance your programming skills.

#### filter

The goal of this exercise is to help you create three functions: `filter`,
`reject`, and `partition`. Each function will take an array and a callback
function as arguments. You will implement these functions to mimic existing
JavaScript and Lodash methods, which will deepen your understanding of
higher-order functions and array manipulation techniques.

#### reduce

The goal of this exercise is to help you understand how to implement your own
versions of the `fold`, `foldRight`, `reduce`, and `reduceRight` functions. You
will learn to manipulate arrays using a given function and an accumulator,
without using the built-in `reduce` and `reduceRight` methods. This will enhance
your skills in functional programming and handling arrays in JavaScript.

#### quantifiers

The goal of this exercise is to enhance your understanding of arrays and
functions in JavaScript. You will create three custom functions: one to check if
every element meets a condition, one to determine if at least one does, and one
to confirm that none do. It requires you to think critically and implement these
functionalities without relying on existing methods, deepening your coding
skills.

#### sweet-curry

The goal of this exercise is to practice "currying," a technique in functional
programming that transforms a function with multiple arguments into a sequence
of functions that each take a single argument. You will create three specific
functions: `mult2` to multiply two numbers, `add3` to add three numbers, and
`sub4` to subtract four numbers in order, enhancing your understanding of
function design and application in JavaScript.

#### has-city

The goal of this exercise is to create a function called `hasCity` that accepts
a country name and an array of cities. It returns a new function that checks if
a given city is in that array. If it is, the new function returns a message
confirming the city is from the specified country; if not, it states the city is
not from that country.

#### flow

The goal of this exercise is to create a function named `flow` that takes an
array of functions as input and returns a new function. When this new function
is called, it will execute the input functions in sequence, passing the result
of one function as the input to the next. This mimics the behavior of `_.flow`
from lodash.

#### currify

The goal of this exercise is to create a function called `currify` that
transforms any standard function into a curried version. Currying is a technique
that allows you to execute a function by supplying its arguments one at a time.
By completing this exercise, you will understand currying better and enhance
your skills in functional programming.
