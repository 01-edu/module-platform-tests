## simple-tokens

### Overview

By completing the quests, you will learn:

- **Minimal Token:** You will understand how to create a basic token and use
  constructors in smart contracts. You will also learn how to check token
  balances and implement token transfers.
- **Token Sale:** You will learn to build a token sale contract, set a fixed
  token price, and create functions for buying tokens and collecting funds.

- **Usable Token:** You will implement basic token functionality, including
  token transfers, approvals, and managing allowances for spending limits.

- **Basic Swap:** You will develop a swap contract, enabling users to exchange
  tokens. You will practice using allowances to ensure secure transactions.

- **Eventful Token:** You will learn about event handling in Solidity, tracking
  token transfers, and logging minting actions.

- **Transfers History:** You will connect a JavaScript function to a smart
  contract, fetching transfer history for users and effectively handling
  blockchain data.

### Content

#### minimal-token

The goal of this exercise is to create a basic token using a Smart Contract
called `MinimalToken`. You will implement a constructor to set an initial token
balance for the deployer and develop functions to check user balances and
transfer tokens. This will help you understand the fundamentals of token
creation in blockchain programming.

#### token-sale

The goal of the Token Sale exercise is to develop a Smart Contract named
`TokenSale` that allows you to sell tokens at a fixed price. You will create a
constructor to set the token address and price, implement a `buy()` function for
users to purchase tokens, add a `getPrice()` function to check token price, and
include a `collect()` function for the contract deployer to gather funds from
sales.

#### usable-token

The goal of this exercise is to create a Smart Contract called `UsableToken`
with basic token functionalities. You will implement a constructor to initialize
token amounts, and functions for transferring tokens to other addresses and for
approving a spender to use a certain amount of tokens. Additionally, you will
manage allowances to track spending limits.

#### basic-swap

The goal of this exercise is to create a basic swap smart contract allowing two
users, Alice and Bob, to exchange tokens securely. You will implement a
`UsableToken` contract and a `BasicSwap` contract that supports token transfers
between the two users. The swap function will ensure proper allowances before
executing the token exchange. This will help you practice smart contract
development using Solidity.

#### eventful-token

The goal of the Eventful Token exercise is to create a Smart Contract called
`EventfulToken` that manages token transfers and minting. You will implement
events to track transfers, including the sender, recipient, and amount, and to
log minting actions with recipient addresses and created amounts. This will help
you understand event handling in Solidity.

#### transfers-history

The goal of this exercise is to create a JavaScript function that retrieves the
transfer history of a specific user from a Smart Contract. You will connect to a
local blockchain node, fetch the transfer events for that user, and return them
in an array. Positive values indicate transfers to the user, while negative
values indicate transfers from the user. This exercise helps you practice using
JavaScript, Ethereum Smart Contracts, and handling blockchain data effectively.
