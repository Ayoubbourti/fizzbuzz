package com.pantxi.game;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

    public class Personnagetest {

        @Test
        public void testTournerUneFois() {
            Personnage personnage = new Personnage();
            String result = personnage.tourner(1);
            assertEquals("EST", result, "Après un quart de tour, l'orientation doit être EST");
        }

        @Test
        public void testTournerDeuxFois() {
            Personnage personnage = new Personnage();
            String result = personnage.tourner(2);
            assertEquals("SUD", result, "Après deux quarts de tour, l'orientation doit être SUD");
        }

        @Test
        public void testTournerTroisFois() {
            Personnage personnage = new Personnage();
            String result = personnage.tourner(3);
            assertEquals("OUEST", result, "Après trois quarts de tour, l'orientation doit être OUEST");
        }

        @Test
        public void testTournerQuatreFois() {
            Personnage personnage = new Personnage();
            String result = personnage.tourner(4);
            assertEquals("NORD", result, "Après quatre quarts de tour, l'orientation doit revenir à NORD");
        }

        @Test
        public void testTournerCinqFois() {
            Personnage personnage = new Personnage();
            String result = personnage.tourner(5);
            assertEquals("EST", result, "Après cinq quarts de tour, l'orientation doit être EST");
        }

        @Test
        public void testTourner15Fois() {
            Personnage personnage = new Personnage();
            String result = personnage.tourner(15);
            assertEquals("OUEST", result, "Après cinq quarts de tour, l'orientation doit être OUEST");
        }
    }

