package estudoDeCaso;
import java.util.Date;

public class Reclamacao {
	
	private int numeroIdentifilcacao;
	private String endereco;
	private int tamanhoBuraco;
	private String localizacao;
	private Date dataRegistro;
	private String situacao;
	
	public Reclamacao(int numeroIdentifilcacao, String endereco, int tamanhoBuraco, String localizacao,
			Date dataRegistro, String situacao) {
		this.numeroIdentifilcacao = numeroIdentifilcacao;
		this.endereco = endereco;
		this.tamanhoBuraco = tamanhoBuraco;
		this.localizacao = localizacao;
		this.dataRegistro = dataRegistro;
		this.situacao = situacao;
	}

	public int getNumeroIdentifilcacao() {
		return numeroIdentifilcacao;
	}

	public void setNumeroIdentifilcacao(int numeroIdentifilcacao) {
		this.numeroIdentifilcacao = numeroIdentifilcacao;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getTamanhoBuraco() {
		return tamanhoBuraco;
	}

	public void setTamanhoBuraco(int tamanhoBuraco) {
		this.tamanhoBuraco = tamanhoBuraco;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public Date getDataRegistro() {
		return dataRegistro;
	}

	public void setDataRegistro(Date dataRegistro) {
		this.dataRegistro = dataRegistro;
	}
	

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	@Override
	public String toString() {
		return "Reclamacao [numeroIdentifilcacao=" + numeroIdentifilcacao + ", endereco=" + endereco
				+ ", tamanhoBuraco=" + tamanhoBuraco + ", localizacao=" + localizacao + ", dataRegistro=" + dataRegistro
				+ ", situacao=" + situacao + "]";
	}

}