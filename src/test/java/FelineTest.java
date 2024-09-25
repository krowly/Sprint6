import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class FelineTest
{
    @Spy
    private final Feline feline = new Feline();
    @Test
    public void felineEatMeatTest() throws Exception {
        feline.eatMeat();
        Mockito.verify(feline).eatMeat();
    }
    @Test
    public void felineGetKittensTest() throws Exception {
        feline.getKittens();
        Mockito.verify(feline).getKittens();
    }
    @Test
    public void felineGetFamilyTest() throws Exception {
        feline.getFamily();
        Mockito.verify(feline).getFamily();
    }
}