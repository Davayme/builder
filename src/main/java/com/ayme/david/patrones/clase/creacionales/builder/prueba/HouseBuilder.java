package com.ayme.david.patrones.clase.creacionales.builder.prueba;

public interface HouseBuilder {
    HouseBuilder buildWalls(String type);
    HouseBuilder buildRoof(String type);
    HouseBuilder buildGarage(boolean hasGarage);
    HouseBuilder buildSwimmingPool(boolean hasSwimmingPool);
    HouseBuilder buildFancyStatues(boolean hasFancyStatues);
    HouseBuilder buildGarden(boolean hasGarden);
    House build();
}
