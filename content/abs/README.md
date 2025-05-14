## Abs

### Learning Objectives

By the end of this lesson, you will:

- Calculate the absolute value of a number without using built-in methods
- Implement mathematical operations in JavaScript
- Work with conditional logic

### Understanding Absolute Values

In mathematics, the absolute value of a number is its distance from zero on the number line, regardless of direction. This means that the absolute value is always non-negative, even when the original number is negative.

For example:

- The absolute value of 5 is 5
- The absolute value of -5 is also 5
- The absolute value of 0 is 0

### Your Assignment

Create a JavaScript file named `abs.js` that implements two functions:

1. **`isPositive`**:

   - Takes a number as input
   - Returns `true` if the number is strictly positive (greater than zero)
   - Returns `false` otherwise (for zero or negative numbers)

2. **`abs`**:
   - Takes a number as input
   - Returns the absolute value of that number
   - **Important**: You cannot use the built-in `Math.abs()` function (it will be undefined in testing)
   - You need to create your own implementation using logic and operators

### Important Note

For this exercise, the `Math.abs` function will be disabled:

```js
Math.abs = undefined;
```

This means you'll need to implement the absolute value calculation using your own logic.

### Testing Your Solution

To verify your solution works correctly, add these test cases:

```javascript
// Test isPositive function
console.log(isPositive(3)); // Should output true
console.log(isPositive(0)); // Should output false
console.log(isPositive(-3)); // Should output false

// Test abs function
console.log(abs(0)); // Should output 0
console.log(abs(5)); // Should output 5
console.log(abs(-5)); // Should output 5
console.log(abs(-10)); // Should output 10
```

### Submission

Add your `abs.js` file to your `((ROOT))` repository.

### Additional Resources

- [Functions](https://nan-academy.github.io/js-training/examples/functions.js)
- [Ternary](https://nan-academy.github.io/js-training/examples/ternary.js)
- [MDN Web Docs: Comparison operators](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Comparison_Operators)
- [MDN Web Docs: Conditional (ternary) operator](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Conditional_Operator)
