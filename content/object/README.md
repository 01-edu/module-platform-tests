## object

### Overview

- You will learn how to manipulate objects in JavaScript by changing keys and
  values using the `invert` function.
- You will understand how to create pure functions with `pick` and `omit`,
  returning new objects without altering the original ones.
- You will enhance your skills in merging objects with the `fusion` function,
  handling different data types effectively.
- You will practice using custom functions to filter, map, and reduce data,
  focusing on values in grocery cart objects, which will deepen your knowledge
  of data manipulation.
- You will explore manipulating object keys using similar custom functions,
  improving your understanding of object structures.
- You will create functions to manipulate object entries and analyze nutritional
  data, reinforcing data aggregation skills.
- You will study functional programming concepts through currying with
  `curry-entries`, learning to transform and filter data.
- You will master recursion by creating deep copies of objects with the
  `deepCopy` function and ensuring that all properties are preserved.
- You will practice handling nested properties with the `replica` function,
  enabling more complex object manipulations.
- You will develop skills in string analysis with the `pronoun` function,
  returning structured data from text.
- You will learn to organize and transform data with the `neuron` function,
  helping to build effective responses for AI applications.
- You will gain experience in processing and filtering object data with the
  `flags` function, ensuring accurate output based on conditions.

### Content

#### invert

The goal of this exercise is to create a function named `invert` that takes an
object as input and returns a new object. In the new object, the original
object's keys will become the values, and the values will become the keys. This
helps you understand object manipulation and reinforces your skills in
JavaScript.

#### pick-omit

In this exercise, you will create two functions, `pick` and `omit`, using
JavaScript. The `pick` function will return a new object containing only the
specified keys from the original object, while the `omit` function will return a
new object excluding those keys. It is essential that these functions do not
alter the original object, ensuring they are pure functions. This exercise will
strengthen your understanding of object manipulation and functional programming
concepts in JavaScript.

#### fusion

The goal of this exercise is to create a function named `fusion` that merges two
objects, applying different rules based on the value types within them. For
arrays, you will concatenate them; for strings, you will join them with a space;
for numbers, you will add them. If the values are objects, you will merge them
recursively. In case of a type mismatch, you will replace the value in the first
object with the value from the second object if available. This exercise
enhances your understanding of object manipulation and type handling in
programming.

#### manipulate-values

In this exercise, you will create three functions that mimic the behavior of the
`.filter`, `.map`, and `.reduce` array methods to manipulate values in a grocery
cart object. Each function will help you analyze nutrition facts, allowing you
to filter, transform, and aggregate data. This will enhance your understanding
of object manipulation in JavaScript.

#### manipulate-keys

The goal of this exercise is to create three functions that mimic the behavior
of the `.filter`, `.map`, and `.reduce` methods but specifically for the keys of
an object representing a grocery cart. You will focus on manipulating the keys
of this object, which holds nutrition facts, allowing you to filter, transform,
and aggregate the keys according to specific rules.

#### manipulate-entries

The goal of this exercise is to create three custom functions that mimic the
behavior of JavaScript's `.filter`, `.map`, and `.reduce` methods specifically
for entries in a grocery cart object. You will also create three additional
functions to calculate total calories, filter items by carbohydrate content, and
summarize nutritional facts in the cart. This will help you understand how to
manipulate object entries effectively.

#### curry-entries

The goal of this exercise is to create functions that manipulate objects using
currying. You will implement `defaultCurry`, `mapCurry`, `reduceCurry`, and
`filterCurry` to combine, transform, reduce, and filter object entries. Then,
you will use these functions to define `reduceScore`, `filterForce`, and
`mapAverage`, focused on a personnel dataset related to scoring and force usage.
This will help you understand functional programming concepts in JavaScript.

#### deep-copy

The goal of the exercise is to create a function named `deepCopy` that takes an
object or an array and creates a complete copy of it, including nested objects
and arrays. You will practice recursion by ensuring that all levels of the input
structure are duplicated correctly, maintaining the original data's properties
and values.

#### replica

You will create a function named `replica` to deeply copy properties from
multiple source objects into a target object. This assignment must ensure that
you handle nested properties and avoid shallow copies, which only copy direct
properties. By doing this exercise, you will practice object manipulation and
enhance your understanding of JavaScript objects.

#### pronoun

The goal of this exercise is to create a function called `pronoun` that analyzes
a string to find specific personal pronouns. The function will return an object
where each pronoun is a key. Each key will link to a sub-object containing the
first word that follows the pronoun and a count of how many times the pronoun
appears in the string.

#### neuron

The goal of this exercise is to create a function named `neuron` that organizes
and transforms data into a structured format. You will learn how to process
input strings, categorize them into questions and orders, and store their
responses in an accessible way. This will help your AI/bot to answer queries
more effectively.

#### flagger

The goal of the exercise is to create a function named `flags` that processes an
object input to return specific alias and description information. The function
must ensure the `help` property is included in the output. Depending on its
presence, the output will show all flag descriptions or only those specified in
`help`.
