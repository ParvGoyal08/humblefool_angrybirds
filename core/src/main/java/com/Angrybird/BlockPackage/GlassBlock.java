package com.Angrybird.BlockPackage;


import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;

public class GlassBlock extends Block {
    public GlassBlock(World world, Vector2 position) {
        super(world, position, "images/Glassblock.png", 0.25f);
    }
}
