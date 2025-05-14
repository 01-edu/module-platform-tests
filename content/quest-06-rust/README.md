## patterns

### Overview

- You will learn how to create functions in Rust for various practical tasks.
- You will understand string manipulation by handling different types of input
  and output.
- You will practice using mathematical operations, such as calculating powers of
  two.
- You will develop skills in summing values associated with characters and
  strings.
- You will enhance your knowledge of searching algorithms by finding elements in
  arrays.
- You will learn to convert numbers into their ordinal forms, improving your
  string formatting skills.
- You will implement logic to check for pangrams, reinforcing your conditional
  programming skills.
- You will get hands-on experience with character encoding through functions
  that rotate letters.
- You will manipulate data structures like structs by working with color values.
- You will practice pattern recognition by transforming words into Pig Latin.
- You will learn about ciphers through encoding messages with a scytale cipher.
- You will create visual outputs by designing symmetrical figures like diamonds.
- You will convert numbers into English words, improving string manipulation
  further.
- You will apply validation techniques through the Luhn algorithm, enhancing
  your problem-solving abilities.

### Content

#### stars

The goal of this exercise is to create a function named `stars` that calculates
the power of two based on the input number, `n`. The function should return a
string containing asterisks, where the number of asterisks is equal to 2 raised
to the power of `n`. You will test the function with different values to see the
corresponding output.

#### scores

The goal of this exercise is to create a function named `score` that calculates
the score of a string based on the specific values assigned to each letter. You
will learn how to sum the scores of individual letters, considering different
characters and their associated values. This will enhance your understanding of
functions and string manipulation in Rust programming.

#### searching

The goal of this exercise is to create a function called `search` that finds the
index of a specific element (`key`) in an array of unique integers. You will
implement the logic to search through the array and return the index wrapped in
an `Option`. The function should handle cases where the `key` is present and
return `None` if it is not found.

#### ordinal

The goal of this exercise is to create a function called `num_to_ordinal` that
converts cardinal numbers into their ordinal form. You will write Rust code that
takes a positive integer and returns it as a string with the correct ordinal
suffix, like "1st" for 1 and "22nd" for 22. This will help you understand string
manipulation and function creation.

#### pangram

The goal of this exercise is to create a function named `is_pangram` that checks
if a given string contains every letter of the alphabet at least once. You will
implement this function in Rust and test it using provided examples. This will
reinforce your understanding of string manipulation and functions in
programming.

#### talking

The goal of this exercise is to create a `talking` function that responds to
different types of inputs. You will learn to identify yelling, questions, and
empty messages, and return appropriate responses based on these conditions. This
task will improve your skills in handling strings and conditional logic in Rust.

#### logic_number

The goal of this exercise is to create a function that checks if a number equals
the sum of its digits, with each digit raised to the power equal to the total
number of digits. You will implement this logic by writing a function in Rust.
You will also test your function using a provided main program and verify its
output with known examples.

#### rot

In this exercise, you will learn to create a `rotate` function that rotates
letters in a string based on a given number. You will apply a rotation to each
letter, moving it either to the right or left depending on the second argument.
Non-letter characters will remain unchanged. This will help you understand
string manipulation and character encoding.

#### rgb_match

The goal of this exercise is to implement the `Color` struct in Rust and create
a `swap` function that swaps two color values. You will practice using Rust's
struct and function features while learning to manipulate color components (red,
green, blue, and alpha). This will help you understand data structures and basic
operations in programming.

#### pig_latin

The goal of this exercise is to create a function that transforms words into Pig
Latin following specific rules based on the first letter of each word. If a word
starts with a vowel, you will add "ay" to the end. For words starting with
consonants, you will move the consonants before the first vowel to the end and
add "ay". The function will help you practice string manipulation and pattern
recognition in Rust.

#### scytale_cipher

The goal of this exercise is to create a function that implements the scytale
cipher. You will take a string message and a number that represents how many
times the strip wraps around a cylinder. Your function will rearrange the
characters of the message based on the cylinder's size and return the encoded
result.

#### diamond_creation

The goal of this exercise is to create a function called `make_diamond` that
generates a symmetrical diamond shape using letters. The diamond design must
have the input letter at its widest point, with the first and last rows
containing 'A'. The diamond will have a specific pattern with letters in
ascending order in the top half and descending in the bottom half while ensuring
both horizontal and vertical symmetry. This exercise will help you practice
string manipulation and create visual patterns in programming.

#### spelling

The goal of this exercise is to create a function named `spell` in Rust that
converts a positive number into its corresponding English words. You will
implement this function to correctly return the spelled-out version of numbers
from 1 to 1,000,000, using proper formatting for hundreds, tens, and units.

#### luhn_algorithm

The goal of this exercise is to create a function that checks if a number is
valid using the Luhn formula. You will write code that takes a string as input,
ignores spaces, and returns true if the number is valid. You will handle invalid
inputs and follow the steps of the Luhn algorithm to validate credit card
numbers.
