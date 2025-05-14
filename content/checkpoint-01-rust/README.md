## Checkpoint 01-rust

### Overview

To achieve the checkpoint for each exercise, you will demonstrate the following
key skills and knowledge:

- **Function Creation**: You will write functions that take inputs and return
  outputs. For example, the `min_and_max` function returns the minimum and
  maximum values.

- **Use of Tuples**: You will understand how to create and return tuples, like
  in `min_and_max`, or represent data structures, as seen in the `Matrix`.

- **Struct and Traits**: You will define a `struct` in Rust and implement traits
  for comparison, as required in the `Matrix`.

- **String Manipulation**: You will practice modifying and reversing strings in
  tasks like `reverse_it` and `modify_letter`.

- **Working with Collections**: You will manipulate `HashMap` in the `smallest`
  function and create maps for counting words in `counting_words`.

- **Array and Vector Manipulation**: You will handle arrays in tasks such as
  `partial_sums` and implement sorting algorithms like `insertion_sort`.

- **Dynamic Data Structures**: You will practice creating and manipulating
  dynamic structures, such as a pyramid in `inv_pyramid`.

- **Error Handling**: You will learn to manage invalid inputs when implementing
  the RPN program.

Completing these tasks will strengthen your Rust programming skills and
understanding of core concepts.

### Content

#### min_and_max

The goal of the exercise is to create a function named `min_and_max` that takes
three integers as input and returns a tuple containing the minimum and maximum
values among them. You will practice using function definitions, tuples, and
handling integer data types in Rust. Testing the function with example values
will confirm its correctness by displaying the correct minimum and maximum
numbers.

#### matrix_multiplication

The goal of this exercise is to create a `struct` called `Matrix` that
represents a 2x2 matrix using tuples. You will write a function named `multiply`
that takes a `Matrix` and an integer to multiply each element by that integer.
You will also ensure that `Matrix` implements certain traits for comparison and
debugging. Testing your function in a simple program is essential to verify its
correctness.

#### previousprime

The goal of this exercise is to create a Rust function that finds the largest
prime number that is less than or equal to a given unsigned 64-bit integer. You
will learn about prime numbers and how to use control structures and functions
in Rust. You will also practice testing your function with sample inputs.

#### nextprime

The goal of this exercise is to create a function that finds and returns the
smallest prime number greater than or equal to a given positive integer. You
will focus on optimizing the function to ensure it works efficiently without
timing out. By completing this, you will improve your programming skills in Rust
and algorithm design.

#### reverse_it

The goal of the exercise is to create a function named `reverse_it` that
reverses a given integer and returns a string that combines the reversed number
with the original number. If the input number is negative, the output string
should start with a `-` sign. You will practice string manipulation and function
creation in Rust.

#### smallest

The goal of this exercise is to create a function called `smallest` that will
find the smallest number stored in a `HashMap`. If the `HashMap` is empty, the
function should return the maximum `i32` value. This will help you practice
working with `HashMap` and improve your skills in Rust programming.

#### partial_sums

The goal of this exercise is to create a function named `parts_sums` that
calculates the partial sums of an input array of `u64`. You will split the array
into all possible partitions, sum each partition, and return a vector containing
these sums in order. This helps you understand array manipulation and summation
in programming.

#### modify_letter

The goal of this exercise is to create three functions in Rust that manipulate
strings in specific ways. The first function removes a specified letter while
considering its case. The second function removes the letter without caring
about case. The third function changes the case of a specified letter in the
string. These functions help you practice string manipulation and handling
characters in Rust.

#### counting_words

The goal of the exercise is to create a function named `counting_words` that
counts each unique word in a string, ignoring case and punctuation (except for
apostrophes in specific usages). You will return a map with each word and its
corresponding count. This helps you practice string manipulation, data storage,
and understanding word boundaries.

#### inv_pyramid

The goal of the exercise is to create a function called `inv_pyramid` that
builds a pyramid structure using a given string and an integer input. The
function will return a vector of strings that represent this pyramid with spaces
aligning the strings. By completing this exercise, you will practice string
manipulation, dynamic data structure use, and implementing functions in Rust.

#### count_factorial_steps

The goal of this exercise is to create a function named `count_factorial_steps`
that calculates how many multiplications are needed to reach a given factorial
number. If the input is not a factorial or is 0 or 1, the function should
return 0. You will practice understanding factorials and implementing logic in
Rust to handle these conditions.

#### lucas_number

The goal of this exercise is to implement the `lucas_number` function in Rust,
which calculates the `n`th number in the Lucas Numbers sequence. You will learn
how to work with functions, handle input parameters, and return the correct
output based on the series rules, where each number is the sum of the two
previous numbers.

#### own_and_return

The goal of the exercise is to create a struct `Film` with a field for the name.
You will implement two functions: `take_film_name`, which consumes the film and
returns its name, and `read_film_name`, which returns the name without consuming
the film. This will help you understand ownership and borrowing in Rust.

#### matrix_determinant

The goal of this exercise is to create a function that calculates the
determinant of a 3x3 matrix. You will learn how to apply the determinant formula
by multiplying elements of the first row with the determinants of smaller
matrices, taking note of the sign changes. This will enhance your understanding
of matrix operations in programming.

#### check_user_name

The goal of this exercise is to help you create a user access management tool in
Rust. You will define an `AccessLevel` enum and a `User` struct with name and
access level fields. You will implement functions to check if the user can
provide their name based on their access level, returning an appropriate
response.

#### format_me

In this exercise, you will implement the `Display` trait for the `Park`
structure and the `ParkType` enum in Rust. Your goal is to format and print the
details of a park, including its name, type, address, cap, and state. By doing
this, you will practice working with traits and formatting output in Rust,
enhancing your skills in structuring and displaying data effectively.

#### insertion_sort (Bonus)

The goal of this exercise is to implement the insertion-sort algorithm in Rust.
You will create a function called `insertion_sort` that sorts an array of
integers in ascending order. The function will execute a specified number of
iterations, allowing you to understand each step of the sorting process and how
elements are compared and shifted within the array. By completing this task, you
will gain a deeper understanding of algorithm implementation and array
manipulation.

#### rpn (Bonus)

The goal of this exercise is to create a program that evaluates mathematical
equations written in Reverse Polish Notation (RPN). You will parse a string
containing the equation, handle invalid inputs, and implement operators such as
addition, subtraction, multiplication, division, and modulus. Your program
should return the result or an error message if the input is incorrect. This
helps you practice string manipulation, command line arguments, and working with
stacks in programming.

#### dress_code (Bonus)

The goal of this exercise is to create a Rust function that determines an
appropriate outfit based on specific criteria. You will use a `formality_level`
and an `invitation_message` to decide the type of jacket and hat to include in
the `Outfit` struct. This reinforces your understanding of enums, structs,
options, and results in Rust.

#### get_document_id (Bonus)

The goal of this exercise is to create a series of structured data types in
Rust, representing different offices that can pass along the task of retrieving
a document ID. You will design these structures to handle potential errors,
allowing the function `get_document_id` to either return a valid document ID or
the first error encountered in the sequence. This reinforces understanding of
chaining results and managing errors effectively in Rust programming.

#### rot21 (Bonus)

The goal of this exercise is to create a `rot21` function in Rust that shifts
each letter in a given string by 21 positions in the alphabet. You will ensure
that only letters are changed while numbers, punctuation, and symbols remain the
same. You will test the function with different inputs to verify the output
matches the expected results.
