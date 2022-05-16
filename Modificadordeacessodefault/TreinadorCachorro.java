package Modificadordeacessodefault;

import java.util.Scanner;

public class TreinadorCachorro {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("billy");
        DonoCachorro dono = new DonoCachorro();
        dono.ensinarCachorroSentar(cachorro);
    }
}
