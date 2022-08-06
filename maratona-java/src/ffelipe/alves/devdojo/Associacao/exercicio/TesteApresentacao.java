package ffelipe.alves.devdojo.Associacao.exercicio;

public class TesteApresentacao {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Jorge",24);
        Aluno aluno2 = new Aluno("Leticia",26);
        Aluno aluno3 = new Aluno("Mateus",20);
        Aluno aluno4 = new Aluno("Ana",21);
        Seminario seminario1 = new Seminario("Como as redes influenciam a politica");
        Seminario seminario2 = new Seminario("A sociedade abstrata de nietch");
        Seminario seminario3 = new Seminario("A teoria fisicoquimica dos hidrocloroformes");
        Seminario seminario4 = new Seminario("Programacao Quantica");
        Professor professor1 = new Professor("Afonso","Computacao");
        Professor professor2 = new Professor("Rica","Filosofia");
        Professor professor3 = new Professor("Leandro","Quimica");
        Local local1 = new Local("Auditorio 2");
        Local local2 = new Local("Teatro");
        Local local3 = new Local("Auditorio 1");
        Local local4 = new Local("Saguao Principal");

        //SETANDO SEMINARIOS PARA ALUNOS
        aluno1.setSeminario(seminario1);
        aluno2.setSeminario(seminario1);
        aluno3.setSeminario(seminario2);

        //SETANDO ALUNOS PARA SEMINARIOS
        Aluno[] alunosGrupo1 = {aluno1,aluno2};
        seminario1.setAlunos(alunosGrupo1);
        Aluno[] alunosGrupo2 = {aluno3};
        seminario2.setAlunos(alunosGrupo2);

        //SETANDO PROFESSORES PARA SEMINARIOS
        seminario1.setProfessor(professor1);
        seminario2.setProfessor(professor2);
        seminario3.setProfessor(professor3);
        seminario4.setProfessor(professor1);

        //SETANDO SEMINARIOS PARA PROFESSORES
        Seminario[] seminarios1 ={seminario1,seminario4};
        professor1.setSeminarios(seminarios1);
        Seminario[] seminarios2 = {seminario3};
        professor2.setSeminarios(seminarios2);
        Seminario[] seminarios3 = {seminario4};
        professor3.setSeminarios(seminarios3);

        //SETANDO LOCAIS PARA SEMINARIOS
        seminario1.setLocal(local1);
        seminario2.setLocal(local2);
        seminario3.setLocal(local3);
        seminario4.setLocal(local4);

        //SETANDO SEMINARIOS PARA LOCAIS
        local1.setSeminario(seminario1);
        local2.setSeminario(seminario2);
        local3.setSeminario(seminario3);
        local4.setSeminario(seminario4);

        //APRESENTACAO DOS DADOS
        System.out.println("===========Dados de ALunos==========");
        aluno1.imprime();
        aluno2.imprime();
        aluno3.imprime();
        aluno4.imprime();

        System.out.println("===========Dados de Seminarios==========");
        seminario1.imprime();
        seminario2.imprime();
        seminario3.imprime();
        seminario4.imprime();

        System.out.println("===========Dados de Professor===========");
        professor1.imprime();
        professor2.imprime();
        professor3.imprime();

        System.out.println("===========Dados do Local===========");
        local1.imprime();
        local2.imprime();
        local3.imprime();
        local4.imprime();

    }
}
