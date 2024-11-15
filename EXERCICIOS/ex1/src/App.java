import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        int quantidade;

        System.out.print("Digite a quantidade de números: ");
        quantidade = Integer.parseInt(entrada.nextLine());

        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

        for(int i = 0; i < quantidade; i++){
            System.out.println("Funcionario " + (i+1) + ": ");
            
            System.out.println();
            System.out.print("id: ");
            int id = Integer.parseInt(entrada.nextLine());
            System.out.print("Nome: ");
            String nome = entrada.nextLine();
            System.out.print("Salario: ");
            float salario = Float.parseFloat(entrada.nextLine());
            System.out.println();

            Funcionario funcionario = new Funcionario(id, nome, salario);
            funcionarios.add(funcionario);
        }

        System.out.println("Digite o ID do funcionario que deseja aumentar o salario: ");
        int id = Integer.parseInt(entrada.nextLine());
        int posicao = posição(funcionarios, id);
        
        if(posicao == -1){
            System.out.println("Funcionario não encontrado.");
        }else{
            System.out.print("Digite a porcentagem de aumento: ");
            float porcentagem = Float.parseFloat(entrada.nextLine());
            funcionarios.get(posicao).receberAumento(porcentagem);
        }

        
        entrada.close();
    
    for(Funcionario x: funcionarios){
        System.out.println(x.toString());
    }
}

    public static int posição(ArrayList<Funcionario> funcionarios, int id){
        for(int i = 0; i < funcionarios.size(); i++){
            if(funcionarios.get(i).getId() == id){
                return i;
            }
        }
        return -1;
    }
}
