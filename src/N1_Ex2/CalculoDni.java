package N1_Ex2;

public class CalculoDni {

    private final char [] alpha = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
	private int numDNI;

    public CalculoDni(int numDNI) {
		this.numDNI = numDNI;
	}

	public char calculaLletra(){
		return alpha[numDNI % 23];
    }
}
