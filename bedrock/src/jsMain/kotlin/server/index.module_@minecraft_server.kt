@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:JsModule(import = "@minecraft/server")
package net.teaclient.anti.server


import tsstdlib.Generator
import tsstdlib.Record
import kotlin.js.*

external enum class BlockComponentTypes {
    Inventory /* = 'minecraft:inventory' */,
    LavaContainer /* = 'minecraft:lavaContainer' */,
    Piston /* = 'minecraft:piston' */,
    PotionContainer /* = 'minecraft:potionContainer' */,
    RecordPlayer /* = 'minecraft:recordPlayer' */,
    Sign /* = 'minecraft:sign' */,
    SnowContainer /* = 'minecraft:snowContainer' */,
    WaterContainer /* = 'minecraft:waterContainer' */
}


external enum class BlockPistonState {
    Expanded /* = 'Expanded' */,
    Expanding /* = 'Expanding' */,
    Retracted /* = 'Retracted' */,
    Retracting /* = 'Retracting' */
}


external enum class BlockVolumeIntersection {
    Disjoint /* = 0 */,
    Contains /* = 1 */,
    Intersects /* = 2 */
}


external enum class CompoundBlockVolumeAction {
    Add /* = 0 */,
    Subtract /* = 1 */
}


external enum class CompoundBlockVolumePositionRelativity {
    Relative /* = 0 */,
    Absolute /* = 1 */
}


external enum class Difficulty {
    Peaceful /* = 0 */,
    Easy /* = 1 */,
    Normal /* = 2 */,
    Hard /* = 3 */
}


external enum class Direction {
    Down /* = 'Down' */,
    East /* = 'East' */,
    North /* = 'North' */,
    South /* = 'South' */,
    Up /* = 'Up' */,
    West /* = 'West' */
}


external enum class DisplaySlotId {
    BelowName /* = 'BelowName' */,
    List /* = 'List' */,
    Sidebar /* = 'Sidebar' */
}


external enum class DyeColor {
    Black /* = 'Black' */,
    Blue /* = 'Blue' */,
    Brown /* = 'Brown' */,
    Cyan /* = 'Cyan' */,
    Gray /* = 'Gray' */,
    Green /* = 'Green' */,
    LightBlue /* = 'LightBlue' */,
    Lime /* = 'Lime' */,
    Magenta /* = 'Magenta' */,
    Orange /* = 'Orange' */,
    Pink /* = 'Pink' */,
    Purple /* = 'Purple' */,
    Red /* = 'Red' */,
    Silver /* = 'Silver' */,
    White /* = 'White' */,
    Yellow /* = 'Yellow' */
}


external enum class EasingType {
    InBack /* = 'InBack' */,
    InBounce /* = 'InBounce' */,
    InCirc /* = 'InCirc' */,
    InCubic /* = 'InCubic' */,
    InElastic /* = 'InElastic' */,
    InExpo /* = 'InExpo' */,
    InOutBack /* = 'InOutBack' */,
    InOutBounce /* = 'InOutBounce' */,
    InOutCirc /* = 'InOutCirc' */,
    InOutCubic /* = 'InOutCubic' */,
    InOutElastic /* = 'InOutElastic' */,
    InOutExpo /* = 'InOutExpo' */,
    InOutQuad /* = 'InOutQuad' */,
    InOutQuart /* = 'InOutQuart' */,
    InOutQuint /* = 'InOutQuint' */,
    InOutSine /* = 'InOutSine' */,
    InQuad /* = 'InQuad' */,
    InQuart /* = 'InQuart' */,
    InQuint /* = 'InQuint' */,
    InSine /* = 'InSine' */,
    Linear /* = 'Linear' */,
    OutBack /* = 'OutBack' */,
    OutBounce /* = 'OutBounce' */,
    OutCirc /* = 'OutCirc' */,
    OutCubic /* = 'OutCubic' */,
    OutElastic /* = 'OutElastic' */,
    OutExpo /* = 'OutExpo' */,
    OutQuad /* = 'OutQuad' */,
    OutQuart /* = 'OutQuart' */,
    OutQuint /* = 'OutQuint' */,
    OutSine /* = 'OutSine' */,
    Spring /* = 'Spring' */
}


external enum class EnchantmentSlot {
    ArmorFeet /* = 'ArmorFeet' */,
    ArmorHead /* = 'ArmorHead' */,
    ArmorLegs /* = 'ArmorLegs' */,
    ArmorTorso /* = 'ArmorTorso' */,
    Axe /* = 'Axe' */,
    Bow /* = 'Bow' */,
    CarrotStick /* = 'CarrotStick' */,
    CosmeticHead /* = 'CosmeticHead' */,
    Crossbow /* = 'Crossbow' */,
    Elytra /* = 'Elytra' */,
    FishingRod /* = 'FishingRod' */,
    Flintsteel /* = 'Flintsteel' */,
    Hoe /* = 'Hoe' */,
    Pickaxe /* = 'Pickaxe' */,
    Shears /* = 'Shears' */,
    Shield /* = 'Shield' */,
    Shovel /* = 'Shovel' */,
    Spear /* = 'Spear' */,
    Sword /* = 'Sword' */
}


external enum class EntityComponentTypes {
    AddRider /* = 'minecraft:addrider' */,
    Ageable /* = 'minecraft:ageable' */,
    Breathable /* = 'minecraft:breathable' */,
    CanClimb /* = 'minecraft:can_climb' */,
    CanFly /* = 'minecraft:can_fly' */,
    CanPowerJump /* = 'minecraft:can_power_jump' */,
    Color /* = 'minecraft:color' */,
    Color2 /* = 'minecraft:color2' */,
    Equippable /* = 'minecraft:equippable' */,
    FireImmune /* = 'minecraft:fire_immune' */,
    FloatsInLiquid /* = 'minecraft:floats_in_liquid' */,
    FlyingSpeed /* = 'minecraft:flying_speed' */,
    FrictionModifier /* = 'minecraft:friction_modifier' */,
    GroundOffset /* = 'minecraft:ground_offset' */,
    Healable /* = 'minecraft:healable' */,
    Health /* = 'minecraft:health' */,
    Inventory /* = 'minecraft:inventory' */,
    IsBaby /* = 'minecraft:is_baby' */,
    IsCharged /* = 'minecraft:is_charged' */,
    IsChested /* = 'minecraft:is_chested' */,
    IsDyeable /* = 'minecraft:is_dyeable' */,
    IsHiddenWhenInvisible /* = 'minecraft:is_hidden_when_invisible' */,
    IsIgnited /* = 'minecraft:is_ignited' */,
    IsIllagerCaptain /* = 'minecraft:is_illager_captain' */,
    IsSaddled /* = 'minecraft:is_saddled' */,
    IsShaking /* = 'minecraft:is_shaking' */,
    IsSheared /* = 'minecraft:is_sheared' */,
    IsStackable /* = 'minecraft:is_stackable' */,
    IsStunned /* = 'minecraft:is_stunned' */,
    IsTamed /* = 'minecraft:is_tamed' */,
    Item /* = 'minecraft:item' */,
    LavaMovement /* = 'minecraft:lava_movement' */,
    Leashable /* = 'minecraft:leashable' */,
    MarkVariant /* = 'minecraft:mark_variant' */,
    Movement /* = 'minecraft:movement' */,
    MovementAmphibious /* = 'minecraft:movement.amphibious' */,
    MovementBasic /* = 'minecraft:movement.basic' */,
    MovementFly /* = 'minecraft:movement.fly' */,
    MovementGeneric /* = 'minecraft:movement.generic' */,
    MovementGlide /* = 'minecraft:movement.glide' */,
    MovementHover /* = 'minecraft:movement.hover' */,
    MovementJump /* = 'minecraft:movement.jump' */,
    MovementSkip /* = 'minecraft:movement.skip' */,
    MovementSway /* = 'minecraft:movement.sway' */,
    NavigationClimb /* = 'minecraft:navigation.climb' */,
    NavigationFloat /* = 'minecraft:navigation.float' */,
    NavigationFly /* = 'minecraft:navigation.fly' */,
    NavigationGeneric /* = 'minecraft:navigation.generic' */,
    NavigationHover /* = 'minecraft:navigation.hover' */,
    NavigationWalk /* = 'minecraft:navigation.walk' */,
    Npc /* = 'minecraft:npc' */,
    OnFire /* = 'minecraft:onfire' */,
    Projectile /* = 'minecraft:projectile' */,
    PushThrough /* = 'minecraft:push_through' */,
    Rideable /* = 'minecraft:rideable' */,
    Riding /* = 'minecraft:riding' */,
    Scale /* = 'minecraft:scale' */,
    SkinId /* = 'minecraft:skin_id' */,
    Strength /* = 'minecraft:strength' */,
    Tameable /* = 'minecraft:tameable' */,
    TameMount /* = 'minecraft:tamemount' */,
    TypeFamily /* = 'minecraft:type_family' */,
    UnderwaterMovement /* = 'minecraft:underwater_movement' */,
    Variant /* = 'minecraft:variant' */,
    WantsJockey /* = 'minecraft:wants_jockey' */
}


external enum class EntityDamageCause {
    anvil /* = 'anvil' */,
    blockExplosion /* = 'blockExplosion' */,
    campfire /* = 'campfire' */,
    charging /* = 'charging' */,
    contact /* = 'contact' */,
    drowning /* = 'drowning' */,
    entityAttack /* = 'entityAttack' */,
    entityExplosion /* = 'entityExplosion' */,
    fall /* = 'fall' */,
    fallingBlock /* = 'fallingBlock' */,
    fire /* = 'fire' */,
    fireTick /* = 'fireTick' */,
    fireworks /* = 'fireworks' */,
    flyIntoWall /* = 'flyIntoWall' */,
    freezing /* = 'freezing' */,
    lava /* = 'lava' */,
    lightning /* = 'lightning' */,
    magic /* = 'magic' */,
    magma /* = 'magma' */,
    none /* = 'none' */,
    override /* = 'override' */,
    piston /* = 'piston' */,
    projectile /* = 'projectile' */,
    ramAttack /* = 'ramAttack' */,
    selfDestruct /* = 'selfDestruct' */,
    sonicBoom /* = 'sonicBoom' */,
    soulCampfire /* = 'soulCampfire' */,
    stalactite /* = 'stalactite' */,
    stalagmite /* = 'stalagmite' */,
    starve /* = 'starve' */,
    suffocation /* = 'suffocation' */,
    suicide /* = 'suicide' */,
    temperature /* = 'temperature' */,
    thorns /* = 'thorns' */,
    void /* = 'void' */,
    wither /* = 'wither' */
}


external enum class EntityInitializationCause {
    Born /* = 'Born' */,
    Event /* = 'Event' */,
    Loaded /* = 'Loaded' */,
    Spawned /* = 'Spawned' */,
    Transformed /* = 'Transformed' */
}


external enum class EntityLifetimeState {
    Loaded /* = 'Loaded' */,
    Unloaded /* = 'Unloaded' */
}


external enum class EquipmentSlot {
    Chest /* = 'Chest' */,
    Feet /* = 'Feet' */,
    Head /* = 'Head' */,
    Legs /* = 'Legs' */,
    Mainhand /* = 'Mainhand' */,
    Offhand /* = 'Offhand' */
}


external enum class FluidType {
    Lava /* = 'Lava' */,
    Potion /* = 'Potion' */,
    PowderSnow /* = 'PowderSnow' */,
    Water /* = 'Water' */
}


external enum class GameMode {
    adventure /* = 'adventure' */,
    creative /* = 'creative' */,
    spectator /* = 'spectator' */,
    survival /* = 'survival' */
}


external enum class GameRule {
    CommandBlockOutput /* = 'commandBlockOutput' */,
    CommandBlocksEnabled /* = 'commandBlocksEnabled' */,
    DoDayLightCycle /* = 'doDayLightCycle' */,
    DoEntityDrops /* = 'doEntityDrops' */,
    DoFireTick /* = 'doFireTick' */,
    DoImmediateRespawn /* = 'doImmediateRespawn' */,
    DoInsomnia /* = 'doInsomnia' */,
    DoLimitedCrafting /* = 'doLimitedCrafting' */,
    DoMobLoot /* = 'doMobLoot' */,
    DoMobSpawning /* = 'doMobSpawning' */,
    DoTileDrops /* = 'doTileDrops' */,
    DoWeatherCycle /* = 'doWeatherCycle' */,
    DrowningDamage /* = 'drowningDamage' */,
    FallDamage /* = 'fallDamage' */,
    FireDamage /* = 'fireDamage' */,
    FreezeDamage /* = 'freezeDamage' */,
    FunctionCommandLimit /* = 'functionCommandLimit' */,
    KeepInventory /* = 'keepInventory' */,
    MaxCommandChainLength /* = 'maxCommandChainLength' */,
    MobGriefing /* = 'mobGriefing' */,
    NaturalRegeneration /* = 'naturalRegeneration' */,
    PlayersSleepingPercentage /* = 'playersSleepingPercentage' */,
    ProjectilesCanBreakBlocks /* = 'projectilesCanBreakBlocks' */,
    Pvp /* = 'pvp' */,
    RandomTickSpeed /* = 'randomTickSpeed' */,
    RecipesUnlock /* = 'recipesUnlock' */,
    RespawnBlocksExplode /* = 'respawnBlocksExplode' */,
    SendCommandFeedback /* = 'sendCommandFeedback' */,
    ShowBorderEffect /* = 'showBorderEffect' */,
    ShowCoordinates /* = 'showCoordinates' */,
    ShowDaysPlayed /* = 'showDaysPlayed' */,
    ShowDeathMessages /* = 'showDeathMessages' */,
    ShowRecipeMessages /* = 'showRecipeMessages' */,
    ShowTags /* = 'showTags' */,
    SpawnRadius /* = 'spawnRadius' */,
    TntExplodes /* = 'tntExplodes' */,
    TntExplosionDropDecay /* = 'tntExplosionDropDecay' */
}


external enum class HudElement {
    PaperDoll /* = 0 */,
    Armor /* = 1 */,
    ToolTips /* = 2 */,
    TouchControls /* = 3 */,
    Crosshair /* = 4 */,
    Hotbar /* = 5 */,
    Health /* = 6 */,
    ProgressBar /* = 7 */,
    Hunger /* = 8 */,
    AirBubbles /* = 9 */,
    HorseHealth /* = 10 */,
    StatusEffects /* = 11 */,
    ItemText /* = 12 */
}


external enum class HudVisibility {
    Hide /* = 0 */,
    Reset /* = 1 */
}


external enum class InputPermissionCategory {
    Camera /* = 1 */,
    Movement /* = 2 */
}


external enum class ItemComponentTypes {
    Cooldown /* = 'minecraft:cooldown' */,
    Durability /* = 'minecraft:durability' */,
    Enchantable /* = 'minecraft:enchantable' */,
    Food /* = 'minecraft:food' */
}


external enum class ItemLockMode {
    inventory /* = 'inventory' */,
    none /* = 'none' */,
    slot /* = 'slot' */
}


external enum class MoonPhase {
    FullMoon /* = 0 */,
    WaningGibbous /* = 1 */,
    FirstQuarter /* = 2 */,
    WaningCrescent /* = 3 */,
    NewMoon /* = 4 */,
    WaxingCrescent /* = 5 */,
    LastQuarter /* = 6 */,
    WaxingGibbous /* = 7 */
}


external enum class ObjectiveSortOrder {
    Ascending /* = 0 */,
    Descending /* = 1 */
}


external enum class PaletteColor {
    White /* = 0 */,
    Orange /* = 1 */,
    Magenta /* = 2 */,
    LightBlue /* = 3 */,
    Yellow /* = 4 */,
    Lime /* = 5 */,
    Pink /* = 6 */,
    Gray /* = 7 */,
    Silver /* = 8 */,
    Cyan /* = 9 */,
    Purple /* = 10 */,
    Blue /* = 11 */,
    Brown /* = 12 */,
    Green /* = 13 */,
    Red /* = 14 */,
    Black /* = 15 */
}


external enum class ScoreboardIdentityType {
    Entity /* = 'Entity' */,
    FakePlayer /* = 'FakePlayer' */,
    Player /* = 'Player' */
}


external enum class ScriptEventSource {
    Block /* = 'Block' */,
    Entity /* = 'Entity' */,
    NPCDialogue /* = 'NPCDialogue' */,
    Server /* = 'Server' */
}


external enum class SignSide {
    Back /* = 'Back' */,
    Front /* = 'Front' */
}


external enum class StructureAnimationMode {
    Blocks /* = 'Blocks' */,
    Layers /* = 'Layers' */,
    None /* = 'None' */
}


external enum class StructureMirrorAxis {
    None /* = 'None' */,
    X /* = 'X' */,
    XZ /* = 'XZ' */,
    Z /* = 'Z' */
}


external enum class StructureRotation {
    None /* = 'None' */,
    Rotate180 /* = 'Rotate180' */,
    Rotate270 /* = 'Rotate270' */,
    Rotate90 /* = 'Rotate90' */
}


external enum class StructureSaveMode {
    Memory /* = 'Memory' */,
    World /* = 'World' */
}


external enum class TimeOfDay {
    Day /* = 1000 */,
    Noon /* = 6000 */,
    Sunset /* = 12000 */,
    Night /* = 13000 */,
    Midnight /* = 18000 */,
    Sunrise /* = 23000 */
}


external enum class WatchdogTerminateReason {
    Hang /* = 'Hang' */,
    StackOverflow /* = 'StackOverflow' */
}


external enum class WeatherType {
    Clear /* = 'Clear' */,
    Rain /* = 'Rain' */,
    Thunder /* = 'Thunder' */
}


external interface BlockComponentTypeMap {
    var inventory: BlockInventoryComponent
    var lavaContainer: BlockLavaContainerComponent
    var minecraft_inventory: BlockInventoryComponent
    var minecraft_lavaContainer: BlockLavaContainerComponent
    var minecraft_piston: BlockPistonComponent
    var minecraft_potionContainer: BlockPotionContainerComponent
    var minecraft_recordPlayer: BlockRecordPlayerComponent
    var minecraft_sign: BlockSignComponent
    var minecraft_snowContainer: BlockSnowContainerComponent
    var minecraft_waterContainer: BlockWaterContainerComponent
    var piston: BlockPistonComponent
    var potionContainer: BlockPotionContainerComponent
    var recordPlayer: BlockRecordPlayerComponent
    var sign: BlockSignComponent
    var snowContainer: BlockSnowContainerComponent
    var waterContainer: BlockWaterContainerComponent
}


external interface EntityComponentTypeMap {
    var addrider: EntityAddRiderComponent
    var ageable: EntityAgeableComponent
    var breathable: EntityBreathableComponent
    var can_climb: EntityCanClimbComponent
    var can_fly: EntityCanFlyComponent
    var can_power_jump: EntityCanPowerJumpComponent
    var color: EntityColorComponent
    var color2: EntityColor2Component
    var equippable: EntityEquippableComponent
    var fire_immune: EntityFireImmuneComponent
    var floats_in_liquid: EntityFloatsInLiquidComponent
    var flying_speed: EntityFlyingSpeedComponent
    var friction_modifier: EntityFrictionModifierComponent
    var ground_offset: EntityGroundOffsetComponent
    var healable: EntityHealableComponent
    var health: EntityHealthComponent
    var inventory: EntityInventoryComponent
    var is_baby: EntityIsBabyComponent
    var is_charged: EntityIsChargedComponent
    var is_chested: EntityIsChestedComponent
    var is_dyeable: EntityIsDyeableComponent
    var is_hidden_when_invisible: EntityIsHiddenWhenInvisibleComponent
    var is_ignited: EntityIsIgnitedComponent
    var is_illager_captain: EntityIsIllagerCaptainComponent
    var is_saddled: EntityIsSaddledComponent
    var is_shaking: EntityIsShakingComponent
    var is_sheared: EntityIsShearedComponent
    var is_stackable: EntityIsStackableComponent
    var is_stunned: EntityIsStunnedComponent
    var is_tamed: EntityIsTamedComponent
    var item: EntityItemComponent
    var lava_movement: EntityLavaMovementComponent
    var leashable: EntityLeashableComponent
    var mark_variant: EntityMarkVariantComponent
    var minecraft_addrider: EntityAddRiderComponent
    var minecraft_ageable: EntityAgeableComponent
    var minecraft_breathable: EntityBreathableComponent
    var minecraft_can_climb: EntityCanClimbComponent
    var minecraft_can_fly: EntityCanFlyComponent
    var minecraft_can_power_jump: EntityCanPowerJumpComponent
    var minecraft_color: EntityColorComponent
    var minecraft_color2: EntityColor2Component
    var minecraft_equippable: EntityEquippableComponent
    var minecraft_fire_immune: EntityFireImmuneComponent
    var minecraft_floats_in_liquid: EntityFloatsInLiquidComponent
    var minecraft_flying_speed: EntityFlyingSpeedComponent
    var minecraft_friction_modifier: EntityFrictionModifierComponent
    var minecraft_ground_offset: EntityGroundOffsetComponent
    var minecraft_healable: EntityHealableComponent
    var minecraft_health: EntityHealthComponent
    var minecraft_inventory: EntityInventoryComponent
    var minecraft_is_baby: EntityIsBabyComponent
    var minecraft_is_charged: EntityIsChargedComponent
    var minecraft_is_chested: EntityIsChestedComponent
    var minecraft_is_dyeable: EntityIsDyeableComponent
    var minecraft_is_hidden_when_invisible: EntityIsHiddenWhenInvisibleComponent
    var minecraft_is_ignited: EntityIsIgnitedComponent
    var minecraft_is_illager_captain: EntityIsIllagerCaptainComponent
    var minecraft_is_saddled: EntityIsSaddledComponent
    var minecraft_is_shaking: EntityIsShakingComponent
    var minecraft_is_sheared: EntityIsShearedComponent
    var minecraft_is_stackable: EntityIsStackableComponent
    var minecraft_is_stunned: EntityIsStunnedComponent
    var minecraft_is_tamed: EntityIsTamedComponent
    var minecraft_item: EntityItemComponent
    var minecraft_lava_movement: EntityLavaMovementComponent
    var minecraft_leashable: EntityLeashableComponent
    var minecraft_mark_variant: EntityMarkVariantComponent
    var minecraft_movement: EntityMovementComponent
    var minecraft_movement_amphibious: EntityMovementAmphibiousComponent
    var minecraft_movement_basic: EntityMovementBasicComponent
    var minecraft_movement_fly: EntityMovementFlyComponent
    var minecraft_movement_generic: EntityMovementGenericComponent
    var minecraft_movement_glide: EntityMovementGlideComponent
    var minecraft_movement_hover: EntityMovementHoverComponent
    var minecraft_movement_jump: EntityMovementJumpComponent
    var minecraft_movement_skip: EntityMovementSkipComponent
    var minecraft_movement_sway: EntityMovementSwayComponent
    var minecraft_navigation_climb: EntityNavigationClimbComponent
    var minecraft_navigation_float: EntityNavigationFloatComponent
    var minecraft_navigation_fly: EntityNavigationFlyComponent
    var minecraft_navigation_generic: EntityNavigationGenericComponent
    var minecraft_navigation_hover: EntityNavigationHoverComponent
    var minecraft_navigation_walk: EntityNavigationWalkComponent
    var minecraft_npc: EntityNpcComponent
    var minecraft_onfire: EntityOnFireComponent
    var minecraft_projectile: EntityProjectileComponent
    var minecraft_push_through: EntityPushThroughComponent
    var minecraft_rideable: EntityRideableComponent
    var minecraft_riding: EntityRidingComponent
    var minecraft_scale: EntityScaleComponent
    var minecraft_skin_id: EntitySkinIdComponent
    var minecraft_strength: EntityStrengthComponent
    var minecraft_tameable: EntityTameableComponent
    var minecraft_tamemount: EntityTameMountComponent
    var minecraft_type_family: EntityTypeFamilyComponent
    var minecraft_underwater_movement: EntityUnderwaterMovementComponent
    var minecraft_variant: EntityVariantComponent
    var minecraft_wants_jockey: EntityWantsJockeyComponent
    var movement: EntityMovementComponent
    var movement_amphibious: EntityMovementAmphibiousComponent
    var movement_basic: EntityMovementBasicComponent
    var movement_fly: EntityMovementFlyComponent
    var movement_generic: EntityMovementGenericComponent
    var movement_glide: EntityMovementGlideComponent
    var movement_hover: EntityMovementHoverComponent
    var movement_jump: EntityMovementJumpComponent
    var movement_skip: EntityMovementSkipComponent
    var movement_sway: EntityMovementSwayComponent
    var navigation_climb: EntityNavigationClimbComponent
    var navigation_float: EntityNavigationFloatComponent
    var navigation_fly: EntityNavigationFlyComponent
    var navigation_generic: EntityNavigationGenericComponent
    var navigation_hover: EntityNavigationHoverComponent
    var navigation_walk: EntityNavigationWalkComponent
    var npc: EntityNpcComponent
    var onfire: EntityOnFireComponent
    var projectile: EntityProjectileComponent
    var push_through: EntityPushThroughComponent
    var rideable: EntityRideableComponent
    var riding: EntityRidingComponent
    var scale: EntityScaleComponent
    var skin_id: EntitySkinIdComponent
    var strength: EntityStrengthComponent
    var tameable: EntityTameableComponent
    var tamemount: EntityTameMountComponent
    var type_family: EntityTypeFamilyComponent
    var underwater_movement: EntityUnderwaterMovementComponent
    var variant: EntityVariantComponent
    var wants_jockey: EntityWantsJockeyComponent
}


external interface ItemComponentTypeMap {
    var cooldown: ItemCooldownComponent
    var durability: ItemDurabilityComponent
    var enchantable: ItemEnchantableComponent
    var food: ItemFoodComponent
    var minecraft_cooldown: ItemCooldownComponent
    var minecraft_durability: ItemDurabilityComponent
    var minecraft_enchantable: ItemEnchantableComponent
    var minecraft_food: ItemFoodComponent
}


external open class BiomeType {
    open var id: String
}


external open class BiomeTypes {
    companion object {
        fun get(typeName: String): BiomeType?
        fun getAll(): Array<BiomeType>
    }
}


external open class Block {
    open var dimension: Dimension
    open var isAir: Boolean
    open var isLiquid: Boolean
    open var isSolid: Boolean
    open var isWaterlogged: Boolean
    open var location: Vector3
    open var permutation: BlockPermutation
    open var type: BlockType
    open var typeId: String
    open var x: Number
    open var y: Number
    open var z: Number
    open fun above(steps: Number = definedExternally): Block?
    open fun below(steps: Number = definedExternally): Block?
    open fun bottomCenter(): Vector3
    open fun canPlace(blockToPlace: BlockPermutation, faceToPlaceOn: Direction = definedExternally): Boolean
    open fun canPlace(blockToPlace: BlockPermutation): Boolean
    open fun canPlace(blockToPlace: BlockType, faceToPlaceOn: Direction = definedExternally): Boolean
    open fun canPlace(blockToPlace: BlockType): Boolean
    open fun canPlace(blockToPlace: String, faceToPlaceOn: Direction = definedExternally): Boolean
    open fun canPlace(blockToPlace: String): Boolean
    open fun center(): Vector3
    open fun east(steps: Number = definedExternally): Block?
    open fun <T : String> getComponent(componentId: T): Any
    open fun getItemStack(amount: Number = definedExternally, withData: Boolean = definedExternally): ItemStack?
    open fun getRedstonePower(): Number?
    open fun getTags(): Array<String>
    open fun hasTag(tag: String): Boolean
    open fun isValid(): Boolean
    open fun matches(blockName: String, states: Record<String, Any /* Boolean | Number | String */> = definedExternally): Boolean
    open fun north(steps: Number = definedExternally): Block?
    open fun offset(offset: Vector3): Block?
    open fun setPermutation(permutation: BlockPermutation)
    open fun setType(blockType: BlockType)
    open fun setType(blockType: String)
    open fun setWaterlogged(isWaterlogged: Boolean)
    open fun south(steps: Number = definedExternally): Block?
    open fun trySetPermutation(permutation: BlockPermutation): Boolean
    open fun west(steps: Number = definedExternally): Block?
}


external open class BlockComponent : Component {
    open var block: Block
}


external open class BlockComponentEntityFallOnEvent : BlockEvent {
    open var entity: Entity
    open var fallDistance: Number
}


external open class BlockComponentOnPlaceEvent : BlockEvent {
    open var previousBlock: BlockPermutation
}


external open class BlockComponentPlayerDestroyEvent : BlockEvent {
    open var destroyedBlockPermutation: BlockPermutation
    open var player: Player
}


external open class BlockComponentPlayerInteractEvent : BlockEvent {
    open var face: Direction
    open var faceLocation: Vector3
    open var player: Player
}


external open class BlockComponentPlayerPlaceBeforeEvent : BlockEvent {
    open var cancel: Boolean
    open var face: Direction
    open var permutationToPlace: BlockPermutation
    open var player: Player
}


external open class BlockComponentRandomTickEvent : BlockEvent


external open class BlockComponentRegistry {
    open fun registerCustomComponent(name: String, customComponent: BlockCustomComponent)
}


external open class BlockComponentStepOffEvent : BlockEvent {
    open var entity: Entity
}


external open class BlockComponentStepOnEvent : BlockEvent {
    open var entity: Entity
}


external open class BlockComponentTickEvent : BlockEvent


external open class BlockEvent {
    open var block: Block
    open var dimension: Dimension
}


external open class BlockExplodeAfterEvent : BlockEvent {
    open var explodedBlockPermutation: BlockPermutation
    open var source: Entity
}


external open class BlockExplodeAfterEventSignal {
    open fun subscribe(callback: (arg: BlockExplodeAfterEvent) -> Unit): (arg: BlockExplodeAfterEvent) -> Unit
    open fun unsubscribe(callback: (arg: BlockExplodeAfterEvent) -> Unit)
}


external open class BlockInventoryComponent : BlockComponent {
    open var container: Container

    companion object {
        var componentId: Any = definedExternally
    }
}


external open class BlockLavaContainerComponent : BlockLiquidContainerComponent {
    companion object {
        var componentId: Any = definedExternally
    }
}


external open class BlockLiquidContainerComponent : BlockComponent {
    open var fillLevel: Number
    open fun isValidLiquid(): Boolean
}




external open class BlockPermutation {
    open var type: BlockType
    open fun getAllStates(): Record<String, dynamic /* Boolean | Number | String */>
    open fun getItemStack(amount: Number = definedExternally): ItemStack?
    open fun getState(stateName: String): dynamic /* Boolean? | Number? | String? */
    open fun getTags(): Array<String>
    open fun hasTag(tag: String): Boolean
    open fun matches(blockName: String, states: Record<String, Any /* Boolean | Number | String */> = definedExternally): Boolean
    open fun withState(name: String, value: Boolean): BlockPermutation
    open fun withState(name: String, value: Number): BlockPermutation
    open fun withState(name: String, value: String): BlockPermutation

    companion object {
        fun resolve(blockName: String, states: Record<String, Any /* Boolean | Number | String */> = definedExternally): BlockPermutation
    }
}


external open class BlockPistonComponent : BlockComponent {
    open var isMoving: Boolean
    open var state: BlockPistonState
    open fun getAttachedBlocks(): Array<Block>
    open fun getAttachedBlocksLocations(): Array<Vector3>

    companion object {
        var componentId: Any = definedExternally
    }
}


external open class BlockPotionContainerComponent : BlockLiquidContainerComponent {
    open fun setPotionType(itemStack: ItemStack)

    companion object {
        var componentId: Any = definedExternally
    }
}


external open class BlockRecordPlayerComponent : BlockComponent {
    open fun clearRecord()
    open fun isPlaying(): Boolean
    open fun setRecord(recordItemType: ItemType)
    open fun setRecord(recordItemType: String)

    companion object {
        var componentId: Any = definedExternally
    }
}


external open class BlockSignComponent : BlockComponent {
    open var isWaxed: Boolean
    open fun getRawText(side: SignSide = definedExternally): RawText?
    open fun getText(side: SignSide = definedExternally): String?
    open fun getTextDyeColor(side: SignSide = definedExternally): DyeColor?
    open fun setText(message: RawMessage, side: SignSide = definedExternally)
    open fun setText(message: RawMessage)
    open fun setText(message: RawText, side: SignSide = definedExternally)
    open fun setText(message: RawText)
    open fun setText(message: String, side: SignSide = definedExternally)
    open fun setText(message: String)
    open fun setTextDyeColor(color: DyeColor = definedExternally, side: SignSide = definedExternally)
    open fun setWaxed(waxed: Boolean)

    companion object {
        var componentId: Any = definedExternally
    }
}


external open class BlockSnowContainerComponent : BlockLiquidContainerComponent {
    companion object {
        var componentId: Any = definedExternally
    }
}


external open class BlockStates {
    companion object {
        fun get(stateName: String): BlockStateType?
        fun getAll(): Array<BlockStateType>
    }
}


external open class BlockStateType {
    open var id: String
    open var validValues: Array<dynamic /* Boolean | Number | String */>
}


external open class BlockType {
    open var canBeWaterlogged: Boolean
    open var id: String
}


external open class BlockTypes {
    companion object {
        fun get(typeName: String): BlockType?
        fun getAll(): Array<BlockType>
    }
}


external open class BlockVolume(from: Vector3, to: Vector3) : BlockVolumeBase {
    open var from: Vector3
    open var to: Vector3
    open fun doesLocationTouchFaces(pos: Vector3): Boolean
    open fun doesVolumeTouchFaces(other: BlockVolume): Boolean
    open fun intersects(other: BlockVolume): BlockVolumeIntersection
}


external open class BlockVolumeBase {
    open fun getBlockLocationIterator(): Iterable<Vector3>
    open fun getBoundingBox(): BoundingBox
    open fun getCapacity(): Number
    open fun getMax(): Vector3
    open fun getMin(): Vector3
    open fun getSpan(): Vector3
    open fun isInside(location: Vector3): Boolean
    open fun translate(delta: Vector3)
}


external open class BlockWaterContainerComponent : BlockLiquidContainerComponent {
    open fun addDye(itemType: ItemType)
    open fun getCustomColor(): RGBA
    open fun setCustomColor(color: RGBA)

    companion object {
        var componentId: Any = definedExternally
    }
}


external open class BoundingBoxUtils {
    companion object {
        fun createValid(min: Vector3, max: Vector3): BoundingBox
        fun dilate(box: BoundingBox, size: Vector3): BoundingBox
        fun equals(box: BoundingBox, other: BoundingBox): Boolean
        fun expand(box: BoundingBox, other: BoundingBox): BoundingBox
        fun getCenter(box: BoundingBox): Vector3
        fun getIntersection(box: BoundingBox, other: BoundingBox): BoundingBox?
        fun getSpan(box: BoundingBox): Vector3
        fun intersects(box: BoundingBox, other: BoundingBox): Boolean
        fun isInside(box: BoundingBox, pos: Vector3): Boolean
        fun isValid(box: BoundingBox): Boolean
        fun translate(box: BoundingBox, delta: Vector3): BoundingBox
    }
}


external open class ButtonPushAfterEvent : BlockEvent {
    open var source: Entity
}


external open class ButtonPushAfterEventSignal : IButtonPushAfterEventSignal


external open class Camera {
    open fun clear()
    open fun fade(fadeCameraOptions: CameraFadeOptions = definedExternally)
    open fun setCamera(cameraPreset: String, setOptions: CameraDefaultOptions = definedExternally)
    open fun setCamera(cameraPreset: String)
    open fun setCamera(cameraPreset: String, setOptions: CameraSetFacingOptions = definedExternally)
    open fun setCamera(cameraPreset: String, setOptions: CameraSetLocationOptions = definedExternally)
    open fun setCamera(cameraPreset: String, setOptions: CameraSetPosOptions = definedExternally)
    open fun setCamera(cameraPreset: String, setOptions: CameraSetRotOptions = definedExternally)
}


external open class ChatSendAfterEvent {
    open var message: String
    open var sender: Player
    open var targets: Array<Player>
}


external open class ChatSendAfterEventSignal {
    open fun subscribe(callback: (arg: ChatSendAfterEvent) -> Unit): (arg: ChatSendAfterEvent) -> Unit
    open fun unsubscribe(callback: (arg: ChatSendAfterEvent) -> Unit)
}


external open class ChatSendBeforeEvent {
    open var cancel: Boolean
    open var message: String
    open var sender: Player
    open var targets: Array<Player>
}


external open class ChatSendBeforeEventSignal {
    open fun subscribe(callback: (arg: ChatSendBeforeEvent) -> Unit): (arg: ChatSendBeforeEvent) -> Unit
    open fun unsubscribe(callback: (arg: ChatSendBeforeEvent) -> Unit)
}


external open class CommandResult {
    open var successCount: Number
}


external open class Component {
    open var typeId: String
    open fun isValid(): Boolean
}


external open class CompoundBlockVolume(origin: Vector3 = definedExternally) {
    open var capacity: Number
    open var items: Array<CompoundBlockVolumeItem>
    open var itemsAbsolute: Array<CompoundBlockVolumeItem>
    open var volumeCount: Number
    open fun clear()
    open fun getBlockLocationIterator(): Iterable<Vector3>
    open fun getBoundingBox(): BoundingBox
    open fun getMax(): Vector3
    open fun getMin(): Vector3
    open fun getOrigin(): Vector3
    open fun isEmpty(): Boolean
    open fun isInside(worldLocation: Vector3): Boolean
    open fun peekLastVolume(forceRelativity: CompoundBlockVolumePositionRelativity = definedExternally): CompoundBlockVolumeItem?
    open fun popVolume(): Boolean
    open fun pushVolume(item: CompoundBlockVolumeItem)
    open fun replaceOrAddLastVolume(item: CompoundBlockVolumeItem): Boolean
    open fun setOrigin(position: Vector3, preserveExistingVolumes: Boolean = definedExternally)
    open fun translateOrigin(delta: Vector3, preserveExistingVolumes: Boolean = definedExternally)
}


external open class Container {
    open var emptySlotsCount: Number
    open var size: Number
    open fun addItem(itemStack: ItemStack): ItemStack?
    open fun clearAll()
    open fun getItem(slot: Number): ItemStack?
    open fun getSlot(slot: Number): ContainerSlot
    open fun isValid(): Boolean
    open fun moveItem(fromSlot: Number, toSlot: Number, toContainer: Container)
    open fun setItem(slot: Number, itemStack: ItemStack = definedExternally)
    open fun swapItems(slot: Number, otherSlot: Number, otherContainer: Container)
    open fun transferItem(fromSlot: Number, toContainer: Container): ItemStack?
}


external open class ContainerSlot {
    open var amount: Number
    open var isStackable: Boolean
    open var keepOnDeath: Boolean
    open var lockMode: ItemLockMode
    open var maxAmount: Number
    open var nameTag: String
    open var type: ItemType
    open var typeId: String
    open fun clearDynamicProperties()
    open fun getCanDestroy(): Array<String>
    open fun getCanPlaceOn(): Array<String>
    open fun getDynamicProperty(identifier: String): dynamic /* Boolean? | Number? | String? | Vector3? */
    open fun getDynamicPropertyIds(): Array<String>
    open fun getDynamicPropertyTotalByteCount(): Number
    open fun getItem(): ItemStack?
    open fun getLore(): Array<String>
    open fun getTags(): Array<String>
    open fun hasItem(): Boolean
    open fun hasTag(tag: String): Boolean
    open fun isStackableWith(itemStack: ItemStack): Boolean
    open fun isValid(): Boolean
    open fun setCanDestroy(blockIdentifiers: Array<String> = definedExternally)
    open fun setCanPlaceOn(blockIdentifiers: Array<String> = definedExternally)
    open fun setDynamicProperty(identifier: String, value: Boolean = definedExternally)
    open fun setDynamicProperty(identifier: String)
    open fun setDynamicProperty(identifier: String, value: Number = definedExternally)
    open fun setDynamicProperty(identifier: String, value: String = definedExternally)
    open fun setDynamicProperty(identifier: String, value: Vector3 = definedExternally)
    open fun setItem(itemStack: ItemStack = definedExternally)
    open fun setLore(loreList: Array<String> = definedExternally)
}


external open class DataDrivenEntityTriggerAfterEvent {
    open var entity: Entity
    open var eventId: String
    open fun getModifiers(): Array<DefinitionModifier>
}


external open class DataDrivenEntityTriggerAfterEventSignal {
    open fun subscribe(callback: (arg: DataDrivenEntityTriggerAfterEvent) -> Unit, options: EntityDataDrivenTriggerEventOptions = definedExternally): (arg: DataDrivenEntityTriggerAfterEvent) -> Unit
    open fun unsubscribe(callback: (arg: DataDrivenEntityTriggerAfterEvent) -> Unit)
}


external open class Dimension {
    open var heightRange: NumberRange
    open var id: String
    open fun containsBlock(volume: BlockVolumeBase, filter: BlockFilter, allowUnloadedChunks: Boolean = definedExternally): Boolean
    open fun createExplosion(location: Vector3, radius: Number, explosionOptions: ExplosionOptions = definedExternally): Boolean
    open fun fillBlocks(volume: BlockVolumeBase, block: BlockPermutation, options: BlockFillOptions = definedExternally): ListBlockVolume
    open fun fillBlocks(volume: BlockVolumeBase, block: BlockPermutation): ListBlockVolume
    open fun fillBlocks(volume: BlockVolumeBase, block: BlockType, options: BlockFillOptions = definedExternally): ListBlockVolume
    open fun fillBlocks(volume: BlockVolumeBase, block: BlockType): ListBlockVolume
    open fun fillBlocks(volume: BlockVolumeBase, block: String, options: BlockFillOptions = definedExternally): ListBlockVolume
    open fun fillBlocks(volume: BlockVolumeBase, block: String): ListBlockVolume
    open fun fillBlocks(volume: CompoundBlockVolume, block: BlockPermutation, options: BlockFillOptions = definedExternally): ListBlockVolume
    open fun fillBlocks(volume: CompoundBlockVolume, block: BlockPermutation): ListBlockVolume
    open fun fillBlocks(volume: CompoundBlockVolume, block: BlockType, options: BlockFillOptions = definedExternally): ListBlockVolume
    open fun fillBlocks(volume: CompoundBlockVolume, block: BlockType): ListBlockVolume
    open fun fillBlocks(volume: CompoundBlockVolume, block: String, options: BlockFillOptions = definedExternally): ListBlockVolume
    open fun fillBlocks(volume: CompoundBlockVolume, block: String): ListBlockVolume
    open fun findClosestBiome(pos: Vector3, biomeToFind: BiomeType, options: BiomeSearchOptions = definedExternally): Vector3?
    open fun findClosestBiome(pos: Vector3, biomeToFind: BiomeType): Vector3?
    open fun findClosestBiome(pos: Vector3, biomeToFind: String, options: BiomeSearchOptions = definedExternally): Vector3?
    open fun findClosestBiome(pos: Vector3, biomeToFind: String): Vector3?
    open fun getBlock(location: Vector3): Block?
    open fun getBlockAbove(location: Vector3, options: BlockRaycastOptions = definedExternally): Block?
    open fun getBlockBelow(location: Vector3, options: BlockRaycastOptions = definedExternally): Block?
    open fun getBlockFromRay(location: Vector3, direction: Vector3, options: BlockRaycastOptions = definedExternally): BlockRaycastHit?
    open fun getBlocks(volume: BlockVolumeBase, filter: BlockFilter, allowUnloadedChunks: Boolean = definedExternally): ListBlockVolume
    open fun getEntities(options: EntityQueryOptions = definedExternally): Array<Entity>
    open fun getEntitiesAtBlockLocation(location: Vector3): Array<Entity>
    open fun getEntitiesFromRay(location: Vector3, direction: Vector3, options: EntityRaycastOptions = definedExternally): Array<EntityRaycastHit>
    open fun getPlayers(options: EntityQueryOptions = definedExternally): Array<Player>
    open fun getTopmostBlock(locationXZ: VectorXZ, minHeight: Number = definedExternally): Block?
    open fun getWeather(): WeatherType
    open fun playSound(soundId: String, location: Vector3, soundOptions: WorldSoundOptions = definedExternally)
    open fun runCommand(commandString: String): CommandResult
    open fun runCommandAsync(commandString: String): Promise<CommandResult>
    open fun setBlockPermutation(location: Vector3, permutation: BlockPermutation)
    open fun setBlockType(location: Vector3, blockType: BlockType)
    open fun setBlockType(location: Vector3, blockType: String)
    open fun setWeather(weatherType: WeatherType, duration: Number = definedExternally)
    open fun spawnEntity(identifier: String, location: Vector3, options: SpawnEntityOptions = definedExternally): Entity
    open fun spawnItem(itemStack: ItemStack, location: Vector3): Entity
    open fun spawnParticle(effectName: String, location: Vector3, molangVariables: MolangVariableMap = definedExternally)
}


external open class DimensionType {
    open var typeId: String
}


external open class DimensionTypes {
    companion object {
        fun get(dimensionTypeId: String): DimensionType?
        fun getAll(): Array<DimensionType>
    }
}


external open class Effect {
    open var amplifier: Number
    open var displayName: String
    open var duration: Number
    open var typeId: String
    open fun isValid(): Boolean
}


external open class EffectAddAfterEvent {
    open var effect: Effect
    open var entity: Entity
}


external open class EffectAddAfterEventSignal {
    open fun subscribe(callback: (arg: EffectAddAfterEvent) -> Unit, options: EntityEventOptions = definedExternally): (arg: EffectAddAfterEvent) -> Unit
    open fun unsubscribe(callback: (arg: EffectAddAfterEvent) -> Unit)
}


external open class EffectAddBeforeEvent {
    open var cancel: Boolean
    open var duration: Number
    open var effectType: String
    open var entity: Entity
}


external open class EffectAddBeforeEventSignal {
    open fun subscribe(callback: (arg: EffectAddBeforeEvent) -> Unit): (arg: EffectAddBeforeEvent) -> Unit
    open fun unsubscribe(callback: (arg: EffectAddBeforeEvent) -> Unit)
}


external open class EffectType {
    open fun getName(): String
}


external open class EffectTypes {
    companion object {
        fun get(identifier: String): EffectType?
        fun getAll(): Array<EffectType>
    }
}


external open class EnchantmentType(enchantmentType: String) {
    open var id: String
    open var maxLevel: Number
}


external open class EnchantmentTypes {
    companion object {
        fun get(enchantmentId: String): EnchantmentType?
        fun getAll(): Array<EnchantmentType>
    }
}


external open class Entity {
    open var dimension: Dimension
    open var fallDistance: Number
    open var id: String
    open var isClimbing: Boolean
    open var isFalling: Boolean
    open var isInWater: Boolean
    open var isOnGround: Boolean
    open var isSleeping: Boolean
    open var isSneaking: Boolean
    open var isSprinting: Boolean
    open var isSwimming: Boolean
    open var lifetimeState: EntityLifetimeState
    open var location: Vector3
    open var nameTag: String
    open var scoreboardIdentity: ScoreboardIdentity
    open var target: Entity
    open var typeId: String
    open fun addEffect(effectType: EffectType, duration: Number, options: EntityEffectOptions = definedExternally): Effect?
    open fun addEffect(effectType: EffectType, duration: Number): Effect?
    open fun addEffect(effectType: String, duration: Number, options: EntityEffectOptions = definedExternally): Effect?
    open fun addEffect(effectType: String, duration: Number): Effect?
    open fun addTag(tag: String): Boolean
    open fun applyDamage(amount: Number, options: EntityApplyDamageByProjectileOptions = definedExternally): Boolean
    open fun applyDamage(amount: Number): Boolean
    open fun applyDamage(amount: Number, options: EntityApplyDamageOptions = definedExternally): Boolean
    open fun applyImpulse(vector: Vector3)
    open fun applyKnockback(directionX: Number, directionZ: Number, horizontalStrength: Number, verticalStrength: Number)
    open fun clearDynamicProperties()
    open fun clearVelocity()
    open fun extinguishFire(useEffects: Boolean = definedExternally): Boolean
    open fun getBlockFromViewDirection(options: BlockRaycastOptions = definedExternally): BlockRaycastHit?
    open fun <T : String> getComponent(componentId: T): Any
    open fun getComponents(): Array<EntityComponent>
    open fun getDynamicProperty(identifier: String): dynamic /* Boolean? | Number? | String? | Vector3? */
    open fun getDynamicPropertyIds(): Array<String>
    open fun getDynamicPropertyTotalByteCount(): Number
    open fun getEffect(effectType: EffectType): Effect?
    open fun getEffect(effectType: String): Effect?
    open fun getEffects(): Array<Effect>
    open fun getEntitiesFromViewDirection(options: EntityRaycastOptions = definedExternally): Array<EntityRaycastHit>
    open fun getHeadLocation(): Vector3
    open fun getProperty(identifier: String): dynamic /* Boolean? | Number? | String? */
    open fun getRotation(): Vector2
    open fun getTags(): Array<String>
    open fun getVelocity(): Vector3
    open fun getViewDirection(): Vector3
    open fun hasComponent(componentId: String): Boolean
    open fun hasTag(tag: String): Boolean
    open fun isValid(): Boolean
    open fun kill(): Boolean
    open fun matches(options: EntityQueryOptions): Boolean
    open fun playAnimation(animationName: String, options: PlayAnimationOptions = definedExternally)
    open fun remove()
    open fun removeEffect(effectType: EffectType): Boolean
    open fun removeEffect(effectType: String): Boolean
    open fun removeTag(tag: String): Boolean
    open fun resetProperty(identifier: String): dynamic /* Boolean | Number | String */
    open fun runCommand(commandString: String): CommandResult
    open fun runCommandAsync(commandString: String): Promise<CommandResult>
    open fun setDynamicProperty(identifier: String, value: Boolean = definedExternally)
    open fun setDynamicProperty(identifier: String)
    open fun setDynamicProperty(identifier: String, value: Number = definedExternally)
    open fun setDynamicProperty(identifier: String, value: String = definedExternally)
    open fun setDynamicProperty(identifier: String, value: Vector3 = definedExternally)
    open fun setOnFire(seconds: Number, useEffects: Boolean = definedExternally): Boolean
    open fun setProperty(identifier: String, value: Boolean)
    open fun setProperty(identifier: String, value: Number)
    open fun setProperty(identifier: String, value: String)
    open fun setRotation(rotation: Vector2)
    open fun teleport(location: Vector3, teleportOptions: TeleportOptions = definedExternally)
    open fun triggerEvent(eventName: String)
    open fun tryTeleport(location: Vector3, teleportOptions: TeleportOptions = definedExternally): Boolean
}


external open class EntityAddRiderComponent : EntityComponent {
    open var entityType: String
    open var spawnEvent: String

    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityAgeableComponent : EntityComponent {
    open var duration: Number
    open var growUp: Trigger
    open var transformToItem: String
    open fun getDropItems(): Array<String>
    open fun getFeedItems(): Array<EntityDefinitionFeedItem>

    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityAttributeComponent : EntityComponent {
    open var currentValue: Number
    open var defaultValue: Number
    open var effectiveMax: Number
    open var effectiveMin: Number
    open fun resetToDefaultValue()
    open fun resetToMaxValue()
    open fun resetToMinValue()
    open fun setCurrentValue(value: Number): Boolean
}


external open class EntityBaseMovementComponent : EntityComponent {
    open var maxTurn: Number
}


external open class EntityBreathableComponent : EntityComponent {
    open var breathesAir: Boolean
    open var breathesLava: Boolean
    open var breathesSolids: Boolean
    open var breathesWater: Boolean
    open var generatesBubbles: Boolean
    open var inhaleTime: Number
    open var suffocateTime: Number
    open var totalSupply: Number
    open fun getBreatheBlocks(): Array<BlockPermutation>
    open fun getNonBreatheBlocks(): Array<BlockPermutation>
    open fun setAirSupply(value: Number)

    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityCanClimbComponent : EntityComponent {
    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityCanFlyComponent : EntityComponent {
    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityCanPowerJumpComponent : EntityComponent {
    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityColor2Component : EntityComponent {
    open var value: PaletteColor

    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityColorComponent : EntityComponent {
    open var value: Number

    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityComponent : Component {
    open var entity: Entity
}


external open class EntityDefinitionFeedItem {
    open var growth: Number
    open var item: String
}


external open class EntityDieAfterEvent {
    open var damageSource: EntityDamageSource
    open var deadEntity: Entity
}


external open class EntityDieAfterEventSignal {
    open fun subscribe(callback: (arg: EntityDieAfterEvent) -> Unit, options: EntityEventOptions = definedExternally): (arg: EntityDieAfterEvent) -> Unit
    open fun unsubscribe(callback: (arg: EntityDieAfterEvent) -> Unit)
}


external open class EntityEquippableComponent : EntityComponent {
    open fun getEquipment(equipmentSlot: EquipmentSlot): ItemStack?
    open fun getEquipmentSlot(equipmentSlot: EquipmentSlot): ContainerSlot
    open fun setEquipment(equipmentSlot: EquipmentSlot, itemStack: ItemStack = definedExternally): Boolean

    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityFireImmuneComponent : EntityComponent {
    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityFloatsInLiquidComponent : EntityComponent {
    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityFlyingSpeedComponent : EntityComponent {
    open var value: Number

    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityFrictionModifierComponent : EntityComponent {
    open var value: Number

    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityGroundOffsetComponent : EntityComponent {
    open var value: Number

    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityHealableComponent : EntityComponent {
    open var forceUse: Boolean
    open fun getFeedItems(): Array<FeedItem>

    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityHealthChangedAfterEvent {
    open var entity: Entity
    open var newValue: Number
    open var oldValue: Number
}


external open class EntityHealthChangedAfterEventSignal {
    open fun subscribe(callback: (arg: EntityHealthChangedAfterEvent) -> Unit, options: EntityEventOptions = definedExternally): (arg: EntityHealthChangedAfterEvent) -> Unit
    open fun unsubscribe(callback: (arg: EntityHealthChangedAfterEvent) -> Unit)
}


external open class EntityHealthComponent : EntityAttributeComponent {
    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityHitBlockAfterEvent {
    open var blockFace: Direction
    open var damagingEntity: Entity
    open var hitBlock: Block
    open var hitBlockPermutation: BlockPermutation
}


external open class EntityHitBlockAfterEventSignal {
    open fun subscribe(callback: (arg: EntityHitBlockAfterEvent) -> Unit, options: EntityEventOptions = definedExternally): (arg: EntityHitBlockAfterEvent) -> Unit
    open fun unsubscribe(callback: (arg: EntityHitBlockAfterEvent) -> Unit)
}


external open class EntityHitEntityAfterEvent {
    open var damagingEntity: Entity
    open var hitEntity: Entity
}


external open class EntityHitEntityAfterEventSignal {
    open fun subscribe(callback: (arg: EntityHitEntityAfterEvent) -> Unit, options: EntityEventOptions = definedExternally): (arg: EntityHitEntityAfterEvent) -> Unit
    open fun unsubscribe(callback: (arg: EntityHitEntityAfterEvent) -> Unit)
}


external open class EntityHurtAfterEvent {
    open var damage: Number
    open var damageSource: EntityDamageSource
    open var hurtEntity: Entity
}


external open class EntityHurtAfterEventSignal {
    open fun subscribe(callback: (arg: EntityHurtAfterEvent) -> Unit, options: EntityEventOptions = definedExternally): (arg: EntityHurtAfterEvent) -> Unit
    open fun unsubscribe(callback: (arg: EntityHurtAfterEvent) -> Unit)
}


external open class EntityInventoryComponent : EntityComponent {
    open var additionalSlotsPerStrength: Number
    open var canBeSiphonedFrom: Boolean
    open var container: Container
    open var containerType: String
    open var inventorySize: Number
    open var private: Boolean
    open var restrictToOwner: Boolean

    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityIsBabyComponent : EntityComponent {
    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityIsChargedComponent : EntityComponent {
    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityIsChestedComponent : EntityComponent {
    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityIsDyeableComponent : EntityComponent {
    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityIsHiddenWhenInvisibleComponent : EntityComponent {
    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityIsIgnitedComponent : EntityComponent {
    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityIsIllagerCaptainComponent : EntityComponent {
    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityIsSaddledComponent : EntityComponent {
    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityIsShakingComponent : EntityComponent {
    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityIsShearedComponent : EntityComponent {
    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityIsStackableComponent : EntityComponent {
    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityIsStunnedComponent : EntityComponent {
    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityIsTamedComponent : EntityComponent {
    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityItemComponent : EntityComponent {
    open var itemStack: ItemStack

    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityLavaMovementComponent : EntityAttributeComponent {
    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityLeashableComponent : EntityComponent {
    open var softDistance: Number
    open fun leash(leashHolder: Entity)
    open fun unleash()

    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityLoadAfterEvent {
    open var entity: Entity
}


external open class EntityLoadAfterEventSignal {
    open fun subscribe(callback: (arg: EntityLoadAfterEvent) -> Unit): (arg: EntityLoadAfterEvent) -> Unit
    open fun unsubscribe(callback: (arg: EntityLoadAfterEvent) -> Unit)
}


external open class EntityMarkVariantComponent : EntityComponent {
    open var value: Number

    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityMovementAmphibiousComponent : EntityBaseMovementComponent {
    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityMovementBasicComponent : EntityBaseMovementComponent {
    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityMovementComponent : EntityAttributeComponent {
    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityMovementFlyComponent : EntityBaseMovementComponent {
    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityMovementGenericComponent : EntityBaseMovementComponent {
    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityMovementGlideComponent : EntityBaseMovementComponent {
    open var speedWhenTurning: Number
    open var startSpeed: Number

    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityMovementHoverComponent : EntityBaseMovementComponent {
    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityMovementJumpComponent : EntityBaseMovementComponent {
    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityMovementSkipComponent : EntityBaseMovementComponent {
    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityMovementSwayComponent : EntityBaseMovementComponent {
    open var swayAmplitude: Number
    open var swayFrequency: Number

    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityNavigationClimbComponent : EntityNavigationComponent {
    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityNavigationComponent : EntityComponent {
    open var avoidDamageBlocks: Boolean
    open var avoidPortals: Boolean
    open var avoidSun: Boolean
    open var avoidWater: Boolean
    open var canBreach: Boolean
    open var canBreakDoors: Boolean
    open var canFloat: Boolean
    open var canJump: Boolean
    open var canOpenDoors: Boolean
    open var canOpenIronDoors: Boolean
    open var canPassDoors: Boolean
    open var canPathFromAir: Boolean
    open var canPathOverLava: Boolean
    open var canPathOverWater: Boolean
    open var canSink: Boolean
    open var canSwim: Boolean
    open var canWalk: Boolean
    open var canWalkInLava: Boolean
    open var isAmphibious: Boolean
}


external open class EntityNavigationFloatComponent : EntityNavigationComponent {
    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityNavigationFlyComponent : EntityNavigationComponent {
    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityNavigationGenericComponent : EntityNavigationComponent {
    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityNavigationHoverComponent : EntityNavigationComponent {
    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityNavigationWalkComponent : EntityNavigationComponent {
    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityNpcComponent : EntityComponent {
    open var defaultScene: String
    open var name: String
    open var skinIndex: Number

    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityOnFireComponent : EntityComponent {
    open var onFireTicksRemaining: Number

    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityProjectileComponent : EntityComponent {
    open var airInertia: Number
    open var catchFireOnHurt: Boolean
    open var critParticlesOnProjectileHurt: Boolean
    open var destroyOnProjectileHurt: Boolean
    open var gravity: Number
    open var hitEntitySound: String
    open var hitGroundSound: String
    open var hitParticle: String
    open var lightningStrikeOnHit: Boolean
    open var liquidInertia: Number
    open var onFireTime: Number
    open var owner: Entity
    open var shouldBounceOnHit: Boolean
    open var stopOnHit: Boolean
    open fun shoot(velocity: Vector3, options: ProjectileShootOptions = definedExternally)

    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityPushThroughComponent : EntityComponent {
    open var value: Number

    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityRemoveAfterEvent {
    open var removedEntityId: String
    open var typeId: String
}


external open class EntityRemoveAfterEventSignal {
    open fun subscribe(callback: (arg: EntityRemoveAfterEvent) -> Unit, options: EntityEventOptions = definedExternally): (arg: EntityRemoveAfterEvent) -> Unit
    open fun unsubscribe(callback: (arg: EntityRemoveAfterEvent) -> Unit)
}


external open class EntityRemoveBeforeEvent {
    open var removedEntity: Entity
}


external open class EntityRemoveBeforeEventSignal {
    open fun subscribe(callback: (arg: EntityRemoveBeforeEvent) -> Unit): (arg: EntityRemoveBeforeEvent) -> Unit
    open fun unsubscribe(callback: (arg: EntityRemoveBeforeEvent) -> Unit)
}


external open class EntityRideableComponent : EntityComponent {
    open var controllingSeat: Number
    open var crouchingSkipInteract: Boolean
    open var interactText: String
    open var passengerMaxWidth: Number
    open var pullInEntities: Boolean
    open var riderCanInteract: Boolean
    open var seatCount: Number
    open fun addRider(rider: Entity): Boolean
    open fun ejectRider(rider: Entity)
    open fun ejectRiders()
    open fun getFamilyTypes(): Array<String>
    open fun getRiders(): Array<Entity>
    open fun getSeats(): Array<Seat>

    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityRidingComponent : EntityComponent {
    open var entityRidingOn: Entity

    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityScaleComponent : EntityComponent {
    open var value: Number

    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntitySkinIdComponent : EntityComponent {
    open var value: Number

    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntitySpawnAfterEvent {
    open var cause: EntityInitializationCause
    open var entity: Entity
}


external open class EntitySpawnAfterEventSignal {
    open fun subscribe(callback: (arg: EntitySpawnAfterEvent) -> Unit): (arg: EntitySpawnAfterEvent) -> Unit
    open fun unsubscribe(callback: (arg: EntitySpawnAfterEvent) -> Unit)
}


external open class EntityStrengthComponent : EntityComponent {
    open var max: Number
    open var value: Number

    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityTameableComponent : EntityComponent {
    open var getTameItems: Array<ItemStack>
    open var isTamed: Boolean
    open var probability: Number
    open var tamedToPlayer: Player
    open var tamedToPlayerId: String
    open fun tame(player: Player): Boolean

    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityTameMountComponent : EntityComponent {
    open var isTamed: Boolean
    open var isTamedToPlayer: Boolean
    open var tamedToPlayer: Player
    open var tamedToPlayerId: String
    open fun tame(showParticles: Boolean)
    open fun tameToPlayer(showParticles: Boolean, player: Player): Boolean

    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityType {
    open var id: String
}


external open class EntityTypeFamilyComponent : EntityComponent {
    open fun getTypeFamilies(): Array<String>
    open fun hasTypeFamily(typeFamily: String): Boolean

    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityTypes {
    companion object {
        fun get(identifier: String): EntityType?
        fun getAll(): Array<EntityType>
    }
}


external open class EntityUnderwaterMovementComponent : EntityAttributeComponent {
    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityVariantComponent : EntityComponent {
    open var value: Number

    companion object {
        var componentId: Any = definedExternally
    }
}


external open class EntityWantsJockeyComponent : EntityComponent {
    companion object {
        var componentId: Any = definedExternally
    }
}


external open class ExplosionAfterEvent {
    open var dimension: Dimension
    open var source: Entity
    open fun getImpactedBlocks(): Array<Block>
}


external open class ExplosionAfterEventSignal {
    open fun subscribe(callback: (arg: ExplosionAfterEvent) -> Unit): (arg: ExplosionAfterEvent) -> Unit
    open fun unsubscribe(callback: (arg: ExplosionAfterEvent) -> Unit)
}


external open class ExplosionBeforeEvent : ExplosionAfterEvent {
    open var cancel: Boolean
    open fun setImpactedBlocks(blocks: Array<Block>)
}


external open class ExplosionBeforeEventSignal {
    open fun subscribe(callback: (arg: ExplosionBeforeEvent) -> Unit): (arg: ExplosionBeforeEvent) -> Unit
    open fun unsubscribe(callback: (arg: ExplosionBeforeEvent) -> Unit)
}


external open class FeedItem {
    open var healAmount: Number
    open var item: String
    open fun getEffects(): Array<FeedItemEffect>
}


external open class FeedItemEffect {
    open var amplifier: Number
    open var chance: Number
    open var duration: Number
    open var name: String
}


external open class FilterGroup


external open class FluidContainer {
    companion object {
        var maxFillLevel: Any = definedExternally
        var minFillLevel: Any = definedExternally
    }
}


external open class GameRuleChangeAfterEvent {
    open var rule: GameRule
    open var value: dynamic /* Boolean | Number */
}


external open class GameRuleChangeAfterEventSignal {
    open fun subscribe(callback: (arg: GameRuleChangeAfterEvent) -> Unit): (arg: GameRuleChangeAfterEvent) -> Unit
    open fun unsubscribe(callback: (arg: GameRuleChangeAfterEvent) -> Unit)
}


external open class GameRules {
    open var commandBlockOutput: Boolean
    open var commandBlocksEnabled: Boolean
    open var doDayLightCycle: Boolean
    open var doEntityDrops: Boolean
    open var doFireTick: Boolean
    open var doImmediateRespawn: Boolean
    open var doInsomnia: Boolean
    open var doLimitedCrafting: Boolean
    open var doMobLoot: Boolean
    open var doMobSpawning: Boolean
    open var doTileDrops: Boolean
    open var doWeatherCycle: Boolean
    open var drowningDamage: Boolean
    open var fallDamage: Boolean
    open var fireDamage: Boolean
    open var freezeDamage: Boolean
    open var functionCommandLimit: Number
    open var keepInventory: Boolean
    open var maxCommandChainLength: Number
    open var mobGriefing: Boolean
    open var naturalRegeneration: Boolean
    open var playersSleepingPercentage: Number
    open var projectilesCanBreakBlocks: Boolean
    open var pvp: Boolean
    open var randomTickSpeed: Number
    open var recipesUnlock: Boolean
    open var respawnBlocksExplode: Boolean
    open var sendCommandFeedback: Boolean
    open var showBorderEffect: Boolean
    open var showCoordinates: Boolean
    open var showDaysPlayed: Boolean
    open var showDeathMessages: Boolean
    open var showRecipeMessages: Boolean
    open var showTags: Boolean
    open var spawnRadius: Number
    open var tntExplodes: Boolean
    open var tntExplosionDropDecay: Boolean
}


external open class IButtonPushAfterEventSignal {
    open fun subscribe(callback: (arg: ButtonPushAfterEvent) -> Unit): (arg: ButtonPushAfterEvent) -> Unit
    open fun unsubscribe(callback: (arg: ButtonPushAfterEvent) -> Unit)
}


external open class ILeverActionAfterEventSignal {
    open fun subscribe(callback: (arg: LeverActionAfterEvent) -> Unit): (arg: LeverActionAfterEvent) -> Unit
    open fun unsubscribe(callback: (arg: LeverActionAfterEvent) -> Unit)
}


external open class IPlayerJoinAfterEventSignal {
    open fun subscribe(callback: (arg: PlayerJoinAfterEvent) -> Unit): (arg: PlayerJoinAfterEvent) -> Unit
    open fun unsubscribe(callback: (arg: PlayerJoinAfterEvent) -> Unit)
}


external open class IPlayerLeaveAfterEventSignal {
    open fun subscribe(callback: (arg: PlayerLeaveAfterEvent) -> Unit): (arg: PlayerLeaveAfterEvent) -> Unit
    open fun unsubscribe(callback: (arg: PlayerLeaveAfterEvent) -> Unit)
}


external open class IPlayerSpawnAfterEventSignal {
    open fun subscribe(callback: (arg: PlayerSpawnAfterEvent) -> Unit): (arg: PlayerSpawnAfterEvent) -> Unit
    open fun unsubscribe(callback: (arg: PlayerSpawnAfterEvent) -> Unit)
}


external open class ItemCompleteUseAfterEvent {
    open var itemStack: ItemStack
    open var source: Player
    open var useDuration: Number
}


external open class ItemCompleteUseAfterEventSignal {
    open fun subscribe(callback: (arg: ItemCompleteUseAfterEvent) -> Unit): (arg: ItemCompleteUseAfterEvent) -> Unit
    open fun unsubscribe(callback: (arg: ItemCompleteUseAfterEvent) -> Unit)
}


external open class ItemCompleteUseEvent {
    open var itemStack: ItemStack
    open var source: Player
}


external open class ItemComponent : Component


external open class ItemComponentBeforeDurabilityDamageEvent {
    open var attackingEntity: Entity
    open var durabilityDamage: Number
    open var hitEntity: Entity
    open var itemStack: ItemStack
}


external open class ItemComponentCompleteUseEvent : ItemCompleteUseEvent


external open class ItemComponentConsumeEvent {
    open var itemStack: ItemStack
    open var source: Entity
}


external open class ItemComponentHitEntityEvent {
    open var attackingEntity: Entity
    open var hadEffect: Boolean
    open var hitEntity: Entity
    open var itemStack: ItemStack
}


external open class ItemComponentMineBlockEvent {
    open var block: Block
    open var itemStack: ItemStack
    open var minedBlockPermutation: BlockPermutation
    open var source: Entity
}


external open class ItemComponentRegistry {
    open fun registerCustomComponent(name: String, itemCustomComponent: ItemCustomComponent)
}


external open class ItemComponentUseEvent {
    open var itemStack: ItemStack
    open var source: Player
}


external open class ItemComponentUseOnEvent : ItemUseOnEvent {
    open var source: Entity
    open var usedOnBlockPermutation: BlockPermutation
}


external open class ItemCooldownComponent : ItemComponent {
    open var cooldownCategory: String
    open var cooldownTicks: Number
    open fun getCooldownTicksRemaining(player: Player): Number
    open fun isCooldownCategory(cooldownCategory: String): Boolean
    open fun startCooldown(player: Player)

    companion object {
        var componentId: Any = definedExternally
    }
}


external open class ItemDurabilityComponent : ItemComponent {
    open var damage: Number
    open var maxDurability: Number
    open fun getDamageChance(unbreakingEnchantmentLevel: Number = definedExternally): Number
    open fun getDamageChanceRange(): NumberRange

    companion object {
        var componentId: Any = definedExternally
    }
}


external open class ItemEnchantableComponent : ItemComponent {
    open var slots: Array<EnchantmentSlot>
    open fun addEnchantment(enchantment: Enchantment)
    open fun addEnchantments(enchantments: Array<Enchantment>)
    open fun canAddEnchantment(enchantment: Enchantment): Boolean
    open fun getEnchantment(enchantmentType: EnchantmentType): Enchantment?
    open fun getEnchantment(enchantmentType: String): Enchantment?
    open fun getEnchantments(): Array<Enchantment>
    open fun hasEnchantment(enchantmentType: EnchantmentType): Boolean
    open fun hasEnchantment(enchantmentType: String): Boolean
    open fun removeAllEnchantments()
    open fun removeEnchantment(enchantmentType: EnchantmentType)
    open fun removeEnchantment(enchantmentType: String)

    companion object {
        var componentId: Any = definedExternally
    }
}


external open class ItemFoodComponent : ItemComponent {
    open var canAlwaysEat: Boolean
    open var nutrition: Number
    open var saturationModifier: Number
    open var usingConvertsTo: String

    companion object {
        var componentId: Any = definedExternally
    }
}


external open class ItemReleaseUseAfterEvent {
    open var itemStack: ItemStack
    open var source: Player
    open var useDuration: Number
}


external open class ItemReleaseUseAfterEventSignal {
    open fun subscribe(callback: (arg: ItemReleaseUseAfterEvent) -> Unit): (arg: ItemReleaseUseAfterEvent) -> Unit
    open fun unsubscribe(callback: (arg: ItemReleaseUseAfterEvent) -> Unit)
}


external open class ItemStack {
    open var amount: Number
    open var isStackable: Boolean
    open var keepOnDeath: Boolean
    open var lockMode: ItemLockMode
    open var maxAmount: Number
    open var nameTag: String
    open var type: ItemType
    open var typeId: String
    constructor(itemType: ItemType, amount: Number = definedExternally)
    constructor(itemType: ItemType)
    constructor(itemType: String, amount: Number = definedExternally)
    constructor(itemType: String)
    open fun clearDynamicProperties()
    open fun clone(): ItemStack
    open fun getCanDestroy(): Array<String>
    open fun getCanPlaceOn(): Array<String>
    open fun <T : String> getComponent(componentId: T): Any
    open fun getComponents(): Array<ItemComponent>
    open fun getDynamicProperty(identifier: String): dynamic /* Boolean? | Number? | String? | Vector3? */
    open fun getDynamicPropertyIds(): Array<String>
    open fun getDynamicPropertyTotalByteCount(): Number
    open fun getLore(): Array<String>
    open fun getTags(): Array<String>
    open fun hasComponent(componentId: String): Boolean
    open fun hasTag(tag: String): Boolean
    open fun isStackableWith(itemStack: ItemStack): Boolean
    open fun matches(itemName: String, states: Record<String, Any /* Boolean | Number | String */> = definedExternally): Boolean
    open fun setCanDestroy(blockIdentifiers: Array<String> = definedExternally)
    open fun setCanPlaceOn(blockIdentifiers: Array<String> = definedExternally)
    open fun setDynamicProperty(identifier: String, value: Boolean = definedExternally)
    open fun setDynamicProperty(identifier: String)
    open fun setDynamicProperty(identifier: String, value: Number = definedExternally)
    open fun setDynamicProperty(identifier: String, value: String = definedExternally)
    open fun setDynamicProperty(identifier: String, value: Vector3 = definedExternally)
    open fun setLore(loreList: Array<String> = definedExternally)
}


external open class ItemStartUseAfterEvent {
    open var itemStack: ItemStack
    open var source: Player
    open var useDuration: Number
}


external open class ItemStartUseAfterEventSignal {
    open fun subscribe(callback: (arg: ItemStartUseAfterEvent) -> Unit): (arg: ItemStartUseAfterEvent) -> Unit
    open fun unsubscribe(callback: (arg: ItemStartUseAfterEvent) -> Unit)
}


external open class ItemStartUseOnAfterEvent {
    open var block: Block
    open var blockFace: Direction
    open var itemStack: ItemStack
    open var source: Player
}


external open class ItemStartUseOnAfterEventSignal {
    open fun subscribe(callback: (arg: ItemStartUseOnAfterEvent) -> Unit): (arg: ItemStartUseOnAfterEvent) -> Unit
    open fun unsubscribe(callback: (arg: ItemStartUseOnAfterEvent) -> Unit)
}


external open class ItemStopUseAfterEvent {
    open var itemStack: ItemStack
    open var source: Player
    open var useDuration: Number
}


external open class ItemStopUseAfterEventSignal {
    open fun subscribe(callback: (arg: ItemStopUseAfterEvent) -> Unit): (arg: ItemStopUseAfterEvent) -> Unit
    open fun unsubscribe(callback: (arg: ItemStopUseAfterEvent) -> Unit)
}


external open class ItemStopUseOnAfterEvent {
    open var block: Block
    open var itemStack: ItemStack
    open var source: Player
}


external open class ItemStopUseOnAfterEventSignal {
    open fun subscribe(callback: (arg: ItemStopUseOnAfterEvent) -> Unit): (arg: ItemStopUseOnAfterEvent) -> Unit
    open fun unsubscribe(callback: (arg: ItemStopUseOnAfterEvent) -> Unit)
}


external open class ItemType {
    open var id: String
}


external open class ItemTypes {
    companion object {
        fun get(itemId: String): ItemType?
        fun getAll(): Array<ItemType>
    }
}


external open class ItemUseAfterEvent {
    open var itemStack: ItemStack
    open var source: Player
}


external open class ItemUseAfterEventSignal {
    open fun subscribe(callback: (arg: ItemUseAfterEvent) -> Unit): (arg: ItemUseAfterEvent) -> Unit
    open fun unsubscribe(callback: (arg: ItemUseAfterEvent) -> Unit)
}


external open class ItemUseBeforeEvent : ItemUseAfterEvent {
    open var cancel: Boolean
}


external open class ItemUseBeforeEventSignal {
    open fun subscribe(callback: (arg: ItemUseBeforeEvent) -> Unit): (arg: ItemUseBeforeEvent) -> Unit
    open fun unsubscribe(callback: (arg: ItemUseBeforeEvent) -> Unit)
}


external open class ItemUseOnAfterEvent {
    open var block: Block
    open var blockFace: Direction
    open var faceLocation: Vector3
    open var itemStack: ItemStack
    open var source: Player
}


external open class ItemUseOnAfterEventSignal {
    open fun subscribe(callback: (arg: ItemUseOnAfterEvent) -> Unit): (arg: ItemUseOnAfterEvent) -> Unit
    open fun unsubscribe(callback: (arg: ItemUseOnAfterEvent) -> Unit)
}


external open class ItemUseOnBeforeEvent : ItemUseOnAfterEvent {
    open var cancel: Boolean
}


external open class ItemUseOnBeforeEventSignal {
    open fun subscribe(callback: (arg: ItemUseOnBeforeEvent) -> Unit): (arg: ItemUseOnBeforeEvent) -> Unit
    open fun unsubscribe(callback: (arg: ItemUseOnBeforeEvent) -> Unit)
}


external open class ItemUseOnEvent {
    open var block: Block
    open var blockFace: Direction
    open var faceLocation: Vector3
    open var itemStack: ItemStack
}


external open class LeverActionAfterEvent : BlockEvent {
    open var isPowered: Boolean
    open var player: Player
}


external open class LeverActionAfterEventSignal : ILeverActionAfterEventSignal


external open class ListBlockVolume(locations: Array<Vector3>) : BlockVolumeBase {
    open fun add(locations: Array<Vector3>)
    open fun remove(locations: Array<Vector3>)
}


external open class MessageReceiveAfterEvent {
    open var id: String
    open var message: String
    open var player: Player
}


external open class MinecraftDimensionTypes {
    companion object {
        var nether: Any = definedExternally
        var overworld: Any = definedExternally
        var theEnd: Any = definedExternally
    }
}


external open class MolangVariableMap {
    open fun setColorRGB(variableName: String, color: RGB)
    open fun setColorRGBA(variableName: String, color: RGBA)
    open fun setFloat(variableName: String, number: Number)
    open fun setSpeedAndDirection(variableName: String, speed: Number, direction: Vector3)
    open fun setVector3(variableName: String, vector: Vector3)
}


external open class PistonActivateAfterEvent : BlockEvent {
    open var isExpanding: Boolean
    open var piston: BlockPistonComponent
}


external open class PistonActivateAfterEventSignal {
    open fun subscribe(callback: (arg: PistonActivateAfterEvent) -> Unit): (arg: PistonActivateAfterEvent) -> Unit
    open fun unsubscribe(callback: (arg: PistonActivateAfterEvent) -> Unit)
}


external open class Player : Entity {
    open var camera: Camera
    open var inputPermissions: PlayerInputPermissions
    open var isEmoting: Boolean
    open var isFlying: Boolean
    open var isGliding: Boolean
    open var isJumping: Boolean
    open var level: Number
    open var name: String
    open var onScreenDisplay: ScreenDisplay
    open var selectedSlotIndex: Number
    open var totalXpNeededForNextLevel: Number
    open var xpEarnedAtCurrentLevel: Number
    open fun addExperience(amount: Number): Number
    open fun addLevels(amount: Number): Number
    open fun eatItem(itemStack: ItemStack)
    open fun getGameMode(): GameMode
    open fun getItemCooldown(cooldownCategory: String): Number
    open fun getSpawnPoint(): DimensionLocation?
    open fun getTotalXp(): Number
    open fun isOp(): Boolean
    open fun playMusic(trackId: String, musicOptions: MusicOptions = definedExternally)
    open fun playSound(soundId: String, soundOptions: PlayerSoundOptions = definedExternally)
    open fun postClientMessage(id: String, value: String)
    open fun queueMusic(trackId: String, musicOptions: MusicOptions = definedExternally)
    open fun resetLevel()
    open fun sendMessage(message: Array<Any /* RawMessage | String */>)
    open fun sendMessage(message: RawMessage)
    open fun sendMessage(message: String)
    open fun setGameMode(gameMode: GameMode = definedExternally)
    open fun setOp(isOp: Boolean)
    open fun setSpawnPoint(spawnPoint: DimensionLocation = definedExternally)
    open fun spawnParticle(effectName: String, location: Vector3, molangVariables: MolangVariableMap = definedExternally)
    open fun startItemCooldown(cooldownCategory: String, tickDuration: Number)
    open fun stopMusic()
}


external open class PlayerBreakBlockAfterEvent : BlockEvent {
    open var brokenBlockPermutation: BlockPermutation
    open var itemStackAfterBreak: ItemStack
    open var itemStackBeforeBreak: ItemStack
    open var player: Player
}


external open class PlayerBreakBlockAfterEventSignal {
    open fun subscribe(callback: (arg: PlayerBreakBlockAfterEvent) -> Unit, options: BlockEventOptions = definedExternally): (arg: PlayerBreakBlockAfterEvent) -> Unit
    open fun unsubscribe(callback: (arg: PlayerBreakBlockAfterEvent) -> Unit)
}


external open class PlayerBreakBlockBeforeEvent : BlockEvent {
    open var cancel: Boolean
    open var itemStack: ItemStack
    open var player: Player
}


external open class PlayerBreakBlockBeforeEventSignal {
    open fun subscribe(callback: (arg: PlayerBreakBlockBeforeEvent) -> Unit, options: BlockEventOptions = definedExternally): (arg: PlayerBreakBlockBeforeEvent) -> Unit
    open fun unsubscribe(callback: (arg: PlayerBreakBlockBeforeEvent) -> Unit)
}


external open class PlayerDimensionChangeAfterEvent {
    open var fromDimension: Dimension
    open var fromLocation: Vector3
    open var player: Player
    open var toDimension: Dimension
    open var toLocation: Vector3
}


external open class PlayerDimensionChangeAfterEventSignal {
    open fun subscribe(callback: (arg: PlayerDimensionChangeAfterEvent) -> Unit): (arg: PlayerDimensionChangeAfterEvent) -> Unit
    open fun unsubscribe(callback: (arg: PlayerDimensionChangeAfterEvent) -> Unit)
}


external open class PlayerGameModeChangeAfterEvent {
    open var fromGameMode: GameMode
    open var player: Player
    open var toGameMode: GameMode
}


external open class PlayerGameModeChangeAfterEventSignal {
    open fun subscribe(callback: (arg: PlayerGameModeChangeAfterEvent) -> Unit): (arg: PlayerGameModeChangeAfterEvent) -> Unit
    open fun unsubscribe(callback: (arg: PlayerGameModeChangeAfterEvent) -> Unit)
}


external open class PlayerGameModeChangeBeforeEvent {
    open var cancel: Boolean
    open var fromGameMode: GameMode
    open var player: Player
    open var toGameMode: GameMode
}


external open class PlayerGameModeChangeBeforeEventSignal {
    open fun subscribe(callback: (arg: PlayerGameModeChangeBeforeEvent) -> Unit): (arg: PlayerGameModeChangeBeforeEvent) -> Unit
    open fun unsubscribe(callback: (arg: PlayerGameModeChangeBeforeEvent) -> Unit)
}


external open class PlayerInputPermissionCategoryChangeAfterEvent {
    open var category: InputPermissionCategory
    open var enabled: Boolean
    open var player: Player
}


external open class PlayerInputPermissionCategoryChangeAfterEventSignal {
    open fun subscribe(callback: (arg: PlayerInputPermissionCategoryChangeAfterEvent) -> Unit): (arg: PlayerInputPermissionCategoryChangeAfterEvent) -> Unit
    open fun unsubscribe(callback: (arg: PlayerInputPermissionCategoryChangeAfterEvent) -> Unit)
}


external open class PlayerInputPermissions {
    open var cameraEnabled: Boolean
    open var movementEnabled: Boolean
}


external open class PlayerInteractWithBlockAfterEvent {
    open var block: Block
    open var blockFace: Direction
    open var faceLocation: Vector3
    open var itemStack: ItemStack
    open var player: Player
}


external open class PlayerInteractWithBlockAfterEventSignal {
    open fun subscribe(callback: (arg: PlayerInteractWithBlockAfterEvent) -> Unit): (arg: PlayerInteractWithBlockAfterEvent) -> Unit
    open fun unsubscribe(callback: (arg: PlayerInteractWithBlockAfterEvent) -> Unit)
}


external open class PlayerInteractWithBlockBeforeEvent {
    open var block: Block
    open var blockFace: Direction
    open var cancel: Boolean
    open var faceLocation: Vector3
    open var itemStack: ItemStack
    open var player: Player
}


external open class PlayerInteractWithBlockBeforeEventSignal {
    open fun subscribe(callback: (arg: PlayerInteractWithBlockBeforeEvent) -> Unit): (arg: PlayerInteractWithBlockBeforeEvent) -> Unit
    open fun unsubscribe(callback: (arg: PlayerInteractWithBlockBeforeEvent) -> Unit)
}


external open class PlayerInteractWithEntityAfterEvent {
    open var itemStack: ItemStack
    open var player: Player
    open var target: Entity
}


external open class PlayerInteractWithEntityAfterEventSignal {
    open fun subscribe(callback: (arg: PlayerInteractWithEntityAfterEvent) -> Unit): (arg: PlayerInteractWithEntityAfterEvent) -> Unit
    open fun unsubscribe(callback: (arg: PlayerInteractWithEntityAfterEvent) -> Unit)
}


external open class PlayerInteractWithEntityBeforeEvent {
    open var cancel: Boolean
    open var itemStack: ItemStack
    open var player: Player
    open var target: Entity
}


external open class PlayerInteractWithEntityBeforeEventSignal {
    open fun subscribe(callback: (arg: PlayerInteractWithEntityBeforeEvent) -> Unit): (arg: PlayerInteractWithEntityBeforeEvent) -> Unit
    open fun unsubscribe(callback: (arg: PlayerInteractWithEntityBeforeEvent) -> Unit)
}

external open class PlayerJoinAfterEvent {
    open var playerId: String
    open var playerName: String
}


external open class PlayerJoinAfterEventSignal : IPlayerJoinAfterEventSignal


external open class PlayerLeaveAfterEvent {
    open var playerId: String
    open var playerName: String
}


external open class PlayerLeaveAfterEventSignal : IPlayerLeaveAfterEventSignal


external open class PlayerLeaveBeforeEvent {
    open var player: Player
}


external open class PlayerLeaveBeforeEventSignal {
    open fun subscribe(callback: (arg: PlayerLeaveBeforeEvent) -> Unit): (arg: PlayerLeaveBeforeEvent) -> Unit
    open fun unsubscribe(callback: (arg: PlayerLeaveBeforeEvent) -> Unit)
}


external open class PlayerPlaceBlockAfterEvent : BlockEvent {
    open var player: Player
}


external open class PlayerPlaceBlockAfterEventSignal {
    open fun subscribe(callback: (arg: PlayerPlaceBlockAfterEvent) -> Unit, options: BlockEventOptions = definedExternally): (arg: PlayerPlaceBlockAfterEvent) -> Unit
    open fun unsubscribe(callback: (arg: PlayerPlaceBlockAfterEvent) -> Unit)
}


external open class PlayerPlaceBlockBeforeEvent : BlockEvent {
    open var cancel: Boolean
    open var face: Direction
    open var faceLocation: Vector3
    open var permutationBeingPlaced: BlockPermutation
    open var player: Player
}


external open class PlayerPlaceBlockBeforeEventSignal {
    open fun subscribe(callback: (arg: PlayerPlaceBlockBeforeEvent) -> Unit, options: BlockEventOptions = definedExternally): (arg: PlayerPlaceBlockBeforeEvent) -> Unit
    open fun unsubscribe(callback: (arg: PlayerPlaceBlockBeforeEvent) -> Unit)
}


external open class PlayerSpawnAfterEvent {
    open var initialSpawn: Boolean
    open var player: Player
}


external open class PlayerSpawnAfterEventSignal : IPlayerSpawnAfterEventSignal


external open class PressurePlatePopAfterEvent : BlockEvent {
    open var previousRedstonePower: Number
    open var redstonePower: Number
}


external open class PressurePlatePopAfterEventSignal {
    open fun subscribe(callback: (arg: PressurePlatePopAfterEvent) -> Unit): (arg: PressurePlatePopAfterEvent) -> Unit
    open fun unsubscribe(callback: (arg: PressurePlatePopAfterEvent) -> Unit)
}


external open class PressurePlatePushAfterEvent : BlockEvent {
    open var previousRedstonePower: Number
    open var redstonePower: Number
    open var source: Entity
}


external open class PressurePlatePushAfterEventSignal {
    open fun subscribe(callback: (arg: PressurePlatePushAfterEvent) -> Unit): (arg: PressurePlatePushAfterEvent) -> Unit
    open fun unsubscribe(callback: (arg: PressurePlatePushAfterEvent) -> Unit)
}


external open class ProjectileHitBlockAfterEvent {
    open var dimension: Dimension
    open var hitVector: Vector3
    open var location: Vector3
    open var projectile: Entity
    open var source: Entity
    open fun getBlockHit(): BlockHitInformation
}


external open class ProjectileHitBlockAfterEventSignal {
    open fun subscribe(callback: (arg: ProjectileHitBlockAfterEvent) -> Unit): (arg: ProjectileHitBlockAfterEvent) -> Unit
    open fun unsubscribe(callback: (arg: ProjectileHitBlockAfterEvent) -> Unit)
}


external open class ProjectileHitEntityAfterEvent {
    open var dimension: Dimension
    open var hitVector: Vector3
    open var location: Vector3
    open var projectile: Entity
    open var source: Entity
    open fun getEntityHit(): EntityHitInformation
}


external open class ProjectileHitEntityAfterEventSignal {
    open fun subscribe(callback: (arg: ProjectileHitEntityAfterEvent) -> Unit): (arg: ProjectileHitEntityAfterEvent) -> Unit
    open fun unsubscribe(callback: (arg: ProjectileHitEntityAfterEvent) -> Unit)
}


external open class Scoreboard {
    open fun addObjective(objectiveId: String, displayName: String = definedExternally): ScoreboardObjective
    open fun clearObjectiveAtDisplaySlot(displaySlotId: DisplaySlotId): ScoreboardObjective?
    open fun getObjective(objectiveId: String): ScoreboardObjective?
    open fun getObjectiveAtDisplaySlot(displaySlotId: DisplaySlotId): ScoreboardObjectiveDisplayOptions?
    open fun getObjectives(): Array<ScoreboardObjective>
    open fun getParticipants(): Array<ScoreboardIdentity>
    open fun removeObjective(objectiveId: ScoreboardObjective): Boolean
    open fun removeObjective(objectiveId: String): Boolean
    open fun setObjectiveAtDisplaySlot(displaySlotId: DisplaySlotId, objectiveDisplaySetting: ScoreboardObjectiveDisplayOptions): ScoreboardObjective?
}


external open class ScoreboardIdentity {
    open var displayName: String
    open var id: Number
    open var type: ScoreboardIdentityType
    open fun getEntity(): Entity?
    open fun isValid(): Boolean
}


external open class ScoreboardObjective {
    open var displayName: String
    open var id: String
    open fun addScore(participant: Entity, scoreToAdd: Number): Number
    open fun addScore(participant: ScoreboardIdentity, scoreToAdd: Number): Number
    open fun addScore(participant: String, scoreToAdd: Number): Number
    open fun getParticipants(): Array<ScoreboardIdentity>
    open fun getScore(participant: Entity): Number?
    open fun getScore(participant: ScoreboardIdentity): Number?
    open fun getScore(participant: String): Number?
    open fun getScores(): Array<ScoreboardScoreInfo>
    open fun hasParticipant(participant: Entity): Boolean
    open fun hasParticipant(participant: ScoreboardIdentity): Boolean
    open fun hasParticipant(participant: String): Boolean
    open fun isValid(): Boolean
    open fun removeParticipant(participant: Entity): Boolean
    open fun removeParticipant(participant: ScoreboardIdentity): Boolean
    open fun removeParticipant(participant: String): Boolean
    open fun setScore(participant: Entity, score: Number)
    open fun setScore(participant: ScoreboardIdentity, score: Number)
    open fun setScore(participant: String, score: Number)
}


external open class ScoreboardScoreInfo {
    open var participant: ScoreboardIdentity
    open var score: Number
}


external open class ScreenDisplay {
    open fun getHiddenHudElements(): Array<HudElement>
    open fun hideAllExcept(hudElements: Array<HudElement> = definedExternally)
    open fun isForcedHidden(hudElement: HudElement): Boolean
    open fun isValid(): Boolean
    open fun resetHudElements()
    open fun setActionBar(text: Array<Any /* RawMessage | String */>)
    open fun setActionBar(text: RawMessage)
    open fun setActionBar(text: String)
    open fun setHudVisibility(visible: HudVisibility, hudElements: Array<HudElement> = definedExternally)
    open fun setTitle(title: Array<Any /* RawMessage | String */>, options: TitleDisplayOptions = definedExternally)
    open fun setTitle(title: Array<Any /* RawMessage | String */>)
    open fun setTitle(title: RawMessage, options: TitleDisplayOptions = definedExternally)
    open fun setTitle(title: RawMessage)
    open fun setTitle(title: String, options: TitleDisplayOptions = definedExternally)
    open fun setTitle(title: String)
    open fun updateSubtitle(subtitle: Array<Any /* RawMessage | String */>)
    open fun updateSubtitle(subtitle: RawMessage)
    open fun updateSubtitle(subtitle: String)
}


external open class ScriptEventCommandMessageAfterEvent {
    open var id: String
    open var initiator: Entity
    open var message: String
    open var sourceBlock: Block
    open var sourceEntity: Entity
    open var sourceType: ScriptEventSource
}


external open class ScriptEventCommandMessageAfterEventSignal {
    open fun subscribe(callback: (arg: ScriptEventCommandMessageAfterEvent) -> Unit, options: ScriptEventMessageFilterOptions = definedExternally): (arg: ScriptEventCommandMessageAfterEvent) -> Unit
    open fun unsubscribe(callback: (arg: ScriptEventCommandMessageAfterEvent) -> Unit)
}


external open class Seat {
    open var lockRiderRotation: Number
    open var maxRiderCount: Number
    open var minRiderCount: Number
    open var position: Vector3
    open var seatRotation: Number
}


external open class ServerMessageAfterEventSignal {
    open fun subscribe(callback: (arg: MessageReceiveAfterEvent) -> Unit): (arg: MessageReceiveAfterEvent) -> Unit
    open fun unsubscribe(callback: (arg: MessageReceiveAfterEvent) -> Unit)
}


external open class Structure {
    open var id: String
    open var size: Vector3
    open fun getBlockPermutation(location: Vector3): BlockPermutation?
    open fun getIsWaterlogged(location: Vector3): Boolean
    open fun isValid(): Boolean
    open fun saveAs(identifier: String, saveMode: StructureSaveMode = definedExternally): Structure
    open fun saveToWorld()
    open fun setBlockPermutation(location: Vector3, blockPermutation: BlockPermutation = definedExternally)
}


external open class StructureManager {
    open fun createEmpty(identifier: String, size: Vector3, saveMode: StructureSaveMode = definedExternally): Structure
    open fun createFromWorld(identifier: String, dimension: Dimension, from: Vector3, to: Vector3, options: StructureCreateOptions = definedExternally): Structure
    open fun delete(structure: String): Boolean
    open fun delete(structure: Structure): Boolean
    open fun get(identifier: String): Structure?
    open fun getWorldStructureIds(): Array<String>
    open fun place(structure: String, dimension: Dimension, location: Vector3, options: StructurePlaceOptions = definedExternally)
    open fun place(structure: String, dimension: Dimension, location: Vector3)
    open fun place(structure: Structure, dimension: Dimension, location: Vector3, options: StructurePlaceOptions = definedExternally)
    open fun place(structure: Structure, dimension: Dimension, location: Vector3)
}


external open class System {
    open var afterEvents: SystemAfterEvents
    open var beforeEvents: SystemBeforeEvents
    open var currentTick: Number
    open fun clearJob(jobId: Number)
    open fun clearRun(runId: Number)
    open fun run(callback: () -> Unit): Number
    open fun runInterval(callback: () -> Unit, tickInterval: Number = definedExternally): Number
    open fun runJob(generator: Generator<Unit, Unit, Unit>): Number
    open fun runTimeout(callback: () -> Unit, tickDelay: Number = definedExternally): Number
    open fun waitTicks(ticks: Number): Promise<Unit>
}


external open class SystemAfterEvents {
    open var scriptEventReceive: ScriptEventCommandMessageAfterEventSignal
}


external open class SystemBeforeEvents {
    open var watchdogTerminate: WatchdogTerminateBeforeEventSignal
}


external open class TargetBlockHitAfterEvent : BlockEvent {
    open var hitVector: Vector3
    open var previousRedstonePower: Number
    open var redstonePower: Number
    open var source: Entity
}


external open class TargetBlockHitAfterEventSignal {
    open fun subscribe(callback: (arg: TargetBlockHitAfterEvent) -> Unit): (arg: TargetBlockHitAfterEvent) -> Unit
    open fun unsubscribe(callback: (arg: TargetBlockHitAfterEvent) -> Unit)
}


external open class Trigger(eventName: String) {
    open var eventName: String
}


external open class TripWireTripAfterEvent : BlockEvent {
    open var isPowered: Boolean
    open var sources: Array<Entity>
}


external open class TripWireTripAfterEventSignal {
    open fun subscribe(callback: (arg: TripWireTripAfterEvent) -> Unit): (arg: TripWireTripAfterEvent) -> Unit
    open fun unsubscribe(callback: (arg: TripWireTripAfterEvent) -> Unit)
}


external open class WatchdogTerminateBeforeEvent {
    open var cancel: Boolean
    open var terminateReason: WatchdogTerminateReason
}


external open class WatchdogTerminateBeforeEventSignal {
    open fun subscribe(callback: (arg: WatchdogTerminateBeforeEvent) -> Unit): (arg: WatchdogTerminateBeforeEvent) -> Unit
    open fun unsubscribe(callback: (arg: WatchdogTerminateBeforeEvent) -> Unit)
}


external open class WeatherChangeAfterEvent {
    open var dimension: String
    open var newWeather: WeatherType
    open var previousWeather: WeatherType
}


external open class WeatherChangeAfterEventSignal {
    open fun subscribe(callback: (arg: WeatherChangeAfterEvent) -> Unit): (arg: WeatherChangeAfterEvent) -> Unit
    open fun unsubscribe(callback: (arg: WeatherChangeAfterEvent) -> Unit)
}


external open class WeatherChangeBeforeEvent {
    open var cancel: Boolean
    open var duration: Number
    open var newWeather: WeatherType
    open var previousWeather: WeatherType
}


external open class WeatherChangeBeforeEventSignal {
    open fun subscribe(callback: (arg: WeatherChangeBeforeEvent) -> Unit): (arg: WeatherChangeBeforeEvent) -> Unit
    open fun unsubscribe(callback: (arg: WeatherChangeBeforeEvent) -> Unit)
}


external open class World {
    open var afterEvents: WorldAfterEvents
    open var beforeEvents: WorldBeforeEvents
    open var gameRules: GameRules
    open var scoreboard: Scoreboard
    open var structureManager: StructureManager
    open fun broadcastClientMessage(id: String, value: String)
    open fun clearDynamicProperties()
    open fun getAbsoluteTime(): Number
    open fun getAllPlayers(): Array<Player>
    open fun getDay(): Number
    open fun getDefaultSpawnLocation(): Vector3
    open fun getDimension(dimensionId: String): Dimension
    open fun getDynamicProperty(identifier: String): dynamic /* Boolean? | Number? | String? | Vector3? */
    open fun getDynamicPropertyIds(): Array<String>
    open fun getDynamicPropertyTotalByteCount(): Number
    open fun getEntity(id: String): Entity?
    open fun getMoonPhase(): MoonPhase
    open fun getPlayers(options: EntityQueryOptions = definedExternally): Array<Player>
    open fun getTimeOfDay(): Number
    open fun playMusic(trackId: String, musicOptions: MusicOptions = definedExternally)
    open fun playSound(soundId: String, location: Vector3, soundOptions: WorldSoundOptions = definedExternally)
    open fun queueMusic(trackId: String, musicOptions: MusicOptions = definedExternally)
    open fun sendMessage(message: Array<Any /* RawMessage | String */>)
    open fun sendMessage(message: RawMessage)
    open fun sendMessage(message: String)
    open fun setAbsoluteTime(absoluteTime: Number)
    open fun setDefaultSpawnLocation(spawnLocation: Vector3)
    open fun setDynamicProperty(identifier: String, value: Boolean = definedExternally)
    open fun setDynamicProperty(identifier: String)
    open fun setDynamicProperty(identifier: String, value: Number = definedExternally)
    open fun setDynamicProperty(identifier: String, value: String = definedExternally)
    open fun setDynamicProperty(identifier: String, value: Vector3 = definedExternally)
    open fun setTimeOfDay(timeOfDay: Number)
    open fun setTimeOfDay(timeOfDay: TimeOfDay)
    open fun stopMusic()
}


external open class WorldAfterEvents {
    open var blockExplode: BlockExplodeAfterEventSignal
    open var buttonPush: ButtonPushAfterEventSignal
    open var chatSend: ChatSendAfterEventSignal
    open var dataDrivenEntityTrigger: DataDrivenEntityTriggerAfterEventSignal
    open var effectAdd: EffectAddAfterEventSignal
    open var entityDie: EntityDieAfterEventSignal
    open var entityHealthChanged: EntityHealthChangedAfterEventSignal
    open var entityHitBlock: EntityHitBlockAfterEventSignal
    open var entityHitEntity: EntityHitEntityAfterEventSignal
    open var entityHurt: EntityHurtAfterEventSignal
    open var entityLoad: EntityLoadAfterEventSignal
    open var entityRemove: EntityRemoveAfterEventSignal
    open var entitySpawn: EntitySpawnAfterEventSignal
    open var explosion: ExplosionAfterEventSignal
    open var gameRuleChange: GameRuleChangeAfterEventSignal
    open var itemCompleteUse: ItemCompleteUseAfterEventSignal
    open var itemReleaseUse: ItemReleaseUseAfterEventSignal
    open var itemStartUse: ItemStartUseAfterEventSignal
    open var itemStartUseOn: ItemStartUseOnAfterEventSignal
    open var itemStopUse: ItemStopUseAfterEventSignal
    open var itemStopUseOn: ItemStopUseOnAfterEventSignal
    open var itemUse: ItemUseAfterEventSignal
    open var itemUseOn: ItemUseOnAfterEventSignal
    open var leverAction: LeverActionAfterEventSignal
    open var messageReceive: ServerMessageAfterEventSignal
    open var pistonActivate: PistonActivateAfterEventSignal
    open var playerBreakBlock: PlayerBreakBlockAfterEventSignal
    open var playerDimensionChange: PlayerDimensionChangeAfterEventSignal
    open var playerGameModeChange: PlayerGameModeChangeAfterEventSignal
    open var playerInputPermissionCategoryChange: PlayerInputPermissionCategoryChangeAfterEventSignal
    open var playerInteractWithBlock: PlayerInteractWithBlockAfterEventSignal
    open var playerInteractWithEntity: PlayerInteractWithEntityAfterEventSignal
    open var playerJoin: PlayerJoinAfterEventSignal
    open var playerLeave: PlayerLeaveAfterEventSignal
    open var playerPlaceBlock: PlayerPlaceBlockAfterEventSignal
    open var playerSpawn: PlayerSpawnAfterEventSignal
    open var pressurePlatePop: PressurePlatePopAfterEventSignal
    open var pressurePlatePush: PressurePlatePushAfterEventSignal
    open var projectileHitBlock: ProjectileHitBlockAfterEventSignal
    open var projectileHitEntity: ProjectileHitEntityAfterEventSignal
    open var targetBlockHit: TargetBlockHitAfterEventSignal
    open var tripWireTrip: TripWireTripAfterEventSignal
    open var weatherChange: WeatherChangeAfterEventSignal
    open var worldInitialize: WorldInitializeAfterEventSignal
}


external open class WorldBeforeEvents {
    open var chatSend: ChatSendBeforeEventSignal
    open var effectAdd: EffectAddBeforeEventSignal
    open var entityRemove: EntityRemoveBeforeEventSignal
    open var explosion: ExplosionBeforeEventSignal
    open var itemUse: ItemUseBeforeEventSignal
    open var itemUseOn: ItemUseOnBeforeEventSignal
    open var playerBreakBlock: PlayerBreakBlockBeforeEventSignal
    open var playerGameModeChange: PlayerGameModeChangeBeforeEventSignal
    open var playerInteractWithBlock: PlayerInteractWithBlockBeforeEventSignal
    open var playerInteractWithEntity: PlayerInteractWithEntityBeforeEventSignal
    open var playerLeave: PlayerLeaveBeforeEventSignal
    open var playerPlaceBlock: PlayerPlaceBlockBeforeEventSignal
    open var weatherChange: WeatherChangeBeforeEventSignal
    open var worldInitialize: WorldInitializeBeforeEventSignal
}


external open class WorldInitializeAfterEvent


external open class WorldInitializeAfterEventSignal {
    open fun subscribe(callback: (arg: WorldInitializeAfterEvent) -> Unit): (arg: WorldInitializeAfterEvent) -> Unit
    open fun unsubscribe(callback: (arg: WorldInitializeAfterEvent) -> Unit)
}


external open class WorldInitializeBeforeEvent {
    open var blockTypeRegistry: BlockComponentRegistry
    open var itemComponentRegistry: ItemComponentRegistry
}


external open class WorldInitializeBeforeEventSignal {
    open fun subscribe(callback: (arg: WorldInitializeBeforeEvent) -> Unit): (arg: WorldInitializeBeforeEvent) -> Unit
    open fun unsubscribe(callback: (arg: WorldInitializeBeforeEvent) -> Unit)
}


external interface BiomeSearchOptions {
    var boundingSize: Vector3?
        get() = definedExternally
        set(value) = definedExternally
}


external interface BlockCustomComponent {
    var beforeOnPlayerPlace: ((arg: BlockComponentPlayerPlaceBeforeEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onEntityFallOn: ((arg: BlockComponentEntityFallOnEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onPlace: ((arg: BlockComponentOnPlaceEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onPlayerDestroy: ((arg: BlockComponentPlayerDestroyEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onPlayerInteract: ((arg: BlockComponentPlayerInteractEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onRandomTick: ((arg: BlockComponentRandomTickEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onStepOff: ((arg: BlockComponentStepOffEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onStepOn: ((arg: BlockComponentStepOnEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onTick: ((arg: BlockComponentTickEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
}


external interface BlockEventOptions {
    var blockTypes: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var permutations: Array<BlockPermutation>?
        get() = definedExternally
        set(value) = definedExternally
}


external interface BlockFillOptions {
    var blockFilter: BlockFilter?
        get() = definedExternally
        set(value) = definedExternally
    var ignoreChunkBoundErrors: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}


external interface BlockFilter {
    var excludePermutations: Array<BlockPermutation>?
        get() = definedExternally
        set(value) = definedExternally
    var excludeTags: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var excludeTypes: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var includePermutations: Array<BlockPermutation>?
        get() = definedExternally
        set(value) = definedExternally
    var includeTags: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var includeTypes: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
}


external interface BlockHitInformation {
    var block: Block
    var face: Direction
    var faceLocation: Vector3
}


external interface BlockRaycastHit {
    var block: Block
    var face: Direction
    var faceLocation: Vector3
}


external interface BlockRaycastOptions : BlockFilter {
    var includeLiquidBlocks: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var includePassableBlocks: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var maxDistance: Number?
        get() = definedExternally
        set(value) = definedExternally
}


external interface BoundingBox {
    var max: Vector3
    var min: Vector3
}


external interface CameraDefaultOptions {
    var easeOptions: CameraEaseOptions
}


external interface CameraEaseOptions {
    var easeTime: Number?
        get() = definedExternally
        set(value) = definedExternally
    var easeType: EasingType?
        get() = definedExternally
        set(value) = definedExternally
}


external interface CameraFadeOptions {
    var fadeColor: RGB?
        get() = definedExternally
        set(value) = definedExternally
    var fadeTime: CameraFadeTimeOptions?
        get() = definedExternally
        set(value) = definedExternally
}


external interface CameraFadeTimeOptions {
    var fadeInTime: Number
    var fadeOutTime: Number
    var holdTime: Number
}


external interface CameraSetFacingOptions {
    var easeOptions: CameraEaseOptions?
        get() = definedExternally
        set(value) = definedExternally
    var facingEntity: Entity
    var location: Vector3?
        get() = definedExternally
        set(value) = definedExternally
}


external interface CameraSetLocationOptions {
    var easeOptions: CameraEaseOptions?
        get() = definedExternally
        set(value) = definedExternally
    var location: Vector3
}


external interface CameraSetPosOptions {
    var easeOptions: CameraEaseOptions?
        get() = definedExternally
        set(value) = definedExternally
    var facingLocation: Vector3
    var location: Vector3?
        get() = definedExternally
        set(value) = definedExternally
}


external interface CameraSetRotOptions {
    var easeOptions: CameraEaseOptions?
        get() = definedExternally
        set(value) = definedExternally
    var location: Vector3?
        get() = definedExternally
        set(value) = definedExternally
    var rotation: Vector2
}


external interface CompoundBlockVolumeItem {
    var action: CompoundBlockVolumeAction?
        get() = definedExternally
        set(value) = definedExternally
    var locationRelativity: CompoundBlockVolumePositionRelativity?
        get() = definedExternally
        set(value) = definedExternally
    var volume: BlockVolume
}


external interface DefinitionModifier {
    var addedComponentGroups: Array<String>
    var removedComponentGroups: Array<String>
    var triggers: Array<Trigger>
}


external interface DimensionLocation {
    var dimension: Dimension
    var x: Number
    var y: Number
    var z: Number
}


external interface Enchantment {
    var level: Number
    var type: EnchantmentType
}


external interface EntityApplyDamageByProjectileOptions {
    var damagingEntity: Entity?
        get() = definedExternally
        set(value) = definedExternally
    var damagingProjectile: Entity
}


external interface EntityApplyDamageOptions {
    var cause: EntityDamageCause
    var damagingEntity: Entity?
        get() = definedExternally
        set(value) = definedExternally
}


external interface EntityDamageSource {
    var cause: EntityDamageCause
    var damagingEntity: Entity?
        get() = definedExternally
        set(value) = definedExternally
    var damagingProjectile: Entity?
        get() = definedExternally
        set(value) = definedExternally
}


external interface EntityDataDrivenTriggerEventOptions {
    var entities: Array<Entity>?
        get() = definedExternally
        set(value) = definedExternally
    var entityTypes: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var eventTypes: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
}


external interface EntityEffectOptions {
    var amplifier: Number?
        get() = definedExternally
        set(value) = definedExternally
    var showParticles: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}


external interface EntityEventOptions {
    var entities: Array<Entity>?
        get() = definedExternally
        set(value) = definedExternally
    var entityTypes: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
}


external interface EntityFilter {
    var excludeFamilies: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var excludeGameModes: Array<GameMode>?
        get() = definedExternally
        set(value) = definedExternally
    var excludeNames: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var excludeTags: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var excludeTypes: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var families: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var gameMode: GameMode?
        get() = definedExternally
        set(value) = definedExternally
    var maxHorizontalRotation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var maxLevel: Number?
        get() = definedExternally
        set(value) = definedExternally
    var maxVerticalRotation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var minHorizontalRotation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var minLevel: Number?
        get() = definedExternally
        set(value) = definedExternally
    var minVerticalRotation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var propertyOptions: Array<EntityQueryPropertyOptions>?
        get() = definedExternally
        set(value) = definedExternally
    var scoreOptions: Array<EntityQueryScoreOptions>?
        get() = definedExternally
        set(value) = definedExternally
    var tags: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var type: String?
        get() = definedExternally
        set(value) = definedExternally
}


external interface EntityHitInformation {
    var entity: Entity?
        get() = definedExternally
        set(value) = definedExternally
}


external interface EntityQueryOptions : EntityFilter {
    var closest: Number?
        get() = definedExternally
        set(value) = definedExternally
    var farthest: Number?
        get() = definedExternally
        set(value) = definedExternally
    var location: Vector3?
        get() = definedExternally
        set(value) = definedExternally
    var maxDistance: Number?
        get() = definedExternally
        set(value) = definedExternally
    var minDistance: Number?
        get() = definedExternally
        set(value) = definedExternally
    var volume: Vector3?
        get() = definedExternally
        set(value) = definedExternally
}


external interface EntityQueryPropertyOptions {
    var exclude: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var propertyId: String
    var value: dynamic /* Boolean? | String? | EqualsComparison? | GreaterThanComparison? | GreaterThanOrEqualsComparison? | LessThanComparison? | LessThanOrEqualsComparison? | NotEqualsComparison? | RangeComparison? */
        get() = definedExternally
        set(value) = definedExternally
}


external interface EntityQueryScoreOptions {
    var exclude: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var maxScore: Number?
        get() = definedExternally
        set(value) = definedExternally
    var minScore: Number?
        get() = definedExternally
        set(value) = definedExternally
    var objective: String?
        get() = definedExternally
        set(value) = definedExternally
}


external interface EntityRaycastHit {
    var distance: Number
    var entity: Entity
}


external interface EntityRaycastOptions : EntityFilter {
    var ignoreBlockCollision: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var includeLiquidBlocks: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var includePassableBlocks: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var maxDistance: Number?
        get() = definedExternally
        set(value) = definedExternally
}


external interface EqualsComparison {
    var equals: dynamic /* Boolean | Number | String */
        get() = definedExternally
        set(value) = definedExternally
}


external interface ExplosionOptions {
    var allowUnderwater: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var breaksBlocks: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var causesFire: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var source: Entity?
        get() = definedExternally
        set(value) = definedExternally
}


external interface GreaterThanComparison {
    var greaterThan: Number
}


external interface GreaterThanOrEqualsComparison {
    var greaterThanOrEquals: Number
}


external interface ItemCustomComponent {
    var onBeforeDurabilityDamage: ((arg: ItemComponentBeforeDurabilityDamageEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onCompleteUse: ((arg: ItemComponentCompleteUseEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onConsume: ((arg: ItemComponentConsumeEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onHitEntity: ((arg: ItemComponentHitEntityEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onMineBlock: ((arg: ItemComponentMineBlockEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onUse: ((arg: ItemComponentUseEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onUseOn: ((arg: ItemComponentUseOnEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
}


external interface LessThanComparison {
    var lessThan: Number
}


external interface LessThanOrEqualsComparison {
    var lessThanOrEquals: Number
}


external interface MusicOptions {
    var fade: Number?
        get() = definedExternally
        set(value) = definedExternally
    var loop: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var volume: Number?
        get() = definedExternally
        set(value) = definedExternally
}


external interface NotEqualsComparison {
    var notEquals: dynamic /* Boolean | Number | String */
        get() = definedExternally
        set(value) = definedExternally
}


external interface PlayAnimationOptions {
    var blendOutTime: Number?
        get() = definedExternally
        set(value) = definedExternally
    var controller: String?
        get() = definedExternally
        set(value) = definedExternally
    var nextState: String?
        get() = definedExternally
        set(value) = definedExternally
    var players: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var stopExpression: String?
        get() = definedExternally
        set(value) = definedExternally
}


external interface PlayerSoundOptions {
    var location: Vector3?
        get() = definedExternally
        set(value) = definedExternally
    var pitch: Number?
        get() = definedExternally
        set(value) = definedExternally
    var volume: Number?
        get() = definedExternally
        set(value) = definedExternally
}


external interface ProjectileShootOptions {
    var uncertainty: Number?
        get() = definedExternally
        set(value) = definedExternally
}


external interface RangeComparison {
    var lowerBound: Number
    var upperBound: Number
}


external interface RawMessage {
    var rawtext: Array<RawMessage>?
        get() = definedExternally
        set(value) = definedExternally
    var score: RawMessageScore?
        get() = definedExternally
        set(value) = definedExternally
    var text: String?
        get() = definedExternally
        set(value) = definedExternally
    var translate: String?
        get() = definedExternally
        set(value) = definedExternally
    var with: dynamic /* Array<String>? | RawMessage? */
        get() = definedExternally
        set(value) = definedExternally
}


external interface RawMessageScore {
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var objective: String?
        get() = definedExternally
        set(value) = definedExternally
}


external interface RawText {
    var rawtext: Array<RawMessage>?
        get() = definedExternally
        set(value) = definedExternally
}


external interface RGB {
    var blue: Number
    var green: Number
    var red: Number
}


external interface RGBA : RGB {
    var alpha: Number
}


external interface ScoreboardObjectiveDisplayOptions {
    var objective: ScoreboardObjective
    var sortOrder: ObjectiveSortOrder?
        get() = definedExternally
        set(value) = definedExternally
}


external interface ScriptEventMessageFilterOptions {
    var namespaces: Array<String>
}


external interface SpawnEntityOptions {
    var initialPersistence: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}


external interface StructureCreateOptions {
    var includeBlocks: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var includeEntities: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var saveMode: StructureSaveMode?
        get() = definedExternally
        set(value) = definedExternally
}


external interface StructurePlaceOptions {
    var animationMode: StructureAnimationMode?
        get() = definedExternally
        set(value) = definedExternally
    var animationSeconds: Number?
        get() = definedExternally
        set(value) = definedExternally
    var includeBlocks: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var includeEntities: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var integrity: Number?
        get() = definedExternally
        set(value) = definedExternally
    var integritySeed: String?
        get() = definedExternally
        set(value) = definedExternally
    var mirror: StructureMirrorAxis?
        get() = definedExternally
        set(value) = definedExternally
    var rotation: StructureRotation?
        get() = definedExternally
        set(value) = definedExternally
    var waterlogged: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}


external interface TeleportOptions {
    var checkForBlocks: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var dimension: Dimension?
        get() = definedExternally
        set(value) = definedExternally
    var facingLocation: Vector3?
        get() = definedExternally
        set(value) = definedExternally
    var keepVelocity: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var rotation: Vector2?
        get() = definedExternally
        set(value) = definedExternally
}


external interface TitleDisplayOptions {
    var fadeInDuration: Number
    var fadeOutDuration: Number
    var stayDuration: Number
    var subtitle: dynamic /* Array<dynamic /* RawMessage | String */>? | RawMessage? | String? */
        get() = definedExternally
        set(value) = definedExternally
}


external interface Vector2 {
    var x: Number
    var y: Number
}


external interface Vector3 {
    var x: Number
    var y: Number
    var z: Number

}


external interface VectorXZ {
    var x: Number
    var z: Number
}


external interface WorldSoundOptions {
    var pitch: Number?
        get() = definedExternally
        set(value) = definedExternally
    var volume: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external val HudElementsCount: Any


external val HudVisibilityCount: Any


external val MoonPhaseCount: Any


external val TicksPerDay: Any


external val TicksPerSecond: Any


external val system: System


external val world: World