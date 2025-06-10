
/**
 *
 * @author Stefano Lopes Delgado
 */
import java.time.Year;

public class Obra {

    private String isbn;
    private String titulo;
    private String autor;
    private Year ano;
    private Integer quantidadeLivros;

    //<editor-fold defaultstate="collapsed" desc="Getters e Setters">
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        if (isbn == null) {
            System.out.println("Erro: O código ISBN não pode ser nulo.");
            return;
        }
        
        isbn = isbn.replaceAll("-", "");
        
        if (!(isbn.length() == 13 && isbn.matches("\\d{13}"))) {
            System.out.println("Erro: O código ISBN deve ser contistuído de "
                    + "13 caracteres numéricos (Numeros de 0 a 9).");
            return;
        }
        
        int soma = 0;
        
        for(int i = 0; i < 12; ++i){
            int digito = Character.getNumericValue(isbn.charAt(i));
            soma += (digito % 2 == 0) ? digito : digito * 3;
        }
        
        int digitoVerificador = (10 - (soma % 10)) % 10;
        int ultimoDigito = Character.
                getNumericValue(isbn.charAt(isbn.length() - 1));
        
        if(digitoVerificador != ultimoDigito){
            System.out.println("Erro: o código ISBN fornecido não é válido (valor esperado: " + digitoVerificador +  ")");
            return;
        }
        
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null){
            System.out.println("Erro: O título não pode ser Nulo.");
        }
        
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (autor == null){
            System.out.println("Erro: O autor não pode ser Nulo.");
        }
        
        this.autor = autor;
    }

    public Year getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (Year.of(ano).isBefore(Year.of(0))){
            System.out.println("Erro: o ano dever ser um numero positivo");
        }
        
        if (Year.of(ano).isAfter(Year.now())) {
            System.out.println("Erro: o ano não pode ser uma data do futuro.");
        }
        
        this.ano = Year.of(ano);
    }
    
    public void setAno(Year ano) {
        if (ano.isBefore(Year.of(0))){
            System.out.println("Erro: o ano deve ser um numero positivo");
        }
        
        if (ano.isAfter(Year.now())) {
            System.out.println("Erro: o ano não pode ser uma data do futuro.");
        }
        
        this.ano = ano;
    }

    public Integer getQuantidadeLivros() {
        return quantidadeLivros;
    }

    public void setQuantidadeLivros(Integer quantidadeLivros) {
        if (quantidadeLivros < 0) {
            System.out.println("Erro: A quantidade de livros deve ser positiva.");
        }
        
        this.quantidadeLivros = quantidadeLivros;
    }
    //</editor-fold>
    
    public Obra(){
        setQuantidadeLivros(0);
    }
    
    public Obra(String isbn, String titulo, String autor, int ano, Integer quantidadeLivros) {
        setIsbn(isbn);
        setTitulo(titulo);
        setAutor(autor);
        setAno(ano);
        setQuantidadeLivros(quantidadeLivros);
    }

    public Obra(String isbn, String titulo, String autor, Year ano, Integer quantidadeLivros) {
        setIsbn(isbn);
        setTitulo(titulo);
        setAutor(autor);
        setAno(ano);
        setQuantidadeLivros(quantidadeLivros);
    }
    
    public boolean disponivel(){
        return quantidadeLivros > 0;
    }
    
    public void emprestimo(){
        if (!disponivel()) {
            System.out.println("Não há cópias disponíveis para emprestimo.");
            return;
        }
        
        quantidadeLivros--;
    }
    
    public void devolver(){
        quantidadeLivros++;
    }

    @Override
    public String toString() {
        return ("Titulo: " + titulo + " {\n"
                + "\tISBN: " + isbn + "\n"
                + "\tAutor: " + autor + "\n"
                + "\tAno: " + ano.toString() + "\n"
                + "\tQuantidade de Livros: " + quantidadeLivros + "\n}"); 
    }
}
