public class VeiculosEsportivos extends Concessionaria {
    
    private int PotenciaMotor;

    public VeiculosEsportivos(String veiculo, int ano, float valor, int potenciaMotor) {
        super(veiculo, ano, valor);
        PotenciaMotor = potenciaMotor;
    }

    public int getPotenciaMotor() {
        return PotenciaMotor;
    }

    public void setPotenciaMotor(int potenciaMotor) {
        PotenciaMotor = potenciaMotor;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPotencia do motor: "+PotenciaMotor +"RPM  (rotações por minuto)" + "\n========================================";
    }

}
