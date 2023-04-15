import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        /* Herança */

        //Instanciar o objeto Curso
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        //Instanciar o objeto Mentoria
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("curso java");
        mentoria1.setDescricao("descrição: curso java");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("curso js");
        mentoria2.setDescricao("descrição: curso js");
        mentoria2.setData(LocalDate.now());

        //Imprimir
        System.out.println(curso1);
        System.out.println(curso2);

        System.out.println();

        System.out.println(mentoria1);
        System.out.println(mentoria2);

        /* Polimorfismo
            Não é possivel instanciar a classe Conteudo, pois é uma classe abstrata. (Conteudo conteudo = new Conteudo();
            Mas você pode pode criar um Curso ou Mentória a partir da classe Conteudo
         */

        Conteudo conteudo = new Curso();
        Conteudo mentoria = new Curso();
        }
    }