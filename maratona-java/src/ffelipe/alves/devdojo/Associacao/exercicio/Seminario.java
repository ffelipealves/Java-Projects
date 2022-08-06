package ffelipe.alves.devdojo.Associacao.exercicio;

public class Seminario {
    //Atributos
    private String titulo;
    private Aluno[] alunos;
    private Professor professor;
    private Local local;

    //Construtor
    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    //METODOS
    public void imprime() {
        System.out.print("O seminario: " + this.titulo);
        if (alunos == null) {
            System.out.println(" Nao tem alunos");
        } else {
            System.out.print(" Tem como integrantes: ");
            for (Aluno aluno : alunos) {
                System.out.print(aluno.getNome() + " ");
            }
            System.out.println("");
        }
        if (professor == null) {
            System.out.println("Nao ha professor");
            System.out.println("------------------");
            return;
        } else {
            System.out.println("Ministrador por: " + professor.getNome());
        }
        if (local == null){
            System.out.println("Sem local");
            return;
        }else {
            System.out.println("Local: "+local.getEndereco());
        }
        System.out.println("------------------");

    }

    //setter e getters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
