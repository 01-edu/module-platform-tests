> Due to file size reason, the solution might be uploaded on GitHub instead of Gitea!

#### General

###### Does the system handle multiple AI entities simultaneously with proper performance?

###### Are different difficulty levels implemented and do they meaningfully affect AI behavior?

###### Are transitions between AI states smooth and logical?

###### Are the mandatory technical requirements implemented properly:

- Behavior Trees for AI decision-making
- Event Dispatchers for system communication
- Actor Components for modular implementation

#### Main Menu

###### Is the main menu implemented on a separate level/map?

###### Does the main menu contain all required buttons:

- **Play Game**: Starts a new game session with proper initialization
- **Tutorial**: Provides interactive gameplay instructions
- **Settings**: Opens settings menu with all options
- **Quit**: Properly exits the game

###### Does the Settings menu include all required options:

- **Graphics**:
  - Resolution options with proper aspect ratios
  - Quality presets affecting appropriate parameters
- **Audio**:
  - Master volume control
  - SFX volume with proper sound categorization
  - Music volume separate from effects
- **Controls**:
  - Mouse sensitivity with separate X/Y axis control
  - Full key rebinding functionality

#### Game Screen (HUD)

###### Does the HUD display all required core information:

- Current Wave Number
- Points/Currency
- Health and Armor
- Active Power-ups with timers

###### Is weapon information clearly displayed:

- Current Weapon selection
- Ammo Count (current/reserve)

###### Are interaction prompts clear and contextual:

- Purchase Costs for items and areas
- Action Prompts for interactions
- Area Unlock Prices when near locked doors

#### Player Systems

###### Is the character system implemented with all required features:

- First-person character with visible weapon models
- Functional health and armor system
- All movement mechanics:
  - Walking/Sprinting with stamina system
  - Jumping/Mantling with proper collision
  - Quick-turn functionality

###### Is the weapon system complete with:

- All required weapon types:
  - Starting Pistol (infinite ammo)
  - Purchasable Weapons
  - Special Weapons
- Complete weapon mechanics:
  - Interruptible reload animations
  - Upgrade system

###### Is the resource management system properly implemented:

- Points system with:
  - Base kill rewards
  - Headshot bonus points
- Ammunition system with:
  - Limited ammo capacity
  - Wall purchase functionality
  - Power-up integration

#### AI Systems

###### Are both infected types properly implemented:

- Basic Infected with:
  - Walking and sprinting behaviors
  - Proper attack patterns
  - Group behavior
- Special Infected with:
  - Unique attack patterns
  - Enhanced movement capabilities
  - Special abilities

###### Do all AI states function correctly:

- Chase State behaviors
- Attack State mechanics
- Death State with proper animations and drops

###### Are the behavior systems functioning as intended:

- Pathfinding with proper obstacle avoidance
- Group coordination preventing AI crowding
- Target selection and prioritization

#### Wave System

###### Is wave management implemented with proper progression:

- Enemy count scaling per wave
- Health and speed scaling
- Special enemy introduction at appropriate intervals
- Fair spawn distribution

###### Does the power-up system include all features:

- All required power-up types:
  - Max Ammo functionality
  - Double Points timer
  - Insta-Kill effects
  - Nuke activation
- Proper spawn logic
- Clear duration indicators

#### Level Design

###### Does the map include all required areas and features:

- Starting area with basic resources
- Unlockable zones with proper progression
- Kiting routes with appropriate spacing
- Mystery Box locations with proper accessibility

###### Are all interactive elements properly implemented:

- Wall weapons with proper pricing
- Mystery box functionality
- Door unlock system
- Weapon upgrade station

#### Game Loop

###### Is the core gameplay loop properly implemented:

- Wave start with clear indicators
- Enemy spawning with fair distribution
- Survival mechanics working properly
- Wave completion with proper rewards

###### Does the economy system function correctly:

- Point distribution and display
- Purchase system functionality
- Upgrade pricing and effects
- Power-up activation and duration

#### Bonus

###### +Is multiplayer support implemented correctly:

- Co-op gameplay up to 4 players
- Functional revive system

###### +Are advanced features present and functional:

- Easter eggs with proper triggers
- Secret weapons with unlock conditions

###### +Is enhanced AI implemented properly:

- Dynamic difficulty adjustment
- Adaptive behavior patterns
