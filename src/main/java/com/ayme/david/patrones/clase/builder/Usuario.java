package com.ayme.david.patrones.clase.builder;

public class Usuario {
	// regla de negocio: Nombre y apellido es requerido para crear un usuario
	private String username;
	private String contrasena;

	private boolean medioContacto; // opcional
	private String nombre;
	private String apellido;
	private String email;
	private String telefono;
	private String direccion;
	private MetodoPago metodoPago;
	private String token;
	
	public Usuario setNombre(String nombre) {
		this.nombre = nombre;
		return this;
	}

	public Usuario setApellido(String apellido) {
		this.apellido = apellido;
		return this;
	}

	public Usuario setEmail(String email) {
		this.email = email;
		return this;
	}

	public Usuario setTelefono(String telefono) {
		this.telefono = telefono;
		return this;
	}

	public Usuario setDireccion(String direccion) {
		this.direccion = direccion;
		return this;
	}

	private Usuario(String username, String contrasena) {
		this.username = username;
		this.contrasena = contrasena;
		this.medioContacto = false;
	}

	public static Usuario crearUsuario(String username, String contrasena) {
		return new Usuario(username, contrasena);
	}

	public Usuario build() {
		return this;
	}


	@Override
	public String toString() {
		return "Usuario [username=" + username + ", contrasena=" + contrasena + ", medioContacto=" + medioContacto
				+ ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", telefono=" + telefono
				+ ", direccion=" + direccion + ", metodoPago=" + metodoPago + ", token=" + token + "]";
	}


	public UserBuilder setMedioContacto(boolean medioContacto) {
		if(!medioContacto) {
			throw new IllegalArgumentException("No se puede cambiar el valor de medio de contacto");
		}
		this.medioContacto = medioContacto;
		return new UserBuilder(this);
	}

	public UserBuilder setMetodoPago(MetodoPago metodoPago) {
		if(this.email == null || this.telefono == null || this.direccion == null) {
			throw new IllegalArgumentException("No se puede asignar el valor de metodo de pago");
		}
		this.metodoPago = metodoPago;
		return new UserBuilder(this);
	}


	public UserBuilder setToken(String token) {
		if(this.metodoPago == null) {
			throw new IllegalArgumentException("No se puede asignar el valor de token sin la tarjeta de credito");
		}
		this.token = token;
		return new UserBuilder(this);
	}


	// crear una nueva clase dentro de la misma clase Usuario
	public static class UserBuilder {
		private Usuario usuario;

		public UserBuilder(Usuario usuario) {
			this.usuario = usuario;
		}

		public UserBuilder setEmail(String email) {
			usuario.email = email;
			return this;
		}

		public UserBuilder setTelefono(String telefono) {
			usuario.telefono = telefono;
			return this;
		}

		public UserBuilder setDireccion(String direccion) {
			usuario.direccion = direccion;
			return this;
		}

		public UserBuilder setMetodoPago(MetodoPago metodoPago) {
			usuario.setMetodoPago(metodoPago);
			return this;
		}

		public UserBuilder setToken(String token) {
			usuario.setToken(token);
			return this;
		}

		public Usuario build() {
			return this.usuario;
		}


	}

}
