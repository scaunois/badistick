package scaunois.badistick.entity.club;

import java.util.ArrayList;
import java.util.List;

public class Ligue {

	public static List<String> ligues = getListeLigues();

	public final static String ALSACE = "Alsace";
	public final static String AQUITAINE = "Aquitaine";
	public final static String AUVERGNE = "Auvergne";
	public final static String BASSE_NORMANDIE = "Basse Normandie";
	public final static String BOURGOGNE = "Bourgogne";
	public final static String BRETAGNE = "Bretagne";
	public final static String CENTRE = "Centre";
	public final static String CHAMPAGNE_ARDENNE = "Champagne Ardenne";
	public final static String FRANCHE_COMT� = "Franche-Comt�";
	public final static String GUADELOUPE = "Guadeloupe";
	public final static String GUYANE = "Guyane";
	public final static String HAUTE_NORMANDIE = "Haute Normandie";
	public final static String ILE_DE_FRANCE = "Ile de France";
	public final static String LANGUEDOC_ROUSSILLON = "Languedoc Roussillon";
	public final static String LIMOUSIN = "Limousin";
	public final static String LORRAINE = "Lorraine";
	public final static String MARTINIQUE = "Martinique";
	public final static String MIDI_PYR�N�ES = "Midi Pyr�n�ees";
	public final static String NORD_PAS_DE_CALAIS = "Nord Pas de Calais";
	public final static String NOUVELLE_CAL�DONIE = "Nouvelle Cal�donie";
	public final static String PAYS_DE_LA_LOIRE = "Pays de la Loire";
	public final static String PICARDIE = "Picardie";
	public final static String POITOU_CHARENTES = "Poitou Charentes";
	public final static String PROVENCE_ALPES_C�TE_D_AZUR = "Provence Alpes C�te d'Azur";
	public final static String R�UNION = "R�union";
	public final static String RHONE_ALPES = "Rhone Alpes";

	private static List<String> getListeLigues() {

		List<String> ligues = new ArrayList<String>();

		ligues.add("Alsace");
		ligues.add("Aquitaine");
		ligues.add("Auvergne");
		ligues.add("Basse Normandie");
		ligues.add("Bourgogne");
		ligues.add("Bretagne");
		ligues.add("Centre");
		ligues.add("Champagne Ardenne");
		ligues.add("Franche-Comt�");
		ligues.add("Guadeloupe");
		ligues.add("Guyane");
		ligues.add("Haute Normandie");
		ligues.add("Ile de France");
		ligues.add("Languedoc Roussillon");
		ligues.add("Limousin");
		ligues.add("Lorraine");
		ligues.add("Martinique");
		ligues.add("Midi Pyr�n�ees");
		ligues.add("Nord Pas de Calais");
		ligues.add("Nouvelle Cal�donie");
		ligues.add("Pays de la Loire");
		ligues.add("Picardie");
		ligues.add("Poitou Charentes");
		ligues.add("Provence Alpes C�te d'Azur");
		ligues.add("R�union");
		ligues.add("Rhone Alpes");

		return ligues;

	}

}
