import calculatrice_tp1.Calculette;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculetteTest {

    private Calculette calculette;

    // Exécuté automatiquement avant CHAQUE méthode @Test
    // Garantit un objet "propre" à chaque test, sans dépendance entre eux
    @BeforeEach
    void setUp() {
        calculette = new Calculette();
    }

    @Test
    void addition_devrait_retourner_la_somme() {
        // Arrange : préparation des données nécessaires au test
        double a = 2;
        double b = 3;

        // Act : exécution de l'action qu'on veut tester
        double resultat = calculette.addition(a, b);

        // Assert : vérification que le résultat correspond à l'attendu
        assertEquals(5, resultat);
    }

    @Test
    void soustraction_devrait_retourner_la_difference() {
        // Arrange
        double a = 5;
        double b = 3;

        // Act
        double resultat = calculette.soustraction(a, b);

        // Assert
        assertEquals(2, resultat);
    }

    @Test
    void multiplication_devrait_retourner_le_produit() {
        // Arrange
        double a = 4;
        double b = 3;

        // Act
        double resultat = calculette.multiplication(a, b);

        // Assert
        assertEquals(12, resultat);
    }

    @Test
    void division_devrait_retourner_le_quotient() {
        // Arrange
        double a = 10;
        double b = 2;

        // Act
        double resultat = calculette.division(a, b);

        // Assert
        assertEquals(5, resultat);
    }

    @Test
    void division_par_zero_devrait_lever_une_exception() {
        // Arrange
        double a = 10;
        double b = 0;

        // Act + Assert : ici l'action ET la vérification sont liées,
        // car on doit vérifier que l'exécution lève bien une exception
        ArithmeticException exception = assertThrows(
                ArithmeticException.class,
                () -> calculette.division(a, b)
        );

        // Assert (complémentaire) : vérifie le message de l'exception
        assertEquals("Division par zéro impossible", exception.getMessage());
    }
}