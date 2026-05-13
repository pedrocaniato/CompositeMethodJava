public class PedidoTest {
    public static void main(String[] args) {
        System.out.println("Iniciando teste Composite...");
        
        ItemPedido burger = new Produto("X-Burger", 25.0);
        ItemPedido batata = new Produto("Batata M", 12.0);
        ItemPedido refri = new Produto("Refri Lata", 8.0);

        Combo comboFamilia = new Combo("Combo Feliz");
        comboFamilia.adicionar(burger);
        comboFamilia.adicionar(batata);
        comboFamilia.adicionar(refri);

        comboFamilia.mostrarDetalhes();

        if (comboFamilia.getPreco() == 45.0) {
            System.out.println("\nTESTE PASSOU: Composite calculou o total corretamente.");
        }
    }
}