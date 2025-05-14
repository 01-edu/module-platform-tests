## Circular

### Learning Objectives

By the end of this lesson, you will:

- Understand the concept of circular references in JavaScript
- Create objects that reference themselves
- Learn about object self-referencing
- Explore the implications of circular data structures

### Understanding Circular References

A circular reference occurs when an object contains a reference to itself, either directly or through a chain of references. While this can sometimes lead to issues like memory leaks or problems with JSON serialization, it's a perfectly valid structure in JavaScript and useful in certain scenarios.

### Your Assignment

Create a JavaScript file named `circular.js` that defines a single object:

**`circular`**:

- An object with a property also named `circular`
- The value of this property should be the object itself
- This creates a self-referential circular structure

### Testing Your Solution

To verify your solution works correctly, add these test cases:

```javascript
// Test that circular.circular points to the circular object itself
console.log(circular.circular === circular); // Should output true

// Test that we can navigate through multiple levels of the reference
console.log(circular.circular.circular.circular === circular); // Should output true

// Test what happens when you try to display the object
console.log(circular); // The console should indicate a circular reference
```

When you log a circular object to the console in most JavaScript environments, you'll see a special notation indicating the circular reference, often showing something like `[Circular]` or displaying expandable nested objects that eventually lead back to the same object.

### Understanding the Implications

Circular references have several implications:

1. **JSON Serialization**: Objects with circular references cannot be directly converted to JSON using `JSON.stringify()` without special handling.

2. **Memory Management**: In modern JavaScript, circular references are properly garbage collected, but in older environments, they could cause memory leaks.

3. **Deep Cloning**: Standard deep cloning techniques might fail with circular references unless they specifically handle them.

4. **Equality Checks**: As demonstrated in the tests, you can verify circular references by checking object identity with the `===` operator.

### Submission

Add your `circular.js` file to your `((ROOT))` repository.

### Additional Resources

- [Data Structures](https://nan-academy.github.io/js-training/examples/data-structures.js)
- [Get](https://nan-academy.github.io/js-training/examples/get.js)
- [Sets](https://nan-academy.github.io/js-training/examples/set.js)
- [MDN Web Docs: Object](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object)

### Tips for Success

- Remember that objects in JavaScript are assigned and passed by reference, not by value
- You cannot create this circular reference directly in an object literal like `const obj = { prop: obj }`
- Think about creating the object first, then adding the self-reference afterward
- This type of structure can be useful in certain algorithms and data structures, but use it carefully
