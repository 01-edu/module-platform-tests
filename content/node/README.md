## node

### Overview

You will learn many important skills from completing these quests:

- **String Manipulation**: You will practice splitting, reversing, and joining
  strings in JavaScript.
- **File Handling**: You will learn to read from and write to files using
  Node.js, including creating and updating JSON files.
- **Command Line Arguments**: You will understand how to process input from the
  command line and use it in your scripts.
- **Error Handling**: You will practice managing errors using `try...catch`,
  which is vital for creating reliable programs.
- **Directory Management**: You will learn how to read and count files in
  directories.
- **Sorting and Filtering**: You will gain experience in sorting data and
  filtering it based on conditions.
- **HTTP Requests**: You will build skills in server programming by handling GET
  and POST requests.
- **Access Control**: You will implement authentication to protect sensitive
  actions on your server.
- **Data Organization**: You will organize and manage data efficiently through
  structured formats.

These skills will greatly improve your programming abilities!

### Content

#### verydisco

The goal of this exercise is to create a script that transforms command line
arguments into a "very disco" format. You will take each word, split it into two
parts, reverse their order, and then display the transformed words. This will
help you practice string manipulation, using methods like `slice()`, `split()`,
and `join()`, as well as working with Node.js command line arguments.

#### verydisco-forever

The goal of this exercise is to modify your existing `verydisco` script so that
it writes its output to a text file named `verydisco-forever.txt` instead of
displaying it in the console. You will use the Node file system's `writeFile`
function to achieve this. This will help you learn about file handling in
Node.js.

#### verydisco-reverso

The goal of this exercise is to create a script named `verydisco-reverso.mjs`
that takes a file name as input, reads the file's content, deciphers the hidden
message in "very disco" mode by reversing it, and then prints the deciphered
message in the console. You will practice file reading, error handling with
try...catch, and using the Math.floor() function.

#### tell-me-how-many

The goal of the exercise is to create a script called `tell-me-how-many.mjs`
that counts the number of files in a specified directory. You will learn to
handle command line arguments, read directories using the Node file system, and
output the result in the console. If there is no directory given, the script
will count files in the current directory instead.

#### tell-me-who

The goal of the exercise is to create a `tell-me-who.mjs` script that lists
guests from a specified directory. You will learn to use file system methods to
read directory contents, sort the guest names in alphabetical order, and format
the output with numbers and names. This practice will enhance your skills in
using JavaScript functions, promises, and array manipulations.

#### tell-me-vip

The goal of the exercise is to create a `tell-me-vip.mjs` script that filters
guests who responded 'YES' to an invitation. You will format the output as a
numbered list in `vip.txt`, sorting it in alphabetical order by last name and
first name. You will use Node.js file system methods, JSON parsing, and array
filtering techniques to complete this task efficiently.

#### tell-it-cypher

The goal of this exercise is to create a script that encodes and decodes files
using base64 encoding. You will implement a `tell-it-cypher.mjs` script that
takes a file and a keyword (`encode` or `decode`). This will help you understand
file handling, encoding, and using Node.js Buffers. You will also practice
working with file names and extensions.

#### friend-support

The goal of this exercise is to create a `friend-support.mjs` program that runs
a server to manage access to a guest list. You will learn to handle HTTP `GET`
requests, respond with appropriate status codes, and return JSON data. The
server will listen on port `5000`, display startup messages, and respond with
guest information or error messages as needed. This teaches essential skills in
web programming and server management.

#### uninvited

The goal of this exercise is to create an `uninvited.mjs` program that sets up a
server to manage party guest information. You will build a server that listens
on port 5000, responds to HTTP `POST` requests to add guests, creates or updates
JSON files, and handles server errors. The server will return appropriate JSON
responses with status codes 201 for success or 500 for errors, ensuring
effective guest management for your party planning.

#### gatecrashers

The goal of this exercise is to implement Basic Access Authentication on a
server to control who can modify a guest list. Only three friends will have
permission to make changes using a specific password. The server should respond
with a 401 Unauthorized error for unauthorized requests. For authorized
requests, it will create a JSON file from the request body and return the
content as a response. You will run the server on port 5000.

#### personal-shopper

The goal of this exercise is to create a script called `personal-shopper.mjs`
that manages a shopping list using file operations. You will implement commands
to create, delete, add, and remove items from a JSON file. You will also handle
errors and display the current list or help information, gaining practical
experience with file handling in Node.js and working with JSON data.

#### happiness-manager

The goal of this exercise is to create a script named `happiness-manager.mjs`
that organizes guest preferences for drinks and food for a barbecue. You will
process data from a directory of guests, focus on those who answered "yes," and
compile their preferences into a JSON file. Your script must handle various
scenarios, such as missing data and no RSVPs, while formatting the output
correctly. This exercise helps you understand file management, data processing,
and handling user input in JavaScript.
