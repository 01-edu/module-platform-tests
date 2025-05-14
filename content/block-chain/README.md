## Block Chain

### Learning Objectives

By the end of this lesson, you will:

- Understand the basic structure of a blockchain
- Create a chained data structure in JavaScript
- Implement a hashing mechanism for data verification
- Use closure functions to maintain state
- Work with JSON data and string manipulation

### Understanding Blockchain Concepts

A blockchain is a data structure consisting of a chain of blocks, where each block contains data and is linked to the previous block through a reference (usually a hash). This creates an immutable chain where modifying any block would require updating all subsequent blocks. Blockchains are fundamental to cryptocurrencies and various other applications requiring tamper-evident records.

Key concepts in a blockchain include:

- **Blocks**: Units containing data and metadata
- **Hashing**: Creating a unique identifier for each block
- **Chaining**: Linking blocks together by including the previous block's hash
- **Genesis Block**: The first block in the chain, with no predecessor

### Your Assignment

Create a JavaScript file named `block-chain.js` that implements a function:

**`blockChain`**:

- Takes two arguments:
  - `data`: Any valid JavaScript object (that can be converted to JSON)
  - `prev`: The previous block (optional, defaults to genesis block `{ index: 0, hash: '0' }`)
- Returns a block object with:
  - `index`: A number representing the block's position in the chain
  - `hash`: A string computed using the provided `hashCode` function
  - `data`: The data passed to the function
  - `prev`: A reference to the previous block
  - `chain`: A method that accepts `data` and creates the next block

### Important Note

The `hashCode` function will be provided for you:

```js
const hashCode = (str) =>
  (
    [...str].reduce((h, c) => (h = (h << 5) - h + c.charCodeAt(0)) & h, 0) >>> 0
  ).toString(36);
```

This function takes a string and returns a hash code as a string. You don't need to understand how this function works internally, but you need to know how to use it.

### Thinking Through the Problem

For the `blockChain` function, consider:

1. How do I create a block with the required properties?

   - What should be the `index` of a new block?
   - How do I calculate the `hash` using the provided function?
   - How do I handle the case when no `prev` block is provided?

2. How do I implement the `chain` method on a block?

   - How does this method create and return a new block?
   - How does the new block reference the current block?

3. What happens when I chain multiple blocks together?
   - How does the hash change at each step?
   - How do different data values create different chains?

### Testing Your Solution

To verify your solution works correctly, start by testing basic block creation:

```javascript
// Test creating a block
const firstBlock = blockChain({ a: 1 });
console.log("First block index:", firstBlock.index);
console.log("First block hash:", firstBlock.hash);
console.log("First block data:", firstBlock.data);
console.log("First block prev:", firstBlock.prev);

// Test chaining
const secondBlock = firstBlock.chain({ b: 2 });
console.log("Second block index:", secondBlock.index);
console.log("Second block hash:", secondBlock.hash);
console.log(
  "Second block references first block:",
  secondBlock.prev === firstBlock,
);

// Test forking chains
const chainA = secondBlock.chain({ c: 3 });
const chainB = secondBlock.chain({ c: 4 }); // Different data

console.log("Chain A and B have same index:", chainA.index === chainB.index);
console.log(
  "Chain A and B have different hashes:",
  chainA.hash !== chainB.hash,
);
```

### Submission

Add your `block-chain.js` file to your `((ROOT))` repository.

### Additional Resources

- [JSON.stringify](https://devdocs.io/javascript/global_objects/json/stringify)
- [MDN Web Docs: Working with Objects](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Working_with_Objects)
- [MDN Web Docs: Closures](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Closures)
- [Introduction to Blockchain Concepts](https://developer.ibm.com/technologies/blockchain/tutorials/cl-blockchain-basics-intro-bluemix-trs/)

### Tips for Success

- Remember that each block's hash depends on its index, the previous block's hash, and its data
- The `chain` method should create a completely new block, not modify the existing one
- Make sure to stringify the data correctly when calculating the hash
- Test your implementation with multiple chain operations to ensure blocks link correctly
- Think about how different data values create different hash outcomes, while identical data creates identical hashes
