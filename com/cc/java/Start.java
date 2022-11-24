// Grundgerüst in Java einer ausführenden App
    package com.cc.java;

    public class Start {
        public static void main( String[] args ) {
            
        }
    }

// Grundgerüst einer Methode (Funktion)
    public void name() {
        // balblabal
    }

// Grundgerüst einer if
    public int gehalt = 5;
    if (gehalt < 5000) {
        // dann balblabal
    }   // KEIN SONST

// Grundgerüst einer ifelse
    public int gehalt = 5;
    if (gehalt < 5000) {
        // dann balblabal
    } else {
        // sonst balblabal
    }

// Grundgerüst einer switch case
    switch (key) {
        case 1:
            // nur wenn case 1 dann balblabal
            break;
        case 2:
            // nur wenn case 2 dann balblabal
            break;
        default:
            // nur wenn KEIN case dann balblabal
            break;
    }

// Grundgerüst einer for Schleife
    for (startwert, maxwert, schritte) {
        // startwert === Beispiel: i = 0, also fängt die SChleife bei 0 ans zu zählen
        // maxwert === Beispiel: i = 3 (arr.lenght), also stoppt die Schleife bei 3 oder bei dem Wert des Arrayinhalts
        // stufen == Beispiele:
            // i++ === i wird immer um 1 zu sich selbst hinzugefügt (1, 2 , 3, 4)
            // i-- === i wird immer um 1 zu sich selbst abgezogen (-1, -2 , -3, -4)
            // i-10 === i wird immer um 10 Schritte zu sich selbst subtrahiert (-10, -20 , -30, -40)
            // i+2 === i wird immer um 2 Schritte zu sich selbst addiert (2, 4, 6, 8)
            // i+7 === i wird immer um 7 Schritte zu sich selbst addiert (7, 14, 21, 28)
            public int count = 0;
            for (i = 0, i = 28, i+7) {
                count++
                public int versuche = i;
            }
            output(versuche);
            output(count);
            // Konsole: 28
            // Konsole: 4

            for (i = 0, i = 30, i+7) {
                public int versuche = i;
                output(versuche);
                output(count);
            }
            // Konsole: 7
            // Konsole: 1
            // Konsole: 14
            // Konsole: 2
            // Konsole: 21
            // Konsole: 3
            // Konsole: 28
            // Konsole: 4
        }

    arr[] = {
        "Montag",
        "Dienstag",
        "Mittwoch",
        "Donnerstag"
    }
    // arr.lenght == der Inhalt des Arrays in einer Zahl, also hier 3 Inhalte
    // arr.lenght = 3 heisst es sind 3 Indexe vorhanen : VON 0
    // Indexe: 0, 1, 2, 3

    for (i = 0, i = arr.lenght - 1, i++) {
        public String tage = arr[i];
        output(tage);
    }
    // Konsole: "Montag",
    // Konsole: "Dienstag",
    // Konsole: "Mittwoch",
    // Konsole: "Donnerstag"
