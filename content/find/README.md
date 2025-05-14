## find

### Overview

- You will learn to use regular expressions to match specific patterns in
  strings effectively.
- You will create and manipulate variables to find occurrences of "hi" in
  various contexts.
- You will practice building a function to extract letters followed by a space
  and a single-digit number.
- You will enhance your skills in string manipulation by adding dots after
  vowels in a string.
- You will develop a function to compare the number of matches from two
  different regular expressions.
- You will practice lookarounds to extract specific words from a string that
  meet certain criteria.
- You will learn to create functions for extracting URLs with specific query
  parameters and improve string processing skills.
- You will learn to extract and format prices from strings by identifying dollar
  and cents components.
- You will practice validating and extracting IP addresses, ensuring correct
  formats and optional ports.

### Content

#### its-a-match

The goal of the exercise is to help you understand and create regular
expressions that match the string "hi" in different contexts. You will create
four variables: "normal" for matches anywhere, "begin" for matches only at the
start, "end" for matches only at the end, and "beginEnd" for an exact match.
This will enhance your skills in using regular expressions effectively.

#### letter-space-number

The goal of the exercise is to create a function called `letterSpaceNumber` that
processes a string. This function will extract instances where a letter is
followed by a space and a single-digit number, ensuring the number is not part
of a larger sequence. You will practice using regular expressions to achieve
this.

#### vowel-dots

The goal of the exercise is to create a function called `vowelDots`, which takes
a string as input and returns a new string where every vowel (a, e, i, o, u) is
followed by a dot. You will learn to use regular expressions (RegEx) to identify
vowels and to manipulate strings effectively. This exercise helps improve your
understanding of string operations and RegEx.

#### same-amount

In this exercise, you will create a function called `sameAmount` that takes a
string and two regular expressions. The goal is to check if both regular
expressions find matches in the string an equal number of times. Your function
will return a boolean value, indicating whether the counts of matches are the
same.

#### ion-out

The goal of the `ionOut` exercise is to develop a function that processes a
given string and extracts words containing the substring 'ion' that follow the
letter 't'. You will return these words as an array, removing the 'ion' part.
This task will help you practice string manipulation and using regular
expressions, specifically lookarounds.

#### greedy-url

The goal of this exercise is to develop three functions that process a given
string, extracting specific URLs based on query parameters. The first function,
`getURL`, retrieves all valid URLs. The second function, `greedyQuery`, filters
URLs with three or more query parameters. The third function, `notSoGreedy`,
captures URLs with two to three parameters. This exercise enhances your skills
in string manipulation and regular expressions.

#### group-price

The goal of this exercise is to create a function called `groupPrice` that
searches a string for prices. The function should extract the full price, the
dollar part, and the cents part, then return them in a 2D array. If no prices
are found, it should return an empty array.

#### valid-ip

The goal of this exercise is to create a function called `findIP` that extracts
valid IP addresses from a provided string, including optional ports. You will
focus on ensuring the IP format is correct, avoiding leading zeros, and
recognizing valid port numbers up to 65,535. You will also learn to use regular
expressions for this task.
