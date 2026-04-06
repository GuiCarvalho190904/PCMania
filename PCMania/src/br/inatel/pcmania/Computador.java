package br.inatel.pcmania;

public class Computador {
    private String marca;
    private float preco;
    private SistemaOperacional sistemaOperacional;
    private HardwareBasico[] hardwares;
    private MemoriaUSB memoriaUSB;

    public Computador(String marca, float preco, String nomeSO, int tipoSO) {
        this.marca = marca;
        this.preco = preco;
        this.sistemaOperacional = new SistemaOperacional(nomeSO, tipoSO);
        this.hardwares = new HardwareBasico[3];
    }

    public void mostraPCConfigs() {
        System.out.println("-------------------------");
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$ " + preco);
        System.out.println("S.O.: " + sistemaOperacional.getNome() + " (" + sistemaOperacional.getTipo() + " bits)");

        for (HardwareBasico hb : hardwares) {
            if (hb != null) {
                // Formatação simples para mostrar MHz ou Gb dependendo do item
                String unidade = hb.getNome().contains("Processador") ? " MHz" : " Gb";
                System.out.println(hb.getNome() + ": " + hb.getCapacidade() + unidade);
            }
        }

        if (memoriaUSB != null) {
            System.out.println("Acompanha: " + memoriaUSB.getNome() + " de " + memoriaUSB.getCapacidade() + "Gb");
        }
    }

    public void addMemoriaUSB(MemoriaUSB musb) {
        this.memoriaUSB = musb;
    }

    public void setHardware(HardwareBasico hb, int index) {
        this.hardwares[index] = hb;
    }

    public float getPreco() { return preco; }
}