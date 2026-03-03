package com.tortoisefey.furrymod.entity;

import net.minecraft.entity.Entity;
import net.minecraft.world.World;

public class TransformationEntity extends Entity {
    private String currentTransformation;

    public TransformationEntity(World world) {
        super(world);
        this.currentTransformation = "none";
    }

    public void transform(String newTransformation) {
        this.currentTransformation = newTransformation;
        // Implement transformation logic here
    }

    public String getCurrentTransformation() {
        return currentTransformation;
    }

    @Override
    protected void readEntityFromNBT(NBTTagCompound compound) {
        super.readEntityFromNBT(compound);
        currentTransformation = compound.getString("CurrentTransformation");
    }

    @Override
    protected void writeEntityToNBT(NBTTagCompound compound) {
        super.writeEntityToNBT(compound);
        compound.setString("CurrentTransformation", currentTransformation);
    }
}