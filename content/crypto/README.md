## crypto

### Overview

- You will learn how to work with hexadecimal numbers and their binary
  representations by creating an `increment` function.
- You will gain experience in file handling and cryptography by developing a
  `hashFile` function to compute SHA-256 hashes of file contents.
- You will understand hash functions better by implementing the `hash160`
  function, combining `sha256` and `ripemd160` algorithms.
- You will explore the concept of brute force attacks and how hash functions
  work through the `semiBrute` function that finds specific hash outputs.
- You will practice elliptic curve cryptography by creating a `signer` function
  to generate key pairs and verify digital signatures.
- You will learn key generation and address creation in blockchain applications
  through the `generateAddress` function that uses the `secp256k1` curve.
- You will build a simple cryptocurrency wallet, understanding key generation,
  transaction creation, and the use of cryptographic signatures for security.

### Content

#### increment

The goal of this exercise is to help you understand how hexadecimal numbers work
and how they relate to binary representation. You will create a function called
`increment` that takes a number in hexadecimal format, increases it by one, and
returns the result as a Node.js Buffer. This will strengthen your skills in
working with different number systems and buffers in JavaScript.

#### hash-file

The goal of this exercise is to create a function called `hashFile` that
computes the SHA-256 hash of a file's content, given its file path. You will use
the Node.js `crypto` and `fs` modules to read the file and generate the hash.
This will help you understand file handling and cryptography in JavaScript.

#### hash-160

The goal of this exercise is to create a function called `hash160` that takes a
string input and applies two hashing algorithms: first `sha256` and then
`ripemd160`. You will return the final result in binary form. This exercise
helps you understand hash functions and their application in securing data.

#### semi-brute

The goal of this exercise is to help you understand how hash functions work and
the concept of brute force attacks. You will create a function called
`semiBrute()` that takes a two-character hexadecimal target and finds a string
whose SHA-256 hash starts with that target. This simulates how miners work by
continuously modifying input to achieve a specific hash. You will develop
problem-solving skills while learning about hashing in programming.

#### signer

The goal of this exercise is to practice using elliptic curve cryptography in
Node.js. You will create a function to generate a cryptographic key pair, sign a
message with that key pair, and verify the signature's validity. This will help
you understand digital signatures and their implementation in blockchain
projects.

#### generate-address

The goal of this exercise is to create a function called `generateAddress()`
that generates a pair of cryptographic keys using the `secp256k1` elliptic
curve. You will return an object containing a private key, a public key, and an
account address derived from the public key using a SHA-256 hash. This exercise
helps you understand key generation and address creation in blockchain
applications.

#### basic-wallet

The goal of this exercise is to create a simple cryptocurrency wallet. You will
write a function to generate a cryptographic key pair and save the private key,
then create a function to build a transaction. This transaction will include the
sender’s hashed public key, the recipient’s address, the amount in hexadecimal,
and a digital signature. This helps you understand key generation, transaction
creation, and using cryptographic signatures.
