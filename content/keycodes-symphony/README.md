## Keycodes symphony

### Instructions

Like an inspired Beethoven who's about to write his Moonlight Sonata, you're about to compose a colorful symphony of letters with your keyboard.

Write the function `compose`:

- Make it fire every time a key is pressed.
- Create a new `div` with the class `note` when a letter of the lowercase alphabet is pressed. It should have a unique background color generated using the `key` of the `event`. It should also display the corresponding pressed character.
- When `Backspace` is pressed, delete the last note.
- When `Escape` is pressed, clear all the notes.

### Files

You only need to create & submit the JS file `keycodes-symphony.js`; we're providing you the following file to download to test locally:

[keycode-symphony.zip](https://assets.01-edu.org/keycode-symphony.zip)

- the HTML file `keycodes-symphony.html` to open in the browser, which includes:

  - the JS script which will allow to run your code.

- feel free to use the CSS file `keycodes-symphony.data.css` as it is or you can also modify it.

### Expected result

You can see an example of the expected result [here](https://youtu.be/5DdijwBnpAk)

### Notions

- [Keyboard event](https://developer.mozilla.org/en-US/docs/Web/API/KeyboardEvent): [`keydown`](https://developer.mozilla.org/en-US/docs/Web/API/Document/keydown_event), [`key`](https://developer.mozilla.org/en-US/docs/Web/API/KeyboardEvent/key)
