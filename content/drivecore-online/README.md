## Drivecore-Online

### Overview

In this project, you will expand your previous Vehicle-Physics project by implementing multiplayer networking mechanics in Unreal Engine 5. This system will allow players to interact in real-time, synchronizing vehicle movement, collisions, and physics-based interactions across a server-client architecture. The focus will be on creating a smooth, responsive, and consistent multiplayer experience while maintaining vehicle dynamics and game logic.

<center>
<img src="./resources/dm.jpg?raw=true" style="width: 500px !important; height: 350px !important;"/>
</center>

### Role Play

You are building a multiplayer vehicle simulation for a next-generation online racing game. Your task is to design a system that allows multiple players to interact with each other in real-time, synchronizing vehicle physics, collisions, and environmental interactions. You must ensure all players see consistent, smooth updates while handling network latency and replication efficiently.

### Learning Objective

By the end of this project, you will have implemented:

- A networked multiplayer system with server-client architecture.
- Vehicle movement, collisions, and physics replicated across all clients.
- Real-time player interactions, such as collisions, boosts, and drifts.
- A Dynamic Lobby System to prepare players before entering the game.
- A Race Mode with checkpoints, a finish line, and HUD updates.
- Session management, including player spawning and session join/host logic.
- Multiplayer game loop logic to create an engaging online experience.
- Network optimization techniques for smooth, lag-free gameplay.

### Instructions

#### General Requirements

- Build on top of the Vehicle-Physics project.
- Implement a functional server-client multiplayer system using Unreal Engine 5’s networking tools.
- Allow up to 4 players to connect, interact, and drive simultaneously.
- Synchronize vehicle physics, collisions, and HUD elements across all clients.

#### Main Menu

The game's main menu must:

- Be a separate `level/map`.
- Include the following options:
  - **Host Game**: Starts a server for other players to join.
  - **Join Game**: Allows players to search for and join active sessions.
  - **Settings**: Allows players to adjust input sensitivity, camera settings, and control schemes.
  - **Quit**: Closes the game.

#### Game Screen (HUD)

The game screen must include a HUD that displays:

- Current speed and gear of the player's vehicle.
- Player names displayed above each vehicle.
- Checkpoint progress: Current checkpoint number and remaining checkpoints.
- Connection status indicator (e.g., "Connected", "Disconnected").
- Current lap (e.g., 2/4).

#### Dynamic Lobby System

- **The lobby is a preparation area where players can**:

  - See Connected Players: Display player names and connection statuses.
  - Chat System: Simple text-based chat for communication before starting the game.
  - Ready Up Mechanic: The race starts only when all players are ready.

- **Lobby Flow**:
  - The host can start the race manually when all players are ready.
  - Transition to the race level occurs seamlessly for all connected clients.

#### Racing

- **Checkpoint System**:

  - Place checkpoints throughout the track to guide players.
  - Players must pass through checkpoints sequentially to progress.

- **Finish Line**:
  - Define a finish line that ends the race when all checkpoints are cleared.
  - Display results (e.g., player positions).

#### Networking and Replication

- **Networking Setup:**

  - Use a listen server or dedicated server for hosting games.
  - Implement session management:
    - `Host Game`: Starts a server and spawns players.
    - `Join Game`: Allows clients to find and connect to active sessions.
  - Spawn player vehicles at designated positions and ensure the server has authority over key game states.

- **Vehicle Replication:**

  - Replicate essential vehicle properties to ensure consistency across all clients:
    - `Position`, `Rotation`, and `Velocity`.
    - `Input States`: `Steering`, `acceleration`, `braking`, and `boosts`.
  - Local calculations:
  - `Interpolation`: Smooth player movement across the network to reduce jitter.
  - `Client-Side Prediction`: Locally predict vehicle movement for immediate responsiveness while waiting for server updates.

- **Player Interactions:**

  - Synchronize key mechanics and interactions across clients:
    - `Collisions`: The server calculates impacts and replicates results to all clients.
    - `Boosts and Drifts`: Replicate activation, speed changes, and visual/audio effects.
    - `Damage System`: Track damage on the server and replicate it to update player HUDs.

- **Checkpoint and Race State Replication:**

  - `Checkpoint Progress`: Validate player progress through checkpoints and replicate the current state to all clients.
  - `Race Completion`: Server tracks race results and triggers a results screen with player positions and race times.
  - `Position Tracking`: Update player positions dynamically based on checkpoint progress and proximity to the finish line.

- **Network Optimization:**
  - Use `reliable replication` for critical events (e.g., collisions) and `unreliable replication` for frequent updates (e.g., position).
  - Implement latency compensation with `interpolation` and `client-side prediction` to address network lag.

#### Game Loop Logic

The multiplayer game loop must include:

- `Dynamic Lobby`: Prepare players before transitioning to the race.
- `Racing Mechanics`: Drive, boost, drift, and interact with other players.
- `Checkpoint Progression`: Validate player progression through the track.
- `Race Completion`: End the race when the finish line is crossed, display results, and reset.
- `Pause Menu`: Players can access a pause menu to quit the session (the menu doesn't pause the multiplayer game).

#### Level Design

Design a multiplayer racing track :

- Include various track types, such as straight roads, sharp turns, and off-road segments.
- Wide lanes to support up to 4 vehicles.
- Add ramps or jumps to demonstrate air control.
- Place obstacles and hazards (e.g., walls, barrels) to test collision handling.
- Include visual markers for checkpoints and the finish line.

### Bonus

- `Voice Chat`: Implement in-game voice chat functionality for real-time player communication.
- `Spectator Mode`: Allow players to spectate other vehicles after finishing the race or disconnecting.
- `Matchmaking System`: Implement an automated matchmaking system that groups players into lobbies.
- `Leaderboard System`: Display real-time race positions and stats, such as player lap times and total wins, during multiplayer sessions.
- `Advanced AI Opponents`: Create AI-controlled vehicles for competitive racing.

### Submission

- You must upload a zip file of your game build and project files in your repository.
  - Ensure that the build works on your platform.
  - If file size is an issue, use GitHub with [Git LFS](https://docs.github.com/en/repositories/working-with-files/managing-large-files/about-large-files-on-github).

### Resources

- [UE5 Networking](https://dev.epicgames.com/documentation/en-us/unreal-engine/networking-overview-for-unreal-engine)
- [UE5 Online Subsystem](https://dev.epicgames.com/documentation/en-us/unreal-engine/online-subsystem-in-unreal-engine)
- [UE5 Multiplayer](https://dev.epicgames.com/documentation/en-us/unreal-engine/networking-and-multiplayer-in-unreal-engine)
- [SketchFab for 3D models](https://sketchfab.com/)
- [itch.io for additional assets](https://itch.io/)
