import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Conteudo curso1 = new Curso("Curso de Java", "texto descrição",60);
        Conteudo curso2 = new Curso("Curso de PHP", "texto descrição",40);
        Conteudo mentoria1 = new Mentoria("Mentoria em JAVA","descrição da mentoria em JAVA", LocalDate.now());


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);


    }
}
