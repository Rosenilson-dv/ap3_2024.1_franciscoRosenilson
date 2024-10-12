

public class VeiculoNaoEncontradoException extends Exception {
    public VeiculoNaoEncontradoException(String message) {
        super("Oooops, veiculo " + message + " não encontrado no estacionamento!");
    }
}