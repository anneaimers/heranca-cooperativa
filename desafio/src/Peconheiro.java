public class Peconheiro extends Cooperado{

    protected int rasasRecolhidas;

    public Peconheiro(String nome, String matricula, double valorBase, int rasasRecolhidas) {
        super(nome, matricula, valorBase);
        this.rasasRecolhidas = rasasRecolhidas;
    }

    @Override 
    public double calcularPagamento(){
        return this.valorBase + 15 * this.rasasRecolhidas;
    }

    @Override 
    public void exibirResumo(){
        System.out.println(this.nome);
        System.out.println(this.matricula);
        System.out.println(this.valorBase);
        System.out.println(this.rasasRecolhidas);
    }





}
