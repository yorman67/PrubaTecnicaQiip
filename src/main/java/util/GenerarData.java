package util;

import com.github.javafaker.Faker;

public class GenerarData {

    private  final Faker faker = new Faker();

    public String generarNombre () { return  faker.name().firstName();}
    public String generarApellido() { return faker.name().lastName();}
    public String generarCodigoPostal(){ return  faker.number().digits(5);}

}
