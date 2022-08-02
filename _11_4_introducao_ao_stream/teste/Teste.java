package _11_4_introducao_ao_stream.teste;

import _11_4_introducao_ao_stream.dao.FaturaDAO;
import _11_4_introducao_ao_stream.modelo.Fatura;

import java.util.List;

public class Teste {
    public static void main(String[] args) {
        List<Fatura> faturas = new FaturaDAO().buscartodasasfaturas(); // buscar em um metodo de instancia

    }
}
