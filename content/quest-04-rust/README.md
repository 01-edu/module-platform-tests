## errors

### Overview

You will learn the following key concepts from each exercise:

- **unwrap_or_expect**: Understand how to handle errors in Rust using `expect`
  and `unwrap_or` methods. You will practice creating functions and managing
  control flow based on security levels.

- **panic**: Learn to handle file operations in Rust and recognize the
  importance of error handling when files are missing. You will practice
  producing panics to demonstrate error management.

- **handling**: Discover how to open or create files in Rust. You will learn to
  manage errors using panics, enhancing your skills in file handling.

- **profanity_filter**: Create a structure to filter messages. This exercise
  will improve your understanding of structures and error checking in
  programming.

- **question_mark**: Learn to design nested structures with `Option` types. You
  will practice accessing and navigating complex data relationships.

- **banner**: Develop command flags and their handlers, enhancing your
  understanding of data structures, error handling, and functional programming.

- **cipher**: Implement the Atbash cipher, improving your error handling skills
  by comparing original and ciphered strings.

- **error_types**: Create a form validator, practicing user input validation and
  managing errors with structured error types.

- **boxing_todo**: Build an API to read JSON files, learning to handle custom
  error types and improving your error management skills.

- **binary_search**: Understand the binary search algorithm, enhancing your
  skills in searching techniques in Rust.

### Content

#### unwrap_or_expect

The goal of this exercise is to create a function called **fetch_data** that
processes a `Result` type and performs actions based on a defined `enum` called
`Security`. You will learn to use methods like `expect`, `unwrap_or`, and others
to handle errors in different ways, depending on the security level provided.
This will enhance your understanding of error handling in Rust while practicing
function creation and control flow.

#### panic

The goal of this exercise is to create a function in Rust that attempts to open
a specified file and produces an error if the file does not exist. You will
learn how to handle file operations and manage errors by causing a panic when a
file is missing, demonstrating the importance of error handling in programming.

#### handling

The goal of this exercise is to create a function named `open_or_create` in Rust
that takes a file path and content as arguments. The function should attempt to
open the specified file. If the file does not exist, it will create it and write
the provided content to it. If there is an error during these operations, the
function should panic, displaying the error message. This exercise helps you
learn file handling and error management in Rust.

#### profanity_filter

The goal of this exercise is to create a message blocker in Rust that filters
out the word "stupid" and prevents empty messages. You will define a `Message`
structure with fields for content and user, and implement functions to
initialize the message and check its validity. The `check_ms` function evaluates
the message and provides feedback based on its content. This practice will
enhance your understanding of structures and error handling in programming.

#### question_mark

The goal of this exercise is to create a series of nested structures in Rust,
each containing an `Option` type. You will design four structures (`One`, `Two`,
`Three`, and `Four`) that have a relationship through `Option`. You will also
implement a function `get_fourth_layer` in the `One` structure that retrieves
the value from the `Four` structure. This helps you understand struct
definitions, the use of `Option`, and how to navigate and access nested data.

#### banner

The goal of this exercise is to create a structured way to handle command flags
with associated callback functions in Rust. You will develop two structures:
`Flag`, which defines command flags with shorthand and descriptions, and
`FlagsHandler`, which manages these flags and executes associated functions. The
task will enhance your understanding of Rust's data structures, error handling,
and functional programming through callbacks.

#### cipher

The goal of this exercise is to create a function named `cipher` that implements
the Atbash cipher encryption method. You will compare an original string to its
ciphered version, returning a boolean to indicate correctness or an error
containing expected results. You will define the `CipherError` structure to
handle errors effectively.

#### error_types

The goal of this exercise is to implement a form validator in Rust that checks
the validity of a user's first name and password. You will create a `Form`
structure with required fields and associated functions for creating and
validating the form. For errors, you will define a `FormError` structure that
captures invalid inputs and error descriptions. This will help you practice user
input validation and error handling in programming.

#### boxing_todo

The goal of this exercise is to create an API that reads and parses a JSON file
containing a list of todos while managing errors effectively. You will define
custom error types using enums and structs to handle different parsing and
reading errors. You will also implement functions to display error messages and
to deserialize the JSON file. This will ensure your code can handle any issues
that arise during the process efficiently.

#### binary_search

The goal of this exercise is to write a function called `binary_search` that
searches for a specific integer in a sorted list using the binary search
algorithm. You will take a sorted list and a target integer as inputs and return
the index of the target if it is found, or `None` if it is not present. This
will help you understand searching algorithms and improve your coding skills in
Rust.
