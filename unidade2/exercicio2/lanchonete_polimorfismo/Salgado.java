package unidade2.exercicio2.lanchonete_polimorfismo;

public class Salgado extends Produto {

    private String proteina;
    
    public Salgado(String nome, double preco, String proteina) {
        super(nome, preco);
        this.proteina = proteina;
    }

    public void consumir(){
        System.out.println("Estou consumindo um salgado");
    }

    public String getProteina() {
        return proteina;
    }

    public void setProteina(String proteina) {
        this.proteina = proteina;
    }
    
    @Override
    public String toString() {
        return "Salgado [nome=" + nome + ", proteina=" + proteina + ", preco=" + preco + super.toString() + "]";
    }
    
}
