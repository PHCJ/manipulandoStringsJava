package manipularString;

public class MinhaClasse {

	public static void main(String[] args) {
		
		String str= "num buraco no ch�o havia um hobbit";
		String xyz = new String ("num buraco no ch�o havia um hobbit");
		if (str ==xyz) System.out.println("IGUAL");
		else System.out.println("DIFERENTE");
		
		if (str.equals(xyz)) {
			//Maneira Correta de se comparar o conte�do da String
			System.out.println("IGUAL");
		}
		
		System.out.println("tamanho da string:"+str.length());
		System.out.println("substring:"+str.substring(0,10));
		System.out.println("caracter na posi��o 5:"+str.charAt(5));
		
		/*O m�todo split quebra a String e v�rias outras, pelo separador desejado */
		String[] palavras = str.split(" ");
		System.out.println(palavras[5]);
		
		
		//retorna o indice da palavra na String
		int i = str.indexOf("ch�o");
		System.out.println(i);
		
		//testa o come�o e o fim da String - retorna boolean
		if(str.startsWith("Ol�") || str.endsWith("hobbit")) {
			System.out.println("Passou no teste hobbit");
		
		
		str = str.trim();
		System.out.println(str);
		
		str = str.replace('h','H');
		System.out.println(str);
		
		str = str.replaceAll("num","Em uma");
		System.out.println(str);
		
		
		}
	}

}
