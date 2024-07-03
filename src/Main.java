import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curos Java");
        curso.setDescrição("Descrição curso java");
        curso.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curos JS");
        curso2.setDescrição("Descrição curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescrição("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev dev = new Dev();
        dev.setNome("Edivando");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("-----------");
        System.out.println("Conteudos inscritos: " + dev.getConteudosInscritos());
        System.out.println("-----------");
        dev.progredir();
        dev.progredir();
        System.out.println("Conteudos inscritos: " + dev.getConteudosInscritos());
        System.out.println("Conteudos concluídos: " + dev.getConteudosConcluidos());
        System.out.println("XP: " + dev.calcularTotalXp());
        System.out.println("-----------");

        Dev dev2 = new Dev();
        dev2.setNome("Eduardo");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("-----------");
        System.out.println("Conteudos inscritos: " + dev2.getConteudosInscritos());
        System.out.println("-----------");
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteudos inscritos: " + dev2.getConteudosInscritos());
        System.out.println("Conteudos concluídos: " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());
        System.out.println("-----------");


    }
}

