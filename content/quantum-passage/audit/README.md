> Due to file size reason, the solution might be uploaded on GitHub instead of Gitea!

#### Main Menu

###### Is the main menu widget on a separate level/map?

###### Does the main menu contain a Play Game button that transitions to the test chambers?

###### Does the main menu contain a Level Select button that allows access to completed chambers?

###### Does the main menu contain a Settings button for adjusting graphics, audio, and controls?

###### Does the main menu contain a Quit button to exit the game?

#### HUD

###### Does the HUD display portal status indicators?

###### Does the HUD show portal placement guides on valid surfaces?

###### Does the HUD display the current test chamber number?

###### Are object interaction prompts displayed when near interactable elements?

###### Is there a pause menu with options to restart or return to main menu?

###### Do the buttons function as expected? (`restart` restarting the chamber and `main menu` transitions the game back to the main menu.)

#### Portal System

- Portal Creation and Placement:

###### Can the player create exactly two portals (entry and exit)?

###### Do portals only appear on valid, flat surfaces of appropriate size?

###### Are portals prevented from being placed on moving objects or invalid materials?

###### Do portal edges have distinct colored glows matching their type (entry/exit)?

- Portal Visualization:

###### Do portals show accurate real-time views of their linked destinations?

###### Are portal effects implemented using Custom Post Process effects?

###### Is the recursive portal view limited to 3 iterations for performance?

###### Does the game maintain 60 FPS with two portals in view of each other?

- Physics and Interactions:

###### Is momentum preserved when passing through portals relative to their orientation?

###### Do objects maintain their physical properties and state when passing through portals?

###### Can the system handle at least 5 physics objects through portals simultaneously?

###### Are "infinite falls" and recursive portal physics handled correctly?

#### Player Systems

- Character Movement:

###### Is the first-person movement smooth and responsive?

###### Does the portal gun have appropriate view model animations?

###### Is physics-based movement through portals implemented correctly?

###### Can the player pick up and manipulate physics objects?

#### Puzzle Elements

- Environmental Objects:

###### Are standard physics cubes implemented and functioning?

###### Do energy cubes properly power mechanisms when placed in receptacles?

###### Do buttons activate when pressed?

###### Do pressure plates stay activated only while weight is applied?

- Energy Fields:

###### Do barrier fields block movement but allow portal shots?

###### Are light bridges solid and walkable?

###### Do tractor beams move objects along their defined paths?

#### Level Design

###### Are test chambers self-contained with clear entrances and exits?

###### Do tutorial chambers introduce one mechanic at a time?

###### Are visual guides present to help players understand new mechanics?

###### Do later chambers combine multiple mechanics in logical ways?

#### Game Loop Logic

###### Does completing a chamber allow progress to the next one?

###### Are chambers accessed through the level select menu once completed?

#### Bonus

###### +Has co-op puzzle mode been implemented?

###### +Is there a custom test chamber creator?

###### +Has a speed run mode been added?

###### +Is there an achievement system?

###### +Has a simple time dilation field been implemented?

###### +Are there environmental hazards?
