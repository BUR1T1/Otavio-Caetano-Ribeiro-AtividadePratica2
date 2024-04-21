public class Concessionaria {
    
    private String veiculo;
    private int ano;
    private float preco;
    
    public Concessionaria(String veiculo, int ano, float preco) {
        this.veiculo = veiculo;
        this.ano = ano;
        this.preco = preco;
    }
    
    public String getVeiculo() {
        return veiculo;
    }
    
    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }
    
    public int getAno() {
        return ano;
    }
    
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public float getPreco() {
        return preco;
    }
    
    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    @Override
    public String toString() {
        return "\nVeiculo: " + veiculo + "\nAno: " + ano + "\nPreço: R$" + preco;
    }
}
