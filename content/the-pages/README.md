## The Pages

### Overview

After using UE5 to implement core features in past projects, it’s time to take the next step and create a simple, fully playable small game. This project introduces narrative design, interactive storytelling, inventory management, and puzzle mechanics. Inspired by "Slender: The Eight Pages," the goal is to build a suspenseful 3D experience where the player collects pages while solving puzzles and managing resources. The focus is on how gameplay mechanics seamlessly interact with storytelling elements and UI/UX design to craft a cohesive and engaging experience.

<center>
<img src="./resources/tpm.jpg?raw=true" style = "width: 500px !important; height: 350px !important;"/>
</center>

### Role Play

You are a budding game developer who wants to push your design skills further by creating a narrative-driven experience using `Unreal Engine 5`. Drawing inspiration from survival horror games, you decide to develop a game centered around collecting scattered "pages" while solving puzzles to progress. To immerse players fully, you’ll focus not only on core mechanics but also on world-building and level design, ensuring the environment is atmospheric and cohesive with the narrative. As you build the game, you'll need to implement an inventory system, design UI for player feedback, craft puzzles that enhance the game's tension and pacing, and create engaging environments that make exploration rewarding. Can you strike the perfect balance between narrative, mechanics, world design, and player experience?

### Learning Objectives

At the end of this project, you will have learned:

- Setting up inventory systems (for managing collected items and resources).
- Implementing basic puzzle mechanics.
- Designing UI/UX elements for player feedback and interaction.
- Integrating narrative storytelling elements into gameplay.
- Developing world-building techniques to support narrative themes and player immersion.
- Implementing collectible systems with logic and player progression.
- Creating level designs that guide player movement, encourage exploration, and build tension.
- Exploring game flow with tension-building mechanics (e.g., time limits, enemy encounters).

### Instructions

#### General Setup

- Your game revolves around collecting a set number of pages hidden across the level.
- Certain areas will only be accessible after solving puzzles or using specific inventory items.
- The game world should have an eerie atmosphere to enhance immersion.

> **Note**: The environment doesn’t have to be a forest, use your imagination, but make sure it stays unsettling and keeps the player on edge.

> **Mandatory**: Use `Event Dispatchers` to ensure interactions (like collecting items or solving puzzles) are decoupled.
> **Mandatory**: Use `Actor Components` to break down complex behaviors into modular, reusable parts, ensuring better scalability and code reusability across multiple actors.

> **Tip**: A consistent visual and sound design will enhance the player's immersion and engagement.

#### Main Menu

The main menu `widget` should:

- Be on a separate `level/map` from the main game map.
- Contain three buttons:
  - **Start Game**
  - **Exit Game**
  - **Settings**
- The Settings Menu must allow the player to adjust:
  - `Audio levels`
  - `Brightness`
  - `Input sensitivity`
  - `Keybindings`

#### Player Character & Movement

- Choose either a `first-person` or `third-person` perspective.
- Add sprint mechanics with a `stamina system`.
- Add a `health system`
- Implement a `flashlight` that can be toggled on/off with limited battery life.

> **Tip**: You can reuse the locomotion system created in the `Locomotion Core` project to save time and ensure smooth movement mechanics but make sure to tweak it to fit the theme of the game.

> **Note**: Regardless of the perspective you choose, make sure to use `animations` that fit the scary theme to enhance immersion and maintain tension throughout the gameplay.

#### Collectible Pages and Inventory System

**Pages as Collectibles:**

- The player must find a specific number of pages (e.g., 8 pages) scattered throughout the level.
- Each page triggers a narrative snippet or piece of lore upon collection.
- Some pages can only be accessed after solving a puzzle.

**Inventory System:**

- An **inventory UI** to manage collected items (pages, keys, puzzle pieces, etc.).
- Items like **keys** or **tools** are needed to unlock certain areas.
- Add **consumables** (e.g., flashlight batteries, health kits).

> **Tip**: Use Unreal's inventory system tutorials for managing items with actor components.

#### Puzzle Mechanics

**Basic Puzzle Examples:**

- **Lock-and-Key Puzzle**: Find a key to unlock a door or chest.
- **Lever Puzzle**: Pull levers in the correct sequence to open a gate.
- **Environmental Puzzle**: Arrange objects (like statues) to unlock a hidden area.

> **Use Event Dispatchers** to manage puzzle states (e.g., opening a gate after all switches are activated).

> **Tip**: Make puzzles relevant to the narrative for enhanced immersion.

#### Enemy Encounters and Tension Mechanics

**Enemy Character:**

- Pre-Detection:

  - The enemy slowly moves through the environment, subtly closing in on the player's general area to build tension.

- Detection and Search:

  - Upon detecting the player (via `trigger box` or `perception system`), the enemy chases.
  - If the player escapes, the enemy enters a `search state`, investigating the last known location before resuming movement.

- Collision:

  - On collision, the player takes damage. If health reaches zero, trigger player death.

> **Note**: Ensure the usage of proper animations for all actions.

> **Note**: Add a jump scare or similar effect upon the player’s death to enhance tension.

**Tension Mechanics:**

- Introduce a **time limit** or increasing difficulty as more pages are collected.
- The enemy becomes **stronger or faster** with each collected page.

> **Tip** use `Blackboard` variables

#### HUD & UI Design

**HUD Elements:**

- A **page counter** (e.g., "3/8 Pages Collected").
- An **inventory button** to display collected items.
- A **stamina meter**.
- A **flashlight battery meter**.

> **Note**: Ensure smooth and intuitive UI updates. Use animation blueprints for subtle feedback (like blinking battery meters).

#### Game Loop Logic

- **Start and Respawn Logic**:

  - The game starts at a spawn point.
  - On death, the player respawns at the last checkpoint or at the start.

- **End Goal**:
  - Once all required pages are collected and the final puzzle is solved, a **final menu** appears with:
    - **Return to Main menu**
    - **Exit Game**

#### Level Design Guidelines

**Design with Exploration in Mind:**

- Place collectibles and puzzles to **encourage exploration**.
- Use **visual and auditory cues** (lights, sounds) to subtly guide players to important areas.

**Atmospheric Level Design:**

- Use **fog, lighting effects, and ambient sounds** to build tension.

### Bonus

- **Multiple Endings**: Offer different outcomes based on player interactions.
- **Advanced Inventory**: Implement item stacking, descriptions, and drag-and-drop functionality.
- **Adaptive AI Behavior**: Enemies adapt based on player actions (e.g., learn patterns and become harder to avoid).
- **Randomized Page Locations**: Implement procedural page spawns to keep tension high.

### Submission

- You must upload a zip file of your game build and project files in your repository.
  - Ensure that the build works on your platform.
  - If file size is an issue, use GitHub with [Git LFS](https://docs.github.com/en/repositories/working-with-files/managing-large-files/about-large-files-on-github).

### Resources

- [Unreal Engine Inventory System](https://forums.unrealengine.com/t/tutorial-simple-inventory-system/1316560)
- [Creating UI in Unreal Engine](https://dev.epicgames.com/documentation/en-us/unreal-engine/building-your-ui-in-unreal-engine?application_version=5.5)
- [Basic AI and Patrol Setup](https://dev.epicgames.com/documentation/en-us/unreal-engine/behavior-trees-in-unreal-engine?application_version=5.5)
