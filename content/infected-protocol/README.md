## Infected Protocol

### Overview

In this advanced project, you will create a wave-based survival game in Unreal Engine 5. You'll implement sophisticated AI systems that drive enemy behavior while managing an engaging arcade-style gameplay loop. Players will face increasingly challenging hordes of infected enemies, manage resources, upgrade weapons, and unlock new areas in a strategic playground-style map. This project combines advanced AI programming with proven survival-horror gameplay mechanics to create a complete, replayable gaming experience.

<center>
<img src="./resources/ipm.gif?raw=true" style="width: 500px !important; height: 500px !important;"/>
</center>

### Role Play

You are a gameplay programmer at a leading game studio tasked with creating the next hit wave-based survival game. Your challenge is to combine sophisticated AI systems with engaging gameplay mechanics to create an addictive arcade-style experience. You must implement progressive difficulty systems, resource management, and varied enemy types while ensuring the game remains challenging yet fair.

### Learning Objective

By the end of this project, you will have implemented:

- A complete wave-based survival gameplay loop
- Complex AI behavior systems using UE5's Behavior Tree
- Resource and economy management systems
- Weapon and upgrade mechanics
- Progressive difficulty scaling
- Dynamic spawn management
- Interactive environment features
- Performance optimization for multiple AI entities

### Instructions

#### General Requirements

- Build a system capable of handling multiple AI entities simultaneously
- Implement different difficulty levels affecting AI behavior and capabilities
- Create smooth transitions between various AI states

> Mandatory: Use Behavior Trees for AI decision-making - Essential for creating complex, maintainable AI logic

> Mandatory: Implement Event Dispatchers for system communication - Ensures proper decoupling between systems

> Mandatory: Utilize Actor Components for modular implementation - Helps maintain clean, reusable code

#### Main Menu

The main menu must:

- Be a **separate level/map** - This ensures clean level management and faster loading
- Include the following options:

  - `Play Game`: Start a new game session
  - `Tutorial`: Interactive tutorial teaching basic mechanics - Should cover movement, combat, and points system
  - `Settings`: Open settings menu with customization options
  - `Quit`: Exit game

The Settings Menu must include:

- **Graphics**:

  - Resolution options - Support common resolutions and aspect ratios
  - Quality presets - Low, Medium, High, and Ultra settings that affect multiple parameters

- **Audio**:

  - Master volume
  - SFX volume - For weapon sounds, zombie noises, and environmental effects
  - Music volume - For background music

- **Controls**:

  - Mouse sensitivity - Separate X and Y axis options
  - Key bindings - Allow full key remapping

#### Game Screen (HUD)

The HUD must be clear and informative without being cluttered. Include:

- Core Information:

  - Current Wave Number
  - Points/Currency
  - Health and Armor
  - Active Power-ups - Clear timers and effect indicators

- Weapon Information:

  - Current Weapon
  - Ammo Count

- Interaction Prompts:

  - Purchase Costs - Clear display of prices near interactive elements
  - Action Prompts - Context-sensitive button prompts
  - Area Unlock Prices - Display when near locked doors

#### Player Systems

- **Character Core**:

  - First-person character with weapon viewmodels

  - Health and armor system:

    - Health regenerates slowly after no damage
    - Armor provides additional protection but doesn't regenerate

  - Movement mechanics:

    - Walking/Sprinting - Sprint uses stamina
    - Jumping/Mantling - Automatic ledge grab for small obstacles
    - Quick-turn (180-degree spin) - Fast escape mechanic

- **Weapon System**:

  - Multiple weapon types:

    - Starting Pistol - Infinite ammo but weak
    - Purchasable Weapons - Better stats but limited ammo
    - Special Weapons - Unique abilities and effects

  - Weapon mechanics:

    - Reload system - Interruptible reload animations
    - Upgrades - Purchasable improvements

- **Resource Management**:

  - Points system:

    - Kill rewards - Base points for normal kills
    - Headshot bonuses - Extra points for precision

  - Ammunition economy:

    - Limited capacity - Forces strategic weapon choices
    - Wall purchases - Reliable but expensive resupply
    - Max ammo power-ups - Rare but valuable finds

#### AI Systems

- **Checkpoint System**:

  - Basic Infected:

    - Walking behavior - Predictable but threatening in groups
    - Sprinting phases - Triggered by distance or health percentage
    - Attack patterns - Simple but effective melee attacks

  - Special Infected:

    - Special attacks - Telegraph dangerous moves
    - Enhanced movement - Unique navigation capabilities

- **AI States**:

  - Chase State:

    - Player pursuit - Effective pathfinding around obstacles
    - Obstacle navigation - Climbing and jumping where appropriate

  - Attack State:

    - Melee combat
    - Special abilities - Unique effects per enemy type

  - Death State:

    - Death animations
    - Resource drops - Random chance of power-ups

- **Behavior Systems**:

- Path finding - Dynamic obstacle avoidance
- Group coordination - Prevent AI crowding

#### Wave System

- **Wave Management**:

  - Progressive difficulty:

    - Enemy count scaling - More zombies per wave
    - Health increases - Tougher enemies over time
    - Speed adjustments - Slightly faster movement in later waves

  - Special enemy introduction - New types every few waves
  - Spawn management - Fair and challenging spawn distribution

- **Power-up System**:

  - Drop types:

    - Max Ammo - Refills all weapons
    - Double Points - Temporary point multiplier
    - Insta-Kill - One-shot kills
    - Nuke - Screen-clearing effect

  - Spawn logic - Based on wave number and player performance
  - Duration management - Clear visual and auditory cues

#### Level Design

Design a survival arena with:

- **Map Structure**:

  - Starting area - Easy zone
  - Unlockable zones - Progressively more dangerous areas
  - Kiting routes - Circular paths for kiting enemies
  - Mystery Box locations - Multiple possible spots

- **Interactive Elements**:

  - Purchase locations:

    - Wall weapons - Reliable but basic weapons
    - Mystery box - Random weapons
    - Door unlocks - Strategic progression choices
    - weapon upgrade - High-cost upgrade station

#### Game Loop

- **Core Loop**:

  - Wave start - Clear audio and visual indicators
  - Enemy spawning - Fair distribution of enemies
  - Player survival - Resource management during waves
  - Wave completion - Reward and preparation phase

- **Economy System**:

  - Point distribution - Instant feedback on points earned
  - Purchase system - Clear pricing and availability
  - Upgrade costs - Significant investments for power
  - Power-up effects - Impactful but temporary advantages

### Bonus

- Multiplayer Support:

  - Co-op gameplay - Up to 4 players
  - Revive system - Team-based survival

- Advanced Features:

  - Easter eggs - Hidden secrets and rewards
  - Secret weapons - Special unlock conditions

Enhanced AI:

- Dynamic difficulty - Adjusts to player skill
- Adaptive behavior - Learns from player patterns

### Submission

- You must upload a zip file of your game build and project files in your repository.
  - Ensure that the build works on your platform.
  - If file size is an issue, use GitHub with [Git LFS](https://docs.github.com/en/repositories/working-with-files/managing-large-files/about-large-files-on-github).

### Resources

- [UE5 AI](https://dev.epicgames.com/documentation/en-us/unreal-engine/artificial-intelligence-in-unreal-engine?application_version=5.5)
- [Fab for assets](https://fab.com/)
- [itch.io for additional assets](https://itch.io/)
