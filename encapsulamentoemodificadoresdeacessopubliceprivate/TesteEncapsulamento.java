package OrientacaoAobjetoParte2.encapsulamentoemodificadoresdeacessopubliceprivate;

public class TesteEncapsulamento {
    public static void main(String[] args) {
        Arcondicionado ar = new Arcondicionado();
        ar.trocarTemperatura(21);
        System.out.println("Temperatura do ar: " + ar.obterTemperatura() +"°");



            }
        }


