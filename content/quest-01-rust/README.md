## variables

### Overview

- You will create arithmetic functions in Rust, enhancing your knowledge of
  basic operations and data types.
- You will implement temperature conversion functions, practicing the use of
  floating-point numbers and function creation.
- You will convert speed between kilometers per hour and meters per second,
  reinforcing your understanding of functions and output display.
- You will create a riddle program using loops, which will teach you about user
  input handling and iteration.
- You will manipulate vectors by adding and retrieving items, developing skills
  in working with collections.
- You will reverse a string with a specific function, learning string
  manipulation and effective use of Rust's string types.
- You will compute the factorial of numbers, gaining experience with recursion,
  iteration, and function testing.
- You will implement the Fibonacci function, enhancing your skills in functions,
  control flow, and recursion.
- You will create a `Matrix` struct and implement transposition, learning about
  data structures and trait implementations.
- You will gain an understanding of tuples by creating a division function that
  returns both quotient and remainder.
- You will work with tuple structs in Rust, reinforcing your understanding of
  accessing and managing structured data.

### Content

#### scalar

The goal of this exercise is to create five functions in Rust that perform basic
arithmetic operations: sum, difference, product, quotient, and remainder. Each
function must accept two parameters and return a result based on specific value
ranges. You will also determine the correct data types for both the input
parameters and the return values. This will help you improve your understanding
of data types and arithmetic operations in Rust programming.

#### temperature_conv

The goal of this exercise is to create two functions in Rust that convert
temperatures between Fahrenheit and Celsius. You will implement the conversion
formulas using the factor (9/5) in both functions. This will help you practice
function creation, using floating-point numbers, and understanding temperature
conversion between the two scales. You will test your functions to ensure they
produce the correct output.

#### speed_transformation

The goal of this exercise is to create a function in Rust that converts speed
from kilometers per hour to meters per second. You will define the function
`km_per_hour_to_meters_per_second`, which takes a speed value in km/h and
returns the equivalent value in m/s. You will also write a main function to
demonstrate the conversion and print the result.

#### looping

The goal of this exercise is to create a program that presents a riddle and
checks user input for the correct answer. You will utilize a loop to allow users
to keep guessing until they provide the correct answer. After the correct
answer, the program will display the number of attempts it took to arrive at the
answer. This helps you practice input handling and looping in programming.

#### groceries

The goal of this exercise is to create two functions in Rust. The `insert`
function will add a new item to the end of a vector, while the `at_index`
function will retrieve the item at a specified index from the vector. You will
practice working with vectors and understand how to manipulate collections in
Rust.

#### reverse_string

The goal of this exercise is to create a function named `rev_str` in Rust that
takes a string as input and returns a new string with the characters in reverse
order. This will help you understand how to manipulate strings and utilize
Rust's string types effectively while practicing function creation and string
handling.

#### find_factorial

The goal of the exercise is to create a function named `factorial` in Rust that
calculates the factorial of a given number. The function will return the product
of all integers from 1 to that number, with special cases for 0 and 1, both of
which return 1. You will also test the function using example numbers to ensure
it works correctly.

#### fibonacci2

The goal of this exercise is to implement the `fibonacci` function in Rust. You
will create a function that takes an integer `n` and returns the `n`th number in
the Fibonacci series. This helps you understand how to work with functions,
control flow, and recursion or iteration in Rust, enhancing your programming
skills.

#### matrix_transposition

The goal of this exercise is to define a `struct` named `Matrix` as a tuple of
two tuples, allowing you to represent a 2x2 matrix. You will implement a
function named `transpose` that switches the rows and columns of the matrix. You
will also ensure `Matrix` implements specific traits like `Debug` and
`PartialEq`, which are necessary for testing and displaying the matrix correctly
when used in a program.

#### division_and_remainder

The goal of this exercise is to create a function named `divide` that takes two
integers and returns a tuple containing the result of their integer division and
the remainder. This helps you understand how to work with functions, return
values, and tuples in Rust. You will implement the function, test it with sample
values, and see how division and remainder work in programming.

#### tuples_refs

The goal of this exercise is to define a tuple struct called `Student` that
includes an id, first name, and last name. You will also create three functions
to access these fields: one for the id, one for the first name, and one for the
last name. Finally, you will test these functions with a program that prints the
student's information. This helps you understand how to work with tuple structs
and functions in Rust.
