import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Conteudo curso1 = new Curso("Curso de Java", "texto descrição",8);
        Conteudo curso2 = new Curso("Curso de PHP", "texto descrição",4);
        Conteudo mentoria1 = new Mentoria("Mentoria em JAVA","descrição da mentoria em JAVA", LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer");
        bootcamp.setDescricao("Descrição do bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devMary = new Dev();
        devMary.setNome("Marília");
        devMary.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Dev " + devMary.getNome() + ": \n"+ devMary.getConteudosInscritos()+"\n");
        devMary.progredir();
        devMary.progredir();
        devMary.progredir();
        System.out.println("Conteudos inscritos Dev " + devMary.getNome() + ": \n"+ devMary.getConteudosInscritos()+"\n");
        System.out.println("Conteudos Concluidos Dev " + devMary.getNome() + ": \n"+ devMary.getConteudosConcluidos() + "\n XP: " + devMary.calcularTotalXp() +"\n");

        /*Dev devRenan = new Dev();
        devRenan.setNome("Renan");
        devRenan.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Dev " + devRenan.getNome() + ": \n" +  devRenan.getConteudosInscritos()+"\n");*/




    }
}
