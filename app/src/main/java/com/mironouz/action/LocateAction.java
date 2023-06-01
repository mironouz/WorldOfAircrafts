package com.mironouz.action;

import com.mironouz.model.Aircraft;
import com.mironouz.model.Location;
import com.mironouz.model.World;

public final class LocateAction extends Action {
    @Override
    public Location act(World world, Aircraft aircraft, Location location) {
        return world.findByMarker(aircraft.marker());
    }
}
