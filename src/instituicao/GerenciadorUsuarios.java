package src.instituicao;

import java.util.ArrayList;

import src.usuario.*;

public class GerenciadorUsuarios {
    private ArrayList<Aluno> alunos;
    private ArrayList<Pesquisador> pesquisadores;
    private ArrayList<Professor> professores;
    private ArrayList<Profissional> profissionais;
    private ArrayList<Tecnico> tecnicos;
    private ArrayList<Usuario> usuarios;

    public Aluno createAluno(String nome, String tipoGraduacao, int cpf) {
        if(alunos == null) {
            alunos = new ArrayList<Aluno>();
        }
        Aluno novoAluno = new Aluno(nome, tipoGraduacao, cpf);
        alunos.add(novoAluno);
        int indexOfAluno = alunos.lastIndexOf(novoAluno);
        return alunos.get(indexOfAluno);
    }
    public Pesquisador createPesquisador(String nome, String tipoGraduacao, int cpf) {
        if(pesquisadores == null) {
            pesquisadores = new ArrayList<Pesquisador>();
        }
        Pesquisador novoPesquisador = new Pesquisador(nome, tipoGraduacao, cpf);
        pesquisadores.add(novoPesquisador);
        int indexOfPesquisador = pesquisadores.lastIndexOf(novoPesquisador);
        return pesquisadores.get(indexOfPesquisador);
    }
    public Professor createProfessor(String nome, String tipoGraduacao, int cpf) {
        if(professores == null) {
            professores = new ArrayList<Professor>();
        }
        Professor novoProfessor = new Professor(nome, tipoGraduacao, cpf);
        professores.add(novoProfessor);
        int indexOfProfessor = professores.lastIndexOf(novoProfessor);
        return professores.get(indexOfProfessor);
    }
    public Profissional createProfissional(String nome, String tipoGraduacao, int cpf) {
        if(profissionais == null) {
            profissionais = new ArrayList<Profissional>();
        }
        Profissional novoProfissional = new Profissional(nome, tipoGraduacao, cpf);
        profissionais.add(novoProfissional);
        int indexOfProfissional = profissionais.lastIndexOf(novoProfissional);
        return profissionais.get(indexOfProfissional);
    }
    public Tecnico createTecnico(String nome, String tipoGraduacao, int cpf) {
        if(tecnicos == null) {
            tecnicos = new ArrayList<Tecnico>();
        }
        Tecnico novoTecnico = new Tecnico(nome, tipoGraduacao, cpf);
        tecnicos.add(novoTecnico);
        int indexOfTecnico = tecnicos.lastIndexOf(novoTecnico);
        return tecnicos.get(indexOfTecnico);
    }
}
