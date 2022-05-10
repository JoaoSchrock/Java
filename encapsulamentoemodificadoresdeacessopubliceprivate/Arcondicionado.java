package OrientacaoAobjetoParte2.encapsulamentoemodificadoresdeacessopubliceprivate;

public class Arcondicionado {
    private int temperatura;

    public void trocarTemperatura(int temperatura) {
        if (temperatura >= 17 && temperatura <= 25) {
            this.temperatura = temperatura;

        }

    }

    public int obterTemperatura() {
        return temperatura;
    }
}


