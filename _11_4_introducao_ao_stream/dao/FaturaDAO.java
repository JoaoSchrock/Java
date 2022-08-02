package _11_4_introducao_ao_stream.dao;

import _11_4_introducao_ao_stream.modelo.Fatura;

import java.util.ArrayList;
import java.util.List;

public class FaturaDAO {

    public List<Fatura> buscartodasasfaturas() {


        List<Fatura> faturas = new ArrayList<>();
        faturas.add(new Fatura("Joaoschrock@gmail.com", 350.0));
        faturas.add(new Fatura("LarissaSchrock@gmail.com", 350.0));
        faturas.add(new Fatura("DeniseSchrock@gmail.com", 350.0));
    return faturas;
    }

}
