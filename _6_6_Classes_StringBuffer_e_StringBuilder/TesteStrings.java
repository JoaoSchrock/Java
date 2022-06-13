package _6_6_Classes_StringBuffer_e_StringBuilder;

public class TesteStrings {
    public static void main(String[] args) {
        String s = "Olá";
        s = s + " Pessoal!";
        System.out.println(s);

        // Jeito bom, Porém nao e o jeito indicado, entao esqueca isso e use o de baixo.

        System.out.println("--------------------------------");

        StringBuilder sb = new StringBuilder("Olá"); // Jeito mais eficiente de se utilizar e é bem mais facil de se Manipular,
        sb.append(" Pessoal!");//Append traduzindo siguinifica "Acrescentar",no caso acrescenta a tal Frase.

        String resultado = sb.toString();//to String converte para String.
        System.out.println("com StringBuilder: " + resultado);

    }
}
