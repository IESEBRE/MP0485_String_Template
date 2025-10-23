import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestProblemes {

    @Test
    void testProblema1a() {
        System.setIn(new java.io.ByteArrayInputStream("Informàtica\n".getBytes()));
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        Problema1.main(new String[]{});

        assertEquals("Longitud: 11 (senar)\n", outContent.toString().trim());
    }

    @Test
    void testProblema1b() {
        System.setIn(new java.io.ByteArrayInputStream("\n".getBytes()));
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        Problema1.main(new String[]{});

        assertEquals("Longitud: 0 (parella)\n", outContent.toString().trim());
    }

    @Test
    void testProblema1c() {
        System.setIn(new java.io.ByteArrayInputStream("Java!\n".getBytes()));
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        Problema1.main(new String[]{});

        assertEquals("Longitud: 5 (senar)\n", outContent.toString().trim());
    }
   
    @Test
    void testProblema2a() {
        System.setIn(new java.io.ByteArrayInputStream("programacio\n".getBytes()));
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        Problema2.main(new String[]{});

        assertEquals("Nombre de vocals: 5\n", outContent.toString().trim());
    }

    @Test
    void testProblema2b() {
        System.setIn(new java.io.ByteArrayInputStream("xyz\n".getBytes()));
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        Problema2.main(new String[]{});

        assertEquals("Nombre de vocals: 0\n", outContent.toString().trim());
    }

    @Test
    void testProblema2c() {
        System.setIn(new java.io.ByteArrayInputStream("aeiouuoiea\n".getBytes()));
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        Problema2.main(new String[]{});

        assertEquals("Nombre de vocals: 10\n", outContent.toString().trim());
    }

    @Test
    void testProblema3a() {
        System.setIn(new java.io.ByteArrayInputStream("Hola món\nmón\n".getBytes()));
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        Problema3.main(new String[]{});

        assertEquals("Sí, la cadena conté la paraula 'món'", outContent.toString().trim());        
    }

    @Test
    void testProblema3b() {
        System.setIn(new java.io.ByteArrayInputStream("hola\nadéu\n".getBytes()));
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        Problema3.main(new String[]{});

        assertEquals("La cadena no conté la paraula 'mon'", outContent.toString().trim());        
    }

    @Test
    void testProblema3c() {
        System.setIn(new java.io.ByteArrayInputStream("java\nja\n".getBytes()));
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        Problema3.main(new String[]{});

        assertEquals("Sí, la cadena conté la paraula 'ja'", outContent.toString().trim());        
    }

  
    @Test
    void testProblema4a() {
        System.setIn(new java.io.ByteArrayInputStream("programació\npro\nció\n".getBytes()));
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        Problema4.main(new String[]{});

        assertEquals("Comença en 'pro': Sí | Acaba en 'ció': Sí", outContent.toString().trim());

    }


    @Test
    void testProblema4b() {
        System.setIn(new java.io.ByteArrayInputStream("Java\nja\nva\n".getBytes()));
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        Problema4.main(new String[]{});

        assertEquals("Comença en 'ja': No | Acaba en 'va': Sí", outContent.toString().trim());

    }

    @Test
    void testProblema4c() {
        System.setIn(new java.io.ByteArrayInputStream("Java\nJa\nVa\n".getBytes()));
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        Problema4.main(new String[]{});

        assertEquals("Comença en 'Ja': Sí | Acaba en 'Va': No", outContent.toString().trim());

    }

    @Test
    void testProblema4d() {
        System.setIn(new java.io.ByteArrayInputStream("Python\nJa\nVa\n".getBytes()));
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        Problema4.main(new String[]{});

        assertEquals("Comença en 'Ja': No | Acaba en 'Va': No", outContent.toString().trim());

    }

    @Test
    void testProblema5a() {
        System.setIn(new java.io.ByteArrayInputStream("abc\nbcd\n".getBytes()));
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        Problema5.main(new String[]{});

        assertEquals("'abc' va abans que 'bcd'", outContent.toString().trim());
        
    }

    @Test
    void testProblema5b() {
        System.setIn(new java.io.ByteArrayInputStream("2\n1\n".getBytes()));
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        Problema5.main(new String[]{});

        assertEquals("'2' va després que '1'", outContent.toString().trim());
    }

    @Test
    void testProblema5c() {
        System.setIn(new java.io.ByteArrayInputStream("1\n1\n".getBytes()));
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        Problema5.main(new String[]{});

        assertEquals("Són iguals", outContent.toString().trim());
    }
 }


