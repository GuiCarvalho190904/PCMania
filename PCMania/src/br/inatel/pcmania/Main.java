package br.inatel.pcmania;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Cliente cliente = new Cliente("Guilherme", "123.456.789-00");

        // --- MONTAGEM DAS PROMOÇÕES CONFORME A TABELA ---

        // PROMOÇÃO 1: Apple
        float precoP1 = 9795f; // Preço: Matrícula pura
        Computador p1 = new Computador("Apple", precoP1, "macOS Sequoia", 64);
        p1.setHardware(new HardwareBasico("Pentium Core i3", 2200), 0);
        p1.setHardware(new HardwareBasico("Memória RAM", 8), 1);
        p1.setHardware(new HardwareBasico("HD", 500), 2);
        p1.addMemoriaUSB(new MemoriaUSB("Pen-drive", 16));

        // PROMOÇÃO 2: Samsung
        float precoP2 = 9795f + 1234f; // Preço: Matrícula + 1234
        Computador p2 = new Computador("Samsung", precoP2, "Windows 8", 64);
        p2.setHardware(new HardwareBasico("Pentium Core i5", 3370), 0);
        p2.setHardware(new HardwareBasico("Memória RAM", 16), 1);
        p2.setHardware(new HardwareBasico("HD", 1000), 2); // 1Tb = 1000Gb
        p2.addMemoriaUSB(new MemoriaUSB("Pen-drive", 32));

        // PROMOÇÃO 3: Dell
        float precoP3 = 9795f + 5678f; // Preço: Matrícula + 5678
        Computador p3 = new Computador("Dell", precoP3, "Windows 10", 64);
        p3.setHardware(new HardwareBasico("Pentium Core i7", 4500), 0);
        p3.setHardware(new HardwareBasico("Memória RAM", 32), 1);
        p3.setHardware(new HardwareBasico("HD", 2000), 2); // 2Tb = 2000Gb
        p3.addMemoriaUSB(new MemoriaUSB("HD Externo", 1000)); // 1Tb = 1000Gb

        // --- MENU DE COMPRAS ---
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n--- PC MANIA - ESCOLHA UMA PROMOÇÃO ---");
            System.out.println("1 - Promoção 1 (Apple)");
            System.out.println("2 - Promoção 2 (Samsung)");
            System.out.println("3 - Promoção 3 (Dell)");
            System.out.println("0 - Finalizar Compra");

            opcao = entrada.nextInt();

            switch (opcao) {
                case 1: cliente.comprar(p1); break;
                case 2: cliente.comprar(p2); break;
                case 3: cliente.comprar(p3); break;
                case 0: break;
                default: System.out.println("Opção inválida!");
            }
        }

        // --- RELATÓRIO FINAL ---
        System.out.println("\n=== RESUMO DO PEDIDO ===");
        System.out.println("Cliente: " + cliente.getNome());

        // Loop para mostrar as configs de cada PC comprado
        for (Computador pc : cliente.getCompras()) {
            if (pc != null) {
                pc.mostraPCConfigs();
            }
        }

        System.out.println("\nTotal da compra: R$ " + cliente.calculaTotalCompra());

        // Chamada da classe utilitária (Helper)
        ProcessarPedido.processar(cliente.getCompras());

        entrada.close();
    }
}