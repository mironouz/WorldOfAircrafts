package com.mironouz.action;

import com.mironouz.model.Aircraft;
import com.mironouz.model.Location;
import com.mironouz.model.World;

public final class FlyAction extends Action {
    @Override
    public Object act(World world, Aircraft aircraft, Location location) {
        world.cleanLocation(aircraft.location());
        world.spawnTheAircraft(new Aircraft(location, aircraft.marker()));
        return location;
    }
}
