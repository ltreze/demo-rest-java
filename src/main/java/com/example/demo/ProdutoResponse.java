package com.example.demo;

public class ProdutoResponse {

    private Produto produto;
    private final boolean sucesso;
    private final String mensagem;

    public ProdutoResponse(final Produto produto, final boolean sucesso, final String mensagem) {
        this.produto = produto;
        this.sucesso = sucesso;
        this.mensagem = mensagem;
    }

    public ProdutoResponse(final boolean sucesso, final String mensagem) {
        this.sucesso = sucesso;
        this.mensagem = mensagem;
    }

    public Produto getProduto() {
         return produto;
    }

    public boolean getSucesso(){
        return sucesso;
    }

    public String getMensagem(){
        return mensagem;
    }
}
