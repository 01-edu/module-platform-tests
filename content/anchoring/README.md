## anchoring

### Overview

You will learn several important skills from these exercises.

- **Local Ethereum Node Setup**: You will gain experience in launching a local
  Ethereum node and simulating a blockchain environment.

- **Node.js Integration**: You will learn how to create scripts in Node.js to
  interact with the Ethereum network API.

- **Ether Transactions**: You will practice writing functions to send Ether to
  addresses, understanding how transactions work on the blockchain.

- **Hashing Concepts**: You will learn how to generate and use SHA-256 hashes,
  enhancing your understanding of data security.

- **Transaction Verification**: You will develop skills in verifying
  transactions on the blockchain and managing data effectively.

- **Smart Contracts**: You will write smart contracts in Solidity, learning how
  to store and retrieve data on the blockchain.

- **Event Handling**: You will understand how to implement events in Solidity,
  making your contracts more efficient and interactive.

These activities will deepen your knowledge of blockchain technology and
programming.

### Content

#### local-node

The goal of this exercise is to launch a local Ethereum node using tools like
Hardhat or Ganache. You will learn to set up a testing environment that
simulates an Ethereum network, allowing you to exchange blocks and transactions,
verify them through the Ethereum Virtual Machine, and interact with the node via
an API. You will not submit any code, just an empty file.

#### get-account

In this exercise, you will create a Node.js script that interacts with an
Ethereum node API. You will load an Ethereum library, like `ethers.js`, and
implement a function called `getAccount()`. This function will connect to a
local node at `http://localhost:8545` and retrieve the address of the first
available account. Finally, you will export this function for use in other
files.

#### send-ether

The goal of this exercise is to write a Node.js script that defines a function
`sendEther(amount, address)`. This function will connect to a local Ethereum
node at `http://localhost:8545` and send the specified amount of Ether to the
given address. You will practice using tools like Hardhat, Ganache, and Ethers
to perform a transaction.

#### send-hash

In this exercise, you will create a function called `sendHash()` that generates
a SHA-256 hash from a given string. You will connect to a local blockchain node
using the provided address and send the transaction containing the hash in the
data field. This will help you understand hashing and blockchain transactions
using JavaScript.

#### check-document

In this exercise, you will create a Node.js script that defines a function
called `checkDocument()`. This function will accept a transaction ID and a
string as parameters. It will connect to a local blockchain node, verify if the
transaction ID and string match, and return the document's date as a Unix
timestamp. If they do not match, the function will return 0. This task enhances
your understanding of blockchain interactions and how to work with Ethereum
transactions using JavaScript.

#### register

The goal of this exercise is to create a smart contract called `Register` using
Solidity. You will implement a function `addDocument()` to store a document hash
and its timestamp, and a function `getDate()` to retrieve the timestamp
associated with a specific document hash. This will help you understand how to
manage data on the blockchain efficiently.

#### register-with-events

The goal of this exercise is to enhance your Smart Contract by adding events,
which help in retrieving information efficiently. You will create a contract
named `RegisterWithEvents` that includes the functions `addDocument()` and
`getDate()`, along with an event `DocumentAdded` that triggers when a document
is added. This practice will improve your understanding of event handling in
Solidity.
