//3) Crie uma classe produto eletr�nico e apresente os atributos e m�todos 
//referentes esta classe, em seguida crie um objeto produto eletr�nico, defina
//as instancias deste objeto e apresente as informa��es deste objeto no console.

package ExercicioPPO;

import java.text.NumberFormat;

public class ProdutoEletronico {

	public String produto;
	public String marca;
	public String processador;
	public int anoFabricacao;
	public double valor;
	
	public ProdutoEletronico(String prod, String marc, 
			String proce, int anoFabri, double val)
	{
		this.produto = prod;
		this.marca = marc;
		this.processador = proce;
		this.anoFabricacao = anoFabri;
		this.valor = val;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produt) {
		this.produto = produt ;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getProcessador() {
		return processador;
	}

	public void setProcessador(String processador) {
		this.processador = processador;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	};
	
	public String formatarMoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance(); //define a moeda padr�o do pais
		nf.setMinimumFractionDigits(2);//define a quantidade de casas depois da v�rgula
		String formatoMoeda = nf.format(valor);//formata a sa�da do sal�rio
		return formatoMoeda;
	}
	
	public void imprimirInfo()
	{
		System.out.println(
				"\nProduto: "+ produto + "\nMarca: " + marca +
				"\nProcessador: " + processador + "\nAno de Fabrica��o: " +
				anoFabricacao + "\nValor: " + this.formatarMoeda()+
				"\n\n*******************************************");
	}
	
}
