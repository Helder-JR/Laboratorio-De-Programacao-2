package lab2;

/**
 * Representação de uma disciplina cursada por um estudante. Cada disciplina
 * possui um nome, horas de estudo a ela dedicadas, quantidade de notas que a
 * compõem e o peso de cada nota. Possibilita cadastrar horas de estudo, notas,
 * calcular a média do aluno para verificar se ele foi aprovado e imprimir o
 * estado atual.
 * 
 * @author Helder Chaves Leite Junior - 118210158
 * @version 1.2
 */
public class Disciplina
{
	/**
	 * Nome da disciplina cursada.
	 */
	private String nomeDisciplina;
	
	/**
	 * Quantidade de horas de estudo que já foram dedicadas a esta disciplina.
	 */
	private int horasEstudadas;
	
	/**
	 * Quantidade de notas que irão compôr as avaliações da disciplina.
	 */
	private int qtdNotas;
	
	/**
	 * Array de notas da disciplina. Possui tamanho variável definido pelo
	 * construtor. 
	 */
	private double nota[];
	
	/**
	 * Array de pesos de cada uma das notas da disciplina. Possui tamanho
	 * variável relativo à quantidade de notas.
	 */
	private int peso[];
	
	/**
	 * Constrói uma disciplina a partir de seu nome, da quantidade de notas e
	 * dos pesos referentes a cada uma das notas. O array de notas terá tamanho
	 * uma unidade maior do que a quantidade de notas que compõem a disciplina,
	 * para que não seja necessário ter de decrementar os índices no momento
	 * das atribuições.
	 * 
	 * @param nomeDisicplina o nome da disciplina.
	 * @param qtdNotas a quantidade de notas da disciplina.
	 * @param peso os pesos das notas da disciplina.
	 */
	public Disciplina(String nomeDisciplina, int qtdNotas, int peso[])
	{
		this.nomeDisciplina = nomeDisciplina;
		this.qtdNotas = qtdNotas;
		this.nota = new double[this.qtdNotas + 1];
		this.peso = peso;
	}
	
	/**
	 * Constrói uma disciplina a partir de seu nome e da quantidade de notas.
	 * O array de notas terá tamanho uma unidade maior do que a quantidade de
	 * notas que compõem a disciplina, para que não seja necessário ter de
	 * decrementar os índices no momento das atribuições, além de os pesos de
	 * cada uma das notas ser definido como um.
	 * 
	 * @param nomeDisicplina o nome da disciplina.
	 * @param qtdNotas a quantidade de notas da disciplina.
	 */
	public Disciplina(String nomeDisciplina, int qtdNotas)
	{
		int[] peso = new int[qtdNotas + 1];
		
		for (int i = 1; i < peso.length; i++)
			peso[i] = 1;
		
		this.nomeDisciplina = nomeDisciplina;
		this.qtdNotas = qtdNotas;
		this.nota = new double[this.qtdNotas + 1];
		this.peso = peso;
	}
	
	/**
	 * Constrói uma disciplina a partir de seu nome. Por padrão a quantidade de
	 * notas será definida como quatro e o peso de cada uma das notas será um.
	 * 
	 * @param nomeDisicplina o nome da disciplina.
	 */
	public Disciplina(String nomeDisicplina)
	{
		this(nomeDisicplina, 4, new int[] {1, 1, 1, 1, 1});
	}
	
	/**
	 * Aumenta a quantidade de horas estudadas pelo estudante nesta disciplina.
	 * 
	 * @param horas horas estudadas a serem cadastradas.
	 */
	public void cadastraHoras(int horas)
	{
		this.horasEstudadas += horas;
	}
	
	/**
	 * Cadastra a pontuação de uma das notas da disciplina.
	 * 
	 * @param nota qual das quatro notas será cadastrada.
	 * @param valorNota a pontuação desta nota.
	 */
	public void cadastraNota(int nota, double valorNota)
	{
		this.nota[nota] = valorNota;
	}
	
	/**
	 * Calcula a média do estudante na disciplina, através da soma total das
	 * notas multiplicada pelos seus respectivos pesos e dividido pela soma
	 * total dos pesos das notas.
	 * 
	 * @return um valor de ponto flutuante (<b>double</b>) respectivo à média.
	 */
	private double calculaMedia()
	{
		double totalPontos = 0.0;
		int totalPesos = 0;
		
		for (int i = 1; i < this.nota.length; i++)
		{
			totalPontos += this.nota[i] * this.peso[i];
			totalPesos += this.peso[i];
		}
		
		return totalPontos / totalPesos;
	}
	
	/**
	 * Verifica se um estudante foi aprovado na disciplina.
	 * 
	 * @return um booleano <b>true</b> caso a média deste estudante tenha sido
	 * maior ou igual a 7.0 e <b>false</b> caso contrário.
	 */
	public boolean aprovado()
	{
		return calculaMedia() >= 7.0;
	}
	
	/**
	 * Imprime as notas, com separação por espaços, seguindo o formato
	 * "NOTA_1 NOTA_2 NOTA_2 ... NOTA_N".
	 * 
	 * @return a String que representa as notas do estudante.
	 */
	private String imprimeNotas()
	{
		String imprimeNotas = "";
		
		for (int i = 1; i < this.nota.length; i++)
			imprimeNotas += String.format("%.1f ", this.nota[i]);
		
		imprimeNotas = imprimeNotas.trim();
		
		return imprimeNotas; 
	}
	
	/**
	 * Imprime a String que representa as informações da disciplina. A
	 * representação segue o formato "NOME_DA_DISCIPLINA HORAS_ESTUDADAS MÉDIA
	 * [NOTA_1 NOTA_2 NOTA_3 ... NOTA_N]".
	 * 
	 * @return a String que representa a disciplina.
	 */
	public String toString()
	{
		return String.format("%s %d %.1f [%s]", this.nomeDisciplina,
				this.horasEstudadas, calculaMedia(), imprimeNotas());
	}
}
