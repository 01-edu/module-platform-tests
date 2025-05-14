## Declarations

### Learning Objectives

By the end of this lesson, you will:

- Learn how to work with special characters in strings
- Create and manipulate arrays and objects
- Understand nested data structures
- Use the `Object.freeze()` method to make objects immutable

### Creating Complex Data Structures

In JavaScript, you can create more complex data structures beyond simple primitives. This includes arrays, objects, and nested combinations of both. You'll also learn how to prevent these structures from being modified.

### Your Assignment

Create a JavaScript file named `declarations.js` with the following constant variables:

1. **`escapeStr`**: Create a string containing all of these special characters: backtick (`` ` ``), backslash (`\`), forward slash (`/`), double quote (`"`), and single quote (`'`).

2. **`arr`**: Create an array containing exactly two values: the number `4` and the string `'2'`.

3. **`obj`**: Create an object with these properties:

   - `str`: a string value of your choice
   - `num`: a number value of your choice
   - `bool`: a boolean value (`true` or `false`)
   - `undef`: the value `undefined`

4. **`nested`**: Create an object with these properties:

   - `arr`: an array containing exactly three values: `4`, `undefined`, and the string `'2'`
   - `obj`: an object with these properties:
     - `str`: a string value of your choice
     - `num`: a number value of your choice
     - `bool`: a boolean value (`true` or `false`)

5. **Make them immutable**: Use `Object.freeze()` to prevent `arr`, `obj`, and `nested` from being modified after creation.

### Working with Special Characters in Strings

Special characters in JavaScript strings need to be "escaped" with a backslash (`\`) to be treated as literal characters rather than having special meaning. For example:

- `\"` for double quotes within a string
- `\'` for single quotes within a string
- `\\` for a literal backslash
- `\`` for a backtick character

Alternatively, you can use different quote types to avoid escaping in some cases:

- Use double quotes to contain single quotes: `"It's a string"`
- Use single quotes to contain double quotes: `'Say "hello"'`
- Use backticks to contain both: `` `Both "double" and 'single' quotes` ``

### Making Objects Immutable with Object.freeze()

When you use `Object.freeze()` on an object:

- Its properties cannot be added, deleted, or changed
- However, `Object.freeze()` is shallow - nested objects need to be frozen separately
- For the `nested` object, you need to freeze the object itself and also its nested objects

### Testing Your Solution

To verify your solution works correctly, try to modify the frozen objects and confirm the changes don't take effect:

```javascript
// Test your frozen objects
arr[0] = "changed"; // Should not change
obj.str = "changed"; // Should not change
nested.obj.bool = "changed"; // Should not change

// Check results
console.log(arr); // Should still be [4, '2']
console.log(obj.str); // Should still be your original string
console.log(nested.obj.bool); // Should still be your original boolean
```

### Submission

Add your `declarations.js` file to your `((ROOT))` repository.

### Additional Resources

- [Primitive and Operators](https://nan-academy.github.io/js-training/examples/primitive-and-operators.js)
- [Variables](https://nan-academy.github.io/js-training/examples/variables.js)
- [Data Structures](https://nan-academy.github.io/js-training/examples/data-structures.js)
- [Object.freeze() Documentation](https://devdocs.io/javascript/global_objects/object/freeze)
- [MDN Web Docs: Working with objects](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Working_with_Objects)

### Tips for Success

- Remember that `Object.freeze()` only freezes the object it's applied to - nested objects need to be frozen separately
- Be careful with your string escaping - test that each special character displays correctly
- Make sure you understand the difference between shallow and deep freezing of objects
