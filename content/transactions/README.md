## transactions

### Overview

- You will learn how to set up a local Bitcoin node and use it for transactions.
- You will gain experience in creating a Bitcoin wallet and addresses on the
  regtest network.
- You will understand how to mine blocks and send Bitcoin transactions using the
  command line.
- You will practice JavaScript by saving transaction IDs in a file, enhancing
  your programming skills.
- You will develop a function in Node.js to retrieve block dates, increasing
  your knowledge of asynchronous programming and network communication.
- You will learn how to fetch transaction values using APIs, deepening your
  understanding of Bitcoin's currency units.
- You will gain hands-on experience in peer-to-peer transactions on the testnet
  by sending Bitcoin to another person.
- You will learn to create and send Ethereum transactions on a testnet,
  broadening your cryptocurrency knowledge.
- You will develop functions that retrieve input and output values from
  transactions, strengthening your grasp of how Bitcoin transactions operate.

### Content

#### send-transaction

The goal of this exercise is to create a simple Bitcoin transaction using the
command line on a local Bitcoin node. You will install a Bitcoin node, set it up
on the regtest network, create a wallet and addresses, mine some blocks, send a
transaction, and finally save the transaction ID in a JavaScript file. This
helps you learn practical Bitcoin development skills.

#### retrieve-block-date

In this exercise, you will create a function named `retrieveBlockDate()` using
Node.js. The function will connect to a Bitcoin node and retrieve the date of a
specific block given its height, demonstrating skills in network communication,
asynchronous programming, and module exporting in JavaScript. This will enhance
your understanding of blockchain technology and RPC methods.

#### retrieve-transaction-value

The goal of this exercise is to create a function called
`retrieveTransactionValue()` that interacts with a local Bitcoin node to fetch
the total value of a specified transaction. You will input a transaction hash,
and the function will calculate the total amount transferred, summing each
output value. This exercise helps you practice working with APIs and
understanding Bitcoin’s currency units.

#### send-transaction-to-peer

The goal of this exercise is for you to send your first peer-to-peer Bitcoin
transaction using the testnet. You will create a Bitcoin address, obtain testnet
Bitcoin from a faucet, and send a small amount to another student. After sending
the transaction, you will retrieve key transaction details, including the
transaction hash, fee, amount, and date. You will store this information in a
variable in your JavaScript file. This hands-on experience will help you
understand how transactions work on the Bitcoin network.

#### send-eth-transaction

You will learn how to create and send an Ethereum transaction using a testnet.
This exercise involves creating a wallet, obtaining testnet Ether from a faucet,
and sending a tiny amount of Ether to a specified address. You will also store
the transaction hash in a JavaScript file for future reference.

#### retrieve-transaction-in-out

The goal of this exercise is to create a function called `retrieveTxValue()`
that uses a local Bitcoin node's RPC API to fetch the input and output values of
a specific Bitcoin transaction. You will provide the transaction hash as an
input, and the function will return an object that contains arrays of input and
output values, helping you understand how transactions work in the Bitcoin
network.
