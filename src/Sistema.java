public class Sistema {
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
        System.out.println("[ txta ] gera um arquivo txt de todos os veiculos cadastrados.");
        System.out.println("[ txte ] gera um arquivo txt de todos os veiculos Esportivo cadastrados.");
        System.out.println("[ txtc ] gera um arquivo txt de todos os veiculos de Carga cadastrados.");
        System.out.println("[ txtp ] gera um arquivo txt de todos os veiculos de Passeio cadastrados.");
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
                
                ListaDeVeiculos.addVeiculo(newEsportivo);
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
                
                ListaDeVeiculos.addVeiculo(newCarga);
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
                
                ListaDeVeiculos.addVeiculo(newVPassaPasseio);
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
                ListaDeVeiculos.listaVcarga();
                break;
                case "7":
                System.out.println("========================================");
                System.out.println("--- Lista veiculos esportivos ---");
                ListaDeVeiculos.listarVesportivos();
                break;
                case "8":
                System.out.println("========================================");
                System.out.println("--- lista veiculos de passeio ---");
                ListaDeVeiculos.listarVpasseio();
                
                break;
                case "9":
                System.out.println("=========================");
                ListaDeVeiculos.exibirListaConcessionarias();

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

                case "txta":
                System.out.println("==================================================");
                Buildtxt.salvarVeiculosEmArquivo();
                System.out.println("Arquivo txt gerado...");
                System.out.println("==================================================");

                break;
                case "txte":
                System.out.println("==================================================");
                Buildtxt.gerarTXTvEsportivos();
                System.out.println("Arquivo txt gerado...");
                System.out.println("==================================================");

                break;
                case "txtc":
                System.out.println("==================================================");
                Buildtxt.gerarTXTvCarga();
                System.out.println("Arquivo txt gerado...");
                System.out.println("==================================================");

                break;
                case "txtp":
                System.out.println("==================================================");
                Buildtxt.gerarTXTpasseio();
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