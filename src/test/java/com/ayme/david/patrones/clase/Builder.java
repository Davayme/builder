package com.ayme.david.patrones.clase;

import org.junit.Test;

import com.ayme.david.patrones.crecionales.clase.builder.MetodoPago;
import com.ayme.david.patrones.crecionales.clase.builder.User;
import com.ayme.david.patrones.crecionales.clase.builder.Usuario;

public class Builder {
	@Test
	public void Test1() {

		Usuario usuario2 = Usuario.crearUsuario("ae.perez", "12345")
				.setNombre("Juan")
				.setMedioContacto(true)
				.build();
				
		System.out.println(usuario2);

        



       
        
	}

}
