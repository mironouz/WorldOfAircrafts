package com.mironouz.model;

import java.util.Arrays;

public class World {
    private char[][][] map;
    private int size;

    public World(int size) {
        map = new char[size][size][size];
        this.size = size;
    }

    public World() {
        this(10);
    }

    public void spawnTheAircraft(Aircraft aircraft) {
        Location location = aircraft.location();
        map[location.x()][location.y()][location.z()] = aircraft.marker();
    }

    public void cleanLocation(Location location) {
        map[location.x()][location.y()][location.z()] = Character.MIN_VALUE;
    }

    public boolean checkLocation(Location location) {
        return map[location.x()][location.y()][location.z()] == Character.MIN_VALUE;
    }

    public Location findByMarker(char marker) {
        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                for (int z = 0; z < size; z++) {
                    if (map[x][y][z] == marker) {
                        return new Location(x, y, z);
                    }
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return Arrays.deepToString(map);
    }

}
