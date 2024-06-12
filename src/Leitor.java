import java.util.InputMismatchException;
import java.util.Scanner;

public class Leitor {
     
    private static Scanner leitor = new Scanner(System.in);

    public static String lerString() {
        try {
            return leitor.nextLine();
        } catch (Exception e) {
            System.out.println("Erro ao ler a string: " + e.getMessage());
            return "";
        }
    }

    public static int lerInt() {
        try {
            int valor = leitor.nextInt();
            leitor.nextLine(); 
            return valor;
        } catch (InputMismatchException e) {
            System.out.println("Erro: entrada inválida. Por favor, insira um número inteiro.");
            leitor.nextLine(); 
            return 0; 
        } catch (Exception e) {
            System.out.println("Erro ao ler o número inteiro: " + e.getMessage());
            return 0; 
        }
    }
    
    public static float lerFloat() {  
        try {
            float valor = leitor.nextFloat();
            leitor.nextLine();
            return valor;
        } catch (InputMismatchException e) {
            System.out.println("Erro: entrada inválida. Por favor, insira um número decimal.");
            leitor.nextLine(); 
            return 0.0f; 
        } catch (Exception e) {
            System.out.println("Erro ao ler o número decimal: " + e.getMessage());
            return 0.0f;
        }
    }
}

