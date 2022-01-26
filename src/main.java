import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("PHP");
        curso2.setDescricao("Descrição curso PHP");
        curso2.setCargaHoraria(5);

        Curso curso3 = new Curso();
        curso3.setTitulo("Html & CSS");
        curso3.setDescricao("Descrição curso de Html & CSS");
        curso3.setCargaHoraria(12);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição mentoria java.");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria PHP");
        mentoria2.setDescricao("Descrição mentoria PHP.");
        mentoria2.setData(LocalDate.now());

        Mentoria mentoria3 = new Mentoria();
        mentoria3.setTitulo("Mentoria Html & CSS");
        mentoria3.setDescricao("Descrição mentoria Html & CSS.");
        mentoria3.setData(LocalDate.now());

        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Bootcamp Java Developer.");
        bootcampJava.setDescricao("Descrição do Bootcamp de Java Developer.");
        bootcampJava.getConteudos().add(curso1);
        bootcampJava.getConteudos().add(mentoria1);

        Bootcamp bootcampPHP = new Bootcamp();
        bootcampPHP.setNome("Bootcamp PHP Developer.");
        bootcampPHP.setDescricao("Descrição do Bootcamp de PHP Developer.");
        bootcampPHP.getConteudos().add(curso2);
        bootcampPHP.getConteudos().add(mentoria2);

        Bootcamp bootcampHtmlCSS = new Bootcamp();
        bootcampHtmlCSS.setNome("Bootcamp Html & CSS Developer.");
        bootcampHtmlCSS.setDescricao("Descrição do Bootcamp de Html & CSS Developer.");
        bootcampHtmlCSS.getConteudos().add(curso3);
        bootcampHtmlCSS.getConteudos().add(mentoria3);

        Dev devGustavo = new Dev();
        devGustavo.setNome("Gustavo");
        devGustavo.inscreverBootcamp(bootcampJava);
        System.out.println("Conteudos Inscritos Gustavo" + devGustavo.getConteudosInscritos());
        System.out.println("\nConteudos Concluidos Gustavo " + devGustavo.getConteudosConcluidos());
        System.out.println("\nXP: " + devGustavo.calcularTotalXp());

        System.out.println("\n---------");

        Dev devJonas = new Dev();
        devJonas.setNome("jonas");
        devJonas.inscreverBootcamp(bootcampPHP);
        System.out.println("\nConteudos Inscritos Jonas " + devJonas.getConteudosInscritos());
        System.out.println("\nConteudos Concluidos Jonas " + devJonas.getConteudosConcluidos());
        System.out.println("\nXP: " + devJonas.calcularTotalXp());

        System.out.println("\n---------");

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcampHtmlCSS);
        devMaria.inscreverBootcamp(bootcampPHP);
        System.out.println("\nConteudos Inscritos Maria " + devMaria.getConteudosInscritos());
        devMaria.progredir();
        System.out.println("\nConteudos Inscritos Maria " + devMaria.getConteudosInscritos());
        System.out.println("\nConteudos Concluidos Maria " + devMaria.getConteudosConcluidos());
        System.out.println("\nXP: " + devMaria.calcularTotalXp());

    }
}
