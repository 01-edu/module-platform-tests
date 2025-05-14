## Returns

### Learning Objectives

By the end of this lesson, you will:

- Understand how to create functions that return values
- Learn to handle different types of arguments in functions
- Work with properties of arrays and strings
- Practice retrieving information from different data types

### Understanding Function Returns

Functions in JavaScript can process data and return a result. The `return` statement specifies the value that a function outputs. Once a function executes a `return` statement, it immediately stops running and returns the specified value.

### Your Assignment

Create a JavaScript file named `returns.js` that implements two functions:

1. **`id`**:

   - Takes one argument of any type
   - Returns the exact same argument, unchanged
   - This is known as an "identity function"

2. **`getLength`**:
   - Takes one argument that is either an array or a string
   - Returns the length of that array or string
   - Uses the `.length` property to determine the length

### Understanding the Functions

#### The Identity Function (`id`)

The identity function simply returns whatever is passed to it. While it might seem trivial, identity functions are actually useful in functional programming and can be used as default transformations.

#### The Length Function (`getLength`)

The `getLength` function leverages the fact that both arrays and strings in JavaScript have a `.length` property. This property returns:

- For arrays: the number of elements
- For strings: the number of characters

### Testing Your Solution

To verify your solution, add test cases after your function definitions:

```javascript
// Testing id function
console.log(id(5)); // Should output 5
console.log(id("hello")); // Should output 'hello'
console.log(id([1, 2, 3])); // Should output [1, 2, 3]

// Testing getLength function
console.log(getLength("hello")); // Should output 5
console.log(getLength([1, 2, 3])); // Should output 3
console.log(getLength([])); // Should output 0
console.log(getLength("")); // Should output 0
```

### Submission

Add your `returns.js` file to your `((ROOT))` repository.

### Additional Resources

- [Functions](https://nan-academy.github.io/js-training/examples/functions.js)
- [Data Structures](https://nan-academy.github.io/js-training/examples/data-structures.js)
- [Get](https://nan-academy.github.io/js-training/examples/get.js)
- [MDN Web Docs: Functions](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Functions)
- [MDN Web Docs: Array.length](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/length)
- [MDN Web Docs: String.length](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/length)

### Tips for Success

- Remember that the identity function (`id`) should not modify its argument in any way
- The `getLength` function works for both arrays and strings because they both have a `.length` property
- Be careful not to invoke methods on the inputs; simply access their properties
- Think about what would happen if you passed something other than an array or string to `getLength`
