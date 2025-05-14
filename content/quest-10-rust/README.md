## features

### Overview

You will learn many important skills from these exercises:

- **Closures**: Understand how closures work and how to efficiently handle data
  in Rust with functions that manipulate sequences.
- **Sales System**: Get hands-on experience building structures and developing
  promotional logic in a shopping context.
- **Currying**: Discover how to create functions that return other functions to
  allow flexible addition operations.
- **Higher-Order Functions**: Gain more experience with higher-order functions
  by implementing logic that calls functions as parameters.
- **Vector Manipulation**: Practice working with vectors to perform calculations
  and create new data structures from existing ones.
- **Structs and Methods**: Learn how to define and manage data using structs and
  implement various methods for accessing data.
- **Iterators**: Delve into custom iterators and understand how to control data
  flow through step-wise iteration.
- **Traits**: Enhance your Rust skills by implementing the `Iterator` trait for
  custom types to improve functionality.
- **Hashmaps**: Gain knowledge on using slices to create hashmaps and handle
  data efficiently with key-value pairs.
- **Simulations**: Build a simulation of real-world physics, enhancing your
  understanding of object properties and iterators in motion.
- **Markdown Parsing**: Learn to process and convert markdown text to HTML,
  improving your skills in text manipulation and pattern recognition.

### Content

#### closures

The goal of this exercise is to practice using closures and iterators in Rust by
creating a function that generates the first 50 even numbers squared and returns
them in a `Vec<i32>`. You will implement the `first_fifty_even_square` function
to complete this task, enabling you to enhance your understanding of efficient
data handling in Rust.

#### sales

The goal of this exercise is to create a shopping system with a store and a cart
that can handle a promotion: "Buy three, get one free." You will implement the
`Cart` structure with functions to initialize the cart, add items from the
store, and generate a receipt that reflects the promotional pricing. You must
ensure that the receipt does not contain any zero values by adjusting the prices
slightly, as shown in the example.

#### adding

The goal of this exercise is to create a function called `add_curry` that
implements currying. This function will allow you to create multiple variations
of the addition operation by returning a new function that adds a specific value
to any number you provide. You will test this functionality by checking the
output with different inputs.

#### adding_twice

The goal of this exercise is to create a new function named `twice` that takes
another function as a parameter. You will reuse your `add_curry` function to add
its output to its own result, effectively adding the value twice. This will
demonstrate your understanding of higher-order functions and closures in Rust.
You will also determine the appropriate types for the function parameters.

#### get_products

The goal of the exercise is to create a function called `get_products` that
calculates the product of all numbers in a given vector, except the current
number for each index. You will take an input vector of integers, process it,
and return a new vector containing these products. The function will help you
practice working with vectors and manipulating data in Rust.

#### highest

The goal of this exercise is to implement methods for the `Numbers` struct in
Rust. You will create a new instance that holds numbers, and then write
functions to return all numbers, the latest added number, the highest number,
and the three highest numbers. This will help you practice struct management and
method creation in Rust.

#### iterators

The goal of this exercise is to implement an iterator that follows the Collatz
Conjecture. You will take a positive integer `n` and determine the number of
steps required to reduce it to 1 using the specified rules for even and odd
numbers. You will create a struct and implement the necessary iterator traits to
handle this process in Rust.

#### roman_numbers_iter

The goal of this exercise is to implement the `Iterator` trait for the
`RomanNumber` type in Rust. You will build on the previous `roman_numbers` code
to create an iterator that allows you to retrieve the next Roman numeral. By
doing this, you will learn how to enhance the functionality of custom types
using traits, improving your skills in Rust programming.

#### slices_to_map

The goal of this exercise is to create a function that takes two slices: one for
keys and another for values, and returns a hashmap. The hashmap's keys will come
from the first slice and the values from the second slice. If the slices are of
different lengths, the function will only include pairs up to the length of the
smaller slice.

#### step_iterator

The goal of this exercise is to create a custom iterator named `StepIterator`
that allows you to iterate over a range of values from a starting point (`beg`)
to an ending point (`end`), using defined steps. This iterator must be generic,
supporting various integer and floating-point types. It should return values in
the defined steps, including the end value only if reachable. If the steps do
not allow reaching the end, it should return the last value below the end. You
will implement the associated function `new` to initialize the iterator and
define the necessary logic in the `Iterator` trait.

#### project_motion

The goal of this exercise is to create a simulation of projectile motion. You
will implement structures to represent an object's properties and functions to
initialize its state and update its position and velocity over time, considering
gravity. You will also implement an iterator to handle the object's motion until
it reaches the ground.

#### markdown_to_html

The goal of this exercise is to create a function that converts markdown text
into HTML format. You will focus on parsing the first three title levels and the
bold and italic styles. By limiting the inputs to simple and correct markdown,
you will practice how to identify and convert specific patterns into their HTML
equivalents efficiently.
