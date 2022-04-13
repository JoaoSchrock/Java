import java.util.Scanner;

/*
System.out.print("Digite o número referente ao dia da semana: ");
Imprima o nome do dia da semana (domingo, segunda-feira, etc.)
 */
public class ExercicioSwit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero que sera igual ao dia da semana" + "\n1-domingo" + "\n2-segunda" + "\n3-terca" + "\n4-quarta" + "\n5-quinta" + "\n6-sexta" + "\n7-sabado");
        System.out.println("Digite:");
        String dia;
        Integer diaDaSemana = scanner.nextInt();


        switch (diaDaSemana) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terça";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sabado";
                break;
            default:
                dia = "invalido";

        }
        System.out.println("Dia escolhido foi: " + dia);

    }
}
