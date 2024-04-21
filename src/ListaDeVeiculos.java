import java.util.ArrayList;
import java.util.List;

public class ListaDeVeiculos{
    
    private static List<Concessionaria> listaConcessionarias = new ArrayList<>();
    

    public static void Addveiculo(Concessionaria Veiculo){

        listaConcessionarias.add(Veiculo);
    }

    public static List<Concessionaria> ExibirListaConcessionarias(){
        System.out.println(listaConcessionarias);
        return listaConcessionarias;
    }
    

    public static void ListarVesportivos() {
        boolean esportivo = false;
        for (Concessionaria concessionaria : listaConcessionarias) {
            if (concessionaria instanceof VeiculosEsportivos) {
                System.out.println(concessionaria);
                esportivo = true;
            } 
        }
        if (!esportivo) {
            System.out.println("não tem veiculos para lista !!!");
        }
    }
    public static void ListarVpasseio(){
        
        boolean acharpasseio = false;
        for (Concessionaria concessionaria : listaConcessionarias) {
            if (concessionaria instanceof VeiculosPasseio) {
                System.out.println(concessionaria);
                acharpasseio = true;
            }
        }
        if (!acharpasseio) {
            System.out.println("não tem veiculos para lista !!!");
        }
    }
    public static void ListaVcarga() {
        boolean achacarga= false;
        
        for (Concessionaria concessionaria : listaConcessionarias) {
            if (concessionaria instanceof VeiculosDeCarga) {
                System.out.println(concessionaria);
                achacarga = true;
            }
        }
        
        if (!achacarga ) {

            System.out.println("não tem veiculos para listar!!!");
        }
    }

    

    public static void buscarVeiculo(String nomeVeiculo) {
        for (Concessionaria concessionaria : listaConcessionarias) {
            if (nomeVeiculo.equals(concessionaria.getVeiculo())) {
                System.out.println("veiculo encontrado:");
                System.out.println(concessionaria);
                return;
            }
        }
    }
    
    public static Boolean excluirVeiculo(String nomeVeiculo){
        for (Concessionaria concessionaria : listaConcessionarias) {
            if (nomeVeiculo.equals(concessionaria.getVeiculo())) {
                listaConcessionarias.remove(concessionaria);
                System.out.println(nomeVeiculo + " excluido com sucesso!!!");
                return true;
            }
        }
        System.out.println("Veiculo não encontrado.");
        return false;
    }
    
    
}


