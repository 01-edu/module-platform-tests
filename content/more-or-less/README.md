## More Or Less

### Learning Objectives

By the end of this lesson, you will:

- Understand how to create and use JavaScript functions
- Learn to write functions that take arguments
- Implement basic arithmetic operations in functions
- Return values from functions

### Understanding JavaScript Functions

Functions are reusable blocks of code that perform specific tasks. They can take inputs (arguments), process them, and return a result. Functions are fundamental building blocks in JavaScript programming.

### Your Assignment

Create a JavaScript file named `more-or-less.js` that implements four functions:

1. **`more`**:

   - Takes one argument
   - Adds 1 to the argument
   - Returns the result

2. **`less`**:

   - Takes one argument
   - Subtracts 1 from the argument
   - Returns the result

3. **`add`**:

   - Takes two arguments
   - Adds the two arguments together
   - Returns the result

4. **`sub`**:
   - Takes two arguments
   - Subtracts the second argument from the first argument
   - Returns the result

### Function Structure

A basic JavaScript function follows this structure:

```javascript
function functionName(parameter1, parameter2) {
  // Code to execute
  return result; // Value to return
}
```

For this exercise, you'll need to create four separate functions following this structure.

### Testing Your Solution

To verify your solution, add test cases after your function definitions:

```javascript
console.log(more(5)); // Should output 6
console.log(less(5)); // Should output 4
console.log(add(5, 3)); // Should output 8
console.log(sub(5, 3)); // Should output 2
```

Make sure to test your functions with different values, including:

- Positive numbers
- Negative numbers
- Zero

### Thinking Through the Problem

For each function, consider:

1. What inputs am I receiving?
2. What operation do I need to perform?
3. What result should I return?

### Submission

Add your `more-or-less.js` file to your `((ROOT))` repository.

### Additional Resources

- [Functions](https://nan-academy.github.io/js-training/examples/functions.js)
- [Primitives and Operators](https://nan-academy.github.io/js-training/examples/primitive-and-operators.js)
- [MDN Web Docs: Functions](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Functions)
- [MDN Web Docs: Arithmetic Operators](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Arithmetic_Operators)

### Tips for Success

- Keep your functions simple and focused on a single task
- Remember that functions need to explicitly return a value using the `return` keyword
- Think about edge cases: what happens if you pass a string instead of a number?
