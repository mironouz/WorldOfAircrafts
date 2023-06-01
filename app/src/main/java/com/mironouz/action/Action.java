package com.mironouz.action;

import com.mironouz.model.Aircraft;
import com.mironouz.model.Location;
import com.mironouz.model.World;

public abstract sealed class Action permits FlyAction, LocateAction, ShootAction {
    public abstract Object act(World world, Aircraft aircraft, Location location);

}
