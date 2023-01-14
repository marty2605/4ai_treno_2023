/**
 * 
 * @author Marta
 * versione 1
 *
 */
public class Vagone {
	private String classe;
	private int postiOcc, pTot, pesoM;

	public Vagone(String classe, int pTot, int pesoM) {
		this.classe = classe;
		this.pTot = pTot;
		this.pesoM = pesoM;
	}

	public boolean setPostiOcc(int p) {
		if (pTot > p) {
			postiOcc = p;
			return true;
		}
		return false;
	}

	public int pesoPass() {
		return postiOcc * pesoM;
	}

	public int getPostiLiberi() {
		return pTot - postiOcc;
	}

	@Override
	public String toString() {
		return "\nclasse: " + classe + "\nposti disponibili: " + getPostiLiberi() + "\nposti occupati: " + postiOcc
				+ "\nnumero posti totali: " + pTot + "\npeso totale: " + pesoPass() + "kg";
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Vagone v1 = new Vagone("prima", 20, 65);
		Vagone v2 = new Vagone("seconda", 18, 65);
		Vagone v3 = new Vagone("seconda", 19, 65);
		System.out.println(v1.setPostiOcc(5));
		System.out.println(v2.setPostiOcc(10));
		System.out.println(v3.setPostiOcc(15));
		System.out.println("VAGONE 1" + v1);
		System.out.println("\nVAGONE 2" + v2);
		System.out.println("\nVAGONE 3" + v3);
	}
}
