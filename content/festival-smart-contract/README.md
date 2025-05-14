## festival-smart-contract

### Overview

- You will learn how to create a simple smart contract using Solidity with the
  `NamedFestival` contract, focusing on setting and getting values.
- You will understand the use of constructors in smart contracts while creating
  `TimeAndPlace`, which sets the festival's time and location.
- You will gain experience in using arrays by managing festival artists with the
  `Lineup` contract, allowing you to register and retrieve artist names.
- You will learn about access control in the `OrganizedFestival` contract, where
  only the organizer can update key festival details.
- You will explore Ethereum transactions in the `BuyTickets` contract by
  implementing ticket sales and tracking ticket ownership.
- You will understand how to manage ticket sales and benefits with the
  `FunAndProfit` contract, including redeeming tickets and transferring profits.
- You will learn about artist compensation and payment distribution in the
  `ArtistsDoWork` contract, ensuring fair payments in your project.
- You will deepen your knowledge of Solidity logic through the `TimeIsMoney`
  contract, handling ticket sales, payments, and event timing.

### Content

#### named-festival

The goal of this exercise is to create your first smart contract named
`NamedFestival` using Solidity in a beginner-friendly environment. You will
specify the license and version, then create a public function `setName()` to
set the festival name and another function `getName()` to retrieve it. This will
familiarize you with basic smart contract development and Solidity syntax.

#### time-and-place

The goal of this exercise is to create a Smart Contract called `TimeAndPlace`
that establishes the time and place for a festival. You will implement a
constructor function to set the festival's start time as a Unix timestamp and
its location as a string. Additionally, you will create two functions:
`getStartTime()` to retrieve the festival's starting time and `getPlace()` to
return its location. This will help you understand how to deploy and interact
with Smart Contracts in Solidity.

#### lineup

The goal of this exercise is to create a Smart Contract named `Lineup` to manage
festival artists. You will implement a function `addArtist(string)` to register
artists in order. Additionally, you will create a function `lineup(uint)` to
retrieve the artist's name by index. This helps you learn about arrays and how
to store and access data in Solidity.

#### organized-festival

The goal of this exercise is to create a Smart Contract named
`OrganizedFestival` that manages festival details. You will set the festival
date and place through a constructor. The contract will allow only the
organizer, identified as the deployer, to update these details. You will
implement functions to retrieve and modify the festival's starting time and
place, ensuring only the organizer can make changes.

#### buy-tickets

The goal of the exercise is to create a smart contract called `BuyTickets` that
allows users to purchase festival tickets for 0.1 Ethers. You will add a
function `buyTicket()` to handle ticket sales, ensuring that any excess payment
is kept. Additionally, you will implement the `ticketsOf()` function to check
how many tickets an Ethereum address owns. This will deepen your understanding
of Ethereum transactions and smart contract development.

#### fun-and-profit

In this exercise, you will build a Smart Contract called `FunAndProfit` to
manage festival ticket sales and benefits. You will implement the `buyTicket()`
and `ticketsOf()` functions. Additionally, you will create the `redeemTicket()`
function, allowing users to return tickets while ensuring ownership, and the
`getBenefits()` function to transfer festival profits to the organizer.

#### artists-do-work

The goal of the exercise is to create a Smart Contract called `ArtistsDoWork`
that enables users to purchase tickets while ensuring artists are fairly
compensated. You will implement the `buyTicket()` function for ticket sales, the
`addRemuneratedArtist()` function for registering artists by the organizer, and
the `getPayed()` function for artists to receive their payment, focusing on
payments and divisions in Solidity.

#### time-is-money

The goal of this exercise is to create a Smart Contract named `TimeIsMoney` that
manages ticket sales, artist payments, and organizer benefits for a festival.
You will implement functions to handle ticket purchases with price variations,
track ticket ownership, register artists, and facilitate payments based on
specific time frames related to the festival's date. This will enhance your
understanding of Solidity and smart contract logic.
