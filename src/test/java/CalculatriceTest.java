import calculatrice_tp1.Calculatrice;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatriceTest {

    @Test
    void addition_devrait_retourner_la_somme() {
        double resultat = Calculatrice.addition(2, 3);
        assertEquals(5, resultat);
    }

    @Test
    void soustraction_devrait_retourner_la_difference() {
        double resultat = Calculatrice.soustraction(5, 3);
        assertEquals(2, resultat);
    }

    @Test
    void multiplication_devrait_retourner_le_produit() {
        double resultat = Calculatrice.multiplication(4, 3);
        assertEquals(12, resultat);
    }

    @Test
    void division_devrait_retourner_le_quotient() {
        double resultat = Calculatrice.division(10, 2);
        assertEquals(5, resultat);
    }

    @Test
    void division_par_zero_devrait_lever_une_exception() {
        ArithmeticException exception = assertThrows(
                ArithmeticException.class,
                () -> Calculatrice.division(10, 0)
        );
        assertEquals("Division par zéro impossible", exception.getMessage());
    }
}
