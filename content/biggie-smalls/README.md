## Biggie Smalls

### Learning Objectives

By the end of this lesson, you will:

- Understand the concept of numeric limits in JavaScript
- Learn about JavaScript's Number data type constraints
- Work with the smallest and largest possible number values
- Access built-in constants for numeric limits

### Understanding JavaScript Number Limits

JavaScript's `Number` type has built-in limits to the range of values it can represent. These limits are defined by how numbers are stored in memory according to the IEEE-754 standard for floating-point arithmetic (specifically the "double-precision 64-bit binary format").

While JavaScript can work with many different numeric values, there are definite upper and lower bounds to what can be precisely represented.

### Your Assignment

Create a JavaScript file named `biggie-smalls.js` that defines two variables:

**`smalls`**:

- Should contain the smallest possible value for a JavaScript `Number`
- This is the closest number to negative infinity

**`biggie`**:

- Should contain the largest possible value for a JavaScript `Number`
- This is the closest number to positive infinity

### Testing Your Solution

To verify your solution works correctly, add these test cases:

```javascript
// Test that you've found the correct minimum value
console.log(smalls < -1e308); // Should output true
console.log(isFinite(smalls)); // Should output true

// Test that you've found the correct maximum value
console.log(biggie > 1e308); // Should output true
console.log(isFinite(biggie)); // Should output true

// Check what happens beyond these limits
console.log(smalls * 2); // Would likely output -Infinity
console.log(biggie + 1 === biggie); // Would likely output true (can't represent a larger number)
```

### Understanding the JavaScript Number System

It's important to note that:

1. These limits are finite numbers, not `Infinity` or `-Infinity`
2. JavaScript also has special values like `Infinity`, `-Infinity`, and `NaN` (Not a Number)
3. Numbers outside the representable range will be converted to `Infinity` or `-Infinity`
4. There's also a smallest positive number (closest to zero) which is different from the negative limit

### Submission

Add your `biggie-smalls.js` file to your `((ROOT))` repository.

### Additional Resources

- [Number - JavaScript | MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number)
- [Number.MAX_VALUE - JavaScript | MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/MAX_VALUE)
- [Number.MIN_VALUE - JavaScript | MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/MIN_VALUE)
- [IEEE 754 - Wikipedia](https://en.wikipedia.org/wiki/IEEE_754)

### Tips for Success

- Be careful! `Number.MIN_VALUE` might not represent what you initially think it does
- Consider both positive and negative number limits
- Remember that JavaScript uses floating-point representation for all numbers
- Check the MDN documentation for the Number object and its properties carefully
