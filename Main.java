import java.util.Scanner;

public class Main{
    public static void main (String [] args){
        Scanner sala = new Scanner (System.in);
        
        int numeroSala = 219;
        
        System.out.println("Informe o número da sala que você entrou:");
        int salaAluno = sala.nextInt ();
        
        if (salaAluno == numeroSala) {
            System.out.println ("Você está no caminho certo.");
            
        }
        
        else {
            System.out.println ("Você está perdido(a), se encontre.");
            
        }
        
    }
    
}
