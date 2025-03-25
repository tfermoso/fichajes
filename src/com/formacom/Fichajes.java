package com.formacom;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Fichajes implements IFichajes {
    private List<Alumno> listaAlumnos;
    private String modo;
    private List<Registro> registros;

    public Fichajes() {
        listaAlumnos=new ArrayList<>();
        registros=new ArrayList<>();
        modo="Entrada";
    }

    @Override
    public Boolean login(String user, String pass) {

        return null;
    }

    @Override
    public String alta_alumno(String dni, String nombre) {
        return "";
    }

    @Override
    public String cambiar_modo(String modo) {
        return "";
    }

    @Override
    public List<Registro> informe_por_dia(LocalDate dia) {
        return List.of();
    }

    @Override
    public List<Registro> informe_por_alumno(String dni) {
        return List.of();
    }

    @Override
    public String fichar(String dni) {
        return "";
    }
}
