import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Spy
    private final Cat cat = new Cat(new Feline());
    @Test
    public void catSoundTest() throws Exception {
        cat.getSound();
        Mockito.verify(cat).getSound();
    }
    @Test
    public void catFoodTest() throws Exception {
        cat.getFood();
        Mockito.verify(cat).getFood();
    }
}
