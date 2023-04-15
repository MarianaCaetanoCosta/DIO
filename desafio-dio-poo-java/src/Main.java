import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        /* Herança */

        //Instanciar o objeto Curso
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(4);

        //Instanciar o objeto Mentoria
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de java");
        mentoria1.setDescricao("Descrição mentoria java");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Curso js");
        mentoria2.setDescricao("Descrição: curso js");
        mentoria2.setData(LocalDate.now());

        //Imprimir
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println();
        System.out.println(mentoria1);
        System.out.println(mentoria2);

        System.out.println("-------");

        /* Polimorfismo
            Não é possivel instanciar a classe Conteudo, pois é uma classe abstrata. (Conteudo conteudo = new Conteudo();
            Mas você pode pode criar um Curso ou Mentória a partir da classe Conteudo
         */

        //Conteudo conteudo = new Curso();
        //Conteudo mentoria = new Mentoria();

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        bootcamp.getConteudos().add(mentoria2);

        //Criar 2 Dev e imprimir os conteudos inscritos
        Dev devMariana = new Dev();
        devMariana.setNome("Mariana");
        devMariana.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Mariana:" + devMariana.getConteudosInscritos());
        devMariana.progredir();
        devMariana.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Mariana:" + devMariana.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Mariana:" + devMariana.getConteudosConcluidos());
        System.out.println("XP:" + devMariana.calcularTotalXp());

        System.out.println("-------");

        Dev devCaetano = new Dev();
        devCaetano.setNome("Caetano");
        devCaetano.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Caetano:" + devCaetano.getConteudosInscritos());
        devCaetano.progredir();
        devCaetano.progredir();
        devCaetano.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Caetano:" + devCaetano.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Caetano:" + devCaetano.getConteudosConcluidos());
        System.out.println("XP:" + devCaetano.calcularTotalXp());
    }
}
