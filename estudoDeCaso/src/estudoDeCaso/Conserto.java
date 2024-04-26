package estudoDeCaso;

import java.util.Date;

public class Conserto {
	
	private int identificadorReclamacao;
    private Date dataHoraConserto;
    private double valorConserto;
    
	public Conserto(int identificadorReclamacao, Date dataHoraConserto, double valorConserto) {
		this.identificadorReclamacao = identificadorReclamacao;
		this.dataHoraConserto = dataHoraConserto;
		this.valorConserto = valorConserto;
	}

	public int getIdentificadorReclamacao() {
		return identificadorReclamacao;
	}

	public void setIdentificadorReclamacao(int identificadorReclamacao) {
		this.identificadorReclamacao = identificadorReclamacao;
	}

	public Date getDataHoraConserto() {
		return dataHoraConserto;
	}

	public void setDataHoraConserto(Date dataHoraConserto) {
		this.dataHoraConserto = dataHoraConserto;
	}

	public double getValorConserto() {
		return valorConserto;
	}

	public void setValorConserto(double valorConserto) {
		this.valorConserto = valorConserto;
	}

	@Override
	public String toString() {
		return "Conserto [identificadorReclamacao=" + identificadorReclamacao + ", dataHoraConserto=" + dataHoraConserto
				+ ", valorConserto=" + valorConserto + "]";
	}
    
}
