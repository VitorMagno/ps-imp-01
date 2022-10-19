package src.controller.gerenciamento;

import java.util.ArrayList;

import src.models.entities.usuario.*;

public class GerenciadorUsuarios {
    private ArrayList<Aluno> alunos;
    private ArrayList<Pesquisador> pesquisadores;
    private ArrayList<Professor> professores;
    private ArrayList<Profissional> profissionais;
    private ArrayList<Tecnico> tecnicos;
    private ArrayList<Usuario> usuarios;
    private int id = 0;

    public Aluno createAluno(String nome, String tipoGraduacao, int cpf, String senha) {
        if(alunos == null) {
            alunos = new ArrayList<Aluno>();
        }
        if(usuarios == null) {
            usuarios = new ArrayList<Usuario>();
        }

        id++;
        Aluno novoAluno = new Aluno(nome, tipoGraduacao, id, cpf, senha);
        usuarios.add(novoAluno);
        alunos.add(novoAluno);
        int indexOfAluno = alunos.lastIndexOf(novoAluno);
        return alunos.get(indexOfAluno);
    }

    public Pesquisador createPesquisador(String nome, String tipoGraduacao, int cpf, String senha) {
        if(pesquisadores == null) {
            pesquisadores = new ArrayList<Pesquisador>();
        }
        if(usuarios == null) {
            usuarios = new ArrayList<Usuario>();
        }

        id++;
        Pesquisador novoPesquisador = new Pesquisador(nome, tipoGraduacao, id, cpf, senha);
        usuarios.add(novoPesquisador);
        pesquisadores.add(novoPesquisador);
        int indexOfPesquisador = pesquisadores.lastIndexOf(novoPesquisador);
        return pesquisadores.get(indexOfPesquisador);
    }

    public Professor createProfessor(String nome, String tipoGraduacao, int cpf, String senha) {
        if(professores == null) {
            professores = new ArrayList<Professor>();
        }
        if(usuarios == null) {
            usuarios = new ArrayList<Usuario>();
        }

        id++;
        Professor novoProfessor = new Professor(nome, tipoGraduacao, id, cpf, senha);
        usuarios.add(novoProfessor);
        professores.add(novoProfessor);
        int indexOfProfessor = professores.lastIndexOf(novoProfessor);
        return professores.get(indexOfProfessor);
    }

    public Profissional createProfissional(String nome, String tipoGraduacao, int cpf, String senha) {
        if(profissionais == null) {
            profissionais = new ArrayList<Profissional>();
        }
        if(usuarios == null) {
            usuarios = new ArrayList<Usuario>();
        }

        id++;
        Profissional novoProfissional = new Profissional(nome, tipoGraduacao, id, cpf, senha);
        usuarios.add(novoProfissional);
        profissionais.add(novoProfissional);
        int indexOfProfissional = profissionais.lastIndexOf(novoProfissional);
        return profissionais.get(indexOfProfissional);
    }

    public Tecnico createTecnico(String nome, String tipoGraduacao, int cpf, String senha) {
        if(tecnicos == null) {
            tecnicos = new ArrayList<Tecnico>();
        }
        if(usuarios == null) {
            usuarios = new ArrayList<Usuario>();
        }

        id++;
        Tecnico novoTecnico = new Tecnico(nome, tipoGraduacao, id, cpf, senha);
        usuarios.add(novoTecnico);
        tecnicos.add(novoTecnico);
        int indexOfTecnico = tecnicos.lastIndexOf(novoTecnico);
        return tecnicos.get(indexOfTecnico);
    }

    public ArrayList<Usuario> getUsuarios() {
        return this.usuarios;
    }

    public void removeUsuarioById(int id){
        for (Usuario elem: usuarios) {
            if(elem.getId() == id) {
                usuarios.remove(elem);
            }else{
                System.out.println("not found");
            }
        }
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void removeAlunoById(int id){
        for (Aluno elem: alunos) {
            if(elem.getId() == id) {
                alunos.remove(elem);
            }else{
                System.out.println("not found");
            }
        }
    }

    public ArrayList<Pesquisador> getPesquisadores() {
        return pesquisadores;
    }

    public void removePesquisadorById(int id){
        for (Pesquisador elem: pesquisadores) {
            if(elem.getId() == id) {
                pesquisadores.remove(elem);
            }else{
                System.out.println("not found");
            }
        }
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    public void removeProfessorById(int id){
        for (Professor elem: professores) {
            if(elem.getId() == id) {
                professores.remove(elem);
            }else{
                System.out.println("not found");
            }
        }
    }

    public ArrayList<Profissional> getProfissionais() {
        return profissionais;
    }

    public void removeProfissionalById(int id){
        for (Profissional elem: profissionais) {
            if(elem.getId() == id) {
                profissionais.remove(elem);
            }else{
                System.out.println("not found");
            }
        }
    }

    public ArrayList<Tecnico> getTecnicos() {
        return tecnicos;
    }

    public void removeTecnicoById(int id){
        for (Tecnico elem: tecnicos) {
            if(elem.getId() == id) {
                tecnicos.remove(elem);
            }else{
                System.out.println("not found");
            }
        }
    }
}
