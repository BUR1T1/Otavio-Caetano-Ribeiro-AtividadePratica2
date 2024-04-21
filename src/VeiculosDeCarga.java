public class VeiculosDeCarga extends Concessionaria {
    
    private int capacidade;
    private int QuantidadeuantDeEixos;
    
    public VeiculosDeCarga(String veiculo, int ano, float valor, int capacidade, int quantidadeuantDeEixos) {
        super(veiculo, ano, valor);
        this.capacidade = capacidade;
        this.QuantidadeuantDeEixos = quantidadeuantDeEixos;
    }
    
    public int getCapacidade() {
        return capacidade;
    }
    
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    
    public int getQuantidadeuantDeEixos() {
        return QuantidadeuantDeEixos;
    }
    
    public void setQuantidadeuantDeEixos(int quantidadeuantDeEixos) {
        this.QuantidadeuantDeEixos = quantidadeuantDeEixos;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nCapacidade de carga: " + capacidade + " toneladas" +
               "\nQuantidade de eixos: " + QuantidadeuantDeEixos + " eixos."  + "\n========================================";
    }
}
