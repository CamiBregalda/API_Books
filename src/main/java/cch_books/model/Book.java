package cch_books.model;

import java.util.List;

public class Book {
    private String titulo;
    private List<String> autores;
    private String editora;
    private boolean disponivelPDF;
    private Double valor;

    public Book(String titulo, List<String> autores, String editora, boolean disponivelPDF, Double valor) {
        this.titulo = titulo;
        this.autores = autores;
        this.editora = editora;
        this.disponivelPDF = disponivelPDF;
        this.valor = valor;
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

    public boolean isDisponivelPDF() {
        return disponivelPDF;
    }

    public void setDisponivelPDF(boolean disponivelPDF) {
        this.disponivelPDF = disponivelPDF;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
