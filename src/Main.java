import com.google.gson.Gson;
import model.ApiConversor;
import model.ApiModel;
import model.Conversor;

import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conversor conversor = new Conversor();
        int option=0;
        while (option != 6){
        System.out.println("********************************************\n" +
                "*             Conversor de monedas         *" +
                "\n********************************************" +
                "\nOpciones disponible:" +
                "\n1-Dolar a Peso Colombiano" +
                "\n2-Dolar a Peso Mexicano" +
                "\n3-Dolar a Rublo" +
                "\n4-Peso Colombiano a dolar" +
                "\n5-Rublo a dolar" +
                "\n6-Salir" +
                "\nOpción R/:");
        option = sc.nextInt();
        if (option == 6){break;}
        if (option > 6 || option < 1){continue;}
        System.out.println("Ingrese valor a convertir: ");
        double valor = sc.nextDouble();
        System.out.println("**************************************\n" +
                "* Resultado: "+conversor.getConversion(option, valor)+" *" +
                "\n**************************************");
        System.out.println("presione para continuar");
            try {
                System.in.read();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}