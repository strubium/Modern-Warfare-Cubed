package com.paneedah.weaponlib.jim.util;

import net.minecraft.entity.Entity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;

public class HitUtil {
    
    /**
     * Traces a ray from the attacker's eyes to 3 blocks ahead in the look direction.
     * Returns the result of the ray trace, which can be used to determine if a hit occurred.
     *
     * @param attacker The entity performing the attack.
     * @param hurt The entity being hit.
     * @return The result of the ray trace.
     */
    public static RayTraceResult traceMeleeHit(Entity attacker, Entity hurt) {
        Vec3d startVec = attacker.getPositionEyes(1.0F);
        Vec3d endVec = startVec.add(attacker.getLookVec().scale(3));
        return hurt.getEntityBoundingBox().calculateIntercept(startVec, endVec);
    }
    
    /**
     * Traces a ray from the attacker's current position to the position it will be in after moving.
     * Returns the result of the ray trace, which can be used to determine if a hit occurred.
     *
     * @param attacker The entity performing the attack.
     * @param hurt The entity being hit.
     * @return The result of the ray trace.
     */
    public static RayTraceResult traceProjectilehit(Entity attacker, Entity hurt) {
        Vec3d start = new Vec3d(
                attacker.posX - attacker.motionX, 
                attacker.posY - attacker.motionY,
                attacker.posZ - attacker.motionZ);
        Vec3d end = new Vec3d(
                attacker.posX + attacker.motionX, 
                attacker.posY + attacker.motionY,
                attacker.posZ + attacker.motionZ);
        return hurt.getEntityBoundingBox().grow(0.1).calculateIntercept(start, end);
        
    }
    
    /**
     * Rotates a vector around another vector.
     *
     * @param toRot The vector to rotate.
     * @param toOrigin The vector to rotate around.
     * @param pitch The pitch rotation in radians.
     * @param yaw The yaw rotation in radians.
     * @return The rotated vector.
     */
    public static Vec3d rotateVector(Vec3d toRot, Vec3d toOrigin, float pitch, float yaw) {
        return toRot.subtract(toOrigin).rotatePitch(pitch).rotateYaw(yaw).add(toOrigin);
    }
    
    /**
     * Determines the direction of a melee hit by tracing a ray from the attacker's eyes to 5 blocks ahead in the look direction.
     * The ray is then rotated to match the hurt entity's rotation.
     *
     * @param player The entity performing the attack.
     * @param hurt The entity being hit.
     * @return The side hit, or null if no hit occurred.
     */
    public static EnumFacing getDirectionHitMelee(Entity player, Entity hurt) {
        Vec3d startVec = player.getPositionEyes(1.0F);
        Vec3d endVec = startVec.add(player.getLookVec().scale(5));
        
        
        float pitch = (float) Math.toRadians(hurt.rotationPitch);
        float yaw = (float) Math.toRadians(hurt.rotationYaw+180);
        
        startVec = rotateVector(startVec, hurt.getPositionVector(), pitch, yaw);
        endVec = rotateVector(endVec, hurt.getPositionVector(), pitch, yaw);
        
        Vec3d zpV = hurt.getPositionVector().add(0, hurt.getEyeHeight(), 0);
        RayTraceResult result = hurt.getEntityBoundingBox().calculateIntercept(startVec, endVec);
        if(result!= null) {
            return result.sideHit;
        } else return null;
        
    }
}
