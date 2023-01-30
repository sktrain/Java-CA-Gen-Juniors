package sk.train.ma.strategy.test;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import sk.train.ma.strategy.util.KarrersException;
import sk.train.ma.strategy.verwaltung.MitarbeiterVerwaltung;
import sk.train.strategy.model.FixGehaltModell;
import sk.train.strategy.model.Geschlecht;
import sk.train.strategy.model.Mitarbeiter;


class MitarbeiterverwaltungMethod_Erweitert_Test {

    private MitarbeiterVerwaltung mv;
    
	@BeforeEach
	void setUp() throws Exception {
		mv = new MitarbeiterVerwaltung();
	}

	
	@Test
	final void testGetGehaltssumme() {
		BigDecimal sum = mv.getGehaltssumme();
		assertNotNull(sum, "Gehaltssumme sollte nicht null sein");
		assertTrue(sum.compareTo(BigDecimal.ZERO)>= 0, "Gehaltssumme sollte nicht negativ sein");
		//Gehaltssumme mal selbst berechnen
		List<Mitarbeiter> mlist =  mv.getMlist(Comparator.naturalOrder());
		BigDecimal result = BigDecimal.ZERO;
		for (Mitarbeiter m : mlist) {
			result = result.add(m.getGmodell().getGehalt());
		}
		assertEquals(result, sum, "Gehaltssumme wird nicht korrekt berechnet");
	}
	
	@Test //Whitebox-Test unter Nutzung der getMap-Methode
	final void testGetGehaltssummeMap() {
		TreeMap<String, Mitarbeiter> map = mv.getMap();
		BigDecimal result = map.values().stream()
		            .map(mitarbeiter -> mitarbeiter.getGmodell().getGehalt())
		            .reduce(BigDecimal.ZERO, BigDecimal::add);
		BigDecimal sum = mv.getGehaltssumme();
		assertEquals(result, sum, "Gehaltssumme wird nicht korrekt berechnet");
	}
	
	@Test
	final void testGetMlistWithComparator() {
		List<Mitarbeiter> mlist =  mv.getMlist(Comparator.naturalOrder());
		assertNotNull(mlist, "Liste sollte nicht null sein");
		Comparator<Mitarbeiter> cgebdatum = (Mitarbeiter m1, Mitarbeiter m2) -> {
			return m1.getGebdatum().compareTo(m2.getGebdatum());
		};
		Comparator<Mitarbeiter> cgehalt = (Mitarbeiter m1, Mitarbeiter m2) -> {
			return m1.getGmodell().getGehalt().compareTo(m2.getGmodell().getGehalt());
		};
		mlist.sort(cgebdatum.thenComparing(cgehalt));
		//siehe Doku zu equals bei Listen und wir brauchen natürlich eindeutige Sortierung
		assertEquals(mlist, mv.getMlist(cgebdatum.thenComparing(cgehalt)), "es wird nicht korrekt sortiert");		
	}

	@Test //hier sollten wir das Design nochmal überlegen
	final void testGetMlistWithNull() {
		//aus der Doku:
		//If the specified comparator is null then all elements in this list must implement the Comparable interface
		//and the elements' natural ordering should be used. 
		assertDoesNotThrow(() ->  mv.getMlist(null), "autsch, es wird Exception geworfen");
		
	
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
