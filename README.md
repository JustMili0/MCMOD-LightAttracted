# LightAttracted
(Unfinished) Source code for unreleased mod (On Modrinth) "LightAttracted" for 1.19.2

I have no idea how to code in java so I'm putting it here for people to finish it (Credit will be given)

## LICENSE
Creative Commons Attribution 4.0 International

## MOD IDEA:
In a 128x128 block radius, if a monster entity (HostileEntity class) detects a light source producing light levels over 8, it'll go towards the light source.
When in a 16x16 radius of the light source, the monster entity will just behave as noraml but when it'll be outside of the radius, it comes back.
If the monster entity sees a player it'll no longer follow the follow-light instructions and will chase the player instead until the player is killed or out of follow distance of the monster entity; then it goes back to the nearest light source.

Purpose: So hostile entities realise that light = player so they'll come and attack the player
Mod should target all hostile entities, so it'll also apply to modded hostile entities.

Light sources:
- Torches
- Redstoen torches
- Redstone lamps
- Furnaces
- Blast furnaces
- Smokers
- Lanterns
- Soul lanterns

