package ExercicioPPO;

public class FuncionarioTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Funcionario [] lista = new Funcionario[3];
		
		lista [0] = new Funcionario("Goku", "Desenvolvedor S�nior", 43, 22000);
		lista [1] = new Funcionario("Gohan", "Desenvolvedor Pleno", 23, 11000);
		lista [2] = new Funcionario("Goten", "Desenvolvedor J�nior", 17, 5500);

	
		System.out.println("\t\t ::: Funcion�rios ::: \n");

		for(Funcionario rodar:lista) {
			rodar.imprimirInfo();
		}
	
	}

}
