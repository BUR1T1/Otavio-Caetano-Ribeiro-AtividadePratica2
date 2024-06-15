import java.util.ArrayList;
import java.util.List;

public class ListaDeVeiculos {
    
    private static List<Concessionaria> listaConcessionarias = new ArrayList<>();
    
    public static void addVeiculo(Concessionaria veiculo) {
        listaConcessionarias.add(veiculo);
    }

    public static List<Concessionaria> exibirListaConcessionarias() {
        System.out.println(listaConcessionarias);
        return listaConcessionarias;
    }

    public static List<Concessionaria> listarVesportivos() {
        List<Concessionaria> esportivos = new ArrayList<>();
    
        for (Concessionaria concessionaria : listaConcessionarias) {
            if (concessionaria instanceof VeiculosEsportivos) {
                esportivos.add(concessionaria);
            }
        }
    
        return esportivos;
    }
    
    public static void listarVpasseio() {
        boolean acharPasseio = false;
        for (Concessionaria concessionaria : listaConcessionarias) {
            if (concessionaria instanceof VeiculosPasseio) {
                System.out.println(concessionaria);
                acharPasseio = true;
            }
        }
        if (!acharPasseio) {
            System.out.println("Não tem veículos para listar!");
        }
    }
    
    public static void listaVcarga() {
        boolean achaCarga = false;
        for (Concessionaria concessionaria : listaConcessionarias) {
            if (concessionaria instanceof VeiculosDeCarga) {
                System.out.println(concessionaria);
                achaCarga = true;
            }
        }
        if (!achaCarga) {
            System.out.println("Não tem veículos para listar!");
        }
    }
    
    public static void buscarVeiculo(String nomeVeiculo) {
        for (Concessionaria concessionaria : listaConcessionarias) {
            if (nomeVeiculo.equals(concessionaria.getVeiculo())) {
                System.out.println("Veículo encontrado:");
                System.out.println(concessionaria);
                return;
            }
        }
        System.out.println("Veículo não encontrado.");
    }
    
    public static boolean excluirVeiculo(String nomeVeiculo) {
        for (Concessionaria concessionaria : listaConcessionarias) {
            if (nomeVeiculo.equals(concessionaria.getVeiculo())) {
                listaConcessionarias.remove(concessionaria);
                System.out.println(nomeVeiculo + " excluído com sucesso!");
                return true;
            }
        }
        System.out.println("Veículo não encontrado.");
        return false;
    }

    
    //usadonso essa classe na criação do arquivo txt onde n printe os veiculos no terminal

    //lista tds os carros
    public static List<Concessionaria> listaemtxt() {
        return listaConcessionarias;
    }

    //lista os veiculos esportivos
    public static List<Concessionaria> listacarrosesportivosparaotxt() {
    List<Concessionaria> esportivos = new ArrayList<>();
    
        for (Concessionaria concessionaria : listaConcessionarias) {
            if (concessionaria instanceof VeiculosEsportivos) {
                esportivos.add(concessionaria);
            }
        }
        return esportivos;
    }
   
    //lista somente os de carga
    public static List<Concessionaria> veiculosDeCargaparaotxt(){
List<Concessionaria> carga = new ArrayList<>();

    for (Concessionaria concessionaria : listaConcessionarias) {
        if (concessionaria instanceof VeiculosDeCarga) {
            carga.add(concessionaria);
        }
    }
    return carga;
  }
  
  //lista os veiculos de passeio
  public static List<Concessionaria> veiculosdepasseiotxt(){
List<Concessionaria> passeio = new ArrayList<>();
  
  for (Concessionaria concessionaria : listaConcessionarias) {
    if (concessionaria instanceof VeiculosPasseio) {
      passeio.add(concessionaria);
    }
}
    return passeio;
  }
}