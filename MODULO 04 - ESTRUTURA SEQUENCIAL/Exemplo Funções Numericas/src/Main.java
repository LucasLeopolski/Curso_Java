
public class Main {

	public static void main(String[] args) {
		System.out.println("EXEMPLO FUNÇÕES NUMERICAS");
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double a, b, c, d, e, f, g, h; 
		
		a = Math.sqrt(x); // variavel a está recebendo a raiz quadrada de x;
		b = Math.sqrt(y); 
		c = Math.sqrt(169.0); // aqui esá pegando a raiz quadrada do número que é passado entre parenteses; 
		
		
		System.out.println("RAIZ QUADRADA: ");
		System.out.println("Raiz quadrada de: " +x+ " = "+a);
		System.out.println("Raiz quadrada de: " +y+ " = "+b);
		System.out.println("Raiz quadrada de 25 = "+c);
		
		System.out.println("\n==============================================================: ");
		System.out.println("POTENCIAÇÃO ( UM NUMERO ELEVADO A OUTRO: )" );
		
		d = Math.pow(x, y); // variavel d está recebendo o resulatdo de x elevado a y (potenciação);
		e = Math.pow(x,2.0);
		f = Math.pow(5.0, 2.0);
		
		System.out.println(x+" elevado a "+y+ " = "+d);
		System.out.println(x+" elevado ao quadrado = "+e);
		System.out.println("5 elevado ao quadrado = "+f);
		
		
		System.out.println("\n==============================================================: ");
		System.out.println("VALOR ABSOLUTO ( UM NUMERO SEM O SEU SINAL  )" );
		g = Math.abs(y); // variavel g esá recebendo o valor absoluto de y ( valor absoluto é apenas o número sem o sinal);
		h = Math.abs(z);
		
		System.out.println("O valor absoluto de "+y+" = "+g);
		System.out.println("O valor absoluto de "+z+" = "+h);
		
		
		System.out.println("\n==============================================================: ");
		System.out.println("EXEMPLO FORMULA DE BHASKARA" );
		//valor1, valor2, e valor3 equivalem a ( a,b,c) 
		double delta, w1, w2; 
		double valor1 = 1.0;
		double valor2 = -5.0 ;
		double valor3 = 6.0; 
		
		// formula de bhaskara: w = -b +- raizQ de delta dividido por 2 * a    --- formula de delta:  delta = b ao quadrado - 4*a*c
		
		
		delta = Math.pow(valor2, 2.0) - 4*valor1*valor3; // formula do delta
		
		w1 = (-valor2 + Math.sqrt(delta)) / 2*valor1; 
		w2 = (-valor2 - Math.sqrt(delta)) / 2*valor1; 
		
		System.out.println("VALOR 1 (X') = "+w1);
		System.out.println("VALOR 2 (X'') = "+w2);
		
		
		

	}

}
