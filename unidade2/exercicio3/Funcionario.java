package unidade2.exercicio3;

import java.text.NumberFormat;
import java.util.Locale;

public class Funcionario {
    
    private long idFuncionario;
    private String nome;
    private String departamento;
    private Double salario;
    
    public Funcionario(long idFuncionario, String nome, String departamento, Double salario) {
        this.idFuncionario = idFuncionario;
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
    }
    
    @Override
    public String toString() {

        NumberFormat formatador = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));


        return idFuncionario + ";" + nome + ";" + departamento + ";" + formatador.format(salario);
    }

}
