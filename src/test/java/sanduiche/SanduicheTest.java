package sanduiche;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SanduicheTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Sanduiche sanduiche = new Sanduiche("Brioche", "1 carne bovina", "Mussarela", false, true);

        Sanduiche sanduicheClone = sanduiche.clone();
        sanduicheClone.setPao("Australiano");
        sanduicheClone.setCarnes("2 carnes de frango");
        sanduicheClone.setBacon(true);

        assertEquals("Sanduiche{pao='Brioche', carnes='1 carne bovina', queijo='Mussarela', bacon=false, salada=true}", sanduiche.toString());
        assertEquals("Sanduiche{pao='Australiano', carnes='2 carnes de frango', queijo='Mussarela', bacon=true, salada=true}", sanduicheClone.toString());
    }
}
