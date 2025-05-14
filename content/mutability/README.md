## Mutability

### Learning Objectives

By the end of this lesson, you will:

- Understand object references vs. copies in JavaScript
- Learn different methods to copy objects
- Recognize the difference between shallow and deep copies
- Apply techniques to create independent copies of objects

### Understanding Object Mutability

In JavaScript, objects are **mutable**, which means their properties can be changed after creation. Additionally, when you assign an object to a new variable, you're not creating a new copy - you're creating a new reference to the same object.

This means that changes to the original object will affect all references to that object, unless you explicitly create copies.

### Your Assignment

Create a JavaScript file named `mutability.js` that performs the following tasks:

1. Work with the provided `person` object (this will be added to your code automatically):

   ```js
   const person = {
     name: "Rick",
     age: 77,
     country: "US",
   };
   ```

2. Create three variables based on the `person` object:

   - `clone1`: A copy that won't change when `person` changes
   - `clone2`: Another copy that won't change when `person` changes
   - `samePerson`: A reference that WILL change when `person` changes

3. After creating these variables, modify the original `person` object:

   - Increase the `age` property by 1 (to 78)
   - Change the `country` property to `'FR'`

4. When your code runs, the following should be true:
   - `person.age` should be `78` and `person.country` should be `'FR'`
   - `clone1` and `clone2` should retain the original values (`age: 77` and `country: 'US'`)
   - `samePerson` should reflect the changes made to `person`

### Approaches to Object Copying

To create independent copies of objects, consider these approaches:

1. **Object.assign()**: Creates a shallow copy of an object

   - Syntax: `Object.assign({}, sourceObject)`
   - Good for simple objects without nested objects

2. **Spread operator**: Another way to create a shallow copy

   - Syntax: `{...sourceObject}`
   - Modern and concise approach

3. **JSON methods**: Creates a deep copy (works for nested objects too)

   - Syntax: `JSON.parse(JSON.stringify(sourceObject))`
   - Note: Has limitations with certain data types (like functions, Date objects)

4. **Creating a reference**: For `samePerson`, you'll need a direct reference to the original object

### Testing Your Solution

To verify your solution, add these console.log statements after making the changes to `person`:

```javascript
console.log(person.age === 78); // Should be true
console.log(person.country === "FR"); // Should be true

console.log(clone1.age === 77); // Should be true
console.log(clone1.country === "US"); // Should be true

console.log(clone2.age === 77); // Should be true
console.log(clone2.country === "US"); // Should be true

console.log(samePerson.age === 78); // Should be true
console.log(samePerson.country === "FR"); // Should be true
```

### Submission

Add your `mutability.js` file to your `((ROOT))` repository.

### Additional Resources

- [Set](https://nan-academy.github.io/js-training/examples/set.js)
- [Get](https://nan-academy.github.io/js-training/examples/get.js)
- [Data Structures](https://nan-academy.github.io/js-training/examples/data-structures.js)
- [MDN Web Docs: Object.assign()](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/assign)
- [MDN Web Docs: Spread syntax](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Spread_syntax)

### Tips for Success

- Remember that assignment with `=` creates a reference, not a copy
- Try multiple copying techniques to ensure you understand how each one works
- Think about the difference between shallow and deep copies
- For this exercise, since the `person` object only contains primitive values (no nested objects), both shallow and deep copying methods will work
