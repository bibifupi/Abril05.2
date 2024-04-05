package com.softekk.presentacion;

import com.softtek.modelo.EjerciciosTime;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class PruebaEjerciciosTime {

    public static void main(String[] args) {
        EjerciciosTime modelo = new EjerciciosTime();

        // a. Declarar la fecha de inicio del curso y le sumamos 10 días
        LocalDate inicioCurso = LocalDate.of(2024, 4, 2);
        LocalDate inicioCursoMasDiez = modelo.sumarDiasAFecha(inicioCurso, 10);
        System.out.println("Fecha de inicio del curso más 10 días: " + inicioCursoMasDiez);

        // b. Declarar la fecha de hoy con la zona horaria por defecto
        ZonedDateTime hoyZonaPorDefecto = modelo.obtenerFechaHoyConZonaHorariaPorDefecto();
        System.out.println("Fecha de hoy con zona horaria por defecto: " + DateTimeFormatter.ISO_TIME.format(hoyZonaPorDefecto));

        // c. Declarar la fecha de hoy con la zona horaria de “Australia/Sydney”
        ZonedDateTime hoyZonaSydney = modelo.obtenerFechaHoyConZonaHoraria("Australia/Sydney");
        System.out.println("Fecha de hoy con zona horaria de Australia/Sydney: " + DateTimeFormatter.ISO_TIME.format(hoyZonaSydney));

        // d. Cuál es el día 100 de 2024
        LocalDate diaCien2024 = modelo.obtenerDiaDelAño(2024, 100);
        System.out.println("Día 100 del año 2024: " + diaCien2024);

        // e. Definir una fecha para navidad y otra para noche vieja y compararlas
        LocalDate navidad = LocalDate.of(2024, 12, 25);
        LocalDate nocheVieja = LocalDate.of(2024, 12, 31);
        boolean navidadAntesNocheVieja = modelo.compararFechas(navidad, nocheVieja);
        System.out.println("Navidad es antes de Noche Vieja: " + navidadAntesNocheVieja);

        // f. Calcular la fecha resultante sumando 35 semanas al 15 de marzo de 2024
        LocalDate fechaSumadaSemanas = modelo.sumarSemanasAFecha(LocalDate.of(2024, 3, 15), 35);
        System.out.println("Fecha resultante sumando 35 semanas al 15 de marzo de 2024: " + fechaSumadaSemanas);

        // g. Calcular los años trabajados en una empresa de un empleado que inició a trabajar el 6 de Julio de 2012
        int añosTrabajados = modelo.calcularAñosTrabajados(LocalDate.of(2012, 7, 6), LocalDate.now());
        System.out.println("Años trabajados desde el 6 de Julio de 2012: " + añosTrabajados);

        // h. Calcular la edad de una persona que nació el 7 de agosto de 2007
        int edad = modelo.calcularEdad(LocalDate.of(2007, 8, 7), LocalDate.now());
        System.out.println("Edad de una persona nacida el 7 de agosto de 2007: " + edad);

        // i. Calcular la fecha en que se tiene que iniciar un proyecto si su duración es 200 días y se tiene que entregar el 2 de octubre de 2024
        LocalDate inicioProyecto = modelo.calcularFechaInicioProyecto(LocalDate.of(2024, 10, 2), 200);
        System.out.println("Fecha de inicio de un proyecto con duración de 200 días y entrega el 2 de octubre de 2024: " + inicioProyecto);

        // j. Si un proyecto inicia el 15 de marzo y termina el 20 de octubre cuál es su periodo
        EjerciciosTime modelo2 = new EjerciciosTime();
        LocalDate fechaInicio = LocalDate.of(2024, 3, 15);
        LocalDate fechaFin = LocalDate.of(2024, 10, 20);

        long duracionProyectoEnDias = modelo.calcularDuracionProyectoEnDias(fechaInicio, fechaFin);
        System.out.println("La duración del proyecto en días es: " + duracionProyectoEnDias);
    }
}


