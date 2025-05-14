## Checkpoint

### Overview

- You will practice writing simple programs that output specific characters:
  'a', 'z', 'f', '1', and 'B'.
- You will learn basic syntax in a programming language to display text on the
  screen.
- You will develop functions with specific behaviors, such as calculating a
  rectangle's perimeter or counting characters in a string.
- You will reinforce skills in string manipulation, including identifying words,
  handling arguments, and formatting output correctly.
- You will understand conditional logic and input validation, ensuring your
  program responds accurately based on given parameters.
- You will work with slices and arrays, learning to manipulate and combine data
  in Go.
- You will enhance your programming skills by being precise in your output,
  handling edge cases, and writing clean, correct code.

### Content

#### onlya

The goal of this exercise is to help you practice writing a simple program that
outputs a single character, specifically the letter 'a'. This will reinforce
your understanding of basic syntax and how to display text on the screen using a
programming language. You will focus on precision and ensure that only the
character 'a' appears as output, enhancing your skills in writing clean and
correct code.

#### onlyz

The goal of this exercise is to help you practice basic programming concepts by
writing a simple program that outputs only the character `z`. You will focus on
understanding how to display text in your chosen programming language. This will
reinforce your skills in syntax and output functions, which are essential for
future projects.

#### onlyf

The goal of this exercise is to help you create a simple program that
consistently outputs the character `f` regardless of any input. This task will
reinforce your understanding of basic programming concepts such as function
execution, standard output, and arguments handling while emphasizing that the
program can ignore all input parameters.

#### only1

The goal of this exercise is to write a simple program that outputs the
character `1` regardless of the input parameters. You will learn to focus on the
core functionality of the program, ensuring it operates correctly without being
influenced by additional inputs. This helps reinforce fundamental programming
concepts.

#### onlyb

The goal of this exercise is to write a program that consistently outputs a
single `B` character, regardless of the input provided. You will practice the
fundamental concept of output in programming while ensuring your code ignores
any arguments passed to it. This helps reinforce the idea of producing fixed
output and understanding how to handle inputs without affecting the outcome.

#### rectperimeter

The goal of this exercise is to write a function called `RectPerimeter` in Go
that calculates the perimeter of a rectangle using its width and height. If
either the width or height is negative, the function should return `-1` to
indicate an error. This helps you practice function creation, input validation,
and understanding perimeter calculations.

#### countcharacter

The goal of this exercise is to write a function named `CountChar` in Go that
counts how many times a specific character appears in a given string. The
function should return 0 if the character is not found or if the string is
empty. This helps you practice string manipulation and function creation in
programming.

#### checknumber

The goal of this exercise is to help you practice writing a function in Go that
checks for the presence of numbers in a given string. You will create a function
named `CheckNumber` that returns `true` if the string contains at least one
number and `false` if it does not. This will enhance your understanding of
string manipulation and conditional logic in programming.

#### countalpha

The goal of this exercise is to create a function named `CountAlpha()` that
counts and returns the number of alphabetic characters in a given string. You
will practice string manipulation and understanding character types. Testing the
function with different input strings will ensure its accuracy and improve your
coding skills in Go.

#### printif

The goal of this exercise is to write a function named `PrintIf` that evaluates
the length of a provided string. If the string contains three or more
characters, the function will return the letter `G` followed by a newline. If
the input is an empty string, it will still return `G`. For shorter strings, it
will return "Invalid Input" followed by a newline.

#### printifnot

The goal of this exercise is to practice writing a function in Go that evaluates
the length of a string. You will return 'G' if the string is empty or less than
three characters. If the string has three or more characters, you will return
'Invalid Input'. This reinforces your understanding of string handling and
conditional statements.

#### retainfirsthalf

The goal of the exercise is to create a function called `RetainFirstHalf()` that
processes a string and returns its first half. For strings with odd lengths, the
function will round down the length for even splitting. It should handle edge
cases like empty strings and single-character strings appropriately. You will
practice string manipulation and conditional logic in Go programming.

#### digitlen

The goal of this exercise is to create a function called `DigitLen()` that
calculates how many times the first integer can be divided by the second integer
before reaching zero. If the second integer is outside the range of 2 to 36, the
function should return -1. Additionally, if the first integer is negative, it
will reverse the sign and count the digits. This task helps you practice
function creation, condition handling, and integer manipulation in Go.

#### fishandchips

The goal of this exercise is to write a function called `FishAndChips()` that
processes an integer input and returns specific strings based on divisibility
rules. You will check if the number is divisible by 2, 3, both, or is negative,
and respond with the appropriate string or an error message. This helps you
practice conditional statements and function creation in Go.

#### cameltosnakecase

The goal of the exercise is to write a function that converts strings from
`camelCase` to `snake_case`. You will handle cases like `lowerCamelCase` and
`UpperCamelCase`. You must return an empty string if the input is empty and
return the input unchanged if it is not in `camelCase`. Otherwise, you will
convert the valid `camelCase` string into `snake_case`. This will help you
practice string manipulation and function development in Go.

#### gcd

The goal of this exercise is to write a function in Go that calculates the
greatest common divisor (GCD) of two positive integers. You will create a
function called Gcd which returns the largest integer that divides both inputs.
If either input is zero, the function will return zero. This practice helps you
understand mathematical algorithms and improve your coding skills.

#### hashcode

The goal of this exercise is to create a function called `HashCode` that takes a
string input and produces a hashed string. You will use a specific equation
involving ASCII values and the string's size to modify each character. The
function ensures all results are within the printable ASCII range, simplifying
string encoding.

#### lastword

The goal of this exercise is to create a function called `LastWord` that takes a
string input and returns the last word found in that string, followed by a
newline character. This helps you practice string manipulation in Go, focusing
on identifying words based on spaces and string boundaries. You will implement
the logic to extract and return just the last word from the provided input.

#### firstword

The goal of this exercise is to create a function that extracts the first word
from a given string and returns it followed by a newline. You will learn to
handle strings, identify the first word based on spaces or string boundaries,
and format the output correctly. This enhances your string manipulation skills
in Go.

#### repeatalpha

The goal of this exercise is to create a function named `RepeatAlpha` that takes
a string as input and modifies it by repeating each alphabetical character based
on its position in the alphabet. For example, 'a' repeats once, 'b' repeats
twice, and so on. This will help you practice string manipulation and understand
character indexing in programming.

#### searchreplace

The goal of this exercise is to write a program that modifies a given string by
replacing a specified letter with another letter, provided that three arguments
are passed. If three arguments are not given, the program will display nothing.
If the letter to be replaced is not found in the string, it will simply output
the original string followed by a newline. This helps you practice argument
handling and string manipulation in programming.

#### findprevprime

The goal of this exercise is to create a function called `FindPrevPrime` in Go
that takes an integer as input and returns the largest prime number that is less
than or equal to that integer. If there are no prime numbers below the input
integer, the function should return 0. You will practice identifying prime
numbers and implementing logical conditions in your code.

#### thirdtimeisacharm

The goal of this exercise is to write a function called `ThirdTimeIsACharm()` in
Go that extracts and returns every third character from a given string. If the
input string is empty or has fewer than three characters, the function should
return a newline character. This will help you practice string manipulation and
basic conditional logic in Go.

#### printrevcomb

The goal of this exercise is to write a program that generates and prints all
unique combinations of three different digits in descending order. You need to
ensure that each combination follows the rule that the first digit is greater
than the second, and the second is greater than the third. The output should be
formatted with combinations separated by a comma and a space.

#### printmemory

The goal of this exercise is to create a function that takes an array of ten
bytes and prints both the hexadecimal representation of each byte and the
corresponding ASCII characters. Non-printable ASCII characters must be replaced
with a dot. This helps you understand byte manipulation and how to work with
character encoding in programming.

#### weareunique

The goal of this exercise is to create a function that identifies unique
characters from two given strings. You will count the characters that appear in
one string but not in the other, ensuring no duplicates. You will return zero if
no unique characters exist and return negative one if both strings are empty.

#### itoa

The goal of this exercise is to write a function called `Itoa` that converts an
integer to its string representation in Go. You need to ensure that the function
correctly handles positive and negative numbers, as well as zero. It will help
you practice converting data types and managing numerical signs.

#### iscapitalized

The goal of this exercise is to create a function called `IsCapitalized()` that
checks if each word in a given string starts with either an uppercase letter or
a non-alphabetic character. You will return `true` if all words meet this
condition, and `false` if any word starts with a lowercase letter or if the
string is empty. This exercise helps you practice string handling and condition
checking in programming.

#### fromto

You will create a function that generates a comma-separated string of numbers
between two integers. You will ensure both integers are valid (between 0 and
99), add leading zeros to single-digit numbers, and handle invalid input by
returning "Invalid". Additionally, you will include a newline at the end of the
string.

#### zipstring

The goal of this exercise is to create a function that transforms a given string
by counting consecutive duplicate characters and replacing them with the count
followed by the character itself. You will eliminate extra duplications and
ensure the output retains only characters from the Latin alphabet, handling any
other characters accordingly. This will help you practice string manipulation
and develop your coding skills in Go.

#### expandstr

The goal of this exercise is to create a program that formats a string by
placing exactly three spaces between each word while removing any leading or
trailing spaces. You will handle specific cases, such as displaying nothing for
invalid input or when no words are present. This will help you practice string
manipulation and argument handling in programming.

#### cleanstr

The goal of this exercise is to create a program that formats a given string by
ensuring there is one space between words, removing any spaces or tabs at the
beginning and end, and adding a newline at the end. You will learn to handle
string manipulation, argument validation, and formatting output correctly.

#### concatalternate

The goal of the `ConcatAlternate` exercise is to create a function that combines
two slices of integers into a new slice. The function should alternate elements
from each slice, starting with the larger slice. If both slices are equal in
length, the new slice should prioritize the first slice. This task helps
strengthen your understanding of slices and function implementation in Go.

#### reversestrcap

The goal of this exercise is to create a program that modifies the case of the
last letter in each word for given input strings. It ensures the last letter is
uppercase while the rest are in lowercase, and it properly handles multiple
arguments. If no arguments are provided, it simply outputs nothing.

#### wdmatch

The goal of this exercise is to write a program that checks if the first string
can be formed using characters from the second string while maintaining the
order of those characters. You will handle input validation and ensure the
program displays the result only when there are exactly two arguments provided.

#### hiddenp

The goal of the exercise is to create a program named `hiddenp` that checks if
one string, `s1`, is hidden within another string, `s2`. You will implement
logic to verify if the characters in `s1` appear in `s2` in the same order, but
not necessarily consecutively. The program should return `1` if hidden and `0`
if not, while also handling special cases like empty strings and incorrect
arguments.

#### concatslice

The goal of the exercise is to create a function named `ConcatSlice()` that
combines two slices of integers into one. You will learn how to work with slices
in Go, including passing them as arguments and returning a new slice. This
exercise helps you practice basic programming concepts and enhances your skills
in manipulating data structures.

#### inter

The goal of this exercise is to write a program that identifies and displays the
unique characters common to two given strings. The characters should appear in
the order they are found in the first string. The program will show nothing if
the input does not consist of exactly two strings.

#### union

The goal of this exercise is to create a program that combines two input strings
by displaying characters from both without any duplicates. You will ensure the
output maintains the original order of appearance from the input. If the program
receives a count other than two arguments, it will simply show a newline.

#### saveandmiss

The goal of this exercise is to write a function called `SaveAndMiss()` that
processes a string based on an integer input. You will save characters from the
string in groups defined by the integer, alternating between saving and omitting
groups. If the integer is zero or negative, you will return the original string.
This will help you practice loops and string manipulation in Go.

#### chunk

The goal of this exercise is to create a function called `Chunk` that divides a
given slice of integers into smaller slices of a specified size. If the size is
`0`, the function will output a newline. You will practice handling slices and
arrays in Go programming while implementing logic to manage different chunk
sizes effectively.

#### addprimesum

The goal of this exercise is to create a program that calculates the sum of all
prime numbers that are less than or equal to a given positive integer. If the
input is not valid, it should return `0` and a newline. This helps you practice
argument handling, prime number identification, and basic input validation in
programming.

#### fprime

The goal of this exercise is to write a program that accepts a positive integer
input and displays its prime factors in ascending order, separated by an
asterisk (`*`). You will handle invalid inputs by displaying nothing if the
arguments are incorrect or if the integer lacks prime factors. This exercise
enhances your programming and problem-solving skills with integers and prime
factorization.

#### canjump

In this exercise, you will implement the function `CanJump()` to determine if
you can reach the last index of an array from the first index. Each position in
the array tells you how many steps you can take forward. You need to return
`true` if you can reach the end and `false` if you cannot, following specific
rules for array length and stepping.

#### notdecimal

The goal of this exercise is to write a function named `NotDecimal()` that
processes a given string representing a float number. You will convert this
string to an integer by removing the decimal point, handling various cases such
as empty strings, non-numeric inputs, and numbers with zero after the decimal
point. This exercise helps you practice string manipulation, conditional logic,
and function creation in Go.

#### slice

The goal of this exercise is to create a function that extracts specific parts
from a slice of strings based on given integer positions. You will learn to
manipulate slices and handle both positive and negative indices. This exercise
will help you understand how to work with slices in Go, enhancing your
programming skills.

#### fifthandskip

The goal of this exercise is to create a function named `FifthAndSkip()` that
processes a string by grouping every five characters together, while skipping
the sixth character. You will handle spaces by only counting non-space
characters until you reach five. You must check for invalid inputs and return
appropriate messages based on the string's length or if it is empty.

#### revconcatalternate

The goal of this exercise is to create a function called `RevConcatAlternate()`
that takes two slices of integers as inputs. You will reverse the order of each
slice, then combine them by alternately selecting values from each slice. The
merging process varies based on the lengths of the slices, ensuring the larger
slice's elements come first, or if they are equal, starting with the first
slice. You will learn about slices and how to manipulate them in Go programming.

#### wordflip

The goal of this exercise is to create a function that reverses the order of
words in a given string while ignoring extra spaces. You will learn how to
manipulate strings, handle empty inputs, and ensure proper formatting of the
output. This will enhance your programming skills in Go language.

#### revwstr

The goal of this exercise is to write a program that takes a single string as
input and prints its words in reverse order. You will learn how to process a
string, manage input arguments, and understand how to manipulate text. This will
enhance your programming skills and strengthen your understanding of working
with strings.

#### rostring

The goal of this exercise is to write a program that rotates a given string one
word to the left. You will take the first word, move it to the end, and keep the
remaining words in the same order. You need to handle cases where the input is
not exactly one argument by displaying a newline.

#### findpairs

The goal of this exercise is to write a program that identifies pairs of indices
in an integer array where the elements sum up to a specified target value. You
will implement error handling for cases like invalid target sums, invalid
numbers in the array, and incorrect input formats. Your program will also
provide appropriate messages based on the output, whether it is found pairs, no
pairs, or errors.

#### options

The goal of this exercise is to write a program that processes command-line
arguments representing options, which start with a `-`. Each option corresponds
to a bit in an integer, allowing for the representation of multiple options. You
must also handle special cases, such as printing valid options with the `-h`
flag or reporting invalid options. The final output should be a byte
representation of the options or an appropriate message when no valid options
are provided.

#### romannumbers

The goal of this exercise is to create a program named `rn` that converts a
given integer into its Roman numeral equivalent. The program should handle
inputs appropriately, providing an error message for invalid numbers or numbers
greater than 4000. You will implement Roman numeral rules, including subtraction
for certain values, and output both the Roman numeral breakdown and the final
result.

#### piglatin

The goal of this exercise is to write a program that converts a given string
into its Pig Latin form based on specific rules. You will learn to manipulate
strings by checking the starting letter, identifying vowels and consonants, and
using conditions to create the correct output. Additionally, you will handle
command-line arguments and manage cases with no vowels or incorrect arguments.

#### itoabase

In this exercise, you will write a function called `ItoaBase` that converts an
integer value to a string representation in a specified base. The bases can
range from 2 to 16. You will ensure the output string contains characters from
0-9 and A-F for bases above 10. If the input value is negative, you will add a
minus sign before the result. This exercise helps you practice number conversion
and string manipulation in programming.

#### rpncalc

The goal of this exercise is to write a program that evaluates mathematical
expressions in Reverse Polish Notation (RPN). You will process a string that
contains an RPN equation, evaluate it using specific operators (addition,
subtraction, multiplication, division, and modulus), and print the result. The
program should handle errors for invalid inputs and ensure proper output
formatting. You will practice string manipulation, mathematical operations, and
error handling in your code.

#### brackets

The goal of this exercise is to write a program that checks if the brackets in
given strings are balanced and correctly ordered. You will learn to process an
indefinite number of string arguments, evaluate their bracket structure, and
output either "OK" for valid expressions or "Error" for invalid ones. You will
also handle cases with no arguments or strings without brackets.

#### grouping

The goal of this exercise is to create a program that mimics the function of
brackets in regular expressions. You will write a program that takes two
strings, applies a regular expression, and returns the matched words in the
order they appear. You will also ensure the program checks for valid input and
handles the "or" operator ("|") to find matches for either side of the operator.
If input conditions are not met, the program will not return any output.

#### brainfuck

The goal of the exercise is to create a `Brainfuck` interpreter. You will take a
valid `Brainfuck` source code as input and execute it using an array of 2048
bytes initialized to zero. By implementing the commands of `Brainfuck` properly,
you will understand how this esoteric language operates and gain experience in
interpreter design.
