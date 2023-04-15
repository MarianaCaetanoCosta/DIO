package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev{
    private String nome;

    /*Polimorfismo: instanciando LinkedHashSet através da genérica Conteudo*/
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>(); //LinkedHashSet: ao criar o conteúdo salvar na mesma ordem.
    private Set<Conteudo> conteudosConcluidos= new LinkedHashSet<>();

    //Métodos
    public void inscreverBootcamp(Bootcamp bootcamp){
        //Inscrito no bootcamp deve ter todos os conteudos.
        this.conteudosInscritos.addAll(bootcamp.getConteudos());

        //Pegar o bootcamp e adicionar o DEV, a palavra this pega o argumento passado pelo método
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir(){
        //Pegar o conteudo na ordem em que foi adicionado
        //Optional: resolve retornos nulos
         Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();

         //Pegar e colocar em conteudos inscritos
        if (conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        }
        else{
            System.err.println("Você não está matriculado em nenhum contéudo!");
        }
    }

    public double calcularTotalXp(){
        //ConteudosIncluidos pegar o xp de cada conteúdo incluido e somar
        return this.conteudosConcluidos
                .stream()
                .mapToDouble(Conteudo::calculoXp)
                .sum();
    }


    /* Get/Set */

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}
