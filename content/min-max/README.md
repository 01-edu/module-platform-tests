## Min Max

### Learning Objectives

By the end of this lesson, you will:

- Create custom functions to determine minimum and maximum values
- Implement comparison logic without built-in methods
- Practice using conditional statements and comparison operators
- Apply problem-solving skills to common programming challenges

### Understanding min max Operations

Finding the minimum or maximum of two numbers is a fundamental operation in programming. While JavaScript provides built-in functions (`Math.min` and `Math.max`), understanding how to implement these functions yourself helps build a stronger foundation in logical operations and comparison.

### Your Assignment

Create a JavaScript file named `min-max.js` that implements two functions:

1. **`max`**:

   - Takes two numbers as arguments
   - Returns the larger of the two numbers
   - **Important**: You cannot use the built-in `Math.max` function

2. **`min`**:
   - Takes two numbers as arguments
   - Returns the smaller of the two numbers
   - **Important**: You cannot use the built-in `Math.min` function

### Important Note

For this exercise, both `Math.min` and `Math.max` functions will be disabled:

```js
Math.min = Math.max = undefined;
```

This means you'll need to implement your own comparison logic.

### Testing Your Solution

To verify your solution works correctly, add these test cases:

```javascript
// Test max function
console.log(max(5, 9)); // Should output 9
console.log(max(9, 5)); // Should output 9
console.log(max(5, 5)); // Should output 5
console.log(max(-5, -9)); // Should output -5

// Test min function
console.log(min(5, 9)); // Should output 5
console.log(min(9, 5)); // Should output 5
console.log(min(5, 5)); // Should output 5
console.log(min(-5, -9)); // Should output -9
```

### Submission

Add your `min-max.js` file to your `((ROOT))` repository.

### Additional Resources

- [Functions](https://nan-academy.github.io/js-training/examples/functions.js)
- [Ternary](https://nan-academy.github.io/js-training/examples/ternary.js)
- [MDN Web Docs: Comparison Operators](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Comparison_Operators)
- [MDN Web Docs: if...else](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Statements/if...else)

### Tips for Success

- Test your functions with various inputs, including negative numbers and equal values
- Consider the readability of your code - sometimes the simplest solution is the best
- Remember that the ternary operator can make your code more concise
- Your functions should work correctly for any valid number inputs
