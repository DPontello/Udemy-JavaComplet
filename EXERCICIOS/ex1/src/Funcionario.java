public class Funcionario {
    
    private int id;
    private String nome;
    private float salario;

    public Funcionario(int id, String nome, float salario){
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public String toString(){
        return "ID: " + id + "\nNome: " + nome + "\nSalario: " + String.format("%.2f",salario) + "\n";
    }

    public int getId(){
        return id;
    }

    public void receberAumento(float x){
        salario += salario*(x/100);
    }
}
