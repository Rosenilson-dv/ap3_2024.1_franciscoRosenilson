package centro_convencoes;

import java.util.List;
import java.util.ArrayList;
import java.time.LocalDateTime;

public class CentroConvecoes {
    private List<Auditorio> auditorios;
    
    public void fazeReserva() {
        for (Auditorio auditorioAtual : auditorios){
            System.out.println(auditorioAtual);
        }
    }
    
    public CentroConvecoes(int capacidadeCentro , int capacidadePorSala) {
        this.auditorios = new ArrayList<>();
        
        for (int i = 0; i < capacidadeCentro; i++) {
            auditorios.add(new Auditorio(i, capacidadePorSala));
        }

    }

    public void ReservarAuditorio (int numeroSala, LocalDateTime data) {
        for (Auditorio auditorioAtual : auditorios) {
            if (auditorioAtual.getNumeroSala() == numeroSala) {
                auditorioAtual.isOcupado();
                auditorioAtual.setDataReserva(data);
            }
        }
    }
}