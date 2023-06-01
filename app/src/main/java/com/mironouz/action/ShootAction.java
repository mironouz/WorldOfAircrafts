package com.mironouz.action;

import com.mironouz.model.Aircraft;
import com.mironouz.model.Location;
import com.mironouz.model.World;

public final class ShootAction extends Action {
    @Override
    public Object act(World world, Aircraft aircraft, Location location) {
        if (aircraft.location().equals(location)) {
            System.out.println("You cannot shoot yourself");
            return false;
        } else if (world.checkLocation(location)) {
            System.out.println("Game is over");
            return true;
        }
        System.out.println("You have missed");
        return false;
    }
}
