package com.mironouz;

import com.mironouz.model.Aircraft;
import com.mironouz.model.Location;
import com.mironouz.model.World;

public class App {
    public static void main(String[] args) {
        World world = new World();
        Aircraft aircraftRed = new Aircraft(new Location(0, 5, 5), 'R');
        Aircraft aircraftBlue = new Aircraft(new Location(9, 5, 5), 'B');
        world.spawnTheAircraft(aircraftRed);
        world.spawnTheAircraft(aircraftBlue);
        System.out.println(world);
    }
}
