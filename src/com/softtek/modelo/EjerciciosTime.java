package com.softtek.modelo;

import java.time.*;

public class EjerciciosTime {


    public LocalDate sumarDiasAFecha(LocalDate fecha, int dias) {
        return fecha.plusDays(dias);
    }

    public ZonedDateTime obtenerFechaHoyConZonaHorariaPorDefecto() {
        return ZonedDateTime.now();
    }

    public ZonedDateTime obtenerFechaHoyConZonaHoraria(String zonaHoraria) {
        return ZonedDateTime.now(ZoneId.of(zonaHoraria));
    }

    public LocalDate obtenerDiaDelAño(int año, int dia) {
        return LocalDate.ofYearDay(año, dia);
    }

    public boolean compararFechas(LocalDate fecha1, LocalDate fecha2) {
        return fecha1.isBefore(fecha2);
    }

    public LocalDate sumarSemanasAFecha(LocalDate fecha, int semanas) {
        return fecha.plusWeeks(semanas);
    }

    public int calcularAñosTrabajados(LocalDate fechaInicio, LocalDate fechaFin) {
        Period periodo = Period.between(fechaInicio, fechaFin);
        return periodo.getYears();
    }

    public int calcularEdad(LocalDate fechaNacimiento, LocalDate fechaActual) {
        Period periodo = Period.between(fechaNacimiento, fechaActual);
        return periodo.getYears();
    }

    public LocalDate calcularFechaInicioProyecto(LocalDate fechaEntrega, int duracionDias) {
        return fechaEntrega.minusDays(duracionDias);
    }

    public long calcularDuracionProyectoEnDias(LocalDate fechaInicio, LocalDate fechaFin) {
        return Duration.between(fechaInicio.atStartOfDay(), fechaFin.atStartOfDay()).toDays();
    }
}


