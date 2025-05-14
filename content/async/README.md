## async

### Overview

You will learn several important concepts from each exercise:

- **Debounce**: You will understand how to delay function execution, improving
  performance when handling rapid events.
- **Throttle**: You will learn to limit function execution frequency, enhancing
  performance and efficiency.
- **Interpolation**: You will create a controlled series of points between
  values, helping manage gradual transitions.
- **Keep Trying or Give Up**: You will practice error handling and asynchronous
  programming with retries and timeouts.
- **Get JSON**: You will learn how to make HTTP requests with promises, parse
  JSON, and handle errors.
- **Is Winner**: You will interact with APIs to gather data and return tailored
  responses based on conditions.
- **Google Search**: You will practice querying multiple servers and managing
  async responses efficiently.
- **All**: You will handle multiple promises within an object, ensuring all
  resolve before accessing results.
- **Series**: You will execute async functions sequentially, mastering promise
  management.
- **Race**: You will implement promise racing, understanding how to return
  results based on the fastest promise.

### Content

#### debounce

In this exercise, you will create two functions that mimic the behavior of the
`_.debounce` function from lodash. The first function, `debounce`, will delay
function execution until after a specified time has passed since the last time
it was invoked. The second function, `opDebounce`, will include the `leading`
option, allowing the function to run at the start of the wait time as well. This
will help you understand how debouncing improves performance in responding to
rapid events in web applications.

#### throttle

The goal of this exercise is to create two functions that mimic the behavior of
lodash's `throttle`. You will develop a basic `throttle` function and an
`opThrottle` function that includes options for `trailing` and `leading`. This
exercise helps you understand how throttling limits the execution of a function
to improve performance and efficiency in programming. You will apply your
knowledge of JavaScript functions and timing control.

#### interpolation

The goal of this exercise is to create an `interpolation` function that
generates a series of points between a `start` and `end` value, based on a
specified number of `steps`. For each point, the function should execute a
`callback` with the current distance and point value. The function will manage
timing using a delay that divides the total `duration` by the number of `steps`,
ensuring that calls occur at the correct intervals. This will allow you to
visualize and work with gradual transitions between two values in a controlled
way.

#### keep-trying-or-giveup

The goal of this exercise is to create two utility functions: `retry` and
`timeout`. The `retry` function will attempt to call an async callback a
specified number of times, handling errors and throwing an error after exceeding
the allowed retries. The `timeout` function will call an async callback and
enforce a maximum wait time, returning an error if the callback does not
complete in time. This exercise helps you understand error handling,
asynchronous programming, and the use of promises in JavaScript.

#### get-json

The goal of this exercise is to create a function named `getJSON` that handles
HTTP requests using promises. You will learn to construct a URL with query
parameters, make an async fetch call, and manage responses. If the request
fails, you will throw an error based on the response status. Finally, you will
parse the JSON response to return either data or an error message. This will
enhance your understanding of async programming and error handling in
JavaScript.

#### is-winner

The goal of the exercise is to create a function named `isWinner` that checks if
a given country has won the FIFA World Cup. Based on the country's history and
continent, the function will return specific messages. You will interact with an
API to gather the necessary data and construct appropriate responses.

#### gougle-search

The goal of this exercise is to create a function called `queryServers` that
generates URLs for querying different servers. It will return the result of the
fastest server response when called with a server name and a query. You will
also build `gougleSearch`, which queries three servers concurrently using
`queryServers`. It must handle a timeout of 80 milliseconds, returning an error
if responses are delayed. This exercise helps you practice asynchronous
programming and working with multiple promises in JavaScript.

#### all

The goal of this exercise is to create a function named `all` that mimics the
behavior of `Promise.all`, but specifically for objects rather than arrays. You
will learn how to handle multiple promises contained within an object, ensuring
that all promises resolve before returning the results. This exercise will
deepen your understanding of promise handling in JavaScript.

#### series

The goal of this exercise is to create a function called `series` that accepts
an array of asynchronous functions and executes them one after another, in the
order they are provided. You will learn to handle asynchronous behavior with
Promises, ensuring that each function completes before the next one starts, and
collecting the results in the same order.

#### race

The goal of this exercise is to implement two functions: `race` and `some`. The
`race` function will mimic the behavior of `Promise.race`, returning a promise
that resolves as soon as one of the promises in an iterable resolves. The `some`
function will take an array of promises or values and a count, returning the
first specified `count` resolved values. If the input is an empty array or zero
count, it should return a promise resolving to `undefined`. This exercise
enhances your understanding of promises and asynchronous programming in
JavaScript.
