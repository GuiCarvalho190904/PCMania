package br.inatel.pcmania;

public class Cliente {
    private String nome;
    private String cpf;
    private Computador[] compras = new Computador[10];

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public float calculaTotalCompra() {
        float total = 0;
        for (Computador pc : compras) {
            if (pc != null) {
                total += pc.getPreco();
            }
        }
        return total;
    }

    // Método para adicionar um PC ao carrinho do cliente
    public void comprar(Computador pc) {
        for (int i = 0; i < compras.length; i++) {
            if (compras[i] == null) {
                compras[i] = pc;
                break;
            }
        }
    }

    // Getters para o relatório final
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public Computador[] getCompras() {
        return compras;
    }

}