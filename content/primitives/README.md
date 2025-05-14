## Primitives

### Learning Objectives

By the end of this lesson, you will:

- Understand the concept of primitive data types in JavaScript
- Learn how to declare constant variables
- Create variables of different primitive types
- Recognize the difference between various primitive types

### What are Primitive Types?

In JavaScript, **primitive types** are the basic building blocks of data. They are immutable (cannot be changed after creation) and include:

- **String**: Text data wrapped in quotes (`'hello'`, `"world"`)
- **Number**: Numeric values (both integers and decimals)
- **Boolean**: Logical values (`true` or `false`)
- **Undefined**: Represents a variable that has been declared but not assigned a value
- **Null**: Represents the intentional absence of any value
- **Symbol**: Unique and immutable values (advanced)
- **BigInt**: For integers larger than the Number type can handle (advanced)

### Your Assignment

Create a JavaScript file named `primitives.js` with constant variables for each of the following primitive types:

1. Create a constant named `str` containing any string value
2. Create a constant named `num` containing any number
3. Create a constant named `bool` containing either `true` or `false`
4. Create a constant named `undef` with the value `undefined`

### How to Declare Constants

In JavaScript, we use the `const` keyword to declare constants. Constants:

- Must be assigned a value when declared
- Cannot be reassigned after declaration
- Are block-scoped (only accessible within the block they're declared in)

### Submission

Add your `primitives.js` file to your `((ROOT))` repository.

### Additional Resources

- [Primitives and operators](https://nan-academy.github.io/js-training/examples/primitive-and-operators.js)
- [Variables](https://nan-academy.github.io/js-training/examples/variables.js)
- [MDN Web Docs: JavaScript data types](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Data_structures)

### Tips for Success

- Remember that constants (`const`) cannot be reassigned, but their content can be modified if they contain objects or arrays
- The `typeof` operator helps you check what type a value is
- Be sure to understand the difference between primitive types and objects in JavaScript
