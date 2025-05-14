## Physics

### Learning Objectives

By the end of this lesson, you will:

- Apply physics formulas in JavaScript functions
- Implement conditional logic to use different calculation methods
- Work with object properties as function parameters
- Handle cases where calculations are not possible

### Understanding Acceleration

In physics, acceleration is the rate of change of velocity of an object. According to Newton's Second Law of Motion, when forces acting on an object are unbalanced, the object will accelerate. This acceleration can be calculated in multiple ways depending on which values are available:

1. Using force and mass: `a = F/m`
2. Using change in velocity and time: `a = Δv/Δt`
3. Using distance and time: `a = 2d/t²`

### Your Assignment

Create a JavaScript file named `physics.js` that implements one function:

**`getAcceleration`**:

- Takes one object as an argument with potential properties:
  - `f`: force
  - `m`: mass
  - `Δv`: change in velocity (delta v)
  - `Δt`: change in time (delta t)
  - `d`: distance
  - `t`: time
- Returns:
  - The calculated acceleration (a number) if possible using any of the available formulas
  - The string `"impossible"` if there's not enough information to calculate acceleration

### Formulas to Use

```
a = F/m
a = Δv/Δt
a = 2d/t²

Where:
a = acceleration
m = mass
F = force
Δv = final velocity - initial velocity
Δt = final time - initial time
d = distance
t = time
```

### Thinking Through the Problem

1. What information do I need to calculate acceleration using each formula?

   - Formula 1: I need both force (`f`) and mass (`m`)
   - Formula 2: I need both change in velocity (`Δv`) and change in time (`Δt`)
   - Formula 3: I need both distance (`d`) and time (`t`)

2. When is it "impossible" to calculate acceleration?
   - When none of the formulas have all their required parameters

### Testing Your Solution

To verify your solution works correctly, add these test cases:

```javascript
console.log(getAcceleration({ f: 10, m: 5 })); // Should output 2
console.log(getAcceleration({ f: 10, m: 5, t: 2, d: 100 })); // Should output 2
console.log(getAcceleration({ Δv: 100, Δt: 50 })); // Should output 2
console.log(getAcceleration({ d: 10, t: 2 })); // Should output 5
console.log(getAcceleration({ d: 100, t: 10 })); // Should output 2
console.log(getAcceleration({ f: 10, Δt: 50 })); // Should output "impossible"
console.log(getAcceleration({ m: 10, Δv: 100 })); // Should output "impossible"
console.log(getAcceleration({})); // Should output "impossible"
```

### Submission

Add your `physics.js` file to your `((ROOT))` repository.

### Additional Resources

- [Newton's Laws of Motion](https://www.physicsclassroom.com/class/newtlaws/Lesson-3/Newton-s-Second-Law)
- [MDN Web Docs: Objects](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Working_with_Objects)
- [MDN Web Docs: Conditional Statements](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Control_flow_and_error_handling)

### Tips for Success

- Remember to handle all three possible calculation methods
- Check if properties exist before trying to use them
- Consider using the power operator (`**`) for calculating t² (or multiply t by itself)
- Test your function with various combinations of input properties
- Pay attention to the data type your function should return (number or string)
