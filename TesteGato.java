public class TesteGato{
    public static void main(String[] args) {
        Gato g = new Gato("vira lata",1,"racao");
        g.Alimentar("racao");
        g.miar();
        System.out.println(g.getRaca());
        System.out.println("O gato tem "+ g.getIdade()+" ano(s)");
    }
}
