
public class FuncoesComReturn {
	
	public static String dia(int numero) {
		switch(numero) {
		case 1: 
			return "Domingo";
			
		case 2: 
			return "Segunda";
				
		case 3: 
			return "Terça";
							
		case 4: 
			return "quarta";
				
		case 5: 
			return "Quinta";
	
				
		case 6: 
			return "Sexta";
			
		case 7: 
			return "Sabado";
			
		default:		
			return "dia invalido";
				
				
		}
	}

	public static void main(String[] args) {
		System.out.println(dia(6));

		
		if (dia (6).equals("Sexta")) {
			System.out.println("Dia de maldade");
		}
	}

}
/*
Funções com argumento
-quando a função depende de um valor anterior
funcoes sem argumento
quando a funcao nao depende de um valor anteior

funcao sem return
		quando a funcao realiza algo que nao gera um alor de resultado retornavel

funcao com return 
		quando a funcao gera um valor que era usado fora dela imediatamente */