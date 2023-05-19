package Pacote;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alex
 */
public class Atleta extends Pessoa {

    String pais;
    double Altura;

    public Atleta(String nome, String pais, String sexo, double Altura) {
        super(nome, sexo);
        this.pais = pais;
        this.Altura = Altura;
    }

    
    
    public String getNome() {
        return nome;
    }

    public String getPais() {
        return pais;
    }
    
    public String getSexo() {
        return sexo;
    }

    public double getAltura() {
        return Altura;
    }
    
    
    
    
}
