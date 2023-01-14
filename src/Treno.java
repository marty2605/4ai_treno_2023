/**
 * <b>classe treno</b>
 * <p>array di oggetti</p>
 * <p>dati in ingresso:</p>
 * <UL>
 * <LI>nome
 * <LI>destinazione
 * <LI>vagoni massimi
 * </UL>
 * 
 * @author Marta
 *versione 3
 */
public class Treno {
	/**
	 * nome = nome del treno
	 */
	private String nome, dest;
	private int maxV;
	private Vagone[] vagoni;

	/**
	 * 
	 * @param nome nome treno
	 * @param dest città
	 * @param maxV
	 */	
	public Treno(String nome, String dest, int maxV) {
		this.nome = nome;
		this.dest = dest;
		this.maxV = maxV;
		vagoni = new Vagone[maxV];
	}

	public void setDestinazione(String d) {
		dest = d;
	}

	public boolean addVagone(int pos, Vagone v) {
		if (vagoni[pos] == null) {
			vagoni[pos] = v;
			return true;
		}
		return false;
	}

	public boolean eliminaVagone(int pos) {
		if (vagoni[pos] != null) {
			vagoni[pos] = null;
			return true;
		}
		return false;
	}

	public int postiLiberi() {
		int pDisp = 0;
		for (int i = 0; i < vagoni.length; i++)
			if (vagoni[i] != null)
				pDisp += vagoni[i].getPostiLiberi();
		return pDisp;
	}

	/**
	 * @return metodo che restituisce il treno completo
	 */
	public String toString() {
		String s = "\nNome treno: " + nome + "\nDestinazione: " + dest + "\nVagoni max: " + maxV + "\n"
				+ "Posti disponibili sul treno: " + postiLiberi() + "\n";
		for (int i = 0; i < vagoni.length; i++)
			if (vagoni[i] != null)
				s += "\nVAGONE " + (i + 1) + vagoni[i] + "\n";
		return s;
	}

	public static void main(String[] args) {
		Vagone v1 = new Vagone("prima", 20, 65);
		Vagone v2 = new Vagone("seconda", 18, 65);
		Vagone v3 = new Vagone("seconda", 19, 65);
		Treno t1 = new Treno("Freccia Rossa", "Milano", 10);
		System.out.println(t1.addVagone(0, v1));
		System.out.println(t1.addVagone(1, v2));
		System.out.println(t1.addVagone(2, v3));
		System.out.println(t1);
		t1.eliminaVagone(2);
		System.out.println("-----------------------------\n" + t1);
	}
}
