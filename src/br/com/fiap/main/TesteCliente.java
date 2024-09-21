package br.com.fiap.main;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Endereco;

import javax.swing.*;

public class TesteCliente {

    //metodo para executar rodar o teste do projeto)
    public static void main(String[] args){
        //Instaciar objeto
        Cliente objCliente =  new Cliente();
        Colaborador objColaborador = new Colaborador();

        Endereco objEndCliente = new Endereco();
        Endereco objEndColabrador = new Endereco();

        //Login do Cliente

        objCliente.setNome(JOptionPane.showInputDialog("Digite o seu nome"));
        objCliente.setCpf(JOptionPane.showInputDialog("Informe o Cpf"));
        objCliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade")));
        objCliente.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite a altura")));

        //Endereço do cliente

        objEndCliente.setLogradouro(JOptionPane.showInputDialog("Informe o Logradouro"));
        objEndCliente.setNumero(Integer.parseInt(JOptionPane.showInputDialog("agora o número")));
        objEndCliente.setComplemento(JOptionPane.showInputDialog("Informe um Complemento, Obs:essa opção é opcinal"));
        objEndCliente.setCep(JOptionPane.showInputDialog("Informe o CEP"));
        objEndCliente.setBairro(JOptionPane.showInputDialog("Informe o Bairro"));
        objEndCliente.setCidade(JOptionPane.showInputDialog("Informe a Cidade"));
        objEndCliente.setEstado(JOptionPane.showInputDialog("Informe o Estado"));

        //Login do Colaborador

        objColaborador.setNome(JOptionPane.showInputDialog("Caro Colaborador, Informe o seu nome"));
        objColaborador.setCpf(JOptionPane.showInputDialog("Caro Colaborador, Informe o CPF"));
        objColaborador.setCargo(JOptionPane.showInputDialog("Caro Colaborador, Informe seu cargo na empresa"));

        //Endereco do Colaborador

        objEndColabrador.setLogradouro(JOptionPane.showInputDialog("Caro Colaborador, Informe o Logradouro"));
        objEndColabrador.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Caro Colaborador,agora informe o numero da casa")));
        objEndColabrador.setComplemento(JOptionPane.showInputDialog("Caro Colaborador, informe o complemento, Obs:essa opção é opcional"));
        objEndColabrador.setCep(JOptionPane.showInputDialog("Caro Colaborador, Informe um Cep"));
        objEndColabrador.setBairro(JOptionPane.showInputDialog("Caro Colaborador, informe um bairro"));
        objEndColabrador.setCidade(JOptionPane.showInputDialog("Caro Colaborador, agora informe a cidade"));
        objEndColabrador.setEstado(JOptionPane.showInputDialog("Caro Colaborador, agora informe o estado"));







        // saidas
        System.out.println(
                "Informaçoes do Cliente"+

                        "\nNome: " + objCliente.getNome()+
                        "\nCpf " + objCliente.getCpf()+
                        "\nIdade" + objCliente.getIdade() +
                        "\nAltura" + objCliente.getAltura()+
                        "\nLogradouro" + objCliente.getEndereco().getLogradouro()+
                        "\nNumero" + objCliente.getEndereco().getNumero()+
                        "\nComplemento" + objCliente.getEndereco().getComplemento()+
                        "\nCep" + objCliente.getEndereco().getCep()+
                        "\nBairro" + objCliente.getEndereco().getBairro()+
                        "\nCidade" + objCliente.getEndereco().getCidade()
        );

    }
}
