package aps2;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int escolha;
        String login;
        String senha;
        
        Gerente gerente = new Gerente("admin","admin","Administrador",1);
        Operador operador = new Operador("Jeff", "123", "1", 1);
        
        System.out.println("**** Bem-vindo, escolha um perfil abixo: ****");
        System.out.println("1 - Gerente");
        System.out.println("2 - Operador de Sistema");
        System.out.println("3 - Sair");
        System.out.print("Digite a opção:_");
        System.out.println("<ENTER>");
        
        escolha = ler.nextInt();
        
        do{
            switch(escolha){
                case 1:
                    boolean GerenteLogado = false;
                    System.out.println("***Faça seu Login****");
                    System.out.print("Digite seu login:_");
                    System.out.println("<ENTER>");
                    login = ler.nextLine();
                    System.out.print("Digite sua senha:_");
                    System.out.println("<ENTER>");
                    senha = ler.nextLine();
                    
                    if(gerente.getLogin().equals(login) && gerente.getSenha().equals(senha)){
                            GerenteLogado = true;
                    }else{
                        System.out.println("Login ou Senha invalido, tente novamente: ");
                    }
                    
                    int escolhaDoGerente;
                    System.out.println("****Olá Gerente "+ gerente.getNome() +"****");
                    System.out.println("1 - Cadastrar Produto");
                    System.out.println("2 - Cadastrar Cliente");
                    System.out.println("3 - Cadastrar Operador");
                    System.out.println("4 - Listar Produtos");
                    System.out.println("5 - Listar Clientes");
                    System.out.println("6 - Listar Operadores");
                    System.out.println("7 - Procurar Produto");
                    System.out.println("8 - Procurar Cliente");
                    System.out.println("9 - Procurar Operador");
                    System.out.println("10 - Sair");
                    System.out.print("Digite a opção:_");
                    System.out.println("<ENTER>");
                    escolhaDoGerente = ler.nextInt();
                    
                    do{
                        switch(escolhaDoGerente){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                            case 6:
                                break;
                            case 7:
                                break;
                            case 8:
                                break;
                            case 9:
                                break;
                            case 10:
                                System.out.println("Gerente Deslogado.");
                                GerenteLogado = false;
                            default:
                                System.out.println("Comando Invalido, tente novamente:_");
                                System.out.println("<ENTER>");
                                break;
                        }  
                    }while(GerenteLogado != false);
                    
                    break;
                case 2:
                    boolean OperadorLogado = false;
                    System.out.println("***Faça seu Login****");
                    System.out.print("Digite seu login:_");
                    System.out.println("<ENTER>");
                    login = ler.nextLine();
                    System.out.print("Digite sua senha:_");
                    System.out.println("<ENTER>");
                    senha = ler.nextLine();
                    
                    if(operador.getLogin().equals(login) && operador.getSenha().equals(senha)){
                            OperadorLogado = true;
                    }else{
                        System.out.println("Login ou Senha invalido, tente novamente: ");
                    }
                    
                    int escolhaDoOperador;
                    System.out.println("****Olá Operador "+ operador.getNome() +"****");
                    System.out.println("1 - Fazer locação");
                    System.out.println("2 - Dar baixa em locação");
                    System.out.println("3 - Excluir locação");
                    System.out.println("4 - Procurar Produto");
                    System.out.println("5 - Procurar Cliente");
                    System.out.println("6 - Sair");
                    System.out.print("Digite a opção:_");
                    System.out.println("<ENTER>");
                    escolhaDoOperador = ler.nextInt();
                    
                    do{
                        switch(escolhaDoOperador){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                            case 6:
                                System.out.println("Gerente Deslogado.");
                                OperadorLogado = false;
                            default:
                                System.out.println("Comando Invalido, tente novamente:_");
                                System.out.println("<ENTER>");
                                break;
                        }  
                    }while(OperadorLogado != false);
                    
                    break;
                case 3:
                    System.out.println("Sistema Encerrado.");
                    escolha = 0;
                default:
                    System.out.println("Comando Invalido, tente novamente:_");
                    System.out.println("<ENTER>");
                    break;
            }
        }while(escolha != 0);
    }
}