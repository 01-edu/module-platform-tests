## traits

### Overview

- You will learn how to create a generic function in Rust, enabling you to work
  with different data types using the `identity` function.
- You will understand data structures by building a linked list that stores
  generic values, including how to add, remove, and check the size of the list.
- You will enhance your understanding of traits and string manipulation by
  appending strings and numbers to a value in Rust.
- You will define and implement traits for different food types, improving your
  skills in struct usage and game logic.
- You will create a data model for blood types, gaining experience with
  structures, enums, and real-world logic applications.
- You will learn to perform vector arithmetic in three-dimensional space by
  working with the `ThreeDVector` structure.
- You will implement conversion from whole numbers to Roman numerals, practicing
  with structs and traits.
- You will create a `Scalar` trait to define basic operations for numeric types,
  deepening your understanding of trait inheritance.
- You will perform vector operations, specifically calculating the dot product,
  learning about vector mathematics.
- You will handle JSON data in Rust, counting commits by authors and weeks,
  enhancing your data handling skills.
- You will process a minesweeper board, applying logic to enhance your
  programming abilities.

### Content

#### generics

The goal of this exercise is to create a function named `identity` in Rust that
takes a value of any data type and returns that same value. This helps you
understand how generics work in Rust, allowing functions to operate on different
data types without specifying them explicitly. You will also practice using the
function with various data types like strings and integers.

#### generics_list

The goal of this exercise is to create a linked list in Rust that can store
generic values. You will implement methods to create a new list, add elements to
the front, remove elements using the last-in-first-out (LIFO) principle, and
check the size of the list. This will help you understand data structures,
memory management, and generics in programming.

#### easy_traits

The goal of this exercise is to implement the `AppendStr` trait for the
`StringValue` struct in Rust. You will create functions to append a string or a
number to the `value`, and a function to remove specific punctuation marks. This
will improve your understanding of traits, methods, and string manipulation in
Rust.

#### traits

The goal of this exercise is to implement traits for different food types in a
video game context. You will define a `Food` trait for `Fruit` and `Meat`,
allowing them to calculate strength gain based on their weight. You will also
implement a display method for the `Player` structure to show player details
after consuming food. This enhances your understanding of traits and struct
usage in Rust.

#### blood_types

In this exercise, you will create a data model for blood types using Rust. You
will define structures and enums for blood type representation, implement the
`FromStr` trait for easy parsing, and implement traits for sorting and
debugging. Additionally, you will create methods to determine blood
compatibility, allowing blood type instances to check which types they can
receive from, and which types can receive from them. This practice helps you
understand data structures and traits in Rust while applying logic to real-world
problems.

#### vector_operations

The goal of this exercise is to create a structure called `ThreeDVector` that
represents a vector in three-dimensional space, defined by its components along
the x, y, and z axes. You will implement addition and subtraction for these
vectors by using Rust's `Add` and `Sub` traits. This exercise helps you
understand how to work with structures and operator overloading in Rust,
enabling you to handle vector arithmetic effectively.

#### roman_numbers

The goal of this exercise is to implement the `From<u32>` trait in Rust to
convert a whole number (u32) into a Roman numeral using subtractive notation.
You will define two structs, `RomanDigit` to represent individual Roman symbols
and `RomanNumber` to hold a collection of these symbols. You will then provide
functionality to convert a number into its corresponding Roman numeral
representation.

#### lalgebra_scalar

The goal of this exercise is to create a `Scalar` trait in Rust that defines
basic arithmetic operations like addition, subtraction, multiplication, and
division. You will implement this trait for various numeric types, ensuring each
type can provide the `zero` and `one` functions as neutral elements. This helps
understand trait inheritance and the concept of generic programming in Rust.
After implementation, you will test the functions to confirm they return the
correct neutral values.

#### lalgebra_vector

The goal of this exercise is to implement a `Vector` struct in Rust that can
perform vector operations, specifically the dot product between two vectors. You
will define the `dot` function to calculate the dot product, handling cases
where the vectors have different lengths by returning `None`. Additionally, you
will ensure the `Vector` struct implements necessary traits. This exercise helps
you understand vector mathematics and Rust's struct and trait system.

#### commits_stats

In this exercise, you will work with a JSON file containing GitHub commit data.
You will define a struct called `CommitData` and create two functions:
`commits_per_author`, which counts commits by each author, and
`commits_per_week`, which counts commits by week. This task will enhance your
skills in data handling and Rust programming.

#### minesweeper

The goal of this exercise is to create a function that processes a minesweeper
board represented as an array of strings. You will calculate the number of mines
surrounding each free space and return a new board with those counts. This
exercise helps you practice handling data structures and implementing logic in
Rust.
