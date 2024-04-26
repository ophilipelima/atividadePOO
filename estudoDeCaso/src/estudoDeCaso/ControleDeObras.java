package estudoDeCaso;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class ControleDeObras {
	
	Random numeroIdentificador = new Random();
	Scanner scan = new Scanner(System.in);
	
	private List<Reclamacao> listaReclamacao;
	
	public ControleDeObras() {
		this.listaReclamacao = new ArrayList<>();
	}

	public static void main(String[] args) {
		Scanner scannearOpcao = new Scanner(System.in);
		ControleDeObras controleDeObras= new ControleDeObras();
		int opcao;
	    do {
	        System.out.println("Menu de opções:");
	        System.out.println("1 - Registrar reclamação");
	        System.out.println("2 - Excluir reclamação");
	        System.out.println("3 - Consultar reclamação");
	        System.out.println("4 - Registrar conserto");
	        System.out.print("Escolha uma opção: ");
	        opcao = scannearOpcao.nextInt();
	        
	        switch (opcao) {
	            case 1:
	                controleDeObras.registrarReclamacao();
	                break;
	            case 2:
	                controleDeObras.excluirReclamacao();	            
	                break;
	            case 3:
	                System.out.println(controleDeObras.consultarReclamacao());
	                break;
	            case 4:
	                controleDeObras.registrarConserto();
	                break;
	            default:
	                System.out.println("Opção inválida!");
	        }
	    } while (opcao != 5);
		
	}

	public void registrarReclamacao() {
		int numeroIdentifilcacao = numeroIdentificador.nextInt(150000);
		String endereco;
		int tamanhoBuraco;
		String localizacao;
		Date dataRegistro;
		String situacao = "Registrada";
		
		System.out.println("Preencha as informações para registrar a reclamação: ");
		System.out.println("Endereço: " );
		endereco = scan.nextLine();
		
		System.out.println("Localização(na rua ou na calçada): ");
		localizacao = scan.nextLine();
		
		System.out.println("Tamanho do buraco 0-10: ");
		tamanhoBuraco = scan.nextInt();
		
		dataRegistro = new Date();
		
		System.out.println("Registro realizado! O código de identificação do registro é: " + numeroIdentifilcacao);
		
		listaReclamacao.add(new Reclamacao(numeroIdentifilcacao, endereco, tamanhoBuraco, localizacao, dataRegistro, situacao));
		
		
	}
	
	public void excluirReclamacao() {
		List<Reclamacao> reclamacoesParaExcluir = new ArrayList<>();
		int identificador;
		System.out.println("Digite o código de identificação da reclamação que você deseja excluir: ");
		identificador = scan.nextInt();
		
		if (!listaReclamacao.isEmpty()) {
		      for (Reclamacao r : listaReclamacao) {
		        if (r.getNumeroIdentifilcacao() == identificador) {
		          reclamacoesParaExcluir.add(r);
		        }
		      }
		      listaReclamacao.removeAll(reclamacoesParaExcluir);
		} 
	}
	
	public Reclamacao consultarReclamacao() {
		Reclamacao reclamacaoPorIdenfificador = null;
		int identificador;
		System.out.println("Digite o código de identificação da reclamação: ");
		identificador = scan.nextInt();
		for(Reclamacao r : listaReclamacao) {
			if(r.getNumeroIdentifilcacao() == identificador) {
				reclamacaoPorIdenfificador = r;
				break;
			}
		}
		return reclamacaoPorIdenfificador;
	}
	
	public void registrarConserto() {
		List<Conserto> listaConserto = new ArrayList<>();
		System.out.println("Informe as seguintes informações para registrar o concerto: ");
		System.out.println("Código da reclamação: ");
		int identificadorReclamacao = scan.nextInt();
		
		System.out.println("Valor do concerto: ");
	    double valorConserto = scan.nextDouble();
	    
	    Date dataHoraConserto = new Date();
	    
	    for(Reclamacao r : listaReclamacao) {
			if(r.getNumeroIdentifilcacao() == identificadorReclamacao) {
				r.setSituacao("Consertada");
			}
	    }
	    listaConserto.add(new Conserto(identificadorReclamacao, dataHoraConserto, valorConserto));
	}
}

