package sk.train.ma.strategy.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


class MitarbeiterverwaltungMethodTest {


	// Test für die getGehaltssumme()
	// - not null
	// > 0
	// korrekte Berechnung der Summe
	@Test
	final void testGetGehaltssumme() {

	}
	

	// Test für die getMlist(Comparator<Mitarbeiter> comp)
	// - Bzgl. Natural Order sollte die Liste nicht null sein
	// - wird korrekt sortiert anhand Beispielssortierung: zuerst nach Gebdatum, gefolgt von Gehalt
	//   (order by Gebdatum, Gehalt)
	//   siehe Doku zu equals bei Listen und wir brauchen natürlich eindeutige Sortierung
	@Test
	final void testGetMlistWithComparator() {

	}


	// Weiterer Test für die getMlist(Comparator<Mitarbeiter> comp)
	// Was erwarten wir, wenn der Comparator null ist?
	@Test
	final void testGetMlistWithNull() {

	}

	// Test für Hinzufügen undf Lesen eines Mitarbeiters
	// - neuen Mitarbeiter hinzufügen, sollte noch nicht existieren
	// - prüfen, ob auch ein Mitarbeiter hinzugefügt wurde
	// - liefert getMitarbeiter(String persnr) den richtigen hinzugefügten Mitarbeiter
	@Test
	final void testAddAndGetMitarbeiter() {

	}


	// Funktioniert das Löschen eines Mitarbeiters
	@Test
	final void testDelMitarbeiterMitarbeiter() {

	}


	// Stimmt das erwartete Verhalten bei getMitarbeiter(String persnr) für eine ungültige Personalnummer
	@Test
	final void testGetMitarbeiterException() {

	}

	// Stimmt das erwartete Verhalten beim Löschen eines unbekannten Mitarbeiters
	@Test  //throw new KarrersException("Mitarbeiter existiert nicht");
	final void testDelMitarbeiterException() {

	}

	@Test
	@Disabled
	final void testWriteToFile() {
		fail("Not yet implemented"); // TODO
	}
}
