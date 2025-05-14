## Combat-core

### Overview

This project involves creating fluid, impactful melee combat mechanics in Unreal Engine 5 (UE5). You will focus on implementing core combat features including attack systems, defensive mechanics, weapon handling, and strategic AI responses. Building upon previous movement systems, this project emphasizes the development of weighty, consequential combat where timing and positioning are crucial. You'll create a complete combat loop from engagement to victory/defeat, ensuring all actions provide clear feedback and meaningful impact.

<center>
<img src="./resources/cm.png?raw=true" style="width: 500px !important; height: 350px !important;"/>
</center>

### Role Play

You're tasked with developing the combat system for an action RPG where timing and positioning are crucial to success. After successfully implementing complex movement mechanics in your previous projects, you must now create a combat system that builds upon that foundation. The challenge lies in integrating your locomotion system with new combat mechanics while maintaining responsiveness and providing clear feedback for every player action.

### Learning Objectives

By the end of this project, you will have implemented:

- Combat state management integrated with the locomotion system
- Weapon system with varied movesets and properties
- Hit detection and damage calculation systems
- Advanced animation blending for combat sequences
- Combat-specific UI elements and feedback
- Strategic AI for combat encounters
- Visual and audio feedback systems
- Resource management mechanics

### Instructions

#### General Requirements

> Tip: This project builds heavily upon the locomotion system from Locomotion-core. Review your previous implementation and consider how combat states will integrate with existing movement states.

> Note: For maximum learning, adapt your locomotion system to support combat mechanics rather than starting from scratch.

#### Main Menu

The main menu `widget` should:

- Be on a separate `level/map` from the main game.
- Contain the following buttons:
  - **Start Game**
  - **Settings**: Allows players to adjust input sensitivity and control schemes.
  - **Exit Game**

#### Player Character

The player `character` should build upon your locomotion system by adding:

- A combat state machine integrated with existing movement states
- An equipment system supporting at least two weapons (e.g. Long Sword, Great Sword, Spear, etc)
- A complete combat animation set including:
  - Combat stance animations
  - Attack animations
  - Defensive animations
  - Hit reaction animations
  - Death animations

**Combat Integration:**

- The locomotion system should smoothly transition between:
  - Regular movement states
  - Combat stance movement
  - Attack animations
  - Defensive actions
- Movement speed should be affected by:
  - Combat stance
  - Equipment weight
  - Action recovery
  - Stamina state

#### Resource Management

The stamina system should:

- Use the Character's stamina component
- Deplete when performing:
  - Combat actions
  - Dodges (from locomotion system)
  - Blocking
- Prevent actions when depleted
- Regenerate based on current state

#### Weapon System

The weapon `actor` should:

- Use a component-based structure for:
  - Damage calculation
  - Hit detection
- Include:
  - Appropriate collision setup
  - Visual effects
  - Sound effects
- Interact properly with animation system

#### Combat Mechanics

**State Machine Integration:**
The combat state machine should:

- Work alongside the locomotion state machine
- Handle transitions between:
  - Combat stance
  - Attack states
  - Defense states
  - Hit reactions
- Prevent invalid state combinations

**Attack System:**
Attacks should:

- Use proper trace channels for hit detection
- Generate appropriate effects on:
  - Hit
  - Block
  - Miss
- Support different attack types
- Work with the animation montage system

**Defense System:**
Defensive actions should:

- dodge mechanics (e.g. Dodge Rolling, Dashing, etc)
- Include blocking states
- Support counter-attack opportunities
- Provide proper feedback

#### Enemy AI

The enemy `character` should:

- Use the AIPerception system for combat awareness
- Implement behavior trees for:
  - Combat positioning
  - Attack selection
  - Defensive decisions
- Include different combat states:
  - Passive
  - Aggressive
  - Defensive
  - Retreating

The AI should:

- Manage resources like the player
- Use proper animation states
- Provide clear attack telegraphing
- React appropriately to player actions

#### HUD

The HUD `widget` should:

- Display:
  - Health status
  - Stamina meter
  - Equipment status
  - Combat state indicators
- Provide feedback for:
  - Damage dealt/received
  - Resource consumption
  - State changes

#### Game Loop Logic

The combat loop should:

- Start the game in front of an opponent.
- Manage combat states properly
- Handle victory/defeat conditions (player or opponent lose all HP)

#### Level Design

the level should:

- Have a coherent visual theme
- Be an arena with defined bounds
- Have proper NavMeshes for the AI

### Bonus

- Add advanced combat mechanics:
  - Weapon arts
  - Special abilities
  - Finishing moves
- Implement status effects system
- Create environmental combat interactions
- Add execution animations
- Develop a combo system

### Submission

- You must upload a zip file of your game build and project files in your repository.
  - Ensure that the build works on your platform.
  - If file size is an issue, use GitHub with [Git LFS](https://docs.github.com/en/repositories/working-with-files/managing-large-files/about-large-files-on-github).

### Resources

- [Animation Blueprint Documentation](https://dev.epicgames.com/documentation/en-us/unreal-engine/animation-blueprints-in-unreal-engine)
- [Behavior Tree Documentation](https://dev.epicgames.com/documentation/en-us/unreal-engine/behavior-trees-in-unreal-engine)
- [Physics System Documentation](https://dev.epicgames.com/documentation/en-us/unreal-engine/physics-in-unreal-engine)
- [Mixamo for animations](https://www.mixamo.com/)
- [SketchFab for 3D models](https://sketchfab.com/)
- [itch.io for additional assets](https://itch.io/)
