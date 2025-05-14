## Concat Str

### Learning Objectives

By the end of this lesson, you will:

- Understand string concatenation in JavaScript
- Create functions that combine string inputs
- Apply string operations within functions
- Use operators for string manipulation

### Understanding String Concatenation

String concatenation is the operation of joining two or more strings together. In JavaScript, this can be done using the `+` operator or various string methods. When strings are concatenated, they form a new string that combines the content of the original strings.

### Your Assignment

Create a JavaScript file named `concat-str.js` that implements one function:

**`concatStr`**:

- Takes two arguments (of any type)
- Concatenates them together as strings
- Returns the resulting combined string

### Understanding the Process

When you concatenate values in JavaScript:

- If both values are strings, they're joined together
- If one or more values are not strings, JavaScript automatically converts them to strings before concatenation
- This automatic conversion is called "type coercion"

### Testing Your Solution

To verify your solution works correctly, add these test cases:

```javascript
// Test with two strings
console.log(concatStr("Hello", "World")); // Should output 'HelloWorld'

// Test with a string and a number
console.log(concatStr("The answer is ", 42)); // Should output 'The answer is 42'

// Test with two numbers
console.log(concatStr(123, 456)); // Should output '123456'

// Test with boolean and string
console.log(concatStr(true, " statement")); // Should output 'true statement'
```

### Thinking Through the Problem

Consider these questions:

1. How do I combine two strings in JavaScript?
2. What happens when I try to concatenate a non-string value with a string?
3. Does my function need to handle special cases, or will JavaScript's automatic type conversion work for all inputs?

### Submission

Add your `concat-str.js` file to your `((ROOT))` repository.

### Additional Resources

- [Functions.js](https://nan-academy.github.io/js-training/examples/functions.js)
- [Primitive and Operators.js](https://nan-academy.github.io/js-training/examples/primitive-and-operators.js)
- [MDN Web Docs: String concatenation](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Addition)
- [MDN Web Docs: Type conversion](https://developer.mozilla.org/en-US/docs/Glossary/Type_coercion)

### Tips for Success

- Remember that the `+` operator performs different functions depending on the types:
  - With numbers: addition
  - With strings: concatenation
  - With mixed types: typically converts to strings and concatenates
- Test your function with various input types to ensure it behaves as expected
- Consider what happens with empty strings or special values like `null` or `undefined`
