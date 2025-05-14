## crates

### Overview

By completing the quests, you will learn the following key concepts:

- **Working with Functions**: You will create functions like `middle_day`,
  `area_fit`, and `invert_sentence`, enhancing your ability to define and use
  functions in Rust.

- **Using Libraries**: You will utilize the `chrono` crate in `middle_day`,
  improving your understanding of external libraries in Rust.

- **Option Types**: You will practice working with `Option` in Rust, allowing
  you to handle potentially absent values effectively.

- **Calculating Areas and Volumes**: In the `does_it_fit` quest, you will learn
  how to calculate geometric properties and make comparisons.

- **Data Handling and JSON**: The `macro_calculator` quest will teach you about
  data structures and JSON serialization, essential for working with data in web
  applications.

- **Modular Design**: You will gain experience in creating modules and
  organizing code effectively in the `mobs` quest.

- **String Manipulation**: The `invert_sentence` and `expected_variable`
  exercises will enhance your skills in handling and comparing strings.

- **Conditionals and Loops**: You will implement logic to perform various checks
  and iterations, crucial for effective programming.

### Content

#### middle_day

The goal of this exercise is to create a function called `middle_day` using the
`chrono` crate in Rust. This function will accept a year as input and determine
the weekday of the middle day of that year. If the year has an even number of
days, the function should return `None`. You will practice working with options
and using library features effectively.

#### does_it_fit

The goal of the exercise is to create two functions, `area_fit` and
`volume_fit`, that determine if a specific number of geometric shapes or volumes
can fit inside a given rectangular or box area. You will calculate the area or
volume of the shapes and compare them to the available area or volume, returning
true if they fit.

#### macro_calculator

The goal of this exercise is to create a Rust function named `calculate_macros`
that receives a list of `Food` structures and computes the total macronutrient
values: calories, carbohydrates, proteins, and fats. Each value should account
for the number of portions and be formatted to two decimal places, unless it
ends in zero. The function will return these totals in a specified JSON format,
allowing you to practice data handling and JSON serialization in Rust.

#### shopping_mall

The goal of this exercise is to create functions to manage operations in a
shopping mall using the provided `mall` module. You will implement functions
that identify the biggest store, find the highest paid employees, count the
total staff, ensure adequate security guards, and adjust employee salaries based
on their working hours.

#### expected_variable

The goal of this exercise is to create a function named `expected_variable` that
checks if a given string is in camel case or snake case. If it is, the function
compares it to an expected string for similarity using the `edit_distance`
function. If they are over 50% similar, it returns the similarity percentage;
otherwise, it returns `None`. This helps you practice functions, string
comparison, and case handling.

#### mobs

The goal of this exercise is to create a Rust module named `mobs` that models a
group or organization with attributes such as name, boss, members, cities, and
wealth. You will implement functions to recruit members, execute attacks between
mobs, steal wealth, and conquer cities. You will also define submodules for
`Boss` and `Member`, along with their roles and promotion logic. This aims to
enhance your understanding of structures, enums, associated functions, and
modular design in Rust.

#### invert_sentence

The goal of the exercise is to create a function called `invert_sentence` in
Rust that reverses the order of words in a given string. You will learn how to
manipulate strings and implement a function that processes input to generate a
new output. This enhances your skills in string handling and function creation
in Rust.
