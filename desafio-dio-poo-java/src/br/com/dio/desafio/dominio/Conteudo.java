package br.com.dio.desafio.dominio;

public abstract class Conteudo
{
    //constante: final
    //protectes: somente as classes filho pode acessar
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    //Um método abstato obriga a classe a ser abstrata
    public abstract double calculoXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Conteudo{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }

    //Construtor vazio
    public Conteudo() {
    }
}
