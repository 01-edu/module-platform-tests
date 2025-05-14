## Sign

### Learning Objectives

By the end of this lesson, you will:

- Determine the sign of a number (positive, negative, or zero)
- Create functions that analyze number properties
- Compare the signs of different numbers
- Implement conditional logic for numeric sign detection

### Understanding Number Signs

In mathematics, the sign of a number indicates whether it's positive, negative, or zero. This is a fundamental property that's often used in various calculations and algorithms. While JavaScript provides the built-in `Math.sign()` method, understanding how to implement this functionality yourself helps build a deeper understanding of number comparisons.

### Your Assignment

Create a JavaScript file named `sign.js` that implements two functions:

1. **`sign`**:

   - Takes one number as an argument
   - Returns:
     - `1` if the number is positive
     - `-1` if the number is negative
     - `0` if the number is exactly 0
   - **Important**: You cannot use the built-in `Math.sign` function

2. **`sameSign`**:
   - Takes two numbers as arguments
   - Returns:
     - `true` if both numbers have the same sign (both positive, both negative, or both zero)
     - `false` if they have different signs

### Important Note

For this exercise, the `Math.sign` function will be disabled:

```js
Math.sign = undefined;
```

This means you'll need to implement your own logic for determining a number's sign.

### Testing Your Solution

To verify your solution works correctly, add these test cases:

```javascript
// Test sign function
console.log(sign(3)); // Should output 1
console.log(sign(-3)); // Should output -1
console.log(sign(0)); // Should output 0

// Test sameSign function
console.log(sameSign(3, 4)); // Should output true
console.log(sameSign(-3, -4)); // Should output true
console.log(sameSign(0, 0)); // Should output true
console.log(sameSign(3, -4)); // Should output false
console.log(sameSign(0, 4)); // Should output false
console.log(sameSign(0, -4)); // Should output false
```

### Submission

Add your `sign.js` file to your `((ROOT))` repository.

### Additional Resources

- [Functions](https://nan-academy.github.io/js-training/examples/functions.js)
- [If-else](https://nan-academy.github.io/js-training/examples/if-else.js)
- [MDN Web Docs: Comparison operators](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Comparison_Operators)
- [MDN Web Docs: Logical operators](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Logical_Operators)

### Tips for Success

- Think about whether zero is considered positive, negative, or neither (hint: it's neither)
- Test your functions with a variety of inputs, including edge cases
- Consider how you can reuse your `sign` function when implementing `sameSign`
