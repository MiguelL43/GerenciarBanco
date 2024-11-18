/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gerenciarbanco;

import java.util.Scanner;


/**
 *
 * @author Cliente
 * 
 * 
 */
//Criando uma clase Cliente 
class Cliente{
        private String nome;
        private String sobrenome;
        private String cpf;
        private double saldo;
// Criando um metodo construtor 
        public Cliente(String nome, String sobrenome, String cpf){
            this.nome= nome;
            this.sobrenome= sobrenome;
            this.cpf= cpf;
            this.saldo= 0.0;
        }
// Criando os Metodos da class
        
        public void consultarSaldo(){
        System.out.println("Seu saldo atual e : " + saldo);
        };    
        
        public void depositar(double valor){
        if (valor > 0){
            saldo += valor;
            System.out.println("Deposito de R$" + valor + "realizado com sucesso");
        }
        else{
            System.out.println("Valor depositado invalido!");}
        }; 
        
        public void sacar(double valor){
        if (valor > 0 && valor <= saldo){
            saldo -= valor;
                System.out.println("Saque de " + valor + "Realziado com sucesso!");
            }
        else {
                System.out.println("Saque invalido valor insuficiente!");
            }
        }//fim dos metodos
     };//fim da classe cliente


public class GerenciaBanco {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira seu nome por favor:");
        String nome = scanner.nextLine();
        System.out.println("Insira seu sobrenome por favor:");
        String sobrenome = scanner.nextLine();
        System.out.println("Insira seu CPF por favor:");
        String cpf = scanner.nextLine();
       // Instaciando um objeto da class Cliente 
        Cliente cliente = new Cliente(nome, sobrenome, cpf);
        
        boolean continuar = true;
        while(continuar){
            System.out.println("\no que deseja:");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Fazer deposito");
            System.out.println("3 - Fazer Saque");
            System.out.println("4 - Encerrar aplicação\n\n");
            
            int escolha = scanner.nextInt();
            switch(escolha) {
                case 1:
                    cliente.consultarSaldo();
                    break;
                case 2:
                    System.out.println("Informe o valor que deseja depositar :");
                    double valorDeposito = scanner.nextDouble();
                    cliente.depositar(valorDeposito);
                    break;
                case 3:
                    System.out.println("Informe o valor a ser sacado");
                    double valorSaque = scanner.nextDouble();
                    cliente.sacar(valorSaque);
                    break;
                case 4:
                    continuar = false;
                    System.out.println("Encerrando aplicação");
                    break;
                default :
                    System.out.println("Opção invalid. tente novamente");
                    break;
            }
        }
        scanner.close();
    };
};