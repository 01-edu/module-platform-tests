> Due to file size reason, the solution might be uploaded on GitHub instead of Gitea!

#### Main Menu

###### Is the main menu widget on a separate level/map from the main game map?

###### Does the main menu contain a `Start Game` button that transitions to the gameplay?

###### Does the main menu contain an `Exit Game` button?

###### Does the main menu contain a `Settings` button with options to adjust:

- Audio levels?
- Brightness?
- Input sensitivity?
- Keybindings?

#### Player Character & Movement

###### Is the game using either a first-person or third-person perspective?

###### Are sprint mechanics implemented with a stamina system?

###### Does the player have a health system?

###### Is a flashlight mechanic implemented, with toggle functionality and limited battery life?

#### Collectible Pages and Inventory System

###### Are pages scattered across the level as collectibles?

###### Does each collected page trigger a narrative snippet or piece of lore?

###### Are some pages accessible only after solving puzzles?

#### Inventory System:

###### Is an inventory system implemented with:

- A UI to manage collected items like pages, keys, and tools?
- Consumables such as flashlight batteries or health kits?

###### Can the player use inventory items (e.g., keys or tools) to unlock certain areas?

#### Puzzle Mechanics

###### Are puzzles implemented, such as:

- Lock-and-Key puzzles?
- Lever puzzles with sequence mechanics?
- Environmental puzzles requiring object arrangement?

###### Are Event Dispatchers used to manage puzzle states (e.g., gate opening)?

###### Are the puzzles relevant to the narrative and enhance immersion?

#### Enemy Encounters and Tension Mechanics

###### Does the enemy character exhibit:

- Pre-detection behavior, subtly moving closer to the player’s location?
- Detection via trigger boxes or perception systems, followed by a chase?
- A search state if the player escapes?

###### Does the enemy inflict damage upon collision, with player death triggered if health reaches zero?

###### Is there a jump scare or similar tension-building effect upon the player’s death?

###### Does collecting more pages increase tension, such as:

- Making the enemy faster or stronger?
- Introducing a time limit or escalating difficulty?

#### HUD & UI Design

###### Does the HUD display:

- A page counter (e.g., "3/8 Pages Collected")?
- An inventory button to view collected items?
- A stamina meter?
- A flashlight battery meter?

###### Are smooth and intuitive UI updates implemented, with feedback animations (e.g., blinking battery meters)?

#### Game Loop Logic

###### Does the game start at a spawn point?

###### Can the player respawn at the last checkpoint or the start upon death?

###### Is the end goal clearly defined, with a final menu appearing after all pages are collected and the last puzzle is solved?

###### Does the final menu provide:

- A button to return to the main menu?
- A button to exit the game?

#### Level Design Guidelines

###### Does the level encourage exploration through collectible and puzzle placement?

###### Are visual and auditory cues (e.g., lighting, sounds) used to guide the player?

###### Is the level atmospheric, using fog, lighting, and ambient sounds to enhance tension?

#### Bonus Features

###### +Are multiple endings implemented based on player interactions?

###### +Does the inventory system support:

- Item stacking?
- Descriptions?
- Drag-and-drop functionality?

###### +Does the enemy AI adapt to the player’s behavior (e.g., learning patterns and becoming harder to avoid)?

###### +Are page locations randomized to increase replayability?
