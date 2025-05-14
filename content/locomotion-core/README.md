## Locomotion-core

### Overview

In this project, you will create an advanced locomotion system in Unreal Engine 5 (UE5). The focus will be on enabling smooth and responsive movement mechanics, allowing players to navigate complex environments effortlessly. In previous projects, you established basic player controls, but refined movement mechanics are essential for creating engaging and polished gameplay. Now, we will push beyond the basics, exploring advanced locomotion elements such as state machines, context-sensitive actions, and inverse kinematics for a more immersive experience.

<center>
<img src="./resources/mvm.png?raw=true" style="width: 350px !important; height: 350px !important;"/>
</center>

### Role Play

You are building an advanced locomotion system for a next-generation action-adventure game. Players need to be able to move through a variety of terrain and environments fluidly, performing actions such as climbing, vaulting, crouching, and sliding. Your task is to ensure that the player’s movements feel natural and responsive, with seamless transitions between different movement states. Additionally, you will implement stamina management to balance the use of abilities and provide visual feedback to players via a HUD.

### Learning Objective

By the end of this project, you will have implemented:

- **Smooth transitions** between various movement states such as walking, running, crouching, and climbing.
- **Context-sensitive actions**, enabling the player to interact with the environment dynamically (e.g., vaulting over low walls or sliding under obstacles).
- A **stamina system** that impacts movement speed and action availability, requiring strategic use of abilities.
- Used **animation blending** techniques to transition between movement states seamlessly.
- **Inverse kinematics (IK)** to ensure realistic hand and foot placement while interacting with the environment.
- **Acceleration and deceleration curves** to make player movement feel fluid and lifelike.
- **Aim offsets**, adjusting the character’s aim based on movement direction and posture.
- A **state machine** to manage different movement modes (e.g., idle, running, or climbing).
- A **HUD** that displays movement status, stamina levels, and action prompts for contextual actions.
- A **test environment** with various terrain types and interactive obstacles to showcase the full range of locomotion mechanics.

### Instructions

#### General Requirements

- Use either Blueprints or C++ to develop the locomotion mechanics.
- Implement smooth and responsive controls to ensure seamless transitions between different movement states.
- Create context-sensitive actions that allow the player to interact with the environment, such as climbing walls or sliding under barriers.
- Develop a stamina system that reduces movement speed and restricts actions when stamina is depleted.
- Design a test level with diverse terrain and obstacles (e.g., walls to vault over, slopes to slide down) to demonstrate the locomotion system effectively.

#### Main Menu

The game's main menu must:

- Be a separate `level/map`.
- Include the following options:
  - **Start Game**: Transitions to the firing range gameplay.
  - **Settings**: Allows players to adjust input sensitivity and key bindings.
  - **Quit**: Closes the game.

#### Game Screen (HUD)

The game screen must include a HUD that displays:

- Current movement speed and state (walking, running, climbing, etc.).
- Stamina meter showing remaining stamina for actions.
- Action prompts indicating context-sensitive options (e.g., "Press E to Climb").

#### Player Character

The player character is the most critical part of this project. The character must feel responsive and provide a smooth gameplay experience. It should support multiple movement states, environmental interactions, and stamina management while maintaining realistic animations and proper alignment with the environment.

- Player Movement and Transitions:

  - The player must be able to walk, run, crouch, and remain idle based on input.
  - Movement transitions must be smooth, without abrupt changes in speed or animation.
  - Sprinting should allow faster movement but deplete stamina gradually. When stamina is depleted, the player must no longer be able to sprint.
  - Crouching should reduce movement speed and allow the player to traverse low obstacles or narrow spaces.
  - Acceleration and deceleration curves must be implemented to avoid sudden starts and stops.

- Animation Blending and State Machines:

  - Use a state machine to control the transitions between idle, walking, running, and crouching states.
  - Ensure that animation blending occurs between each state to maintain fluidity. For example, when stopping from a run, the character should transition smoothly to idle.
  - Movement animations must reflect the character’s current state, and there should be no noticeable delays when switching between them.

- Stamina System and Movement Restrictions:

  - Implement a stamina system that decreases while sprinting or performing actions (jumping, climbing, etc).
  - Once stamina reaches zero, certain actions (such as sprinting) must become unavailable until stamina regenerates.
  - Stamina must regenerate gradually when the player is walking or idle.
  - The HUD must display a visible stamina meter, showing the remaining stamina at all times.

- Context-Sensitive Actions:

  - The player must be able to vault over low obstacles and slide under narrow spaces while sprinting.
  - Interactions with the environment (like vaulting) must only be available when the player is in the appropriate position.
  - Prompts on the HUD must appear to notify the player of available interactions (e.g., "Press E to Vault").
  - Actions must not interrupt the flow of movement, vaulting and sliding must feel like extensions of the player’s momentum.

- Inverse Kinematics (IK) and Realistic Movement:

  - IK nodes must be used to align the player’s feet with uneven terrain (e.g., stairs, slopes).
  - Hands must be properly positioned on surfaces when climbing or interacting with ledges.
  - The character’s limbs must adjust dynamically to the environment without awkward movements or misalignments.

- Aim Offsets and Movement Posture

  - Aim offsets must adjust the character’s aim direction based on the mouse position.
  - The aim must remain accurate and smooth, even while transitioning between different movement states.
  - Aim and movement animations must blend together without conflicts, ensuring that the player feels in control at all times.

#### Targets and Obstacles

You must include several elements to challenge the player’s movement abilities:

- obstacles: Waist-high walls for vaulting.
- Narrow tunnels and slopes: For sliding mechanics.
- Climbable elements: Ledges or ladders for climbing interactions.
- Uneven terrain: Stairs or hills to demonstrate inverse kinematics.

#### Game Loop Logic

The game loop must include:

- Player Movement: The player starts in the test environment and can use all available movement mechanics.
- Stamina Management: The player must manage stamina to avoid running out during movement or interactions.
- Contextual Actions: Action prompts appear only when the player is near an interactable object.
- Pause Menu: The player can open a pause menu at any time with options to:
  - Restart: Reset stamina and environment.
  - Return to Main Menu.

#### Level Design

Design a test level that emphasizes movement exploration:

- Create sections with stationary and interactive obstacles to demonstrate the different movement mechanics (vaulting, sliding, climbing).
- Incorporate varied terrain (e.g., flat areas, stairs, and slopes) to test the inverse kinematics setup.
- Use environmental cues such as lighting and particle effects to draw attention to interactable areas.
- Place obstacles throughout the environment to encourage players to experiment with different movements.

### Bonus

- Swimming and Diving Integration: Add underwater movement with distinct mechanics for swimming, diving, and resurfacing, requiring stamina management.
- Prone and Rolling Mechanics: Add the ability to go prone or perform rolls to avoid obstacles or enemies, integrating them smoothly into the movement system.
- Rope or Zipline Mechanics: Add ropes or ziplines that the player can grab onto mid-air, extending the vertical movement possibilities.
- Time Trials: Add a timed obstacle course.
- Exhaustion Penalties: If stamina is completely depleted, introduce penalties such as stumbling, delayed reactions, or slower recovery.
- Environmental Interaction States: Create systems where different surfaces (ice, mud) affect movement by slowing or speeding the player, requiring adaptability.

### Submission

- You must upload a zip file of your game build and project files in your repository.
  - Ensure that the build works on your platform.
  - If file size is an issue, use GitHub with [Git LFS](https://docs.github.com/en/repositories/working-with-files/managing-large-files/about-large-files-on-github).

### Resources

- [UE5 Character movement component](https://dev.epicgames.com/documentation/en-us/unreal-engine/setting-up-character-movement)
- [Mixamo for character animations and models](https://www.mixamo.com/)
- [SketchFab for 3D models](https://sketchfab.com/)
- [itch.io for additional assets](https://itch.io/)
