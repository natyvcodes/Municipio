package Gobierno.co;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Datos {

    Scanner keyboard = new Scanner(System.in);
    private boolean municipioException = false;
    String[] municipio = new String[3];
    int[] cant_adulH = new int[3];
    int[] cant_adulM = new int[3];
    int[] cant_ninH = new int[3];
    int[] cant_ninM = new int[3];
    int[] cantidadTA = new int[3];
    int[] cantidadTN = new int[3];
    int[] prima = new int[3];
    int[] prima_Edu = new int[3];


    public String[] getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String[] municipio) {
        this.municipio = municipio;
    }

    public int[] getCant_adulH() {
        return cant_adulH;
    }

    public void setCant_adulH(int[] cant_adulH) {
        this.cant_adulH = cant_adulH;
    }

    public int[] getCant_adulM() {
        return cant_adulM;
    }

    public void setCant_adulM(int[] cant_adulM) {
        this.cant_adulM = cant_adulM;
    }

    public int[] getCant_ninH() {
        return cant_ninH;
    }

    public void setCant_ninH(int[] cant_ninH) {
        this.cant_ninH = cant_ninH;
    }

    public int[] getCant_ninM() {
        return cant_ninM;
    }

    public void setCant_ninM(int[] cant_ninM) {
        this.cant_ninM = cant_ninM;
    }

    String[] municipiosColombia = {
            "Barrancabermeja", "Cartago", "Florencia", "Maicao", "Girardot",
            "Sogamoso", "Buga", "Tumaco", "Giron", "Tunja",
            "Ipiales", "Facatativa", "Jamundi", "Madrid", "Zipaquira",
            "Yopal", "Malambo", "Funza", "Cienaga", "Villa del Rosario",
            "Caldas", "Piedecuesta", "Chia", "Rionegro", "Magangue",
            "Sabaneta", "Duitama", "Puerto Tejada", "Caucasia", "Chiquinquira",
            "Turbaco", "Fusagasuga", "Bugalagrande", "Copacabana", "Chinchina",
            "Patia", "Villamaria", "Pitalito", "Turbo", "Caicedonia",
            "Yarumal", "Valle del Guamuez", "Tocancipa", "La Estrella", "Barrancas",
            "Chigorodo", "Santander de Quilichao", "Candelaria", "San Gil", "El Bagre",
            "La Dorada", "El Carmen de Bolivar", "Lorica", "Ayapel", "Tierralta",
            "Baranoa", "Puerto Berrio", "Puerto Lopez", "Chaparral", "Montelibano",
            "San Juan del Cesar", "La Virginia", "Santa Rosa de Cabal", "La Ceja", "El Banco",
            "Guacari", "Purificacion", "Campo de la Cruz", "Cotorra", "La Plata",
            "Galapa", "Barbosa", "Arauca", "Yumbo"
            // Continúa añadiendo municipios según sea necesario
    };


    class MunicipioNoEncontradoException extends Exception {
        public MunicipioNoEncontradoException(String mensaje) {
            super(mensaje);
        }
    }

    public void municipios(String mun) throws MunicipioNoEncontradoException {

        boolean encontrado = false;
        for (String munCol : municipiosColombia) {
            if (mun.equalsIgnoreCase(munCol)) {
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            throw new MunicipioNoEncontradoException("El municipio '" + mun + "' no se encuentra en la lista.");
        }

    }

    public void ingresar() {
        for (int i = 0; i < municipio.length; i++) {
            if (i == 0) {
                boolean municipioValido = false;
                while (!municipioValido) {
                    try {
                        System.out.print("Ingresa el nombre del municipio " + (i + 1) + ": ");
                        municipio[i] = keyboard.nextLine();
                        municipios(municipio[i]);
                        municipioValido = true;
                    } catch (MunicipioNoEncontradoException ex) {
                        System.out.println(ex.getMessage());
                        // Se vuelve a solicitar el nombre del municipio en el próximo ciclo del bucle while
                    }
                }
            }

            boolean municipioValido2 = false;
            if (i == 1) {
                while (!municipioValido2) {
                    try {
                        System.out.print("Ingresa el nombre del municipio " + (i + 1) + ": ");
                        municipio[i] = keyboard.nextLine();
                        municipios(municipio[i]);
                        municipioValido2 = true;
                    } catch (MunicipioNoEncontradoException ex) {
                        System.out.println(ex.getMessage());
                    }
                }
            }
            if (i == 2) {
                boolean municipioValido3 = false;
                while (!municipioValido3) {
                    try {
                        System.out.print("Ingresa el nombre del municipio " + (i + 1) + ": ");
                        municipio[i] = keyboard.nextLine();
                        municipios(municipio[i]);
                        municipioValido3 = true;
                    } catch (MunicipioNoEncontradoException ex) {
                        System.out.println(ex.getMessage());
                    }
                }
            }

            boolean inputValido = false;
            while (!inputValido) {
                try {
                    System.out.print("Ingrese la cantidad de adultos hombres en el municipio " + (i + 1) + ": ");
                    cant_adulH[i] = keyboard.nextInt();
                    inputValido = true;
                } catch (InputMismatchException ex) {
                    System.out.println("Debe ingresar valores enteros");
                    keyboard.nextLine(); // Limpia el buffer del teclado
                }
            }

            inputValido = false;
            while (!inputValido) {
                try {
                    System.out.print("Ingrese la cantidad de mujeres adultas en el municipio " + (i + 1) + ": ");
                    cant_adulM[i] = keyboard.nextInt();
                    inputValido = true;
                } catch (InputMismatchException ex) {
                    System.out.println("Debe ingresar valores enteros");
                    keyboard.nextLine(); // Limpia el buffer del teclado
                }
            }

            inputValido = false;
            while (!inputValido) {
                try {
                    System.out.print("Ingrese la cantidad de niños en el municipio " + (i + 1) + ": ");
                    cant_ninH[i] = keyboard.nextInt();
                    inputValido = true;
                } catch (InputMismatchException ex) {
                    System.out.println("Debe ingresar valores enteros");
                    keyboard.nextLine(); // Limpia el buffer del teclado
                }
            }

            inputValido = false;
            while (!inputValido) {
                try {
                    System.out.print("Ingrese la cantidad de niñas en el municipio " + (i + 1) + ": ");
                    cant_ninM[i] = keyboard.nextInt();

                    inputValido = true;
                } catch (InputMismatchException ex) {
                    System.out.println("Debe ingresar valores enteros");
                    keyboard.nextLine(); // Limpia el buffer del teclado
                }
                String prueba = keyboard.nextLine();
            }


        }

    }

    public void total_person() {
        for (int i = 0; i < cantidadTA.length; i++) {
            cantidadTA[i] = cant_adulM[i] + cant_adulH[i];
        }

        for (int j = 0; j < cantidadTN.length; j++) {
            cantidadTN[j] = cant_ninM[j] + cant_ninH[j];
        }

    }

    public void monto() {
        for (int i = 0; i < cantidadTN.length; i++) {
            if (cantidadTN[i] > 0 && cantidadTN[i] < 100) {
                prima[i] = 30000;
                prima_Edu[i] = cantidadTN[i] * prima[i];
            } else if (cantidadTN[i] >= 101 && cantidadTN[i] < 200) {
                prima[i] = 25000;
                prima_Edu[i] = cantidadTN[i] * prima[i];
            } else if (cantidadTN[i] > 201 && cantidadTN[i] < 500) {
                prima[i] = 20000;
                prima_Edu[i] = cantidadTN[i] * prima[i];
            } else {
                System.out.println("La cantidad de niños supera ");
            }
        }
    }


    public void imprimir() {
        for (int i = 0; i < municipio.length; i++) {
            System.out.println("El municipio " + municipio[i] + " tiene un total de " + cantidadTA[i] + " Adultos y una cantidad de " + cantidadTN[i] + "  niños, el valor de monto de prima es " + prima[i] + " un monto total de educacion de " + prima_Edu[i]);
        }

    }

}
