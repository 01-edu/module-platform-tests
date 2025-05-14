## lifetimes

### Overview

You will learn important skills by completing these quests in Rust:

- **Matrix Creation**: You will create a `Matrix` data structure and understand
  how to use two-dimensional vectors.
- **Basic Operations**: You will implement addition and subtraction for
  matrices, ensuring that they match in size. This teaches traits and error
  handling.
- **Matrix Functions**: You will gain skills in retrieving matrix dimensions and
  performing multiplication, enhancing your practical experience.
- **Lifetime Management**: You will work with structs and learn how to manage
  ownership and lifetimes through the `Person` struct.
- **String Manipulation**: You will practice using functions and the Option type
  with the `delete_prefix` function to modify strings.
- **Traits and Structs**: You will implement the `Vehicle` trait to work with
  different vehicle types and improve your understanding of traits.
- **Notification System**: You will create a notification system, practicing
  enum handling and struct usage for displaying events.
- **Macros**: You will develop a `hash_map` macro, learning to write flexible
  and reusable code for collections.

### Content

#### matrix

The goal of this exercise is to create a data structure called `Matrix` in Rust
that represents a matrix using a two-dimensional vector. You will implement
three functions: `new`, which creates a `1 x 1` matrix, `identity`, which
generates an identity matrix of size `n`, and `zero`, which returns a zero
matrix of specified rows and columns. This exercise enhances your understanding
of data structures and basic operations in Rust.

#### matrix_ops

The goal of this exercise is to implement the addition and subtraction
operations for matrices in Rust. You will ensure that two matrices can only be
added or subtracted if they have the same size, returning an `Option<T>` to
handle cases where the operation fails. This reinforces your understanding of
traits, matrix operations, and error handling in Rust while using previously
defined structures.

#### matrix_mult

The goal of this exercise is to implement basic functions for a matrix, allowing
you to get the number of rows and columns, as well as retrieve specific rows and
columns. You will also define matrix multiplication by implementing the `Mul`
trait for your matrix type. This gives you practical skills in working with
matrices in Rust.

#### lifetimes

The goal of this exercise is to understand how to work with structs and methods
in Rust. You will complete the `Person` struct by adding fields and implementing
the `new` function, which initializes `age` to `0`. This will help you learn
about basic data structures and how to manage ownership and lifetimes in Rust.

#### delete_prefix

The goal of this exercise is to create a function `delete_prefix` in Rust that
takes a prefix and a string. The function removes the prefix from the string if
it exists, returning the modified string wrapped in `Some`. If the prefix is not
present, it returns `None`. This will help you practice string manipulation and
the use of the Option type in Rust.

#### border_cross

The goal of this exercise is to create a function that takes a list of vehicles,
which can be either cars or trucks, and returns a list of their models. You will
implement a trait called `Vehicle` for both structures and use the function
`all_models` to extract the model names from the vector of vehicles. This will
help you understand traits and struct implementations in Rust.

#### events

The goal of this exercise is to create a notification system that displays
messages based on different events. You will define a `notify` method that
returns a `Notification` struct, which includes properties like size, color,
position, and content. This helps you practice enum handling and struct usage in
Rust while formatting messages for visual output. You will also implement
formatting for command line display.

#### macro_map

The goal of this exercise is to create a macro called `hash_map` that simplifies
the process of initializing a `HashMap` in Rust. The macro should allow for both
leading and non-leading commas to cater to different coding styles. You will
practice creating flexible and reusable code, similar to how the `vec!` macro
works for vectors. This will enhance your understanding of macros and
collections in Rust.
