## How 2 Js

### Learning Objectives

By the end of this lesson, you will:

- Understand what JavaScript runtime environments are
- Create and run your first JavaScript program in a browser
- Learn how to use the browser console for testing code

### What is a JavaScript Runtime?

JavaScript can run in different **runtime environments**. A runtime environment determines:

- What JavaScript features are available to you
- How your code interacts with the computer
- What APIs you can access

Common JavaScript runtime environments include:

- Web browsers (Chrome, Firefox, Safari, etc.)
- [Node.js](https://nodejs.org/) - For running JavaScript outside browsers
- [Deno](https://deno.land/) - A secure runtime for JavaScript

### Your First JavaScript Program: Hello World

In this exercise, you'll create a simple JavaScript program and run it in your browser.

#### Step 1: Create your JavaScript file

Open your terminal and run:

```sh
echo "console.log('Hello World')" > how-2-js.js
```

This creates a file named `how-2-js.js` that displays "Hello World" in the console.

#### Step 2: Create an HTML file to load your JavaScript

```sh
echo '<script type="module" src="how-2-js.js"></script>' > index.html
```

This creates a minimal HTML page that loads your JavaScript file.

#### Step 3: Start a local web server

```sh
python3 -m http.server &
```

This starts a simple web server on port 8000.

#### Step 4: Open the page in your browser

Use the appropriate command for your operating system:

- **Linux**: `xdg-open 'http://localhost:8000'`
- **macOS**: `open 'http://localhost:8000'`
- **Windows**: `start 'http://localhost:8000'`

#### Step 5: View your output

Open the browser's developer console:

- **Mac**: Press `Command+Option+J` (Chrome) or `Command+Option+C` (Firefox/Safari)
- **Windows/Linux**: Press `Control+Shift+J` (Chrome) or `Control+Shift+K` (Firefox)

You should see "Hello World" displayed in the console.

### Testing Your Code

The browser console is perfect for quick JavaScript testing. Try entering simple JavaScript expressions directly in the console.

To re-run your script after making changes, simply refresh the page.

### Your Assignment

1. Create a repository named `((ROOT))`
2. Add both files you created (`how-2-js.js` and `index.html`) to this repository
3. Make sure your code successfully displays "Hello World" in the browser console

### Tips for Success

- Don't worry if everything feels new - we'll build your knowledge step by step
- The console will be your best friend for debugging JavaScript
- When in doubt, refresh the page to run your latest code

Ready to continue your JavaScript journey? Let's go! 🚀
