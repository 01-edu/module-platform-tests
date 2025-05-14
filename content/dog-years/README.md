## Dog Years

### Learning Objectives

By the end of this lesson, you will:

- Create functions with multiple parameters
- Perform mathematical calculations in JavaScript
- Work with planetary orbital periods
- Format numeric output with proper precision

### Understanding the Problem

According to popular belief, one human year equals seven dog years. In this exercise, we'll calculate a dog's age in dog years based on:

1. The dog's age in seconds
2. The planet the dog is on (since years are different lengths on different planets)

### Your Assignment

Create a JavaScript file named `dog-years.js` that implements a function:

**`dogYears`**:

- Takes two arguments:
  - A string representing the name of a planet (lowercase)
  - A number representing the dog's age in seconds
- Returns the dog's age in dog years on that planet, rounded to 2 decimal places

### Planetary Information

Each planet has a different orbital period (length of year) compared to Earth:

| Planet  | Orbital Period (in Earth years) |
| ------- | ------------------------------- |
| Earth   | 1.0                             |
| Mercury | 0.2408467                       |
| Venus   | 0.61519726                      |
| Mars    | 1.8808158                       |
| Jupiter | 11.862615                       |
| Saturn  | 29.447498                       |
| Uranus  | 84.016846                       |
| Neptune | 164.79132                       |

For reference:

- 1 Earth year = 365.25 Earth days = 31,557,600 seconds

### Examples to Guide You

- A dog that's 1,000,000,000 seconds old would be 221.82 Earth-dog-years old
- The same dog would be approximately 921.3 Mercury-dog-years old
- The same dog would be approximately 118.15 Jupiter-dog-years old

### Testing Your Solution

To verify your solution works correctly, add these test cases:

```javascript
console.log(dogYears("earth", 1000000000)); // Should output 221.82
console.log(dogYears("mercury", 1000000000)); // Should output 921.3
console.log(dogYears("venus", 1000000000)); // Should output 360.59
```

### Thinking Through the Problem

For each step of the calculation, consider:

1. How do I convert seconds to Earth years?
2. How do I convert Earth years to the specified planet's years?
3. How do I calculate dog years?
4. How do I format the result to 2 decimal places?

### Submission

Add your `dog-years.js` file to your `((ROOT))` repository.

### Additional Resources

- [MDN Web Docs: Math](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math)
- [MDN Web Docs: Number.prototype.toFixed()](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/toFixed)
- [MDN Web Docs: Math.round()](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/round)

### Tips for Success

- Break down the problem into smaller steps
- Be careful with the order of operations in your calculations
- Test your solution with different planets to ensure it works for all cases
- Pay special attention to the precision and rounding requirements
