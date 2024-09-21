package br.com.fiap.beans;

public class Cliente {

    // visibiliade, tipo de dados e atributos
    private String nome; //Isaque
    private String cpf; //537.785.678/37
    private int idade; // 19
    private double altura; // 1.86;

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    private Endereco endereco;

    // metodos setters ( entrada ) e getters ( retornar/exibir)

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
          return nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
    public void setIdade (int idade){
        this.idade = idade;
            }

            public int getIdade(){
        return idade;
            }
            public void setAltura (double altura){
        this.altura = altura;
            }

    public double getAltura() {
        return altura;
    }
}
