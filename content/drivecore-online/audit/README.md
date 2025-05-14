> Due to file size reason, the solution might be uploaded on GitHub instead of Gitea!

#### General

###### Did the student build on top of their Vehicle-Physics project ?

- Features from the vehicle-physics project should be present while adding this project's requirements on top.

#### Main Menu

###### Is the main menu implemented on a separate level/map?

###### Does the main menu contain the following buttons:

- **Host Game**: Allows the player to create a multiplayer session.
- **Join Game**: Enables the player to search and connect to active sessions.
- **Settings**: Adjust input sensitivity, camera settings, and control schemes.
- **Quit**: Provides functionality to exit the game.

#### Game Screen (HUD)

###### Does the HUD display the following essential elements:

- Current speed and gear of the player's vehicle.
- Player names above vehicles for identification.
- Checkpoint progress, including the current checkpoint and remaining checkpoints.
- A connection status indicator (e.g., "Connected", "Disconnected").
- Current lap information (e.g., Lap 2/4).

#### Dynamic Lobby System

###### Does the lobby display connected players with their names and connection statuses?

###### Is there a text-based chat system for pre-race communication?

###### Does the lobby include a ready-up mechanic to allow all players to indicate readiness?

###### Can the host manually start the race only when all players are ready?

###### Is the transition from the lobby to the race level seamless for all connected players?

#### Racing

- **Checkpoint System**:

###### Are checkpoints placed throughout the track to guide players?

###### Are players required to pass through checkpoints sequentially to progress?

- **Finish Line**:

###### Does crossing the finish line trigger the end of the race when all checkpoints are cleared?

###### Are race results displayed, showing player positions and times?

#### Networking and Replication

- **Networking Setup**:

##### Launch the game and try to host a session.

##### Verify if the host player is also acting as the server (listen server) or if there's a separate dedicated server process

###### Is a listen server or dedicated server used for hosting games?

###### Are session management features implemented for:

- Hosting a game.
- Joining a game.

###### Are player vehicles spawned at designated positions with the server maintaining authority over critical game states?

- **Vehicle Replication**:

###### Are key vehicle properties replicated across all clients:

- Position, rotation, and velocity.
- Input states like steering, acceleration, braking, and boosts.

###### Are interpolation and client-side prediction implemented to reduce latency-induced jitter?

- **Player Interactions**:

###### Are collisions calculated on the server and results replicated to all clients?

###### Are boosts and drifts synchronized with visual/audio feedback replicated?

###### Does the server track damage and update HUD elements across all clients?

- **Checkpoint and Race State Replication**:

###### Is checkpoint progress validated and replicated to all clients?

###### Does the server track race completion and trigger a results screen with player positions and race times?

###### Are player positions dynamically updated based on checkpoint progress and proximity to the finish line?

- **Network Optimization**:

###### Are critical events (e.g., collisions) replicated using reliable replication?

###### Are frequent updates (e.g., position, rotation) replicated using unreliable replication?

###### Are latency compensation techniques, like interpolation and client-side prediction, implemented effectively?

#### Game Loop Logic

###### Does the game loop include a dynamic lobby for player preparation?

###### Are racing mechanics, including driving, boosting, drifting, and player interactions, fully functional?

###### Is checkpoint progression validated correctly?

###### Does the race end appropriately upon crossing the finish line, displaying results and resetting for the next session?

###### Is there a pause menu with an option to quit the session (without pausing the multiplayer game)?

#### Level Design

###### Does the racing track include the following elements:

- A variety of track types, such as straight roads, sharp turns, and off-road segments.
- Wide lanes that accommodate up to 4 vehicles simultaneously.
- Ramps or jumps to showcase air control mechanics.
- Obstacles and hazards (e.g., walls, barrels) to test collision handling.
- Clear visual markers for checkpoints and the finish line.

#### Bonus

###### +Is in-game voice chat implemented for real-time player communication?

###### +Is a spectator mode available to view other players after finishing the race or disconnecting?

###### +Does a matchmaking system exist to automate the grouping of players into lobbies?

###### +Is there a leaderboard system displaying race positions and player statistics (e.g., lap times, total wins)?

###### +Are advanced AI opponents present for competitive racing?
