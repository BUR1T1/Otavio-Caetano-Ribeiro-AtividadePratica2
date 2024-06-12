import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Sistema {

    public static void salvarVeiculosEmArquivo() {
        List<Concessionaria> veiculos = ListaDeVeiculos.ExibirListaConcessionarias();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("veiculos.txt"))) {

             String cabecalho = "Lista de Veículos:";
             writer.write(cabecalho);
             writer.newLine();
             writer.write("====================================");
             writer.newLine();
 
            for (Concessionaria veiculo : veiculos) {
                writer.write(veiculo.toString());
                writer.newLine();
            }
            System.out.println("Lista de veículos salva em 'veiculos.txt'.");
        } catch (IOException e) {
            System.out.println("Erro ao salvar os veículos no arquivo: " + e.getMessage());
        }
    }
    
    
    public static void ExibirMenu(){

        System.out.println("---- Comandos do Sistema ----");
        System.out.println("1)cadastrar veiculo esportivo.");
        System.out.println("2)cadastrar veiculo de carga.");
        System.out.println("3)cadastrar veiculo de passeio.");
        System.out.println("4)buscar veiculo.");
        System.out.println("5)excluir veiculo.");
        System.out.println("6)listar todos os veiculos de carga.");
        System.out.println("7)listar todos os veiculos esportivos.");
        System.out.println("8)listar todos os veiculos de passeio.");  
        System.out.println("9)listar todos od veiculos."); 
        System.out.println("0)finaliza o programa.");
        
    }
    
    public static void Controle(){
        
        String op;
        Boolean continuar = true;
        String txt;
        String nomeveiculo;
        int ano;
        float preco;
        int capacidadeDecarga;
        int quantDeeixo;
        int potenciaMotor;
        int CapDePassageiros;
        
        
        while (continuar) {
            System.out.println("escreva 'menu' para exibir menu.");
            System.out.print("digite seu comando: ");
            op = Leitor.lerString();
            
            switch (op) {
                case "1":
                System.out.println("=======================================");
                
                System.out.println("--- Cadastrar veiculo esportivo ---");
                System.out.print("modelo do veiculo: ");
                nomeveiculo = Leitor.lerString();
                
                System.out.print("Ano de veiculo: ");
                ano = Leitor.lerInt();
                
                System.out.print("Valor de venda do veiculo: ");
                preco = Leitor.lerFloat();
                
                System.out.print("Potencia do motor: ");
                potenciaMotor = Leitor.lerInt();
                
                VeiculosEsportivos newEsportivo = new VeiculosEsportivos(nomeveiculo, ano, preco, potenciaMotor);
                
                ListaDeVeiculos.Addveiculo(newEsportivo);
                System.out.println("=======================================");
                
                break;
                case "2":
                System.out.println("========================================");
                System.out.println("--- Cadastrar veiculo de carga ---");
                System.out.print("modelo do veiculo: ");
                nomeveiculo = Leitor.lerString();
                
                System.out.print("Ano de veiculo: ");
                ano = Leitor.lerInt();
                
                System.out.print("Valor de venda do veiculo: ");
                preco = Leitor.lerFloat();

                System.out.print("capacidade de carga: ");
                capacidadeDecarga = Leitor.lerInt();
                
                System.out.print("quantidade de eixos: ");
                quantDeeixo = Leitor.lerInt();
                
                VeiculosDeCarga newCarga = new VeiculosDeCarga(nomeveiculo, ano, preco, capacidadeDecarga, quantDeeixo);
                
                ListaDeVeiculos.Addveiculo(newCarga);
                System.out.println("========================================");
                
                
                break;
                case "3":
                System.out.println("========================================");
                System.out.println("--- Cadastrar veiculo de passeio ---");
                System.out.print("modelo do veiculo: ");
                nomeveiculo = Leitor.lerString();
                
                System.out.print("Ano de veiculo: ");
                ano = Leitor.lerInt();
                
                System.out.print("Valor de venda do veiculo: ");
                preco = Leitor.lerFloat();
                
                System.out.print("cacidade de passageiros: ");
                CapDePassageiros = Leitor.lerInt();
                
                VeiculosPasseio newVPassaPasseio = new VeiculosPasseio(nomeveiculo, ano, preco, CapDePassageiros);
                
                ListaDeVeiculos.Addveiculo(newVPassaPasseio);
                System.out.println("========================================");
                
                
                break;
                
                case "4": 
                System.out.println("=========================");
                System.out.println("---- BUSCAR VEICULO -----");
                System.out.print("qual veiculo deseja buscar: ");
                txt = Leitor.lerString();
                System.out.println("----------------------------------");
                
                ListaDeVeiculos.buscarVeiculo(txt);
                System.out.println("========================================");
                
                break;
                case "5":
                System.out.println("--- Excluir veiculo ---");
                System.out.print("qual veiculo deseja excluir: ");
                nomeveiculo = Leitor.lerString();
                System.out.println("----------------------------------");
                
                ListaDeVeiculos.excluirVeiculo(nomeveiculo);
                break;
                case "6":
                System.out.println("========================================");
                System.out.println("--- Lista veiculos de carga ---");
                ListaDeVeiculos.ListaVcarga();
                break;
                case "7":
                System.out.println("========================================");
                System.out.println("--- Lista veiculos esportivos ---");
                ListaDeVeiculos.ListarVesportivos();
                break;
                case "8":
                System.out.println("========================================");
                System.out.println("--- lista veiculos de passeio ---");
                ListaDeVeiculos.ListarVpasseio();
                
                break;
                case "9":
                System.out.println("=========================");
                ListaDeVeiculos.ExibirListaConcessionarias();

                break;
                case "menu":
                ExibirMenu();
                break;
                case "0":
                System.out.println("==================================================");
                System.out.println("O programa foi finalizado...");
                System.out.println("==================================================");
                continuar = false;
                break;

                case "txt":
                System.out.println("==================================================");
                salvarVeiculosEmArquivo();
                System.out.println("Arquivo txt gerado...");
                System.out.println("==================================================");

                break;
                default:
                System.out.println("====================================");
                System.out.println("opição invalida!!!!");
                System.out.println("====================================");
                break;
            }      
        }
    }


    
}