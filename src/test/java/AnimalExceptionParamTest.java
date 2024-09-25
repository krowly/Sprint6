import com.example.Animal;
import org.junit.runner.RunWith;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(org.junit.runners.Parameterized.class)
public class AnimalExceptionParamTest {
    @org.junit.runners.Parameterized.Parameters
    public static Object[] getExceptionData() {
        return new Object[][] {
                {"",new Exception("Неизвестный вид животного, используйте значение Травоядное или Хищник")},
                {"WrongString",new Exception("Неизвестный вид животного, используйте значение Травоядное или Хищник")},
        };
    }
    public AnimalExceptionParamTest(String animalKind, Exception expectedException) {
        animal = new Animal();
        this.animalKind = animalKind;
        this.expectedException = expectedException;
    }
    private final Animal animal;
    private final String animalKind;
    private final Exception expectedException;
    @Test
    public void testGetFood_Exception() throws Exception {
        Exception exception = assertThrows(expectedException.getClass(), () -> animal.getFood(animalKind));
    }
}
