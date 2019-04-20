package br.edu.fatecmm;

import java.util.Scanner;

public class ContaTeste {

    public Conta cc = new Conta();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //instanciar a propria classe para ter acesso
        //ao atributo ct - representante de uma conta (cc)
        ContaTeste ct = new ContaTeste();

        int opc = 0;
        do {
            System.out.println("MENU");
            System.out.println("1..Cadastrar");
            System.out.println("2..Consultar");
            System.out.println("3..Depositar");
            System.out.println("4..Sacar");
            System.out.println("9..SAIR");
            System.out.println("Digite sua opção: ");
            opc = Integer.parseInt(sc.nextLine());

            switch (opc){
                case 1:
                    ct.execCadastrar();
                    break;
                case 2:
                    ct.execConsultar();
                    break;
                case 3:
                    ct.execDepositar();
                    break;
                case 4:
                    ct.execSacar();
                    break;
                case 9:
                    System.out.println("Fim do programa");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (opc != 9);
    }

    public void execCadastrar(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite a agencia: ");
        cc.agencia = sc.nextLine();
        System.out.println("Digite a conta: ");
        cc.conta = sc.nextLine();
        System.out.println("Nome do cliente: ");
        cc.nomeCliente = sc.nextLine();
        System.out.println("Cadastro efetuado com sucesso");
    }

    public void execConsultar(){
        cc.imprimir();
    }

    public  void execSacar(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite o valor do saque: ");
        double valor = Double.parseDouble(sc.nextLine());
        int r = cc.sacar(valor);
        if(r==1){
            System.out.println("Saque efetuado com sucesso");
        }else{
            System.out.println("Sem saldo suficiente");
        }
    }

    public void execDepositar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do depósito: ");
        double valor = Double.parseDouble(sc.nextLine());
        cc.depositar(valor);
        System.out.println("Depósito efetuado com sucesso");
    }
}
