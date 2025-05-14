## Collections

### Learning Objectives

By the end of this lesson, you will:

- Convert between different JavaScript data types and collections
- Work with arrays, sets, strings, objects, and maps
- Understand the properties and methods of various JavaScript collections
- Create a custom type detection function that improves upon JavaScript's native `typeof`

### Understanding JavaScript Collections

JavaScript provides several built-in data structures or "collections" to store and manipulate data:

- **Arrays**: Ordered collections of values accessible by index
- **Sets**: Collections of unique values
- **Strings**: Sequences of characters
- **Objects**: Collections of key-value pairs with string or symbol keys
- **Maps**: Collections of key-value pairs where keys can be of any type

Being able to convert between these different data types is an essential skill for effective JavaScript programming.

### Your Assignment

Create a JavaScript file named `collections.js` that implements the following functions:

1. **`arrToSet`**: Converts an array to a set

   - Input: Array
   - Output: Set (with duplicates removed)

2. **`arrToStr`**: Converts an array to a string

   - Input: Array
   - Output: String (array elements joined without separator)

3. **`setToArr`**: Converts a set to an array

   - Input: Set
   - Output: Array containing all elements from the set

4. **`setToStr`**: Converts a set to a string

   - Input: Set
   - Output: String (set elements joined without separator)

5. **`strToArr`**: Converts a string to an array

   - Input: String
   - Output: Array of individual characters

6. **`strToSet`**: Converts a string to a set

   - Input: String
   - Output: Set of unique characters

7. **`mapToObj`**: Converts a map to an object

   - Input: Map
   - Output: Object with the same key-value pairs

8. **`objToArr`**: Converts an object to an array

   - Input: Object
   - Output: Array containing all values from the object

9. **`objToMap`**: Converts an object to a map

   - Input: Object
   - Output: Map with the same key-value pairs

10. **`arrToObj`**: Converts an array to an object

    - Input: Array
    - Output: Object where keys are indices and values are array elements

11. **`strToObj`**: Converts a string to an object

    - Input: String
    - Output: Object where keys are indices and values are characters

12. **`superTypeOf`**: Returns the specific type of a value
    - Input: Any value
    - Output: String representing the specific type (e.g., 'Array', 'Set', 'Map', etc.)

### Thinking Through the Problem

For each conversion function, consider:

1. What methods or properties are available on the source type?
2. How can I create a new instance of the target type?
3. How should I handle the data during the conversion?

For the `superTypeOf` function:

1. How can I detect the exact type beyond what `typeof` provides?
2. What special cases do I need to handle (like null, arrays, etc.)?
3. How can I distinguish between different object types like Map, Set, Array, etc.?

### Useful Methods and Properties

Here are some methods and properties that may be helpful:

- **For Arrays**:

  - `Array.from()`: Creates a new array from an iterable or array-like object
  - `join()`: Joins all elements of an array into a string
  - `toString()`: Returns a string representing the array

- **For Sets**:

  - `Set` constructor: Creates a new Set, optionally from an iterable
  - Sets are iterable, so you can use them with spread syntax `[...set]`

- **For Strings**:

  - `split()`: Splits a string into an array of substrings
  - Strings can be accessed by index: `str[0]`, `str[1]`, etc.
  - Strings are iterable, so you can use them with spread syntax `[...str]`

- **For Objects**:

  - `Object.keys()`: Returns an array of an object's property names
  - `Object.values()`: Returns an array of an object's property values
  - `Object.entries()`: Returns an array of key-value pairs
  - `Object.fromEntries()`: Creates an object from key-value pairs

- **For Maps**:
  - `Map` constructor: Creates a new Map, optionally from key-value pairs
  - `map.entries()`: Returns an iterator of key-value pairs
  - Maps are iterable, so you can use them with spread syntax `[...map]`

### Testing Your Solution

Create test cases for each function to ensure they work correctly:

```javascript
// Create test data
const str = "hello";
const arr = [1, 2, 1, 3];
const obj = { x: 45, y: 75, radius: 24 };
const set = new Set();
set.add(1);
set.add(2);
set.add(1); // Duplicate will be ignored
set.add(3);
const map = new Map();
map.set("a", 1);
map.set("b", 2);
map.set(3, "c");
map.set(4, "d");

// Test each function
console.log("arrToSet:", arrToSet(arr));
console.log("arrToStr:", arrToStr(arr));
console.log("setToArr:", setToArr(set));
console.log("setToStr:", setToStr(set));
console.log("strToArr:", strToArr(str));
console.log("strToSet:", strToSet(str));
console.log("mapToObj:", mapToObj(map));
console.log("objToArr:", objToArr(obj));
console.log("objToMap:", objToMap(obj));
console.log("arrToObj:", arrToObj(arr));
console.log("strToObj:", strToObj(str));

// Test superTypeOf with different types
console.log("superTypeOf(map):", superTypeOf(map));
console.log("superTypeOf(set):", superTypeOf(set));
console.log("superTypeOf(obj):", superTypeOf(obj));
console.log("superTypeOf(str):", superTypeOf(str));
console.log("superTypeOf(666):", superTypeOf(666));
console.log("superTypeOf(NaN):", superTypeOf(NaN));
console.log("superTypeOf(arr):", superTypeOf(arr));
console.log("superTypeOf(null):", superTypeOf(null));
console.log("superTypeOf(undefined):", superTypeOf(undefined));
console.log("superTypeOf(superTypeOf):", superTypeOf(superTypeOf));
```

### Submission

Add your `collections.js` file to your `((ROOT))` repository.

### Additional Resources

- [typeof](https://devdocs.io/javascript/operators/typeof)
- [Spread syntax](https://devdocs.io/javascript/operators/spread_syntax)
- [Map](https://devdocs.io/javascript/global_objects/map)
- [Set](https://devdocs.io/javascript/global_objects/set)
- [Object.fromEntries](https://devdocs.io/javascript/global_objects/object/fromentries)
- [Object.entries](https://devdocs.io/javascript/global_objects/object/entries)
- [Array.from](https://devdocs.io/javascript/global_objects/array/from)
- [instanceof](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/instanceof)
- [Object.prototype.toString](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/toString)

### Tips for Success

- Remember that Sets automatically remove duplicates
- Pay attention to the specific format of the output in the examples
- When converting Maps to Objects, non-string keys will be converted to strings
- For the `superTypeOf` function, try using `Object.prototype.toString.call()` to get detailed type information
- Test each function with a variety of inputs, including edge cases
