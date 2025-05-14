## Quantum-Passage

### Overview

In this advanced project, you will create a first-person puzzle game focused on portal mechanics using Unreal Engine 5. You'll implement a sophisticated portal system that allows players to create interconnected gateways to solve environmental puzzles. The project combines precise physics calculations with creative level design to create an engaging puzzle-solving experience that challenges spatial reasoning.

<center>
<img src="./resources/qp.jpg?raw=true" style="width: 500px !important; height: 350px !important;"/>
</center>

### Role Play

You are a gameplay programmer at an innovative game studio tasked with creating an engaging puzzle game that challenges conventional physics. Your mission is to develop a system where players can create interconnected portals to solve intricate environmental puzzles. You must ensure that the portal mechanics remain precise and intuitive while providing players with increasingly challenging scenarios.

### Learning Objective

By the end of this project, you will have implemented:

- A robust portal system with seamless transitions and physics preservation
- Advanced physics interactions between portals and objects
- Environmental puzzle elements that utilize portal mechanics
- Progressive difficulty scaling through level design
- Precise player movement and interaction systems
- Performance optimization for portal rendering
- Complex level streaming for multi-room puzzles

### Instructions

#### General Requirements

- Build a system capable of handling two active portals simultaneously
- Implement physics-based interactions through portals
- Create smooth transitions between portal traversal

> Mandatory: Use Custom Post Process effects for portal visualization - Essential for creating convincing portal effects

> Mandatory: Implement Event Dispatchers for system communication - Ensures proper decoupling between systems

> Mandatory: Utilize Actor Components for modular implementation - Helps maintain clean, reusable code

#### Main Menu

The main menu must:

- Be a **separate level/map**
- Include the following options:

  - `Play Game`: Start a new game session
  - `Level Select`: Access completed test chambers
  - `Settings`: Open settings menu with customization options
  - `Quit`: Exit game

The Settings Menu must include:

- **Graphics**:

  - Resolution options
  - Quality presets
  - Post-process effects intensity

- **Audio**:

  - Master volume
  - SFX volume
  - Music volume

- **Controls**:
  - Mouse sensitivity
  - Key bindings

#### Game Screen (HUD)

The HUD must be minimalistic and informative:

- Portal status indicators
- Portal placement guides
- Current test chamber number
- Object interaction prompts

- Pause Menu: The player can open a pause menu at any time with options to:
  - Restart: Restart the level.
  - Return to Main Menu.

#### Player Systems

- **Character Core**:

  - First-person character with smooth movement
  - Portal gun viewmodel with simple animations
  - Physics-based movement through portals
  - Object pickup and manipulation system

#### Portal Mechanics

- **Portal Creation**:

  - Two-portal limit:

    - Entry portal (color 1)
    - Exit portal (color 2)

  - Surface detection:

    - Only flat, portal-sized surfaces can accept portals. Portals cannot be placed on moving objects or invalid materials.

  - Visual effects:
    - Portals must show a real-time view of their linked destination. The portal edges should have a distinct glow matching their color (blue/orange).

- **Portal Physics**:

  - Momentum preservation:

    - Objects maintain velocity and direction relative to exit portal orientation. Example: Falling into a floor portal facing a wall will convert downward momentum into forward momentum.

  - Portal-to-portal interactions:
    - Portals must handle "infinite falls" and recursive views correctly. Objects passing through multiple portals must maintain consistent physics.

#### Puzzle Elements

- **Environmental Objects**:

  - Cubes:

    - Standard physics cubes
    - Energy cubes:
      - Special cubes that power mechanisms. When placed in receptacles, they activate connected devices like bridges or lifts.

  - Buttons:

    - Devices that activate when pressed.

  - Pressure Plates:

    - Weight-sensitive devices that stay activated only while an object or player remains on them.

  - Energy Fields:
    - Barrier fields: Transparent walls that block movement but not portal shots
    - Bridge emitters: Create solid light bridges that can be walked on
    - Tractor beams: Directional fields that move objects along a fixed path

#### Level Design

Design test chambers that progressively introduce and combine mechanics:

- **Chamber Structure**:

  - Each chamber must be a self-contained puzzle room with a clear entrance and exit. Chambers should not require precise timing or "trick shots" to complete.

- **Progressive Complexity**:

  - Tutorial chambers must introduce one mechanic at a time with clear visual guides. Later chambers can combine multiple mechanics but must remain logically solvable.

- **Performance Requirements**:

  - Portal rendering:

    - Portals must maintain 60 FPS when two portals are in view of each other. Recursive portal views should be limited to 3 iterations for performance.

  - Physics calculations:
    - The game must handle at least 5 physics objects passing through portals simultaneously without performance drops.

### Bonus

- **Advanced Features**:

  - Co-op puzzle mode
  - Custom test chamber creator
  - Speed run mode
  - Achievement system

- **Enhanced Mechanics**:

  - Simple time dilation field
  - Environmental hazards

### Submission

- You must upload a zip file of your game build and project files in your repository.
  - Ensure that the build works on your platform.
  - If file size is an issue, use GitHub with [Git LFS](https://docs.github.com/en/repositories/working-with-files/managing-large-files/about-large-files-on-github).

### Resources

- [UE5 Post Process Effects](https://dev.epicgames.com/documentation/en-us/unreal-engine/post-process-effects-in-unreal-engine)
- [UE5 Physics](https://dev.epicgames.com/documentation/en-us/unreal-engine/physics-in-unreal-engine)
- [Fab for assets](https://fab.com/)
- [itch.io for additional assets](https://itch.io/)
