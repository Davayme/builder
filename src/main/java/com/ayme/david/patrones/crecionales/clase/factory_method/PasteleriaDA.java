package com.ayme.david.patrones.crecionales.clase.factory_method;

import java.util.HashMap;
import java.util.Map;

public class PasteleriaDA implements IPasteleria{

    private Map<String, Pastel> pastelMap;

    public PasteleriaDA() {
        pastelMap = new HashMap<>();
        pastelMap.put("chocolate", new Pastel(8, "chocolate"));
        pastelMap.put("vainilla", new Pastel(5, "vainilla"));
        pastelMap.put("relleno", new PastellRelleno(0, "relleno"));
    }

    public Pastel prepararPastel(String sabor) {
        return pastelMap.get(sabor);
    }
}