import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Curso de Java", "texto descrição",60);
        Curso curso2 = new Curso("Curso de PHP", "texto descrição",40);
        Mentoria mentoria1 = new Mentoria("Mentoria em JAVA","descrição da mentoria em JAVA", LocalDate.now());


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);


    }
}
