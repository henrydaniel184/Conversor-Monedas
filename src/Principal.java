import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        BuscarMoneda consulta = new BuscarMoneda();

        int opcion=0;
        while(opcion !=7){
            System.out.println("************************\n" +
                    "Bienvenidos al conversor de monedas\n\n" +
                    "Ingresa la conversion que deseas realizar\n\n" +
                    "1.Dollar a peso argentino\n"+
                    "2.Peso Argentino a Dolar\n"+
                    "3.Dollar a Real Brazilero\n"+
                    "4.Real Brazilero a Dolar\n"+
                    "5.Dollar a peso Colombiano\n"+
                    "6.Peso Colombiano a Dolar\n"+
                    "7.Salir");
            opcion = lectura.nextInt();
            lectura.nextLine();
            switch (opcion){
                case 1:
                    Conversor.convertir("USD",  "ARS", consulta, lectura);
                    break;
                case 2:
                    Conversor.convertir( "ARS", "USD", consulta, lectura);
                    break;
                case 3:
                    Conversor.convertir("USD", "BRL", consulta, lectura);
                    break;
                case 4:
                    Conversor.convertir("BRL", "USD", consulta, lectura);
                    break;
                case 5:
                    Conversor.convertir("USD", "COP", consulta, lectura);
                    break;
                case 6:
                    Conversor.convertir( "COP", "USD", consulta, lectura);
                    break;
                case 7:
                    System.out.println("Fin del Programa");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }
    }
}
