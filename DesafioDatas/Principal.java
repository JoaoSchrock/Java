package DesafioDatas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public Principal() {
        Scanner entrada = new Scanner(System.in);
        try {
            System.out.println("Data do último período menstrual (dd/mm/aaaa):");
            String ultimoPeriodoMenstrual = entrada.nextLine();
            Date dataUltimoPeriodoMenstrual = this.converterEmData(ultimoPeriodoMenstrual);
            CalculadoraGravidez calculadora = new CalculadoraGravidez(dataUltimoPeriodoMenstrual);
            Date dataEstimadaConcepcao = calculadora.calcularDataEstimadaConcepcao();
            System.out.println("Data estimada da concepção: "
                    + this.formatarData(dataEstimadaConcepcao));
            Date dataEstimadaParto = calculadora.calcularDataEstimadaParto();
            System.out.println("Data estimada para parto: "
                    + this.formatarData(dataEstimadaParto));
        } catch (ParseException pe) {
            System.out.println("Informe uma data no padrão dd/mm/aaaa.");
        }
    }

    public static void main(String args[]) {
        new Principal();
    }

    private String formatarData(Date data) {
        DateFormat formatador = new SimpleDateFormat("EEEE, dd 'de' MMMM 'de' yyyy",
                new Locale("pt", "br"));
        return formatador.format(data);
    }

    private Date converterEmData(String texto) throws ParseException {
        DateFormat conversor = new SimpleDateFormat("dd/MM/yyyy");
        return conversor.parse(texto);
    }
}