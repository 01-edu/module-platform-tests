## pointers

### Overview

In this quest, you will learn valuable skills and concepts in Rust programming:

- **Heap Memory Management:** You will understand how to use `Box` for storing
  data on the heap, and manage memory allocation effectively.

- **Ownership and Smart Pointers:** You will practice ownership principles by
  transforming data and using smart pointers like `Rc` and `RefCell`.

- **Data Structures:** You will create and manipulate structures, such as a
  `GameSession` and a list of workers, enhancing your understanding of recursion
  and linked data.

- **Reference Counting:** You will learn how to manage memory with `Rc` and how
  to count references to shared data.

- **Mutability Management:** You will explore interior mutability with
  `RefCell`, allowing you to modify data safely.

- **Error Handling:** You will implement error checking in games, ensuring data
  integrity and understanding game rules.

These experiences will strengthen your Rust programming skills and deepen your
understanding of memory management and data handling.

### Content

#### box_it

The goal of this exercise is to practice using Rust's heap memory management
with Box. You will create the function `transform_and_save_on_heap` to convert a
string of numbers into a vector of `u32`, while handling 'k' suffixes for
thousands. The second function, `take_value_ownership`, will take this vector,
unbox it, and return the value. Through this, you will learn about memory
allocation, ownership, and smart pointers in Rust.

#### borrow_box

Your goal for this exercise is to implement a `GameSession` structure with CRUD
functionality. You will create a game session, determine the winning player,
update their score, and allow for deleting the session. You need to manage the
game rules, ensuring updates only happen when the game is active. This will help
you understand how to manipulate data effectively in Rust.

#### box_recursion

The goal of this exercise is to create a simple structure for managing a list of
workers within a work environment using recursion in Rust. You will implement
functions to initialize the work environment, add and remove workers, and
retrieve information about the last added worker. You will also define a
recursive type `Link` that connects workers and allows navigation through the
list. This will help you understand data structures and memory management in
programming.

#### how_many_references

The goal of this exercise is to practice using Rust's reference counting with
the `Rc` type by creating functions to manage a list of referenced strings. You
will implement a method to add elements, count how many times a value is
referenced in the list, and remove all occurrences of an `Rc<String>` if they
point to the same allocation. This will strengthen your understanding of
ownership and memory management in Rust.

#### ref_cell

The goal of this exercise is to create a message tracking system in Rust using a
`messenger` module. You will implement a `Logger` trait for logging messages
about reference usage and a `Tracker` structure to monitor the number of
references to a value. The `Tracker` will enforce a maximum limit and issue
warnings or errors based on the usage percentage. You will then build a `Worker`
structure that utilizes the `Logger` trait and stores messages. You will
practice using interior mutability with `RefCell` to manage mutable data without
needing mutable references.

#### drop_the_thread

The goal of this exercise is to implement a Drop Checker API in Rust using
interior mutability. You will define two structures: `Workers`, which tracks the
number of dropped threads and their states, and `Thread`, which represents
individual threads. You will implement various functions for these structures to
manage thread creation, state checking, and counting drops. The exercise
emphasizes understanding Rust's ownership model, references, and the Drop trait,
enhancing your skills in Rust programming and data management.

#### bowling_score

The goal of this exercise is to create a library that calculates a player's
score in bowling using a `struct`. You will implement a `BowlingGame` to handle
rolls, validate them, and compute the score based on the rules of bowling
scoring. You must manage errors for invalid rolls and track the game state
accurately.
