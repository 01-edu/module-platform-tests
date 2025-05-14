## memory

### Overview

You will learn several important skills by completing the exercises:

- **Borrowing**: You will understand how to reference values without taking
  ownership in Rust with the `str_len` function.

- **Function Creation**: You will practice defining function parameters and
  modifying strings in-place using the `doubtful` function.

- **String Manipulation**: You will enhance your skills in string formatting for
  URLs through the `to_url` function.

- **Memory Management**: You will gain insights into memory allocation when
  working with strings in the `string_literals` exercise.

- **Heap Management**: You will learn about efficient handling of data in
  functions like `initials`.

- **Ownership Concepts**: You will practice manipulating string formats and
  ownership with the `first_subword` function.

- **Data Ownership**: Through the `copy` exercise, you will explore how Rust
  handles ownership with different data types.

- **Game Logic**: You will develop skills in function creation and data
  evaluation while checking the game status in `tic_tac_toe`.

- **Sorting Techniques**: You will enhance your understanding of sorting and
  efficient memory usage with the `arrange_phrase` function.

- **Numerical Logic**: You will verify mathematical properties with the
  `armstrong_number` function.

### Content

#### borrow

The goal of this exercise is to create a Rust function named `str_len` that
accepts a string and returns its length without taking ownership of that string.
This teaches you about borrowing in Rust, which allows you to reference a value
without transferring ownership. The exercise helps you understand how to work
with string slices and how to handle string types efficiently.

#### doubtful

The goal of the exercise is to create a function named `doubtful` that adds a
question mark to a given string without returning a value. You will learn to
define function parameters correctly, modify a string in-place, and understand
how to test the function using a main program. This exercise reinforces your
skills in function creation and string manipulation in Rust.

#### to_url

The goal of this exercise is to create a function named `to_url` that transforms
a given string by replacing every space with the sequence `"%20"`. This function
will help you understand string manipulation and formatting for use in URLs,
ensuring proper encoding of spaces. You will write and test this function in
Rust, reinforcing your programming skills.

#### string_literals

The goal of this exercise is to create functions in Rust that manipulate
strings. You will write functions to check if a string is empty, if it contains
only ASCII characters, if it contains a specific pattern, to split a string at a
specified index, and to find the index of a specific character. You will also be
mindful of memory allocation practices in your implementation. This exercise
will help you enhance your understanding of string manipulation and memory
management in Rust.

#### name_initials

The goal of this exercise is to create a function named `initials` that takes a
vector of names and returns a vector containing the initials of each name. You
will focus on efficiently managing heap allocations while processing the input.
This exercise helps reinforce your understanding of string manipulation and
memory management in Rust.

#### ownership

The goal of this exercise is to create a function named `first_subword`, which
will take a string as input and return the first sub-word. This function must
handle different naming conventions like `camelCase`, `PascalCase`, and
`snake_case`. By completing this task, you will practice working with string
manipulation and ownership in Rust.

#### copy

The goal of this exercise is to create three functions in Rust that demonstrate
how data ownership works with different types. You will develop `nbr_function`
to handle integers and return a tuple of the original value, its exponential
function, and the natural logarithm. You will implement `str_function` to
process a string and return the original string along with the exponential
values as strings. Finally, you will create `vec_function` for a vector of
integers that returns the original vector and the natural logarithm of each
absolute value. This practice helps you understand Rust's ownership system and
data handling.

#### borrow_me_the_reference

The goal of this exercise is to help you understand and apply Rust's ownership
feature. By creating functions that manipulate strings and vectors, you will
practice borrowing and mutable references. You will learn how ownership
influences memory management, allowing for safe and efficient code execution
without a garbage collector.

#### tic_tac_toe

The goal of this exercise is to create a set of functions that will check the
status of a tic-tac-toe game. You will develop a main function named
`tic_tac_toe` which evaluates a game board and returns the result: whether
player O or player X has won, or if there is a tie. You will also create
functions for checking if a player has won through rows, columns, or diagonals,
enhancing your skills in function creation and data handling in Rust.

#### arrange_it

The goal of this exercise is to create a function named `arrange_phrase` in Rust
that takes a string with words marked by numbers indicating their correct order.
You will sort the words based on these numbers and return a properly arranged
string. You will also focus on efficient memory usage during this process.

#### armstrong_number

The goal of this exercise is to create a function in Rust that checks if a given
number is an Armstrong number. You will determine if the sum of the digits of
the number, each raised to the power of the number of digits, equals the number
itself. If it is an Armstrong number, the function will return the number;
otherwise, it will return `None`. You will also test the function with several
examples to verify its correctness.
