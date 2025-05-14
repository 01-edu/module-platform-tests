## Method Man

### Learning Objectives

By the end of this lesson, you will:

- Use built-in JavaScript string methods
- Manipulate strings using various transformations
- Convert between strings and arrays
- Apply case modifications to text

### Understanding String Methods

JavaScript provides numerous built-in methods to manipulate strings. These methods allow you to transform text in various ways, including splitting strings into arrays, joining arrays into strings, and changing character case. String methods are essential tools for text processing in programming.

### Your Assignment

Create a JavaScript file named `method-man.js` that implements five functions:

1. **`words`**:

   - Takes a string as input
   - Splits the string wherever there's a space
   - Returns an array containing the resulting substrings

2. **`sentence`**:

   - Takes an array of strings as input
   - Joins the array elements with spaces between them
   - Returns a single string

3. **`yell`**:

   - Takes a string as input
   - Converts the entire string to uppercase
   - Returns the transformed string

4. **`whisper`**:

   - Takes a string as input
   - Converts the entire string to lowercase
   - Surrounds the string with asterisks (`*`)
   - Returns the transformed string

5. **`capitalize`**:
   - Takes a string as input
   - Transforms the first character to uppercase
   - Transforms all other characters to lowercase
   - Returns the transformed string

### Testing Your Solution

To verify your solution works correctly, add these test cases:

```javascript
// Test words function
console.log(words("Hello there, how are you?"));
// Should output: ["Hello", "there,", "how", "are", "you?"]

// Test sentence function
console.log(sentence(["This", "is", "a", "test"]));
// Should output: "This is a test"

// Test yell function
console.log(yell("be quiet"));
// Should output: "BE QUIET"

// Test whisper function
console.log(whisper("EXCUSE ME"));
// Should output: "*excuse me*"

// Test capitalize function
console.log(capitalize("rUNNING"));
// Should output: "Running"
```

### String Methods You Might Use

For this assignment, consider these useful JavaScript string methods:

- `split()`: Divides a string into substrings and returns them as an array
- `join()`: Joins elements of an array into a string
- `toUpperCase()`: Converts a string to uppercase
- `toLowerCase()`: Converts a string to lowercase
- `charAt()`: Returns the character at a specified index
- `substring()` or `slice()`: Extract parts of a string

Remember that strings in JavaScript are immutable, meaning the original string isn't changed when you apply these methods. Instead, they return a new string with the modifications.

### Thinking Through the Problem

For each function, consider:

1. What input am I receiving?
2. What transformation do I need to apply?
3. What should I return?

### Submission

Add your `method-man.js` file to your `((ROOT))` repository.

### Additional Resources

- [Methods](https://nan-academy.github.io/js-training/examples/methods.js)
- [MDN Web Docs: String](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String)
- [MDN Web Docs: Array](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array)

### Tips for Success

- String methods don't modify the original string but return a new one
- Test your functions with various inputs, including empty strings and multi-word strings
- Pay attention to the exact requirements, like adding asterisks for the whisper function
- Remember that some methods like `join()` operate on arrays, while others like `split()` operate on strings
