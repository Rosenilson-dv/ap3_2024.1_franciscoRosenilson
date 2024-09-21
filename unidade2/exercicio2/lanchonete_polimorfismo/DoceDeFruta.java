package unidade2.exercicio2.lanchonete_polimorfismo;

public class DoceDeFruta extends Produto {
    
    
    public FRUTA fruta;
    private String NomeFruta;
    
    public DoceDeFruta(String nome, double preco, String nomeFruta) {
        super(nome, preco);
        NomeFruta = nomeFruta;
    }
    
    public String getNomeFruta() {
        return NomeFruta;
    }

    public void setNomeFruta(String nomeFruta) {
        NomeFruta = nomeFruta;
    }
    
    public void consumir(){
        System.out.println("Estou consumindo um doce de fruta");
    }
    
@Override
public String toString() {
    return "DoceDeFruta [nome=" + nome + ", fruta=" + fruta + ", preco=" + preco + ", NomeFruta=" + NomeFruta + super.toString() + "]";
}

}
