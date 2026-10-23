public class Cooperado {

    protected String nome;
    protected String matricula;
    protected double valorBase;

    public Cooperado(String nome, String matricula, double valorBase) {
        this.nome = nome;
        this.matricula = matricula;
        this.valorBase = valorBase;
    }

    public double calcularPagamento(){
        return valorBase;
    }

    public void exibirResumo(){
        System.out.println(this.nome);
        System.out.println(this.matricula);
        System.out.println(this.valorBase);
    }






}

