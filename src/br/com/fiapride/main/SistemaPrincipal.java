package br.com.fiapride.main;

import br.com.fiapride.model.Microondas;

public class SistemaPrincipal {

    public static void main(String[] args) {

        Microondas microondas = new Microondas();

        microondas.marca = "Electrolux";
        microondas.potencia = 1000;
        microondas.tempo = 0;

        System.out.println("=== FiapRide ===");
        System.out.println("Micro-ondas: " + microondas.marca);
        System.out.println("Potência: " + microondas.potencia + " W");
        System.out.println("Tempo inicial: " + microondas.tempo + " segundos");

        System.out.println("\n--- Teste 1: Aquecer ---");

        microondas.aquecer(30);

        System.out.println("Tempo atual: "
                + microondas.tempo + " segundos");

        System.out.println("\n--- Teste 2: Aquecer com valor inválido ---");

        microondas.aquecer(-10);

        System.out.println("\n--- Teste 3: Parar ---");

        microondas.parar();

        System.out.println("Tempo atual: "
                + microondas.tempo + " segundos");

        System.out.println("\n--- Teste 4: Parar novamente ---");

        microondas.parar();
    }
}