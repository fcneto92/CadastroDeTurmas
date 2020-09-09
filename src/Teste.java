import java.util.Scanner;

public class Teste {

	// Caio Massao Guimaraes Hatano - RA: 201920718
	// Francisco Correa Neto - RA: 201920736
	
	public static void main(String[] args) {
		
		/****************** Cadastro ******************/ 
		
		Scanner input = new Scanner(System.in);
		System.out.println("Quantas turmas quer cadastrar? ");
		int qtdTurmas = input.nextInt();

		Turma vet1[] = new Turma[qtdTurmas];
		for (int cont = 0; cont <vet1.length; cont = cont +1) {
			
			System.out.printf("Id da turma: ", cont);
			int idLido = input.nextInt();
			
			System.out.printf("Data de in�cio da turma: ", cont);
			String dataIniLido = input.next();
			
			System.out.printf("Turno da turma: ", cont);
			String turnoLido = input.next();
			
			System.out.printf("Capacidade de alunos da turma: ", cont);
			int capacidadeAlunosLido = input.nextInt();
			
			Turma t = new Turma(idLido, dataIniLido, turnoLido, capacidadeAlunosLido);
			vet1[cont] = t;	
		}
		
		
		/****************** Busca ******************/ 
		
		System.out.println("\n\nDigite o ID da turma que deseja buscar:");
		int idBuscado = input.nextInt();
		
		boolean find = false;
		
		for (int cont = 0; cont < vet1.length && find == false; cont = cont + 1) {
			
			Turma t = vet1[cont];
			int idAtual = t.getid();
			
			if (idAtual == (idBuscado)) {
				find = true;
				
				System.out.printf("\n\nEncontrou o ID na posi��o %d do vetor!\n", cont);
				System.out.println("Dados da turma encontrada:");
				System.out.printf("Id: %d", t.getid());
				System.out.printf("\nData de In�cio: %s", t.getdataIni());
				System.out.printf("\nTurno: %s", t.getturno());
				System.out.printf("\nCapacidade de Alunos: %d", t.getcapacidadeAlunos());
				
			}
		}
		
		if (find ==false) {
			System.out.println("ID n�o encontrado!");
		}
		
		/****************** Relat�rio ******************/ 

		System.out.println("\n\n\n*** Relat�rio das turmas cadastradas ***");
		for (int cont = 0; cont < vet1.length; cont = cont + 1) {
			
			Turma t = vet1[cont];
			System.out.printf("Id: %d", t.getid());
			System.out.printf("\nData de In�cio: %s", t.getdataIni());
			System.out.printf("\nTurno: %s", t.getturno());
			System.out.printf("\nCapacidade de Alunos: %d", t.getcapacidadeAlunos());
			System.out.println("\n");
	
		}
	
		input.close();
		
	}

}
