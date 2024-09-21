package unidade2.exercicio2.lanchonete_polimorfismo;

public abstract class Produto {

    
    String nome;
    double preco;
    
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;

    }
    public abstract void consumir();    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", preco=" + preco + super.toString() + "]";
    }
    
}
