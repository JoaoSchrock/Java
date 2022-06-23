package _7_mais_detalhes_e_frameworks_7_1__metodos_da_classe_string;

public class ExemploClassesString {
    public static void main(String[] args) {
        String s = "João Vitor Campos dos santos schrock da silva";

        System.out.println(s.charAt(0));
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(8));
        System.out.println(s.charAt(9));

        System.out.println(s.length());//Quantidade de letras do nome

        char[] array = {'0', 'L', 'A',};
        String s1 = new String(array);
        System.out.println(s1);

        String s2 = "Desenvolvimento Java";
        System.out.println(s2.substring(16));
        String s3 = "Cursos online de Desenvolvimento de Software";
        System.out.println(s3.substring(7,12));

        String s4 = "Cursos_online__de_Desenvolvimento_de_Software";
        String[] array1 = s4.split("_");
        for(int i = 0; i < array1.length; i++){
            System.out.println("[" + i + "]=" + array1[i]);
        }

       String s5 = "    João    ";
        System.out.println(">" + s5 + "<");
        System.out.println(">" + s5.trim() + "<");//o ( trim ) tira os espacos em branco

        String s6 = "Java";
        int indice = s6.indexOf('a');
        System.out.println(indice);
        indice = s6.indexOf('a');
        System.out.println(indice);

        String s7 = "Desenvolvimento Java";
        System.out.println(s7.replaceAll("Java","de Software"));




    }
}
