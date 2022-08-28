//2) Crie uma classe avi�o e apresente os atributos e m�todos referentes
//esta classe, em seguida crie um objeto avi�o, defina as instancias 
//deste objeto e apresente as informa��es deste objeto no console.

package ExercicioPPO;

import java.text.NumberFormat;
// Biblioteca que vai formatar na moeda local

public class Aviao {
	
	public String modelo;
	public int ano;
	public int assento;
	public double valor;
	
	
	public Aviao (String modelo, int ano, int assento, int valor)
	{
		this.modelo = modelo;
		this.ano = ano;
		this.assento = assento;
		this.valor = valor;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public int getAno() {
		return ano;
	}


	public void setAno(int ano) {
		this.ano = ano;
	}


	public int getAssento() {
		return assento;
	}


	public void setAssento(int assento) {
		this.assento = assento;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}
	public String formatarMoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance(); //define a moeda padr�o do pais
		nf.setMinimumFractionDigits(2);//define a quantidade de casas depois da v�rgula
		String formatoMoeda = nf.format(valor);//formata a sa�da do sal�rio
		return formatoMoeda;
	}

	
	public void imprimirInfo() {
		
		System.out.println("\n\t\t ::: Avi�o ::: \n"
				+"\nModelo: " + modelo + "\nAno: " +ano+"\nN� assentos: " + assento +
				"\nValor: " + this.formatarMoeda());
	}
}




