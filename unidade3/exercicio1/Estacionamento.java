import java.util.Arrays;

public class Estacionamento {

    private int capacidade = 12;
    private Veiculo[] osVeiculos = new Veiculo[capacidade]; 
    private int contador = 0;
    
    public void adicionar(Veiculo veiculo) {
        if (contador < capacidade) {
            osVeiculos[contador] = veiculo;
            contador++;
            System.out.println("Veiculo adicionado: " + veiculo.getPlaca());
        } else {
            System.out.println("Capacidade máxima atingida. Não é possível adicionar mais veiculos.");
        }
    }
    
    public void remover(String message) throws VeiculoNaoEncontradoException {
        for (int i = 0; i < contador; i++) {
            if (osVeiculos[i].getPlaca().equals(message)) {
                osVeiculos[i] = osVeiculos[contador - 1];
                osVeiculos[contador - 1] = null;
                contador--;
                System.out.println("Veiculo removido: " + message);
                return;
            }
        }
        throw new VeiculoNaoEncontradoException(message);
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    
    public Veiculo[] getOsVeiculos() {
        return osVeiculos;
    }
    
    public void setOsVeiculos(Veiculo[] osVeiculos) {
        this.osVeiculos = osVeiculos;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    @Override
    public String toString() {
        return "Estacionamento [capacidade=" + capacidade + ", osVeiculos=" + Arrays.toString(osVeiculos)
                + ", contador=" + contador + "]";
    }
}
