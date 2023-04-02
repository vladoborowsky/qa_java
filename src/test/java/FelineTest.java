import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;

import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.*;


import java.util.List;
import java.util.Random;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Spy
    Feline feline;


    @Test
    public void eatMeatTest() throws Exception {
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void getFamilyTest() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensTest() {
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensTestWithArgument() {
        int random = new Random().nextInt();
        assertEquals(random, feline.getKittens(random));
    }
}
