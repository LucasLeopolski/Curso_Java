
public class Main {

	public static void main(String[] args) {
		
		String original = "abcd EFGH ijkl MNOP ABcdEfGh LLJJAkkaaHH   abcd      ";
		
		// TRANSFORMANDO TODA A STRING PARA MINUSCULA
		String minuscula = original.toLowerCase();
		
		System.out.println("ORIGINAL: "+original +"\n");
		System.out.println("toLowerCase() minuscula: "+minuscula+" - \n");
		
		// TRANSFORMANDO EM MAIUSCULA
		
		String maiuscula = original.toUpperCase();
		
		System.out.println("toUpperrCase() maiuscula: "+maiuscula+" - \n");
		
		// REMOVENDO ESPAÇOS EM BRANCO DO FINAL DA STRING 
		
		String trim = original.trim();
		
		System.out.println("trim() - removendo espaços do final da String : "+trim+" - \n");
		
		// RECORTAR 
		
		String recortar = original.substring(2); // 2 é a posição do caracter, então vai imprimir a prtir da letra c. 
		
		String recortar2 = original.substring(3, 8);
		
		System.out.println("substring() recortar (inicio) : "+recortar+" - \n");
		System.out.println("substring() recortar (inicio e fim): "+recortar2+" - \n");
		
		// SUBSTITUIR CARACATER OU STRING
		
		String replaceChar = original.replace('a', 'x'); // aqui vai fazer a troca sempre que encontrar a vai substituir por x
		
		String replaceString = original.replace("MNOP", "TROCADO");
		
		System.out.println("Replace() trocando  ('a', 'x'): "+replaceChar+" - \n");
		System.out.println("Replace() trocando (MNOP, TROCADO): "+replaceString+" - \n");
		
		// BUSCAR POSIÇÃO 
		
		int buscarInicio = original.indexOf("abcd"); // vai retornar a primeira posição que o parametro se encontra
		
		int buscarFim = original.lastIndexOf("abcd"); // vai retornar a ultima posição que o parametro se encontra
		
		System.out.println("indexOf() buscando primeira posição do reult: "+buscarInicio+" - \n");
		
		System.out.println("lastIndexOf() buscando primeira posição do reult: "+buscarFim+" - \n");
		
		
		// RECORTAR STRING COM BASE EM UM SEPARADOR 
		
		// está separando a string e jogando dentro de um vetor cada uma das palavras - meu separador nesse caso é o espaço em branco.
		
		String s = "um dois três";
		
		String vet [] = s.split(" ");
		
		System.out.println(vet[0]);
		System.out.println(vet[1]);
		System.out.println(vet[2]);
	}

}
