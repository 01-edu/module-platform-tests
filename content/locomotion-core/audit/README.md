> Due to file size reason, the solution might be uploaded on GitHub instead of Gitea!

#### Main menu

###### Is the main menu widget on a separate level/map?

###### Does the main menu contain a Start Game button that transitions to the gameplay environment?

###### Does the main menu contain a Settings button for adjusting input sensitivity and key bindings?

###### Does the main menu contain a Quit button to exit the game?

#### HUD

###### Does the HUD display the current movement state (e.g., walking, running, climbing)?

###### Does the HUD display the player’s stamina in a visible meter?

###### Are action prompts displayed only when the player is near an interactable object (e.g., “Press E to Vault”)?

#### Player Character

- Movement and Transitions:

###### Can the player character walk, run, crouch, and remain idle based on input?

###### Are the movement transitions smooth, with no sudden changes in speed or animation?

###### Does crouching reduce movement speed and allow traversal through low obstacles?

###### Are acceleration and deceleration curves implemented to avoid sudden starts and stops?

- Animation Blending and State Machines:

###### Are state machines used to control movement transitions?

###### Are animations blended smoothly between different states? (For example, when stopping from a run, the character should transition smoothly to idle.)

###### Do animations reflect the current movement state (e.g., sprinting, climbing) without noticeable delays?

- Stamina System and Restrictions:

###### Does stamina decrease when performing actions like sprinting or climbing?

###### Are certain actions like sprinting disabled when stamina is depleted?

###### Does stamina regenerate gradually when the player is walking or idle?

###### Is the stamina meter always visible on the HUD?

- Context-Sensitive Actions:

###### Can the player vault over low obstacles and slide under narrow spaces while sprinting?

###### Are environmental interactions available only when the player is in the correct position?

###### Do HUD prompts appear when near interactable objects (e.g., “Press E to Vault”)?

###### Are vaulting and sliding mechanics fluid, without interrupting the player’s momentum?

- Inverse Kinematics (IK) and Realistic Movement:

###### Are IK nodes used to align the player’s feet with uneven surfaces (e.g., stairs, slopes)?

###### Are the character’s hands properly positioned on ledges or surfaces during interactions?

###### Does the character’s body dynamically adjust to the environment, avoiding awkward movements?

- Aim Offsets and Movement Posture:

###### Are aim offsets implemented to adjust the character’s aim direction while moving?

###### Does the aim remain smooth and accurate, even during movement transitions?

###### Are aim and movement animations blended together without conflicts?

#### Targets and Obstacles

###### Are obstacles such as waist-high walls implemented for vaulting?

###### Are slopes or narrow tunnels included for sliding mechanics?

###### Are climbable elements (e.g., ledges, ladders) present for climbing interactions?

###### Is uneven terrain used to demonstrate the character’s IK setup (e.g., stairs or hills)?

#### Game Loop Logic

###### Does the player need to manage stamina to perform actions effectively?

###### Do action prompts appear only when the player is near interactable objects?

###### Is there a pause menu available with the restart and return to main menu buttons?

###### Do the buttons function as expected? (`restart` restarting the level and `main menu` transitions the game back to the main menu.)

#### Level Design

###### Is the level designed to encourage exploration of all movement mechanics (vaulting, sliding, climbing)?

###### Does the level contain varied terrain (e.g., flat areas, stairs, slopes) to test the IK setup?

###### Are environmental cues (e.g., lighting, particles) used to highlight interactable areas?

#### Bonus

###### +Is there a swimming and diving system?

###### +Has a prone or rolling mechanic been added?

###### +Is there a rope or zipline system?

###### +Has a timed obstacle course or time-trial mode been implemented?

###### +Are there penalties for stamina depletion, such as stumbling or slower recovery?

###### +Do environmental conditions (e.g., ice, mud) affect movement speed and ability?
