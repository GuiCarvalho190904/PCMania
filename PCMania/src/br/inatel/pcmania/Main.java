package br.inatel.pcmania;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. Criar o Scanner para ler a opção do usuário
        Scanner entrada = new Scanner(System.in);

        // 2. Criar o br.inatel.pcmania.Cliente
        Cliente cliente = new Cliente("Seu Nome", "123.456.789-00");

        // PROMOÇÃO 1
        float precoP1 = 9795f;
        Computador p1 = new Computador("Positivo", precoP1, "Linux Ubuntu", 32);
        p1.setHardware(new HardwareBasico("Processador Pentium", 2200), 0);
        p1.setHardware(new HardwareBasico("Memória RAM", 8), 1);
        p1.setHardware(new HardwareBasico("HD", 500), 2);
        p1.addMemoriaUSB(new MemoriaUSB("Pen-drive", 16));

        // PROMOÇÃO 2
        float precoP2 = 9795f + 1234f;
        Computador p2 = new Computador("Acer", precoP2, "Windows 10", 64);
        p2.setHardware(new HardwareBasico("Processador Core i5", 3370), 0);
        p2.setHardware(new HardwareBasico("Memória RAM", 16), 1);
        p2.setHardware(new HardwareBasico("HD", 1000), 2);
        p2.addMemoriaUSB(new MemoriaUSB("Pen-drive", 32));

        // PROMOÇÃO 3
        float precoP3 = 9795f + 5678f;
        Computador p3 = new Computador("Vaio", precoP3, "Windows 10", 64);
        p3.setHardware(new HardwareBasico("Processador Core i7", 4500), 0);
        p3.setHardware(new HardwareBasico("Memória RAM", 32), 1);
        p3.setHardware(new HardwareBasico("HD", 2000), 2);
        p3.addMemoriaUSB(new MemoriaUSB("HD Externo", 1000));

        // --- MENU DE COMPRAS ---
        int opcao = -1;
        System.out.println("Bem-vindo à PC Mania!");

        while (opcao != 0) {
            System.out.println("\nEscolha uma promoção:");
            System.out.println("1 - Promoção 1 (Positivo)");
            System.out.println("2 - Promoção 2 (Acer)");
            System.out.println("3 - Promoção 3 (Vaio)");
            System.out.println("0 - Sair e finalizar pedido");

            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    cliente.comprar(p1);
                    System.out.println("Você adicionou a Promoção 1 ao carrinho!");
                    break;
                case 2:
                    cliente.comprar(p2);
                    System.out.println("Você adicionou a Promoção 2 ao carrinho!");
                    break;
                case 3:
                    cliente.comprar(p3);
                    System.out.println("Você adicionou a Promoção 3 ao carrinho!");
                    break;
                case 0:
                    System.out.println("Finalizando compra...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        // Dentro do loop ou no relatório final do Cliente
        for (Computador pc : cliente.getCompras()) {
            if (pc != null) {
                pc.mostraPCConfigs(); // <--- Quando você escrever essa linha, o "no usage" some!
            }
        }
        System.out.println("\n---------- RESUMO DO PEDIDO ----------");
        System.out.println("br.inatel.pcmania.Cliente: " + cliente.getNome() + " | CPF: " + cliente.getCpf());

        // Aqui você percorre o array de compras do cliente para mostrar cada PC
        // E no final, calculamos o total:
        System.out.println("Total da Compra: R$ " + cliente.calculaTotalCompra());

        // No final da sua br.inatel.pcmania.Main, depois de mostrar o total:
        ProcessarPedido.processar(cliente.getCompras());

        entrada.close();
    }
}