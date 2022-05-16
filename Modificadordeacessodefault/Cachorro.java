package Modificadordeacessodefault;

public class Cachorro {

    private String nome;
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void sentar(){
        System.out.println("Eu, " +  nome + ", vou sentar!");
    }
    public  void andar(){
        System.out.println("Eu, " + nome + ", vou andar!");
    }
    public void rolar(){
        System.out.println("Eu, " + nome + ", vou rolar");
    }

}
