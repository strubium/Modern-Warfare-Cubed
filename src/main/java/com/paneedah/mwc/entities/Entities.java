package com.paneedah.mwc.entities;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.Guns;
import com.paneedah.mwc.weapons.Magazines;
import com.paneedah.weaponlib.ai.*;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.EnumDifficulty;
import net.minecraftforge.common.BiomeDictionary;

public class Entities {

    public static void init(CommonProxy commonProxy) {

        new EntityConfiguration.Builder()
                .withName("terrorist")
                .withBaseClass(EntityCustomMob.class)
                .withMaxHealth(40)
                .withEntityIdSupplier(() -> 10000)
                .withEquipmentOption(Guns.VSSVintorez, EnumDifficulty.EASY, 0.1f, Magazines.VSSVintorezMag)
                .withEquipmentOption(Guns.Remington870, EnumDifficulty.EASY, 0.07f)
                .withEquipmentOption(Guns.VSSVintorez, EnumDifficulty.HARD, 0.1f, Magazines.ASValMag)
                .withEquipmentOption(Guns.AK47, EnumDifficulty.NORMAL, 0.07f, Magazines.AK47Mag)
                .withSecondaryEquipmentOption(Guns.MakarovPM, EnumDifficulty.EASY, 0.1f, Magazines.MakarovMag)
                .withPrimaryEquipmentDropChance(0.4f)
                .withSpawn(10, 0, 15,  BiomeDictionary.Type.CONIFEROUS, BiomeDictionary.Type.WASTELAND, BiomeDictionary.Type.SNOWY, BiomeDictionary.Type.HILLS)
                .withMaxTolerableLightBrightness(1f)
                .withSpawnEgg(0xFF808000, 0xFF556B2F)
                .withTexturedModelVariant("com.paneedah.mwc.models.BanditNew", "banditnew.png")
                .withTexturedModelVariant("com.paneedah.mwc.models.BanditNew2", "banditnew2.png")
                .withTexturedModelVariant("com.paneedah.mwc.models.BanditNew3", "banditnew3.png")
                .withTexturedModelVariant("com.paneedah.mwc.models.BanditNew4", "banditnew4.png")
                .withTexturedModelVariant("com.paneedah.mwc.models.BanditNew5", "banditnew5.png")
                .withHurtSound("hurt")
                .withAmbientSound("drawweapon")
                .withStepSound("step")
                .withLookHeightMulitplier(3)
                .withAiTask(1, e -> new EntityAISwimming(e))
                .withAiTask(3, e -> new EntityAIAvoidEntity<>(e, EntityWolf.class, 6.0F, 1.0D, 1.2D))
                .withAiTask(4, e -> new EntityAIAttackRangedWeapon((EntityCustomMob) e, 1.0D, 10, 30.0F))
                .withAiTask(5, e -> new EntityAIWander(e, 1.0D))
                .withAiTask(6, e -> new EntityAIWatchClosest(e, EntityPlayer.class, 50.0F))
                .withAiTask(6, e -> new EntityAILookIdle(e))

                .withAiTargetTask(1, e -> new EntityAIHurtByTarget(  e, false))
                .withAiTargetTask(2, e -> new EntityAINearestAttackableTarget<>( e, EntityPlayer.class, true))
                .withAiTargetTask(2, e -> new BetterAINearestAttackableTarget<>( e, EntityCustomMob.class, "soldier", true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityVillager.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityZombie.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityHusk.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntitySkeleton.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntitySpider.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityEnderman.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityCreeper.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntitySlime.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityDragon.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityEndermite.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityBlaze.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityGhast.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityIllusionIllager.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityMagmaCube.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityPigZombie.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntitySpellcasterIllager.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityStray.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityVindicator.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityWitch.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityZombieVillager.class, true))
                .register(MWC.modContext);

        new EntityConfiguration.Builder()
                .withName("soldier")
                .withBaseClass(EntityCustomMob.class)
                .withMaxHealth(80)
                .withEntityIdSupplier(() -> 10011)
                .withEquipmentOption(Guns.M4A1, EnumDifficulty.EASY, 0.1f, Magazines.M4A1Mag)
                .withEquipmentOption(Guns.M110, EnumDifficulty.EASY, 0.1f, Magazines.M110Mag)
                .withEquipmentOption(Guns.M16A1, EnumDifficulty.NORMAL, 0.2f, Magazines.M4A1Mag)
                .withEquipmentOption(Guns.FNFAL, EnumDifficulty.NORMAL, 0.1f, Magazines.FNFALMag)
                .withEquipmentOption(Guns.M4A1, EnumDifficulty.HARD, 0.2f, Magazines.Stanag100)
                .withEquipmentOption(Guns.M249, EnumDifficulty.HARD, 0.1f, Magazines.M249Mag)
                .withSecondaryEquipmentOption(Guns.Glock18C,  EnumDifficulty.NORMAL, 0.1f, Magazines.M9A1Mag)
                .withSecondaryEquipmentOption(Guns.DesertEagle,  EnumDifficulty.HARD, 0.1f, Magazines.DesertEagleMag)
                .withPrimaryEquipmentDropChance(0.4f)
                .withSpawn(0, 5, 6, BiomeDictionary.Type.PLAINS, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.HILLS)
                .withMaxTolerableLightBrightness(1f)
                .withSpawnEgg(0x5A674F, 0x464039)
                .withTexturedModelVariant("com.paneedah.mwc.models.Soldier", "soldier.png")
                .withTexturedModelVariant("com.paneedah.mwc.models.Soldier2", "soldier2.png")
                .withTexturedModelVariant("com.paneedah.mwc.models.SoldierSniper", "soldiersniper.png")
                .withHurtSound("hurt")
                .withAmbientSound("drawweapon")
                .withStepSound("step")
                .withLookHeightMulitplier(3)
                .withAiTask(1, e -> new EntityAISwimming(e))
                .withAiTask(3, e -> new EntityAIAvoidEntity<>(e, EntityWolf.class, 6.0F, 1.0D, 1.2D))
                .withAiTask(4, e -> new EntityAIAttackRangedWeapon((EntityCustomMob) e, 1.0D, 10, 30.0F))
                .withAiTask(5, e -> new EntityAIWander(e, 1.0D))
                .withAiTask(6, e -> new EntityAIWatchClosest(e, EntityPlayer.class, 50.0F))
                .withAiTask(6, e -> new EntityAILookIdle(e))
                .withAiTask(7, e -> new EntityAIBreakDoor(e))

                .withAiTargetTask(1, e -> new EntityAIHurtByTarget(  e, false))
                .withAiTargetTask(2, e -> new EntityAINearestAttackableTarget<>( e, EntityPlayer.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityVillager.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityZombie.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityHusk.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntitySkeleton.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntitySpider.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityEnderman.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityCreeper.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntitySlime.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityDragon.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityEndermite.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityBlaze.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityGhast.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityIllusionIllager.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityMagmaCube.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityPigZombie.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntitySpellcasterIllager.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityStray.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityVindicator.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityWitch.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityZombieVillager.class, true))
                .withAiTargetTask(4, e -> new BetterAINearestAttackableTarget<>( e, EntityCustomMob.class, "terrorist", true))
                .register(MWC.modContext);

        new EntityConfiguration.Builder()
                .withName("turret")
                .withBaseClass(EntityCustomMob.class)
                .withMaxHealth(80)
                .withEntityIdSupplier(() -> 10012)
                .withEquipmentOption(Guns.turretgun, EnumDifficulty.EASY, 0.1f)
                .withPrimaryEquipmentDropChance(0.0f)
                .withSpawnEgg(0x5A674F, 0x464039)
                .withTexturedModelVariant("com.paneedah.mwc.models.Turret", "turret.png")
                .withAmbientSound("turret_turn")
                .withMaxSpeed(0.0F) // 0.1-0.3 is normal speed
                .withAiTask(1, e -> new EntityAIAttackRangedWeapon((EntityCustomMob) e, 1.0D, 1, 50.0F))
                .withAiTask(2, e -> new EntityAILookIdle(e))
                .withCollidability(false)
                .withDespawnability(false)
                .withPushability(false)
                .withInvulnerability()
                .withLookHeightMulitplier(1.5f)
                .withSize(1f, 0.7f)
                .withPickupItemID(1)

                .withAiTargetTask(1, e -> new EntityAIHurtByTarget( e, false))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityVillager.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityZombie.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityHusk.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntitySkeleton.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntitySpider.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityEnderman.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityCreeper.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntitySlime.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityDragon.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityEndermite.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityBlaze.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityGhast.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityIllusionIllager.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityMagmaCube.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityPigZombie.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntitySpellcasterIllager.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityStray.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityVindicator.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityWitch.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityZombieVillager.class, true))
                .withAiTargetTask(4, e -> new BetterAINearestAttackableTarget<>( e, EntityCustomMob.class, "soldier", true))
                .withAiTargetTask(4, e -> new BetterAINearestAttackableTarget<>( e, EntityCustomMob.class, "terrorist", true))
                .register(MWC.modContext);
        new EntityConfiguration.Builder()
                .withName("turretupgraded")
                .withBaseClass(EntityCustomMob.class)
                .withMaxHealth(80)
                .withEntityIdSupplier(() -> 10013)
                .withEquipmentOption(Guns.turretgunupgraded, EnumDifficulty.EASY, 0.1f)
                .withPrimaryEquipmentDropChance(0.0f)
                .withSpawnEgg(0x5A674F, 0x464039)
                .withTexturedModelVariant("com.paneedah.mwc.models.TurretBuff", "turretbuff.png")
                .withAmbientSound("turret_turn")
                .withMaxSpeed(0.0F) // 0.1-0.3 is normal speed
                .withAiTask(1, e -> new EntityAIAttackRangedWeapon((EntityCustomMob) e, 1.0D, 1, 50.0F))
                .withAiTask(2, e -> new EntityAILookIdle(e))
                .withCollidability(false)
                .withDespawnability(false)
                .withPushability(false)
                .withInvulnerability()
                .withLookHeightMulitplier(1.5f)
                .withSize(1f, 0.7f)
                .withPickupItemID(2)

                .withAiTargetTask(1, e -> new EntityAIHurtByTarget(  e, false))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityVillager.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityZombie.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityHusk.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntitySkeleton.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntitySpider.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityEnderman.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityCreeper.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntitySlime.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityDragon.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityEndermite.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityBlaze.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityGhast.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityIllusionIllager.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityMagmaCube.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityPigZombie.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntitySpellcasterIllager.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityStray.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityVindicator.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityWitch.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityZombieVillager.class, true))
                .withAiTargetTask(4, e -> new BetterAINearestAttackableTarget<>( e, EntityCustomMob.class, "soldier", true))
                .withAiTargetTask(4, e -> new BetterAINearestAttackableTarget<>( e, EntityCustomMob.class, "terrorist", true))
                .register(MWC.modContext);

        new EntityConfiguration.Builder()
                .withName("turretsilenced")
                .withBaseClass(EntityCustomMob.class)
                .withMaxHealth(80)
                .withEntityIdSupplier(() -> 10014)
                .withEquipmentOption(Guns.turretgunsilenced, EnumDifficulty.EASY, 0.1f)
                .withPrimaryEquipmentDropChance(0.0f)
                .withSpawnEgg(0x5A674F, 0x464039)
                .withTexturedModelVariant("com.paneedah.mwc.models.turretsilenced", "turretsilenced.png")
                .withAmbientSound("turret_turn")
                .withMaxSpeed(0.0F) // 0.1-0.3 is normal speed
                .withAiTask(1, e -> new EntityAIAttackRangedWeapon((EntityCustomMob) e, 1.0D, 1, 50.0F))
                .withAiTask(2, e -> new EntityAILookIdle(e))
                .withCollidability(false)
                .withDespawnability(false)
                .withPushability(false)
                .withInvulnerability()
                .withLookHeightMulitplier(1.5f)
                .withSize(1f, 0.7f)
                .withPickupItemID(3)

                .withAiTargetTask(1, e -> new EntityAIHurtByTarget( e, false))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityVillager.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityZombie.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityHusk.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntitySkeleton.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntitySpider.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityEnderman.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityCreeper.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntitySlime.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityDragon.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityEndermite.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityBlaze.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityGhast.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityIllusionIllager.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityMagmaCube.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityPigZombie.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntitySpellcasterIllager.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityStray.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityVindicator.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityWitch.class, true))
                .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>( e, EntityZombieVillager.class, true))
                .withAiTargetTask(4, e -> new BetterAINearestAttackableTarget<>( e, EntityCustomMob.class, "soldier", true))
                .withAiTargetTask(4, e -> new BetterAINearestAttackableTarget<>( e, EntityCustomMob.class, "terrorist", true))
                .register(MWC.modContext);
    }
}
