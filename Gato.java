import java.io.*;

public class Gato extends Animal{
    private String raca;
    private int idade;
    
    public Gato(String alimento){
        super(alimento);
        this.raca = "SRD";
        this.idade=0;
    }
    public Gato(String raca,int idade,String alimento){
        super(alimento);
        this.raca = raca;
        this.idade = idade;
    }
    public void miar(){
        System.out.println("miaww");
    }
    public String getRaca(){
        return raca;
    }
    public int getIdade(){
        return idade;
    }

}
