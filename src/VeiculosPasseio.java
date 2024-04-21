public class VeiculosPasseio extends Concessionaria{
    
    private int CapDeAssentos;

    public VeiculosPasseio(String veiculo, int ano, float preco, int capDeAssentos) {
        super(veiculo, ano, preco);
        this.CapDeAssentos = capDeAssentos;
    }

    public int getCapDeAssentos() {
        return CapDeAssentos;
    }

    public void setCapDeAssentos(int capDeAssentos) {
        CapDeAssentos = capDeAssentos;
    }

    @Override
    public String toString() {
        return super.toString() + "\nQuantidade de assentos por pessoa: "+CapDeAssentos  + "\n========================================";
    }
}
