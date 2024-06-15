import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Buildtxt {
    
    public static void salvarVeiculosEmArquivo() {
        List<Concessionaria> veiculos = ListaDeVeiculos.listaemtxt();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("veiculos.txt"))) {

             String cabecalho = "-------- Lista de todos os veiculos --------";
             writer.write(cabecalho);
             writer.newLine();
             writer.write("===================================================");
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

    public static void gerarTXTvEsportivos(){
        List<Concessionaria> veiculoEsp = ListaDeVeiculos.listacarrosesportivosparaotxt();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("VEsportivos.txt"))){
            
            String cabecalho = "-------- Lista de Veículos Esportivos --------";
            writer.write(cabecalho);
            writer.newLine();
            writer.write("===================================================");
            writer.newLine();
             
            for (Concessionaria veiculo : veiculoEsp) {
                writer.write(veiculo.toString());
                writer.newLine();
            }

            System.out.println("Lista de veículos esportivos salva em 'VEsportivos.txt'.");
        } catch (IOException e) {
            System.out.println("Erro ao salvar os veículos esportivos no arquivo: " + e.getMessage());
        }
    }

    public static void gerarTXTvCarga(){
        List<Concessionaria> veiculoCARGA = ListaDeVeiculos.veiculosDeCargaparaotxt();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("VCarga.txt"))){
            
            String cabecalho = "-------- Lista de Veículos de Carga --------";
            writer.write(cabecalho);
            writer.newLine();
            writer.write("===================================================");
            writer.newLine();
             
            for (Concessionaria veiculo : veiculoCARGA) {
                writer.write(veiculo.toString());
                writer.newLine();
            }
            System.out.println("Lista de veículos esportivos salva em 'VCarga.txt'.");
        } catch (IOException e) {
            System.out.println("Erro ao salvar os veículos esportivos no arquivo: " + e.getMessage());
        }
    }

    public static void gerarTXTpasseio(){
        List<Concessionaria> veiculoPasseio = ListaDeVeiculos.veiculosdepasseiotxt();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("VPasseio.txt"))){

            String cabecalho = "-------- Lista de Veículos de Passeio --------";
            writer.write(cabecalho);
            writer.newLine();
            writer.write("===================================================");
            writer.newLine();
             
            for (Concessionaria veiculo : veiculoPasseio) {
                writer.write(veiculo.toString());
                writer.newLine();
            }
            
            System.out.println("Lista de veículos esportivos salva em 'VPasseio.txt'.");
        } catch (IOException e) {
            System.out.println("Erro ao salvar os veículos esportivos no arquivo: " + e.getMessage());
        }
    }
}
