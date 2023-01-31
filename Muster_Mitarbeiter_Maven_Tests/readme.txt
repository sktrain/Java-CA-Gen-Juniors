
sk.train.ma.strategy:

- Basisversion der Mitarbeiterklasse mit Gehaltsmodell (Has-A), 
  Gehaltsmodelle sind per Interface definiert (Strategy-Pattern umgesetzt)
- Entsprechend kann die Mitarbeiterverwaltung die Gehaltssumme liefern
- Mitarbeiterverwaltung ist auf Map umgestellt und Methodik erweitert
- Methode, die das Sortierkriterium als Baustein erwartet und entsprechende Liste
  liefert, ist in der Mitarbeiterverwaltung vorhanden
- Mitarbeiterklasse implementiert Comparable
- Factory für Gehaltsmodelle ist vorhanden
- Klassen haben Standardmethoden (toString, equals, hashcode) überschrieben
- Factory wird per Properties gefüttert
- Ausgabe der MItarbeiterverwaltung in Textdatei
- Ergänzt um GUI-Komponente via Swing JTable

- Ergänzt um ein paar Tests
