public class Main {
    public static void main(String[] args) {
        
        VeiculosDeCarga c1Carga = new VeiculosDeCarga("5tom", 2012, 500.000f, 5, 3);
        VeiculosDeCarga c2Carga = new VeiculosDeCarga("Scania142", 1989, 135.000f, 41, 3);
        VeiculosDeCarga c3Carga = new VeiculosDeCarga("Volvo FH540", 2022, 985.000f, 80, 9);
    
        VeiculosEsportivos e1Esportivos = new VeiculosEsportivos("Ferrari 488 GTB", 2021, 2.000000f, 8000);
        VeiculosEsportivos e2Esportivos = new VeiculosEsportivos("Lamborghini Huracán EVO", 2022, 2.500000f, 8000);
        VeiculosEsportivos e3Esportivos = new VeiculosEsportivos("Porsche 911 Turbo S", 2020, 1.800000f, 7000);
    
        VeiculosPasseio p1Passeio = new VeiculosPasseio("Spin", 2022, 70.000f, 7);
        VeiculosPasseio p2Passeio = new VeiculosPasseio("Doblo", 2021, 65.000f, 9);
        VeiculosPasseio p3Passeio = new VeiculosPasseio("Kombi", 2021, 65.000f, 9);

        ListaDeVeiculos.addVeiculo(c1Carga);
        ListaDeVeiculos.addVeiculo(c2Carga);
        ListaDeVeiculos.addVeiculo(c3Carga);

        ListaDeVeiculos.addVeiculo(e1Esportivos);
        ListaDeVeiculos.addVeiculo(e2Esportivos);
        ListaDeVeiculos.addVeiculo(e3Esportivos);

        ListaDeVeiculos.addVeiculo(p1Passeio);
        ListaDeVeiculos.addVeiculo(p2Passeio);
        ListaDeVeiculos.addVeiculo(p3Passeio);

        
        Sistema.Controle();
    }
}