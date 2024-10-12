public class MainEstacionamento {

    public static void main(String[] args) {
        
        Estacionamento estacionamento = new Estacionamento();

        Veiculo veiculo1 = new Veiculo("IVX4H97", "Fiat - Uno");
        Veiculo veiculo2 = new Veiculo("PIA2A19", "Porsche - Macan");
        Veiculo veiculo3 = new Veiculo("BRA20E4", "BMW - I8");

        try {
            System.out.println("Adicionando...");
            estacionamento.adicionar(veiculo1);
            estacionamento.adicionar(veiculo2);
            estacionamento.adicionar(veiculo3);
            System.out.println("3 veiculos adicionados.");

            System.out.println("Removendo...");
            estacionamento.remover("HPT6Q77");
            System.out.println("1 veiculo removido.");
        } catch (VeiculoNaoEncontradoException e) {
            System.out.println(e.getMessage());
        }
    }
}
