
public class RemoverVeiculoThread extends Thread{

    private final Estacionamento estacionamento;
    private final String placa;

    public RemoverVeiculoThread(Estacionamento estacionamento, String placa) {
        this.estacionamento = estacionamento;
        this.placa = placa;
    }

    @Override
    public void run() {
        try {
            estacionamento.remover(placa);
        } catch (VeiculoNaoEncontradoException e) {
            System.out.println(e.getMessage());
        }
    }
}
