## Change

### Learning Objectives

By the end of this lesson, you will:

- Access and modify properties of JavaScript objects
- Create functions that interact with object data
- Learn different ways to read and update object properties
- Understand property accessors in JavaScript

### Understanding JavaScript Objects

Objects in JavaScript are collections of key-value pairs, where each key (property) is associated with a value. These values can be of any type, including numbers, strings, booleans, functions, or even other objects. Working with objects involves accessing and modifying these properties.

### Your Assignment

Create a JavaScript file named `change.js` that implements two functions to work with the provided `sourceObject`:

**`get`**:

- Takes one argument: a key (property name)
- Returns the value associated with that key from the `sourceObject`

**`set`**:

- Takes two arguments: a key (property name) and a value
- Updates the property in the `sourceObject` with the new value
- Returns the new value

### The Source Object

You'll be working with an object that has already been defined (you don't need to create it):

```js
const sourceObject = {
  num: 42,
  bool: true,
  str: "some text",
  log: console.log,
};
```

### Accessing Object Properties

There are two main ways to access object properties in JavaScript:

1. **Dot notation**: `object.propertyName`

   - Simple and direct
   - Only works when the property name is a valid identifier

2. **Bracket notation**: `object['propertyName']`
   - More versatile
   - Works with any string (including those with spaces or special characters)
   - Also allows using variables as property names

For this exercise, bracket notation will be particularly useful since you'll be receiving the property name as a function parameter.

### Testing Your Solution

To verify your solution works correctly, add these test cases:

```javascript
// Test get function
console.log(get("num")); // Should output 42
console.log(get("bool")); // Should output true
console.log(get("str")); // Should output 'some text'

// Test set function
console.log(set("num", 77)); // Should output 77
console.log(set("bool", false)); // Should output false
console.log(set("str", "new text")); // Should output 'new text'

// Verify the changes
console.log(get("num")); // Should output 77
console.log(get("bool")); // Should output false
console.log(get("str")); // Should output 'new text'
```

### Thinking Through the Problem

For each function, consider:

**For the `get` function:**

1. How do I access a property of an object when I only have the property name as a string?
2. How do I return the value at that property?

**For the `set` function:**

1. How do I update a property of an object when I have the property name as a string?
2. How do I make sure the update is saved to the original object?
3. What should I return from this function?

### Submission

Add your `change.js` file to your `((ROOT))` repository.

### Additional Resources

- [Functions](https://nan-academy.github.io/js-training/examples/functions.js)
- [Data Structures](https://nan-academy.github.io/js-training/examples/data-structures.js)
- [Get](https://nan-academy.github.io/js-training/examples/get.js)
- [Set](https://nan-academy.github.io/js-training/examples/set.js)
- [MDN Web Docs: Working with Objects](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Working_with_Objects)
- [MDN Web Docs: Property Accessors](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Property_Accessors)

### Tips for Success

- Remember that bracket notation `object[propertyName]` is necessary when your property name is stored in a variable
- Consider what happens if you try to access a property that doesn't exist
- For the `set` function, make sure you're modifying the actual `sourceObject`, not a copy
- Test your functions with various properties from the source object to ensure they all work correctly
