/**
 * @author Stefano Lopes Delgado
 */

public class Produto {
    private String nomeDoProduto;
    private Float preco;
    private Float desconto;
    private Integer quantidadeEstoque;
    
    //<editor-fold defaultstate="collapsed" desc="Getters e Setters">
    public String getNomeDoProduto() {
        return nomeDoProduto;
    }
    
    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = Math.abs(preco);
    }

    public Float getDesconto() {
        return desconto;
    }

    public void setDesconto(Float desconto) {
        this.desconto = Math.abs(desconto);
    }

    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        this.quantidadeEstoque = Math.abs(quantidadeEstoque);
    }
//</editor-fold>

    public Produto() {
        nomeDoProduto = "Produto Nulo";
        preco = 0f;
        desconto = 0f;
        quantidadeEstoque = 0;
    }

    public Produto(String nomeDoProduto, Float preco, Float desconto, Integer quantidadeEstoque) {
        setNomeDoProduto(nomeDoProduto);
        setPreco(preco);
        setDesconto(desconto);
        setQuantidadeEstoque(quantidadeEstoque);
    }
    
    public Integer adicionarEstoque(Integer quantidadeProdutos){
        quantidadeEstoque += Math.abs(quantidadeProdutos);
        return getQuantidadeEstoque();
    }
    
    public Integer removerEstoque(Integer quantidadeProdutos){
        if (quantidadeProdutos > quantidadeEstoque){
            return -1;
        }
        quantidadeEstoque -= quantidadeProdutos;
        return getQuantidadeEstoque();
    }

    @Override
    public String toString() {
        return (nomeDoProduto + ": {\n\t- Preco: R$" + preco + "\n\t- Desconto: " 
                + (desconto > 0f ? (desconto + "%") : ("Sem desconto.") ) 
                + "\n\t- Estoque: " + quantidadeEstoque + (quantidadeEstoque == 1 ? " unidade" : " unidades") + "\n}");
    }
    
}
