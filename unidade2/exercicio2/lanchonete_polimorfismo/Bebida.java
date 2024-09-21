package unidade2.exercicio2.lanchonete_polimorfismo;

public class Bebida extends Produto {
    

    private double volume;
    
    public Bebida(String nome, double preco, double volume) {
        super(nome, preco);
        this.volume = volume;
    }

    public void consumir(){
        System.out.println("Estou bebendo uma bebida");
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
    
    @Override
    public String toString() {
        return "Bebida [nome=" + nome + ", volume=" + volume + ", preco=" + preco + super.toString()
                + "]";
    }
    
}
