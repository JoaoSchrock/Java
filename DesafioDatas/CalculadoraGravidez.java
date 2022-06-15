package DesafioDatas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalculadoraGravidez {
    public Date dataUltimoPeriodoMenstrual;
    public CalculadoraGravidez(Date dataUltimoPeriodoMenstrual) {
        this.dataUltimoPeriodoMenstrual = dataUltimoPeriodoMenstrual;
    }
    private Calendar converterDateParaCalendar(Date data) {
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(data);
        return calendar;
    }
    public Date calcularDataEstimadaConcepcao() {
       Calendar dataEstimadaConcepcao = converterDateParaCalendar(dataUltimoPeriodoMenstrual);
       dataEstimadaConcepcao.add(Calendar.WEEK_OF_YEAR,2);
    return dataEstimadaConcepcao.getTime();
    }
    public Date calcularDataEstimadaParto() {
        Calendar dataEstimadaParto = converterDateParaCalendar(dataUltimoPeriodoMenstrual);
        dataEstimadaParto.add(Calendar.WEEK_OF_YEAR,40);
        return dataEstimadaParto.getTime();
    }
}