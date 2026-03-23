package TodoParte.RevisaoExercicios.exe1;

import java.time.LocalDateTime;
public class TestaConsulta {

    public static void main(String[] args) {

        // Criando médico
        Medico medico = new Medico("Dr. João",  "Cardiologia", 156);

        // Criando paciente
        Paciente paciente = new Paciente(1, "Maria", "123.456.789-00");

        // Data da consulta (20/05/2026 às 14:00)
        LocalDateTime dataConsulta = LocalDateTime.of(2026, 5, 20, 14, 0);

        // Criando consulta
        Consulta consulta = new Consulta(dataConsulta, 200.0, medico, paciente);

        // Exibindo informações
        System.out.println("Consulta marcada!");
        System.out.println("Data: " + consulta.getData());
        System.out.println("Médico: " + consulta.getMedico().getNome());
        System.out.println("Paciente: " + consulta.getPaciente().getNome());
        System.out.println("Valor: R$ " + consulta.getValorDaConsulta());
    }


}


