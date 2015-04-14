package scaunois.badistick.entity.classement;

public class Classement {
	
	protected ListeClassement classementSimple;
	protected ListeClassement classementDouble;
	protected ListeClassement classementMixte;
	
	public Classement() {
		super();
	}
	
	public Classement(ListeClassement classementSimple,
			ListeClassement classementDouble, ListeClassement classementMixte) {
		super();
		this.classementSimple = classementSimple;
		this.classementDouble = classementDouble;
		this.classementMixte = classementMixte;
	}
	
	public ListeClassement getClassementSimple() {
		return classementSimple;
	}
	public void setClassementSimple(ListeClassement classementSimple) {
		this.classementSimple = classementSimple;
	}
	public ListeClassement getClassementDouble() {
		return classementDouble;
	}
	public void setClassementDouble(ListeClassement classementDouble) {
		this.classementDouble = classementDouble;
	}
	public ListeClassement getClassementMixte() {
		return classementMixte;
	}
	public void setClassementMixte(ListeClassement classementMixte) {
		this.classementMixte = classementMixte;
	}

	@Override
	public String toString() {
		return "Classement [classementSimple=" + classementSimple
				+ ", classementDouble=" + classementDouble
				+ ", classementMixte=" + classementMixte + "]";
	}
	
}
