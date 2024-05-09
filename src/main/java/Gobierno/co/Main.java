package Gobierno.co;

import java.security.spec.RSAOtherPrimeInfo;

//project by Natalia Fajardo, Juan Miguel Caicedo and Duvan Mancilla
public class Main {
    public static void main(String[] args) {

        Datos data = new Datos();
        System.out.println("Bienvenido a Muni_System, Ingresa el nombre de tres Municipios");
        data.ingresar();
        data.total_person();
        data.monto();
        System.out.println("A continuacion se mostrara los datos por cada municipio: ");
        data.imprimir();
    }
}