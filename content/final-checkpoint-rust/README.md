## Final Checkpoint-rust

### Overview

To successfully complete these exercises, you will need to demonstrate the
following key skills and knowledge:

- **Function Definitions**: Create functions with specific signatures and return
  types.
- **Data Types**: Work with integers, strings, tuples, and `HashMap`.
- **Control Structures**: Use loops and conditionals to manage program flow.
- **String Manipulation**: Handle and modify strings for processing.
- **Collections**: Utilize structures like `HashMap`, `Vec`, and `BTreeSet`.
- **Algorithm Implementation**: Develop sorting and matrix operations.
- **Error Handling**: Implement correct responses for invalid inputs.
- **Testing**: Use sample inputs to validate the correctness of your functions.
- **Structs and Enums**: Define and manage custom data types for complex data
  structures.
- **Closure Usage**: Apply closures for filtering and manipulating data within
  collections.
- **Command-Line Arguments**: Handle inputs from the user at runtime.
- **Prime Number Calculation**: Finding previous and next prime numbers, prime checking.
- **Ownership and Borrowing**: Implementing Rust’s ownership rules in struct methods.
- **Modules and Namespaces**: Organizing code with modules and sub-modules.
- **Generic Types**: Implementing generic structs and methods.
- **Data Encoding and Decoding**: Working with ciphers like Scytale and ROT21.
- **Linked Lists and Recursive Types**: Implementing recursive data structures and linked lists.

By practicing these skills, you will strengthen your Rust programming abilities
and deepen your understanding of the language.

### Content

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

#### insertion_sort

The goal of this exercise is to implement the insertion-sort algorithm in Rust.
You will create a function called `insertion_sort` that sorts an array of
integers in ascending order. The function will execute a specified number of
iterations, allowing you to understand each step of the sorting process and how
elements are compared and shifted within the array. By completing this task, you
will gain a deeper understanding of algorithm implementation and array
manipulation.

#### rpn

The goal of this exercise is to create a program that evaluates mathematical
equations written in Reverse Polish Notation (RPN). You will parse a string
containing the equation, handle invalid inputs, and implement operators such as
addition, subtraction, multiplication, division, and modulus. Your program
should return the result or an error message if the input is incorrect. This
helps you practice string manipulation, command line arguments, and working with
stacks in programming.

#### dress_code

The goal of this exercise is to create a Rust function that determines an
appropriate outfit based on specific criteria. You will use a `formality_level`
and an `invitation_message` to decide the type of jacket and hat to include in
the `Outfit` struct. This reinforces your understanding of enums, structs,
options, and results in Rust.

#### get_document_id

The goal of this exercise is to create a series of structured data types in
Rust, representing different offices that can pass along the task of retrieving
a document ID. You will design these structures to handle potential errors,
allowing the function `get_document_id` to either return a valid document ID or
the first error encountered in the sequence. This reinforces understanding of
chaining results and managing errors effectively in Rust programming.

#### rot21

The goal of this exercise is to create a `rot21` function in Rust that shifts
each letter in a given string by 21 positions in the alphabet. You will ensure
that only letters are changed while numbers, punctuation, and symbols remain the
same. You will test the function with different inputs to verify the output
matches the expected results.

#### flat_tree

The goal of this exercise is to create the `flatten_tree` function in Rust,
which takes a `BTreeSet` as input and returns the elements in a `Vec` format in
sorted order. You will practice handling collections and transforming data
structures while ensuring the elements are correctly ordered. This helps to
deepen your understanding of Rust’s collections and their properties.

#### order_books

The goal of this exercise is to create a module named `library` that includes
two sub-modules: `writers` and `books`. You will define the structures `Writer`
and `Book`, and implement the function `order_books` to sort the books of a
given writer alphabetically by title. This will help you practice organizing
code and manipulating collections in Rust.

#### prime_checker

The goal of this exercise is to create a function called `prime_checker` that
checks if a given unsigned 32-bit integer is a prime number. The function will
return `None` for numbers less than or equal to one. If the number is prime, it
will return `Ok(u32)`; if it is not, it will return an error type indicating
whether it is even or the smallest divisor. You will also need to optimize your
solution for better performance.

#### profanity_filter

The goal of this exercise is to create a message blocker in Rust that filters
out the word "stupid" and prevents empty messages. You will define a `Message`
structure with fields for content and user, and implement functions to
initialize the message and check its validity. The `check_ms` function evaluates
the message and provides feedback based on its content. This practice will
enhance your understanding of structures and error handling in programming.

#### display_table

The goal of this exercise is to create a `Table` structure in Rust that can
store headers and body data. You will implement functions to create a new table
and add rows to it. You will also format the table for display, ensuring each
column's width adjusts to the longest entry and centers the content within
cells, while also handling empty tables without printing anything. This will
enhance your skills in data structures and formatting output in Rust.

#### scytale_decoder

The goal of this exercise is to create a function that decodes a scytale cipher.
You will take a string that represents the coded message and an unsigned integer
for the number of letters per turn around the cylinder. Your function will
rearrange the characters based on these inputs. If the message is empty or the
letters per turn is zero, the function will return `None`. This helps you
understand string manipulation and algorithms.

#### office_worker

The goal of this exercise is to create a structure called `OfficeWorker` with
specific fields and an enum called `WorkerRole`. You will implement the `From`
trait to convert string inputs into these types using a defined format. This
will help you practice structuring data, enum management, and implementing
traits in Rust.

#### matrix_display

The goal of this exercise is to complete the `Matrix` struct in Rust. You will
implement the `new` function to initialize the struct with a vector of integer
vectors and make it capable of being displayed with the `std::fmt::Display`
trait. By doing this, you will learn how to create and format data structures in
Rust.

#### car_rental

The goal of this exercise is to help you understand interior mutability in Rust
by using the `RefCell` type. You will create two structs, `Car` and
`RentalBusiness`, and implement methods in `RentalBusiness` that allow you to
access and modify the `Car` object even when it is not mutable. This will deepen
your understanding of how to manage state in your programs while following
Rust's ownership rules.

#### negative_spelling

The goal of this exercise is to create a function called `negative_spell` that
converts negative integers into their English words representation. You will
handle negative numbers up to "minus one million" and return an error message
for positive numbers. This task will help you understand string manipulation and
function creation in Rust.

#### queens

The goal of this exercise is to determine if two queens can attack each other on
a chessboard based on their positions. You will create a `ChessPosition` struct
to represent the position and a `Queen` struct for queens. You must implement
functions to create valid positions and to check if the queens can attack using
their ranks, files, or diagonals. This will reinforce your understanding of
structs and logical conditions in programming.

#### organize_garage

The goal of this exercise is to create a generic `Garage` structure in Rust that
can manage two containers: `left` and `right`. You will implement methods to
move values between these containers while ensuring that the generic type meets
specific traits. This will help you understand generics, methods, and basic Rust
syntax.

#### blood_types_s

The goal of this exercise is to implement methods in the `BloodType` struct that
determine blood compatibility. You will define the `can_receive_from` method to
check if one blood type can receive from another. You will also create `donors`
to list blood types that can donate to the current type and `recipients` to list
those that can receive from it. This will help you understand blood type
relationships.

#### lunch_queue

The goal of this exercise is to create an API to manage a queue of people
ordering food. You will implement functions to add a person, remove the first
person, invert the order, and search for a person by name. You will also create
a structure for the queue and a type for linking people in the queue. This will
reinforce your understanding of data structures and linked lists in Rust.

#### moving_targets

In this exercise, you will create a linked list of `Target` structures using
Rust. You will implement functions to initialize the list, add or remove
targets, and access them without removing. You will learn about recursive types,
ownership, and how to manage memory effectively in Rust. This will enhance your
understanding of data structures and improve your programming skills.

#### filter_table

The goal of this exercise is to implement functions for a `Table` struct in
Rust. You will create a new table, add rows, and filter columns and rows using
closures. This will help you understand how to manage data in a table-like
structure and manipulate it based on certain conditions, enhancing your
programming skills with Rust.

#### drop_the_blog

The goal of this exercise is to implement a blogging system in Rust using
structures that manage articles. You will define a `Blog` structure that keeps
track of dropped articles and their states. You will also create an `Article`
structure linked to the `Blog`. You will implement functions to handle article
creation, state checks, and dropping articles, including implementing the `Drop`
trait to update the blog's state. This will enhance your understanding of
ownership, references, and managing state in Rust.

#### brackets_matching

The goal of this exercise is to create a program that checks if the input
expressions are correctly bracketed, based on specified bracket types. Your
program will read command-line arguments, evaluate only the relevant brackets,
and determine if they are properly matched. It will print "OK" for valid
expressions and "Error" for invalid ones, or nothing if no arguments are given.
This will help you practice handling command-line inputs and understanding
bracket matching in programming.

#### brain_fuck

The goal of this exercise is to create a `Brainfuck` interpreter in Rust. You
will write a program that takes a `Brainfuck` code string as input and executes
the commands defined by the language. The interpreter will manipulate an array
of bytes according to `Brainfuck` instructions and produce output based on the
operations performed.
