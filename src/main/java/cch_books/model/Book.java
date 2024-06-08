package cch_books.model;

import java.util.List;

public class Book {
    private String id;
    private String titulo;
    private List<String> autores;
    private String editora;
    private String paisOrigem;
    private String descricao;
    private String linguagem;
    private boolean disponivelPDF;
    private boolean disponivelEPub;
    private String codMoeda;
    private Double valor;

    public Book(String id, String titulo, List<String> autores, String editora, String paisOrigem, String descricao, String linguagem, boolean disponivelPDF, boolean disponivelEPub, String codMoeda, Double valor) {
        this.id = id;
        this.titulo = titulo;
        this.autores = autores;
        this.editora = editora;
        this.paisOrigem = paisOrigem;
        this.descricao = descricao;
        this.linguagem = linguagem;
        this.disponivelPDF = disponivelPDF;
        this.disponivelEPub = disponivelEPub;
        this.codMoeda = codMoeda;
        this.valor = valor;
    }

    public Book() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<String> getAutores() {
        return autores;
    }

    public void setAutores(List<String> autores) {
        this.autores = autores;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public boolean isDisponivelPDF() {
        return disponivelPDF;
    }

    public void setDisponivelPDF(boolean disponivelPDF) {
        this.disponivelPDF = disponivelPDF;
    }

    public boolean isDisponivelEPub() {
        return disponivelEPub;
    }

    public void setDisponivelEPub(boolean disponivelEPub) {
        this.disponivelEPub = disponivelEPub;
    }

    public String getCodMoeda() {
        return codMoeda;
    }

    public void setCodMoeda(String codMoeda) {
        this.codMoeda = codMoeda;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    
}