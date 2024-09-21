import java.time.LocalDateTime;
public class MainMercado {

    public static void main(String[] args) {
        
        Produto umProduto = new Produto("Copo", 1);
        
        Produto umProduto2 = new Produto("Livro", 1);
        
        Produto umProduto3 = new Produto("Lapis", 1);
        
        ProdutoPerecivel umPerecivel = new ProdutoPerecivel("Queijo", 1, LocalDateTime.now());
        
        ProdutoPerecivel umPerecivel2 = new ProdutoPerecivel("Frutas", 1, LocalDateTime.now());
        
        System.out.println();
        System.out.println(umProduto);
        System.out.println();
        System.out.println(umProduto2);
        System.out.println();
        System.out.println(umProduto3);
        System.out.println();
        System.out.println(umPerecivel);
        System.out.println();
        System.out.println(umPerecivel2);
    }
}
