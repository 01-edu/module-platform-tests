## data

### Overview

- You will learn how to create and initialize struct types in Rust, enhancing
  your understanding of struct creation and implementation.
- You will practice modifying state in structs, such as changing the brightness
  of a smart light and manipulating data within vectors.
- You will learn to calculate geometric properties like distance, area, and
  diameter by working with struct methods, improving your mathematical
  programming skills.
- You will explore using enumerations to define categories, adding depth to your
  understanding of Rust's type system.
- You will gain skills in working with arrays and handling operations like
  summation, enhancing your ability to manipulate collections of data.
- You will understand string handling in Rust, including counting characters and
  manipulating their cases, which is crucial for text processing.
- You will learn how to measure string similarity through algorithms, improving
  your problem-solving skills.
- You will practice using data structures like `HashMap` to manage and analyze
  data efficiently, including counting occurrences and distinct items.
- You will enhance your skills in sorting algorithms, specifically bubble sort,
  while understanding how data can be organized and processed.
- You will learn how to check for anagrams, deepening your skills in string
  manipulation and logical comparisons.

### Content

#### changes

The goal of this exercise is to create functionality for a smart light system
using Rust. You will define a `new` function to initialize a light with a given
alias and a brightness of 0. You will also implement the `change_brightness`
function to modify the brightness of a specific light identified by its alias
within a vector of lights. This will help you practice struct creation and
function definitions in Rust.

#### circle

The goal of this exercise is to create two structures in Rust: `Circle` and
`Point`. You will implement methods for calculating the distance between points,
the diameter and area of circles, and checking if two circles intersect.
Completing the structures and methods will allow you to run the provided
program, which produces specific output, thereby enhancing your understanding of
Rust's struct and method features.

#### card_deck

The goal of this exercise is to implement a simple card deck in Rust. You will
create enumerations for `Suit` and `Rank`, including functions to return random
values and translate numerical inputs into the corresponding card types. Then,
you will define a `Card` structure that combines a suit and rank. Finally, you
will create a function to determine if a card is an Ace of Spades, enhancing
your understanding of enums, structures, and random value generation in
programming.

#### arrays

The goal of this exercise is to define two functions in Rust: `thirtytwo_tens`,
which creates an array with 32 positions all set to 10, and `sum`, which
calculates the total value of an array of integers. You will also figure out the
missing types in the provided `main` function to ensure it runs correctly and
demonstrates how the functions work.

#### strings

The goal of this exercise is to create a function called `char_length` that
receives a string slice and returns the number of characters in that string. You
will practice handling different types of characters, including emojis and
multi-byte characters. This helps you understand string processing in Rust.

#### capitalizing

The goal of this exercise is to create three functions in Rust that manipulate
string cases. The `capitalize_first` function changes the first letter of a
string to uppercase. The `title_case` function capitalizes the first letter of
each word in a string. The `change_case` function swaps uppercase and lowercase
letters in a string. You will implement and test these functions to understand
string manipulation.

#### edit_distance

The goal of this exercise is to create a function called `edit_distance` that
calculates the minimum number of changes required to transform one string into
another. You will implement this in Rust, focusing on insertions, deletions, and
substitutions. This helps improve your understanding of string manipulation and
algorithms in programming.

#### simple_hash

The goal of this exercise is to create two functions in Rust. The first
function, `word_frequency_counter`, will count how many times each word appears
in a vector of strings and return a `HashMap` with words as keys and their
counts as values. The second function, `nb_distinct_words`, will take a
reference to the `HashMap` and return the total number of unique words. This
helps you practice using data structures and counting occurrences in
programming.

#### bigger

The goal of this exercise is to create a function called `bigger` that
identifies and returns the largest positive integer from a `HashMap`. You will
work with the Rust programming language to build the function and test it using
a sample `HashMap`. This helps you practice handling data structures
effectively.

#### string_permutation

The goal of this exercise is to create a function called `is_permutation` that
checks if one string is a permutation of another. You will compare the
characters and their counts in both strings, ensuring that they contain the same
elements, regardless of the order. You will practice using Rust and enhance your
skills in handling strings and hash maps.

#### hashing

The goal of this exercise is to create three functions in Rust that compute
statistical values from a list of integers: the mean calculates the average, the
median finds the middle value, and the mode identifies the most frequently
occurring number. You will practice using vectors, data manipulation, and basic
statistical concepts.

#### collect

The goal of this exercise is to implement the `bubble_sort` function that sorts
a mutable vector of integers in increasing order using the bubble sort
algorithm. You will learn how to manipulate vectors in Rust and understand the
sorting process through the implementation of this algorithm. You will also test
your function to ensure it works correctly by comparing its output with Rust's
built-in sort method.

#### is_anagram

The goal of this exercise is to implement a function called `is_anagram` in Rust
that checks if two given strings are anagrams of each other. You will create the
logic to compare the letters of both strings and return `true` if they can be
rearranged to form each other. If they cannot, the function will return `false`.
You will also test the function with sample strings to confirm it works
correctly.
