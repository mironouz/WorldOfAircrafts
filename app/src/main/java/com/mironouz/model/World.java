package com.mironouz.model;

import java.util.Arrays;

public class World {
    private boolean[][][] map;

    public World(int xSize, int ySize, int zSize) {
        map = new boolean[xSize][ySize][zSize];
        for (int x = 0; x < xSize; x++) {
            for (int y = 0; y < ySize; y++) {
                for (int z = 0; z < zSize; z++) {
                    map[x][y][z] = false;
                }
            }
        }
    }

    public World() {
        this(10, 10, 10);
    }

    public void spawnTheAircraft(Aircraft aircraft) {
        Location location = aircraft.location();
        map[location.x()][location.y()][location.z()] = true;
    }

    @Override
    public String toString() {
        return Arrays.deepToString(map);
    }

}
