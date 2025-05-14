## Is

### Learning Objectives

By the end of this lesson, you will:

- Determine the type of JavaScript values
- Create utility functions for type checking
- Use the `typeof` operator effectively
- Understand truthy and falsy values in JavaScript
- Work with object properties as functions

### Understanding Type Checking

In JavaScript, determining the type of a value is a common task. While the language provides basic tools like the `typeof` operator, they have limitations. Creating custom type-checking functions allows for more precise and reliable type detection, especially for complex types like arrays and `NaN` values.

### Your Assignment

Create a JavaScript file named `is.js` that adds function properties to the provided `is` object:

```js
const is = {};
```

Add the following function properties to this object:

1. **`is.num`**: Returns `true` if the value is a number (excluding `NaN`), `false` otherwise
2. **`is.nan`**: Returns `true` if the value is `NaN`, `false` otherwise
3. **`is.str`**: Returns `true` if the value is a string, `false` otherwise
4. **`is.bool`**: Returns `true` if the value is a boolean, `false` otherwise
5. **`is.undef`**: Returns `true` if the value is `undefined`, `false` otherwise
6. **`is.def`**: Returns `true` if the value is defined (not `undefined`), `false` otherwise
7. **`is.arr`**: Returns `true` if the value is an array, `false` otherwise
8. **`is.obj`**: Returns `true` if the value is a simple object or `null`, `false` otherwise
9. **`is.fun`**: Returns `true` if the value is a function, `false` otherwise
10. **`is.truthy`**: Returns `true` if the value is truthy, `false` otherwise
11. **`is.falsy`**: Returns `true` if the value is falsy, `false` otherwise

Each function should take exactly one argument and return a boolean.

### Thinking Through the Problem

For each type-checking function, consider:

1. What JavaScript operators or methods can I use to check this type?
2. Are there any edge cases I need to handle?

Some specific considerations:

- The `typeof` operator returns a string indicating the type
- `typeof NaN` returns `'number'`, so you'll need special handling for `is.num` and `is.nan`
- For arrays, `typeof` returns `'object'`, so you'll need a different approach
- Remember that `null` is also of type `'object'` in JavaScript
- Understand what makes a value truthy or falsy in JavaScript

### JavaScript's Truthy and Falsy Values

In JavaScript, values are considered either "truthy" or "falsy" when used in a boolean context.

Falsy values (all of these evaluate to `false` in a boolean context):

- `false`
- `0`
- `''` (empty string)
- `null`
- `undefined`
- `NaN`

All other values are considered truthy.

### Testing Your Solution

To verify your solution works correctly, add these test cases:

```javascript
// Test is.num
console.log(is.num(5)); // true
console.log(is.num(-5.5)); // true
console.log(is.num(NaN)); // false
console.log(is.num("5")); // false

// Test is.nan
console.log(is.nan(NaN)); // true
console.log(is.nan(5)); // false
console.log(is.nan("hello")); // false

// Test is.str
console.log(is.str("hello")); // true
console.log(is.str("")); // true
console.log(is.str(5)); // false

// Test is.bool
console.log(is.bool(true)); // true
console.log(is.bool(false)); // true
console.log(is.bool(1)); // false

// Test is.undef
console.log(is.undef(undefined)); // true
console.log(is.undef(null)); // false
console.log(is.undef(0)); // false

// Test is.def
console.log(is.def(undefined)); // false
console.log(is.def(null)); // true
console.log(is.def(0)); // true

// Test is.arr
console.log(is.arr([])); // true
console.log(is.arr([1, 2, 3])); // true
console.log(is.arr({})); // false

// Test is.obj
console.log(is.obj({})); // true
console.log(is.obj(null)); // true
console.log(is.obj([])); // false
console.log(is.obj(function () {})); // false

// Test is.fun
console.log(is.fun(function () {})); // true
console.log(is.fun(() => {})); // true
console.log(is.fun({})); // false

// Test is.truthy
console.log(is.truthy(true)); // true
console.log(is.truthy(1)); // true
console.log(is.truthy("hello")); // true
console.log(is.truthy(0)); // false
console.log(is.truthy("")); // false
console.log(is.truthy(null)); // false

// Test is.falsy
console.log(is.falsy(false)); // true
console.log(is.falsy(0)); // true
console.log(is.falsy("")); // true
console.log(is.falsy(null)); // true
console.log(is.falsy(undefined)); // true
console.log(is.falsy(NaN)); // true
console.log(is.falsy(1)); // false
console.log(is.falsy("hello")); // false
```

### Submission

Add your `is.js` file to your `((ROOT))` repository.

### Additional Resources

- [Primitives and operators](https://nan-academy.github.io/js-training/examples/primitive-and-operators.js)
- [typeof operator](https://devdocs.io/javascript/operators/typeof)
- [Truthy - MDN](https://developer.mozilla.org/en-US/docs/Glossary/Truthy)
- [Falsy - MDN](https://developer.mozilla.org/en-US/docs/Glossary/Falsy)
- [Array.isArray() - MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/isArray)
- [Number.isNaN() - MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/isNaN)

### Tips for Success

- Test each function with a variety of inputs, including edge cases
- Pay special attention to the difference between `is.num` and `is.nan`
- Remember that `typeof null` returns `'object'`
- Consider how to handle special cases like empty arrays, empty objects, arrow functions, etc.
- Keep your code concise and readable
