package br.inatel.pcmania;

public class HardwareBasico {
    private String nome;       // Ex: "Processador Pentium Core i3"
    private float capacidade;  // Ex: 2200 (Mhz) ou 8 (Gb)

    // CONSTRUTOR: Serve para "dar vida" ao objeto já com seus valores
    public HardwareBasico(String nome, float capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    // MÉTODOS GETTERS: Permitem que outras classes leiam o nome e a capacidade
    public String getNome() {
        return nome;
    }
    public float getCapacidade() {
        return capacidade;
    }
}