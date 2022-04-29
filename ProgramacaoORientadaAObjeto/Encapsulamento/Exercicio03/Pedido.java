package ProgramacaoOrientadaAObjeto.Encapsulamento;
public class Pedido {
        int codigo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    public int getTotal() {
        return subtotal - desconto;
    }


    int subtotal;
        int desconto;
    }

