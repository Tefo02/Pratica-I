/**
 *
 * @author Stefano Lopes Delgado
 */


public class Papelaria {

    public static void main(String[] args) {
        // Teste 1: Produto padrão
        Produto produtoPadrao = new Produto();
        System.out.println("Produto padrão:");
        System.out.println(produtoPadrao);
        System.out.println();

        // Teste 2: Produto personalizado
        Produto produto1 = new Produto("Caneta Azul", 2.50f, 0.50f, 100);
        System.out.println("Produto personalizado:");
        System.out.println(produto1);
        System.out.println();

        // Teste 3: Adicionar estoque
        System.out.println("Adicionando 50 unidades ao estoque:");
        produto1.adicionarEstoque(50);
        System.out.println("Novo estoque: " + produto1.getQuantidadeEstoque());
        System.out.println();

        // Teste 4: Remover estoque com quantidade válida
        System.out.println("Removendo 30 unidades do estoque:");
        int novoEstoque = produto1.removerEstoque(30);
        if (novoEstoque != -1) {
            System.out.println("Novo estoque: " + novoEstoque);
        } else {
            System.out.println("Erro: estoque insuficiente.");
        }
        System.out.println();

        // Teste 5: Remover estoque com quantidade inválida
        System.out.println("Tentando remover 1000 unidades do estoque:");
        int resultado = produto1.removerEstoque(1000);
        if (resultado != -1) {
            System.out.println("Novo estoque: " + resultado);
        } else {
            System.out.println("Erro: estoque insuficiente.");
        }
        System.out.println();

        // Teste 6: Verificação final do toString
        System.out.println("Estado final do produto:");
        System.out.println(produto1);
    }
}
