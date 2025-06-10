/**
 *
 * @author Stefano Lopes Delgado
 */

import java.time.Year;

public class BibliotecaObra {

    public static void main(String[] args) {
        System.out.println("==== TESTE 1: ISBN inválido (nulo) ====");
        Obra o1 = new Obra();
        o1.setIsbn(null);  // Deve imprimir erro

        System.out.println("\n==== TESTE 2: ISBN com formato inválido ====");
        o1.setIsbn("123456789012");  // Deve imprimir erro (apenas 12 dígitos)

        System.out.println("\n==== TESTE 3: ISBN com dígito verificador incorreto ====");
        o1.setIsbn("9780306406158");  // ISBN com DV errado (corrigir último dígito se necessário)

        System.out.println("\n==== TESTE 4: ISBN válido ====");
        o1.setIsbn("9780306406151");  // ISBN válido

        System.out.println("\n==== TESTE 5: Título nulo ====");
        o1.setTitulo(null);  // Deve imprimir erro

        System.out.println("\n==== TESTE 6: Título válido ====");
        o1.setTitulo("O Guia do Mochileiro das Galáxias");

        System.out.println("\n==== TESTE 7: Autor nulo ====");
        o1.setAutor(null);  // Deve imprimir erro

        System.out.println("\n==== TESTE 8: Autor válido ====");
        o1.setAutor("Douglas Adams");

        System.out.println("\n==== TESTE 9: Ano no futuro ====");
        o1.setAno(Year.now().plusYears(1));  // Deve imprimir erro

        System.out.println("\n==== TESTE 10: Ano negativo ====");
        o1.setAno(-50);  // Deve imprimir erro

        System.out.println("\n==== TESTE 11: Ano válido ====");
        o1.setAno(1979);

        System.out.println("\n==== TESTE 12: Quantidade de livros negativa ====");
        o1.setQuantidadeLivros(-5);  // Deve imprimir erro

        System.out.println("\n==== TESTE 13: Quantidade de livros válida ====");
        o1.setQuantidadeLivros(3);

        System.out.println("\n==== TESTE 14: Verificar disponibilidade ====");
        System.out.println("Disponível? " + o1.disponivel());  // true

        System.out.println("\n==== TESTE 15: Realizar 3 empréstimos ====");
        o1.emprestimo();
        o1.emprestimo();
        o1.emprestimo();
        System.out.println("Quantidade após 3 empréstimos: " + o1.getQuantidadeLivros());

        System.out.println("\n==== TESTE 16: Tentar emprestar sem livros ====");
        o1.emprestimo();  // Deve dar erro

        System.out.println("\n==== TESTE 17: Devolver um livro ====");
        o1.devolver();
        System.out.println("Quantidade após devolução: " + o1.getQuantidadeLivros());

        System.out.println("\n==== TESTE 18: Construtor com int ====");
        Obra o2 = new Obra("9780306406151", "Duna", "Frank Herbert", 1965, 10);
        System.out.println(o2.toString());

        System.out.println("\n==== TESTE 19: Construtor com Year ====");
        Obra o3 = new Obra("9780306406151", "1984", "George Orwell", Year.of(1949), 5);
        System.out.println(o3.toString());

        System.out.println("\n==== TESTE 20: toString ====");
        System.out.println(o3);  // toString implícito
    }
}
