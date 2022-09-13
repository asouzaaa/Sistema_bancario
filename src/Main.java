import entidades.ContaBancaria;
import entidades.Pessoa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        ContaBancaria contaBancaria = new ContaBancaria();
        Scanner sc = new Scanner(System.in);
        int senha;
        int opcao = 0;
        int valor = 0;
        int cpf = 0;
        do {
            System.out.println("## Escolha uma das opções abaixo ##");
            System.out.println("Opção 1 - Cadastra Pessoa");
            System.out.println("Opção 2 - Depositar");
            System.out.println("Opção 3 - Transferir");
            System.out.println("Opção 4 - Sacar");
            System.out.println("Opção 5 - Extrato");
            System.out.println("Opção 0 - Sair");
            System.out.println("_______________________");

            System.out.print("Digite aqui sua opção: ");
            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao){
                case 1:
                    System.out.print("Digite o nome: ");
                    pessoa.setNome(sc.nextLine());
                    if (pessoa.getNome() == null){
                        System.out.println("Nome invalido");
                        break;
                    }
                    System.out.print("Digite o CPF: ");
                    pessoa.setCpf(Integer.parseInt(sc.nextLine()));
                    if (pessoa.getCpf() <= 0){
                        System.out.println("CPF invalido");
                    }
                    System.out.print("Digite o Genero: ");
                    pessoa.setGenero(sc.nextLine());

                    System.out.println("ATENÇÃO: SENHA DEVERÁ CONTER 4 NÚMEROS INTEIROS");
                    System.out.println("Digite a senha: ");
                    pessoa.setSenha(Integer.parseInt(sc.nextLine()));
                    if (pessoa.getSenha() <= 1000){
                        System.out.println("Senha inválida");
                        break;
                    }else if (pessoa.getSenha() >= 9999){
                        System.out.println("Senha inválida");
                        break;
                    }
                    System.out.print("Conta Bancaria: ");
                    contaBancaria.setConta(sc.nextLine());

                    System.out.println("------------------------------");
                    System.out.println("CLIENTE CADASTRADO COM SUCESSO");
                    System.out.println("------------------------------");
                    System.out.println(pessoa.toString());
                    break;
                case 2:
                    if (pessoa.getNome() == null){
                        System.out.println("Você não está cadastrado!");
                        break;
                    }
                    System.out.println("Digite a senha: ");
                    senha = Integer.parseInt(sc.nextLine());

                    if (pessoa.getSenha() == senha) {
                        System.out.println("Qual o valor de deposito? ");
                        contaBancaria.depositar(Double.parseDouble(sc.nextLine()));
                        System.out.println(contaBancaria.getSaldo());
                    } else {
                        System.out.println("Senha invalida");
                    }
                    break;

                case 3:
                    if (pessoa.getNome() == null){
                        System.out.println("Você não está cadastrado!");
                        break;
                    }
                    System.out.println("Digite a senha: ");
                    senha = Integer.parseInt(sc.nextLine());

                    if (pessoa.getSenha() == senha) {
                        System.out.println("Qual valor você quer transferir?");
                        contaBancaria.transferir(Double.parseDouble(sc.nextLine()));
            }
                    break;
                case 4:
                    if (pessoa.getNome() == null){
                        System.out.println("Você não está cadastrado!");
                        break;
                    }
                    System.out.println("Digite a senha: ");
                    senha = Integer.parseInt(sc.nextLine());

                    if (pessoa.getSenha() == senha) {
                        System.out.println("Quanto você deseja sacar?");
                        contaBancaria.sacar(Double.parseDouble(sc.nextLine()));
                    }
                    break;
                case 5:
                    if (pessoa.getNome() == null){
                        System.out.println("Você não está cadastrado!");
                        break;
                    }
                    System.out.println("Digite a senha: ");
                    senha = Integer.parseInt(sc.nextLine());

                    if (pessoa.getSenha() == senha) {
                        System.out.println("O seu saldo atual é " + contaBancaria.getSaldo());
                        System.out.println("Conta " + contaBancaria.getConta());
                    }
                    break;
            }

        } while (opcao != 0);

        sc.close();
    }
}