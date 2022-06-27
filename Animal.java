import java.io.*;

public class Animal 
{
    protected String alimento;

    public Animal(String alimento)
    {
        this.alimento = alimento;
    }
    
    public void Alimentar(String alimento)
    {
        if(this.alimento == alimento)
        {
            System.out.println("buchin cheio");
        }
        else
        {
            System.out.println("não gosto disso"); 
        }
    }

    /*
     * Sugestão de herança:
     *      Vaca com a função Mugir()
     *      Cachorro com a função Latir()
     *      Gato com a função Miar()
     *      etc.
     * Obs: para passar o parametro "alimento" no constructor da classe mãe, no caso,
     * "Animal", deve-se usar a keyword "Super()". Ex: Super("algum alimento");
     * 
     */
}
