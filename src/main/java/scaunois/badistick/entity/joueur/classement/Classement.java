package scaunois.badistick.entity.joueur.classement;

public enum Classement {

	NC("NC"), D4("D4"), D3("3"), D2("D2"), D1("D1"), C4("C4"), C3("C3"), C2("C2"), C1("C1"), B4("B4"), B3("B34"), B2(
			"B2"), B1("B1"), A4("A4"), A3("A3"), A2("A2"), A1("A1"), T50("T50"), T20("T20"), T10("T10"), T5("T5");

	private final String classement;

	private Classement(String classement) {
		this.classement = classement;
	}

}
