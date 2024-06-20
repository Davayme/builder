
package com.ayme.david.patrones.clase.creacionales.builder.prueba;

/**
 * DirectorHouse
 */
public class DirectorHouse {
    private HouseBuilder house;

    public DirectorHouse(HouseBuilder house) {
        this.house = house;
    }

    public House createLuxuryHouse(){
        return this.house.buildGarden(true)
                         .buildFancyStatues(true)
                         .buildWalls("De oro pe xd")
                         .buildFancyStatues(true)
                         .build();
    }


    
}