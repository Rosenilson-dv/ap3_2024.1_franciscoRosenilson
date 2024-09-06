import java.time.LocalDateTime;

public class MainMercado {

    public static void main(String[] args) {
        Produto umProduto = new Produto("Arroz", 3);
        ProdutoPerecivel umPerecivel = new ProdutoPerecivel("Frutas", 2, LocalDateTime.now());
        System.out.println();
        System.out.println(umPerecivel);
        System.out.println();
        System.out.println(umProduto);
    }
}
