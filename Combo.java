import java.util.ArrayList;
import java.util.List;

public class Combo implements ItemPedido {
    private String nomeCombo;
    private List<ItemPedido> itens = new ArrayList<>();

    public Combo(String nome) {
        this.nomeCombo = nome;
    }

    public void adicionar(ItemPedido item) {
        itens.add(item);
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("\n--- Combo: " + nomeCombo + " ---");
        for (ItemPedido item : itens) {
            item.mostrarDetalhes();
        }
        System.out.println("Preço Total do Combo: R$ " + getPreco());
    }

    @Override
    public double getPreco() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.getPreco();
        }
        return total;
    }
}