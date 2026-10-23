public class Batedor extends Cooperado{

    protected double litrosBatidos;
     
    public Batedor(String nome, String matricula, double valorBase, double litrosBatidos) {
        super(nome, matricula, valorBase);
        this.litrosBatidos = litrosBatidos;
    }

    @Override 
    public double calcularPagamento(){
        return this.valorBase + 2.5 * this.litrosBatidos;
    }

    



}
