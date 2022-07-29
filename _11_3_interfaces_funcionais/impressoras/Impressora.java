package _11_3_interfaces_funcionais.impressoras;

import _11_3_interfaces_funcionais.Compra.Compra;

@FunctionalInterface
public interface Impressora {

    public void imprimir(Compra c);
}
