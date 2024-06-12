package com.ayme.david.patrones.clase.builder;

public class User {
    private String username;
    private String password;

    private boolean contactMedia;// opcional
    // si tiene un valor verdadero el cliente prodea asignar valores para mail
    // tetlefono y direccion
    // si es falso no se habilita los setters de los atributos mail telefono y
    // direccion
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;

    private String payMethod;
    private String token;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.contactMedia = false;
    }

    public User setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public User setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public User build() {
        return this;
    }

    public UserBuilder setContactMedia(boolean contactMedia) {
        if (!contactMedia) {
            throw new IllegalArgumentException(
                    "No se puede asignar valores a mail, telefono y direccion si contactMedia es falso");
        }
        this.contactMedia = contactMedia;
        return new UserBuilder(this);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", payMethod='" + payMethod + '\'' +
                ", token='" + token + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isContactMedia() {
        return contactMedia;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    // crear una nueva clase dentro de la clase User
    public static class UserBuilder {
        private User user;

        public UserBuilder(User user) {
            this.user = user;
        }

        public UserBuilder setEmail(String email) {
            user.setEmail(email);
            return this;
        }

        public UserBuilder setPhone(String phone) {
            user.setPhone(phone);
            return this;
        }

        public UserBuilder setAddress(String address) {
            user.setAddress(address);
            return this;
        }

        public boolean allContactMedia() {
            return user.getEmail() != null && user.getPhone() != null && user.getAddress() != null;
        }

        public PayMethodBuilder setPayMethod(String payMethod) {
            if (allContactMedia()) {
                return new PayMethodBuilder(user, payMethod);
            }
            throw new IllegalArgumentException(
                    "No se puede asignar un metodo de pago si no se han asignado valores a email, telefono y direccion");
        }

        public User build() {

            return user;
        }

        public static class PayMethodBuilder {
            private User user;

            public PayMethodBuilder(User user, String payMethod) {
                this.user = user;
                user.setPayMethod(payMethod);
            }

            public boolean isPayMethod() {
                return user.getPayMethod() != null && !user.getPayMethod().isEmpty();
            }

            public TokenBuilder setToken(String token) {
                if (isPayMethod()) {
                    if (user.getPayMethod().equals("Paypal") || user.getPayMethod().equals("Credito")
                            || user.getPayMethod().equals("Debito")) {
                        return new TokenBuilder(user, token);

                    } else {
                        throw new IllegalArgumentException(
                                "No se puede asignar un token si el metodo de pago es Paypal");
                    }

                }
                throw new IllegalArgumentException(
                        "No se puede asignar un token si no se ha asignado un metodo de pago");
            }

            public User build() {
                return user;
            }

            public static class TokenBuilder {
                private User user;

                public TokenBuilder(User user, String token) {
                    this.user = user;
                    user.setToken(token);
                }

                public User build() {
                    return user;
                }
            }
        }

    }

    private void setUsername(String username) {
        this.username = username;
    }

    private void setPassword(String password) {
        this.password = password;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    private void setPhone(String phone) {
        this.phone = phone;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    public String getPayMethod() {
        return payMethod;
    }

    public String getToken() {
        return token;
    }

    private void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    private void setToken(String token) {
        this.token = token;
    }

}
