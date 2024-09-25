import com.example.Feline;
import com.example.Lion;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;
import org.mockito.junit.MockitoJUnit;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionTest {
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();
    @Mock
    private Feline feline;
    @org.junit.runners.Parameterized.Parameters
    public static Object[] getLionsData() {
        return new Object[][] {
                {"Самец", true, 1, List.of("Животные", "Птицы", "Рыба")},
                { "Самка", false, 1, List.of("Животные", "Птицы", "Рыба")}
        };
    }
    public LionTest(String sex, boolean hasMane, int kittens, List<String> food) throws Exception {
        this.sex = sex;
        this.hasMane = hasMane;
        this.kittens = kittens;
        this.food = food;
        lion = new Lion(sex,feline);
    }
    private final String sex;
    private final boolean hasMane;
    private final int kittens;
    private final List<String> food;
    private final Lion lion;

    @Test
    public void lionGetKittensTest() throws Exception {
        Feline felineStub = new Feline();
        Lion lionStub = new Lion(sex,felineStub);
        assertEquals(kittens,lionStub.getKittens());
    }
    @Test
    public void lionGetFoodTest() throws Exception {
        Feline felineStub = new Feline();
        Lion lionSpy = new Lion(sex,felineStub);
        assertEquals(food,lionSpy.getFood());
    }
    @Test
    public void lionGetHasMane() throws Exception {
        assertEquals(hasMane,lion.doesHaveMane());
    }
}
