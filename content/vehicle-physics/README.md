## Vehicle-Physics

### Overview

In this project, you will create a realistic vehicle physics system in Unreal Engine 5. This system will simulate driving mechanics, collision handling, and physics-based interactions. The focus will be on creating a smooth and responsive driving experience with customizable controls, realistic handling, and environmental interactions. This project will push your understanding of UE5 physics systems, animation blueprints, and player input systems.

<center>
<img src="./resources/cm1.jpg?raw=true" style="width: 500px !important; height: 350px !important;"/>
</center>

### Role Play

You are building a physics-driven vehicle simulation for a next-generation racing or open-world adventure game. Your task is to design a vehicle system that handles various terrains, responds realistically to player input, and incorporates advanced features such as suspension, acceleration curves, and drift mechanics. Your vehicle must also provide clear feedback to players via an on-screen HUD.

### Learning Objective

By the end of this project, you will have implemented:

- Vehicle setup with suspension, wheel configurations, and engine torque curves.
- Physics-based controls for acceleration, braking, steering, and drifting.
- Environmental interaction, such as collision detection, terrain responsiveness, and tire friction settings.
- HUD elements to display vehicle speed, gear, and damage status.
- Customizable input settings for smooth and intuitive player controls.
- Collision handling with visual and auditory feedback for impacts.
- Terrain adaptation, simulating different driving surfaces like asphalt, dirt, and sand.
- Advanced vehicle dynamics, including drifting, boosting, and air movement (e.g., ramps or jumps).
- Test environment with various track types and obstacles to showcase the system.

### Instructions

#### General Requirements

- Use either Blueprints or C++ to develop the vehicle physics system.
- Implement realistic physics and controls for a smooth driving experience.
- Create environmental interactions, including varying traction and collision effects.
- Build a test level with diverse track types and obstacles (e.g., ramps, sharp turns, uneven terrain).

#### Main Menu

The game's main menu must:

- Be a separate `level/map`.
- Include the following options:
  - **Start Game**: Transitions to the driving simulation.
  - **Settings**: Allows players to adjust input sensitivity, camera settings, and control schemes.
  - **Quit**: Closes the game.

#### Game Screen (HUD)

The game screen must include a HUD that displays:

- Current speed.
- Active gear (e.g., "1st", "Reverse").
- Damage meter indicating vehicle condition.
- Context-sensitive action prompts (e.g., "Press Shift for Boost").

#### Vehicle Setup

The player vehicle is the core of this project. It must feel responsive and provide an engaging driving experience with realistic handling and controls.

- **Vehicle Physics**:

  - Configure a physics-based vehicle with proper mass distribution and suspension:
    - Mass should be distributed appropriately to prevent instability during cornering and uneven terrain navigation.
    - Suspension must account for vehicle weight, ensuring it absorbs shocks and maintains ground contact.
  - Develop engine torque and acceleration curves:
    - Implement a simple acceleration system with linear or slightly curved torque delivery.
    - Basic torque adjustment for smooth power delivery across gears.
  - Braking force must allow for smooth and consistent deceleration:
    - Integrate braking that respects the vehicle’s momentum while preventing abrupt stops.
  - Steering mechanics should scale based on speed:
    - At lower speeds, steering should be tighter, while at higher speeds, it should feel progressively less sensitive.

- **Terrain Adaptation**:

  - Tire Friction:
    - Define basic tire behavior for 3 surface types, such as asphalt, dirt, and sand.
    - Friction should dynamically adjust to represent realistic grip levels, with the car slowing down or sliding more on slippery surfaces.
  - Suspension and Ground Interaction:
    - Suspension must dynamically respond to basic terrain types, allowing for smooth transitions between surfaces like bumps and slopes.
    - Suspension should compress appropriately when driving over sharp dips or jumps, maintaining contact with the ground.
  - Surface Feedback:
    - Add simple visual cues, such as skid marks for asphalt and dust clouds for dirt and sand.
    - auditory feedback should change based on terrain type, reflecting different surface interactions like tire squeals on asphalt or crunching sounds on dirt.

- **Collision Handling**:

  - Collision Physics:
    - Impacts must produce basic responses such as bouncing, stopping, or sliding based on the collision angle and intensity.
    - Collisions at different speeds and angles should influence the car’s behavior, such as spinning/flipping when hit from the side or losing speed when crashing head-on.

- **Advanced Features**:

  - Drifting:
    - Implement a basic drift mechanic that allows players to perform controlled slides during sharp turns.
    - Drifting must balance steering and throttle inputs to maintain momentum.
  - Boost Mechanics:
    - Introduce a simple boost feature that temporarily increases the vehicle’s speed.
    - Boost effects should interact with existing physics systems, temporarily impacting acceleration and steering.
    - Boosting should give the player visual and auditory feedback.
  - Jumps and Ramps:
    - Vehicles must maintain momentum when hitting ramps, with smooth transitions into and out of the air.
    - Jumping at improper angles or speeds should lead to natural consequences, such as flipping over or landing off-track.

- **Crashing**:

  - Vehicle damage should accumulate when the car collides with the environment:
    - Each collision should add damage to the vehicle, with handling and speed progressively worsening as damage increases.
  - When the vehicle's damage reaches a critical threshold:
    - A crash sequence should be triggered, during which the car is destroyed.
    - The vehicle should then respawn near the crash location, allowing the player to continue driving.

#### Game Loop Logic

The game loop must include:

- `Driving Mechanics`: Players can accelerate, brake, steer, drift, and boost through the test environment.
- `Environmental Interaction`: The vehicle must respond dynamically to different terrains and obstacles.
- `Damage System`: The player must manage vehicle health to avoid critical damage.
- `Pause Menu`: Players can access a pause menu to restart the level or return to the main menu.

#### Level Design

Design a test level that showcases the vehicle system’s capabilities:

- Include various track types, such as straight roads, sharp turns, and off-road segments.
- Add ramps or jumps to demonstrate air control.
- Place obstacles and hazards (e.g., walls, barrels) to test collision handling.
- Use visual cues (e.g., cones, barriers) to guide players through the track.

### Bonus

- `Dynamic Weather`: Add rain or snow effects that impact vehicle handling.
- `Custom Vehicle Tuning`: Allow players to adjust suspension stiffness, tire friction, or engine torque.
- `Time Trials`: Add a timer for players to complete the course as fast as possible.
- `Advanced AI Opponents`: Create AI-controlled vehicles for competitive racing.
- `Replay System`: Allow players to view a replay of their drive with cinematic camera angles.

### Submission

- You must upload a zip file of your game build and project files in your repository.
  - Ensure that the build works on your platform.
  - If file size is an issue, use GitHub with [Git LFS](https://docs.github.com/en/repositories/working-with-files/managing-large-files/about-large-files-on-github).

### Resources

- [UE5 Physics](https://dev.epicgames.com/documentation/en-us/unreal-engine/physics-in-unreal-engine)
- [SketchFab for 3D models](https://sketchfab.com/)
- [itch.io for additional assets](https://itch.io/)
