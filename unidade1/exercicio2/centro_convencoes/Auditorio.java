package centro_convencoes;

import java.time.LocalDateTime;

public class Auditorio {
    
    int numeroSala;
    int capacidade;
    boolean ocupado;
    LocalDateTime DataReserva;

    public Auditorio(int numeroSala, int capacidade) {
        this.numeroSala = numeroSala;
        this.capacidade = capacidade;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public LocalDateTime getDataReserva() {
        return DataReserva;
    }

    public void setDataReserva(LocalDateTime dataReserva) {
        DataReserva = dataReserva;
    }
    
    @Override
    public String toString() {
        return "Auditorio [numeroSala=" + numeroSala + ", capacidade=" + capacidade + ", ocupado=" + ocupado
                + ", DataReserva=" + DataReserva + "]";
    }
}
