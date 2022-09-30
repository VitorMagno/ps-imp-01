package src.app;
import pacotes.pacote.*;
import src.atividade.Atividade;
import src.projeto.Projeto;
import src.usuario.Aluno;
import src.usuario.Professor;
import src.usuario.Profissional;
import src.usuario.Tecnico;
import src.usuario.Usuario;

import java.util.ArrayList;
import java.util.Date;
import java.text.DateFormat;
import java.util.Scanner;
class Main {
    private static boolean running = true;
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Usuario> usuarios;
    private static ArrayList<Projeto> projetos;
    private static ArrayList<Atividade> atividades;
    public static void main(String[] args) {
        System.out.println("Type 0 to see available commands");
        while (running) {
            int firstCommand = scanner.nextInt();
            switch (firstCommand) {
                case 0:
                    help();
                    break;
                case 1:
                    exit();
                    break;
                case 2:
                    newUser();
                    break;
                case 3:
                    listUsers();
                    break;
                case 4:
                    getUser();
                    break;
                case 5:
                    newProject();
                    break;
                case 6:
                    listProjects();
                    break;
                case 7:
                    getProject();
                    break;
                case 8:
                    newActivity();
                    break;
                case 9:
                    listActivities();
                    break;
                case 10:
                    getActivity();
                    break;
                default:
                    System.out.println("Type 0");
                    break;
            }
        }
        scanner.close();
        return;
    }
    private static void help() {
        System.out.println("Available commands:\n'1-exit'\n'2-new user'\n'3-list users'\n'3-get user'\n'5-new project'\n'6-list projects'\n'7-get project'\n'8-new activity'\n'9-list activities'\n'10-get activity'");
    }
    private static void exit() {
        Main.running = false;
        System.out.println("Exiting...");
    }
    private static void newUser() {
        System.out.println("");
        int typeOfUser = scanner.nextInt();
        System.out.println("Wich user will you create?\n'1-Aluno'\n'2-Professor'\n'3-Profissional'\n'4-Tecnico'");
        switch (typeOfUser) {
            case 1:
            System.out.println("type name of Aluno and its degree");
            String nomeAluno = scanner.nextLine();
            String degree = scanner.nextLine();
            Aluno novoAluno = new Aluno(nomeAluno, degree);
            usuarios.add(novoAluno);
            break;
            case 2:
            System.out.println("type name of Professor");
            String nomeProfessor = scanner.nextLine();
            Professor novoProfessor = new Professor(nomeProfessor);
            usuarios.add(novoProfessor);
                break;
            case 3:
                System.out.println("type name of Profissional and its cargo");
                String nomeProfissional = scanner.nextLine();
                String cargo = scanner.nextLine();
                Profissional novoProfissional = new Profissional(nomeProfissional, cargo);
                usuarios.add(novoProfissional);
                break;
            case 4:
                System.out.println("type name of Tecnico");
                String nomeTecnico = scanner.nextLine();
                Tecnico novoTecnico = new Tecnico(nomeTecnico);
                usuarios.add(novoTecnico);
                break;
                default:
                System.out.println("Invalid");
                break;
            }
            
        }
        private static void listUsers() {
            //to implement
        }
        private static void getUser() {
            //to implement
        }
        private static void newProject() {
            System.out.println("type 'identificacao',\n 'descricao',\n 'coordenador',\n 'valor de bolsa',\n 'data e hr de termino(DD/M/AA H:mm AM ou PM)' e\n 'tempo de vigencia da bolsa(DD/M/AA H:mm AM ou PM)'");
            String identificacao = scanner.nextLine();
            String descricao = scanner.nextLine();
            String coordenador = scanner.nextLine();
            int valorBolsa = scanner.nextInt();
            String terminoToDate = scanner.nextLine();
            String vigenciaToDate = scanner.nextLine();
            Date dataHrTermino;
            Date vigenciaBolsa;
            try {
                dataHrTermino = DateFormat.getInstance().parse(terminoToDate);
                vigenciaBolsa = DateFormat.getInstance().parse(vigenciaToDate);
                Projeto novo = new Projeto(identificacao, descricao, coordenador, valorBolsa, dataHrTermino, vigenciaBolsa);
                projetos.add(novo);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        private static void listProjects() {
            //to implement
            System.out.println("work in progress");
        }
        private static void getProject() {
            //to implement
            System.out.println("work in progress");
        }
        private static void newActivity() {
            //to implement
            System.out.println("work in progress");
            System.out.println("type 'identificacao',\n 'descricao',\n 'data e hr de inicio(DD/M/AA H:mm AM ou PM)',\n 'data e hr de termino(DD/M/AA H:mm AM ou PM)' e\n 'usuario responsavel'");
            String identificacao = scanner.nextLine();
            String descricao = scanner.nextLine();
            String inicioToDate = scanner.nextLine();
            String terminoToDate = scanner.nextLine();
            String responsavel = scanner.nextLine();
            Date dataHrInicio;
            Date dataHrTermino;
            Usuario userFound;
            try {
                dataHrInicio = DateFormat.getInstance().parse(inicioToDate);
                dataHrTermino = DateFormat.getInstance().parse(terminoToDate);
                Atividade novo = new Atividade(identificacao, descricao, dataHrInicio, dataHrTermino, userFound);
                atividades.add(novo);
            } catch (Exception e) {
                System.out.println(e);
            }


        }
        private static void listActivities() {
            //to implement
            System.out.println("work in progress");
        }
        private static void getActivity() {
            //to implement
            System.out.println("work in progress");
        }
    }