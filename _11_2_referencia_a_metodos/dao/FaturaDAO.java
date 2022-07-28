package _11_2_referencia_a_metodos.dao;

import _11_2_referencia_a_metodos.modelo.Fatura;

import java.util.ArrayList;
import java.util.List;

public class FaturaDAO {

    public List<Fatura> buscarFaturasVencidas(){
        //Obiviamente voce buscaria isso no banco de Dados....Que estamos apenas emulando

        List<Fatura> faturas = new ArrayList<>();
        faturas.add(new Fatura("joaoschrock@gmail.com", 350.0));
        faturas.add(new Fatura("schrockholmes@gmail.com", 350.0));
        faturas.add(new Fatura("schrock's027@gmail.com", 350.0));

        return faturas;
    }
}
