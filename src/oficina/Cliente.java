package oficina;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
	public List<Cliente> listaClientes = new ArrayList<>();
	private String nomeCliente;
	private int cpf;
	private Veiculo veiculo;
	
	public Cliente(String nomeCliente, int cpf, Veiculo veiculo) {
		this.setNomeCliente(nomeCliente);
		this.setCpf(cpf);
		this.setVeiculo(veiculo);
		
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

}
