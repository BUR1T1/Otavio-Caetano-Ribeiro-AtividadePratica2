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

        ListaDeVeiculos.Addveiculo(c1Carga);
        ListaDeVeiculos.Addveiculo(c2Carga);
        ListaDeVeiculos.Addveiculo(c3Carga);

        ListaDeVeiculos.Addveiculo(e1Esportivos);
        ListaDeVeiculos.Addveiculo(e2Esportivos);
        ListaDeVeiculos.Addveiculo(e3Esportivos);

        ListaDeVeiculos.Addveiculo(p1Passeio);
        ListaDeVeiculos.Addveiculo(p2Passeio);
        ListaDeVeiculos.Addveiculo(p3Passeio);

        
        Sistema.Controle();
    }
}