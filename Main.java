import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        int totalVezes = 0;
        int numeroDado;
        int somaDosDados = 0;


        System.out.println("*********************************************************");
        System.out.println("PROGRAMA DE ROLAR DADOS (6 LADOS) (SERVE PRA ROLAR DADOS)");
        System.out.println("*********************************************************");
        System.out.println(" ");
        System.out.print("Digite quantos dados irá rolar: ");
        numeroDado = scanner.nextInt();

        if(numeroDado > 0){
            for(int i = 0; i < numeroDado; i++){
                int rolar = random.nextInt(1,7);
                mostrarDado(rolar);
                System.out.println("Você rolou: " + rolar);
                System.out.println(" ");
                totalVezes++;
                somaDosDados = somaDosDados + rolar;
            }
            System.out.println(" ");
            System.out.println("Total de vezes que rolou o dado: " + totalVezes);
            System.out.println("A soma dos dados foi de: " + somaDosDados);
        }
        else{
            System.out.println("O número do dado precisa ser maior que zero.");
        }
        scanner.close();
    }
    static void mostrarDado(int rolar){

        String dado1 = """
                -------
                |     |
                |  ●  |
                |     |
                -------   
                """;
        String dado2 = """
                -------
                |     |
                |   ● |
                | ●   |
                -------   
                """;
        String dado3 = """
                -------
                |  ●  |
                |  ●  |
                |  ●  |
                -------   
                """;
        String dado4 = """
                -------
                | ● ● |
                | ● ● |
                |     |
                -------   
                """;
        String dado5 = """
                -------
                | ● ● |
                |  ●  |
                | ● ● |
                -------   
                """;
        String dado6 = """
                -------
                | ● ● |
                | ● ● |
                | ● ● |
                -------   
                """;

        switch (rolar){
            case 1 -> System.out.println(dado1);
            case 2 -> System.out.println(dado2);
            case 3 -> System.out.println(dado3);
            case 4 -> System.out.println(dado4);
            case 5 -> System.out.println(dado5);
            case 6 -> System.out.println(dado6);
            default -> System.out.println("Rolada de dado não-válida.");
        }
    }
}
