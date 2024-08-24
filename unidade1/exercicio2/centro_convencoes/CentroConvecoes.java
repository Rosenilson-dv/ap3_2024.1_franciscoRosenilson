package centro_convencoes;

import java.util.List;

public class CentroConvecoes {
    public class Reserva {

        protected List<Reserva> reservas;
        protected List<Auditorio> auditorios;
        
        public Reserva(List<Reserva> reservas, List<Auditorio> auditorios) {
            this.reservas = reservas;
            this.auditorios = auditorios;
        }

        public List<Reserva> getReservas() {
            return reservas;
        }
        public void setReservas(List<Reserva> reservas) {
            this.reservas = reservas;
        }
        public List<Auditorio> getAuditorios() {
            return auditorios;
        }
        public void setAuditorios(List<Auditorio> auditorios) {
            this.auditorios = auditorios;
        }

        @Override
        public String toString() {
            return "Reserva [reservas=" + reservas + ", auditorios=" + auditorios + ", getReservas()=" + getReservas()
                    + ", getAuditorios()=" + getAuditorios() + "]";
        }
    }     
}