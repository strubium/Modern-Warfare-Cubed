---
description: Creating custom skins for weapons in Modern Warfare Cubed
keywords:
  - skins
  - custom
  - mwc
  - modern
  - warfare
  - cubed
---

# Custom Skins

First thing's first, **how do we use it?**

This will depend on whether you're on Singleplayer or Multiplayer.

**Ensure your custom skins are images that fit in a 1:1 ratio (size of the image doesn't matter), and that they're `.png` files!**

## Singleplayer Use

*In order to use custom skins for singleplayer, it's actually really simple.*

- **Step 1:** Navigate to the MWC Configuration Directory (`.minecraft/config/mwc/`) and find a new folder called `skins`.
- **Step 2:** Drag-and-drop any custom skins you want (they must be `.png` files) inside there!
- **Step 3:** Go in-game and enjoy!

## Multiplayer Use

*Using this on Multiplayer is a little different and includes modifying a different file only available server-side, but I'll help you through it!*

- **Step 1:** Navigate to the MWC Configuration Directory (`./config/mwc/`) and find a new folder called `skins`.
- **Step 2:** Open the `skins.json` file (this file is ONLY AVAILABLE on the server! Not the client!)

**The default skins.json file should look like this:**

```json
{
  "skins": [
    "oldiepinkcamo"
  ]
}
```

- **Step 3:** Add the names of the custom skins that you want to use. For example: You're adding a skin called 'tornado'. You'd start by adding it to the `skins.json` file, like this!

```json
{
  "skins": [
    "oldiepinkcamo",
    "tornado"
  ]
}
```

- **Step 4:** Follow steps for "Singleplayer" for each skin added (ensure the files are all named in LOWERCASE, end with `.png`. Please note that these `.png` files DO NOT have to be added to the server.
- **Step 5:** Have fun! That's all there is to it!
