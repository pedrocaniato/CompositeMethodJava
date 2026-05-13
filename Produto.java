public class Produto implements ItemPedido {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Item: " + nome + " - R$ " + preco);
    }

    @Override
    public double getPreco() {
        return preco;
    }
}