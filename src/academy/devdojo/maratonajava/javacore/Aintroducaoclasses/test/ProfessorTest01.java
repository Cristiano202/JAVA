package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;


import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominig.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome="Mestre cris";
        professor.idade=54;
        professor.sexo='M';

        System.out.println(professor.nome+"\n "+ professor.idade +"\n "+professor.sexo);
    }


}
