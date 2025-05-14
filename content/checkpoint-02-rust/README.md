## Checkpoint 02-rust

### Overview

To achieve the checkpoint for the exercises listed, you will need the following
key skills and knowledge:

- **Understanding Prime Numbers**: You will learn how to identify and work with
  prime numbers through functions that find the nearest primes.

- **Control Structures**: You will use conditionals, loops, and functions to
  manage logic and flow in your programs.

- **Function Creation**: You will practice declaring functions that take
  parameters and return values based on calculations.

- **String Manipulation**: You will learn to reverse strings and to create
  outputs that include both original and manipulated data.

- **Factorials**: You will understand how to calculate factorials and the steps
  to reach them.

- **Ownership and Borrowing**: You will gain insight into Rust's unique
  ownership model through struct implementations and data return methods.

- **Matrix Operations**: You will learn to compute determinants using
  mathematical formulas.

- **Enums and Structs**: You will create and manage enums and structs to
  organize data effectively.

- **Error Handling**: You will explore how to manage potential errors through
  structured data and return types.

- **Sorting and Collections**: You will practice sorting data structures,
  enhancing your organizational skills.

- **Ciphers and Algorithms**: You will develop algorithms for decoding messages
  and shifting letters to understand data manipulation.

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

#### scytale_decoder (Bonus)

The goal of this exercise is to create a function that decodes a scytale cipher.
You will take a string that represents the coded message and an unsigned integer
for the number of letters per turn around the cylinder. Your function will
rearrange the characters based on these inputs. If the message is empty or the
letters per turn is zero, the function will return `None`. This helps you
understand string manipulation and algorithms.

#### office_worker (Bonus)

The goal of this exercise is to create a structure called `OfficeWorker` with
specific fields and an enum called `WorkerRole`. You will implement the `From`
trait to convert string inputs into these types using a defined format. This
will help you practice structuring data, enum management, and implementing
traits in Rust.

#### matrix_display (Bonus)

The goal of this exercise is to complete the `Matrix` struct in Rust. You will
implement the `new` function to initialize the struct with a vector of integer
vectors and make it capable of being displayed with the `std::fmt::Display`
trait. By doing this, you will learn how to create and format data structures in
Rust.

#### car_rental (Bonus)

The goal of this exercise is to help you understand interior mutability in Rust
by using the `RefCell` type. You will create two structs, `Car` and
`RentalBusiness`, and implement methods in `RentalBusiness` that allow you to
access and modify the `Car` object even when it is not mutable. This will deepen
your understanding of how to manage state in your programs while following
Rust's ownership rules.
