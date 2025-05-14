## Last First Kiss

### Learning Objectives

By the end of this lesson, you will:

- Access elements from arrays and characters from strings
- Learn about array and string indexing in JavaScript
- Create functions that manipulate data structures
- Combine operations to create new data structures

### Understanding Array and String Access

Both arrays and strings in JavaScript are indexed collections, meaning their elements or characters can be accessed using numeric indices. JavaScript uses zero-based indexing, so the first element is at position 0, the second at position 1, and so on.

There are multiple ways to access elements:

- Using bracket notation with an index: `array[0]` or `string[0]`
- For the first element: index 0
- For the last element: `length - 1`

### Your Assignment

Create a JavaScript file named `last-first-kiss.js` that implements three functions:

1. **`first`**:

   - Takes one argument (an array or a string)
   - Returns the first element (if array) or character (if string)

2. **`last`**:

   - Takes one argument (an array or a string)
   - Returns the last element (if array) or character (if string)

3. **`kiss`**:
   - Takes one argument (an array or a string)
   - Returns an array with exactly 2 elements:
     - The first element should be the last element/character of the input
     - The second element should be the first element/character of the input

### Testing Your Solution

To verify your solution works correctly, add these test cases:

```javascript
// Test the first function
console.log(first([1, 2, 3])); // Should output 1
console.log(first("hello")); // Should output "h"

// Test the last function
console.log(last([1, 2, 3])); // Should output 3
console.log(last("hello")); // Should output "o"

// Test the kiss function
console.log(kiss([1, 2, 3])); // Should output [3, 1]
console.log(kiss("hello")); // Should output ["o", "h"]
```

### Submission

Add your `last-first-kiss.js` file to your `((ROOT))` repository.

### Additional Resources

- [Data Structures.js](https://nan-academy.github.io/js-training/examples/data-structures.js)
- [Get.js](https://nan-academy.github.io/js-training/examples/get.js)
- [MDN Web Docs: Arrays](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array)
- [MDN Web Docs: Strings](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String)

### Tips for Success

- Remember that both arrays and strings use zero-based indexing
- Think about whether you can reuse code between your functions
- Consider what would happen with empty arrays or strings - how would your functions handle these edge cases?
- Arrays can be created using square brackets: `[element1, element2]`
