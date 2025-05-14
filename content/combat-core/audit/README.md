> Due to file size reasons, the solution might be uploaded on GitHub instead of Gitea!

#### Main Menu

###### Is the main menu widget on a separate level/map?

###### Does the main menu contain a `Start Game` button that transitions to the combat arena?

###### Does the main menu contain a `Settings` button for adjusting input sensitivity and control schemes?

###### Does the main menu contain an `Exit Game` button to quit the game?

#### Player Character Integration

- **State Management**:

###### Is there a combat state machine that integrates with the existing locomotion system?

###### Do combat and movement states transition smoothly between each other?

###### Are invalid state combinations properly prevented?

###### Does movement speed appropriately adjust based on combat stance?

###### Does movement speed appropriately adjust based on equipment weight?

###### Does movement speed appropriately adjust based on action recovery?

###### Does movement speed appropriately adjust based on stamina state?

- **Animation Sets**:

###### Are combat stance animations implemented and working correctly?

###### Are attack animations implemented and working correctly?

###### Are defensive animations implemented and working correctly?

###### Are hit reaction animations implemented and working correctly?

###### Are death animations implemented and working correctly?

###### Do animations blend smoothly between different states?

#### Resource Management

###### Is there a functional stamina component attached to the character?

###### Does stamina deplete when performing combat actions?

###### Does stamina deplete when dodging?

###### Does stamina deplete when blocking?

###### Are actions properly prevented when stamina is depleted?

###### Does stamina regenerate based on the current character state?

#### Weapon System

- **Component Structure**:

###### Is there a component-based damage calculation system?

###### Is there a component-based hit detection system?

###### Are weapon collisions properly set up?

###### Are weapon visual effects implemented?

###### Are weapon sound effects implemented?

- **Equipment System**:

###### Are at least two different weapons implemented?

###### Do weapons properly interact with the animation system?

###### Can weapons be switched during gameplay?

#### Combat Mechanics

- **Attack System**:

###### Are proper trace channels used for hit detection?

###### Are hit effects generated on successful hits?

###### Are block effects generated on blocked hits?

###### Are miss effects generated on missed attacks?

###### Are different attack types supported?

###### Does the attack system work properly with animation montages?

- **Defense System**:

###### Is a dodging mechanic implemented? (e.g. dodge rolling, dashing, etc)

###### Is blocking implemented?

###### Are counter-attack opportunities available?

###### Does the defense system provide clear feedback?

#### Enemy AI

- **Perception and Behavior**:

###### Is the AIPerception system implemented for combat awareness?

###### Are behavior trees implemented for combat positioning?

###### Are behavior trees implemented for attack selection?

###### Are behavior trees implemented for defensive decisions?

- **Combat States**:

###### Does the AI have a functional passive state?

###### Does the AI have a functional aggressive state?

###### Does the AI have a functional defensive state?

###### Does the AI have a functional retreating state?

- **AI Features**:

###### Does the AI properly manage resources like stamina?

###### Does the AI use appropriate animation states?

###### Does the AI provide clear attack telegraphing?

###### Does the AI react appropriately to player actions?

#### HUD

###### Does the HUD display the player's health status?

###### Does the HUD display the stamina meter?

###### Does the HUD display equipment status?

###### Does the HUD display combat state indicators?

###### Does the HUD provide feedback for damage dealt/received?

###### Does the HUD provide feedback for resource consumption?

###### Does the HUD provide feedback for state changes?

#### Game Loop Logic

###### Does the game start with the player facing an opponent?

###### Are combat states managed properly throughout the gameplay?

###### Are victory conditions properly handled when opponent loses all HP?

###### Are defeat conditions properly handled when player loses all HP?

#### Level Design

###### Does the level have a coherent visual theme?

###### Is the combat arena properly bounded?

###### Are NavMeshes properly set up for AI navigation?

#### Bonus Features

###### +Are weapon arts implemented?

###### +Are special abilities implemented?

###### +Are finishing moves implemented?

###### +Is a status effects system implemented?

###### +Are environmental combat interactions implemented?

###### +Are execution animations implemented?

###### +Is a combo system implemented?
