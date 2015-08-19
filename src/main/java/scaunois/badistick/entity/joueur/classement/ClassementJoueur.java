package scaunois.badistick.entity.joueur.classement;

public class ClassementJoueur {
	
	protected Classement classementSimple;
	protected Classement classementDouble;
	protected Classement classementMixte;
	
	public ClassementJoueur() {
		super();
	}
	
	public ClassementJoueur(Classement classementSimple,
			Classement classementDouble, Classement classementMixte) {
		super();
		this.classementSimple = classementSimple;
		this.classementDouble = classementDouble;
		this.classementMixte = classementMixte;
	}
	
	public Classement getClassementSimple() {
		return classementSimple;
	}
	public void setClassementSimple(Classement classementSimple) {
		this.classementSimple = classementSimple;
	}
	public Classement getClassementDouble() {
		return classementDouble;
	}
	public void setClassementDouble(Classement classementDouble) {
		this.classementDouble = classementDouble;
	}
	public Classement getClassementMixte() {
		return classementMixte;
	}
	public void setClassementMixte(Classement classementMixte) {
		this.classementMixte = classementMixte;
	}

	@Override
	public String toString() {
		return "Classement [classementSimple=" + classementSimple
				+ ", classementDouble=" + classementDouble
				+ ", classementMixte=" + classementMixte + "]";
	}
	
}
