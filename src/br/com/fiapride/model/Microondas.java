package br.com.fiapride.model;

public class Microondas {

    public String marca;
    public int potencia;
    public int tempo;

    public void aquecer(int segundos) {

        if (segundos > 0) {
            tempo += segundos;
            System.out.println("Micro-ondas aquecendo por "
                    + segundos + " segundos.");
        } else {
            System.out.println("Erro: o tempo deve ser maior que zero.");
        }
    }

    public void parar() {

        if (tempo > 0) {
            tempo = 0;
            System.out.println("Micro-ondas parado.");
        } else {
            System.out.println("Erro: o micro-ondas já está parado.");
        }
    }
}
