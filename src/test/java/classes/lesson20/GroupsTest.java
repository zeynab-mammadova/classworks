package classes.lesson20;

import az.company.classes.lesson20.ShoesPairs;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GroupsTest {
    private ShoesPairs c;

    @BeforeEach
    public void setUp() throws Exception {
        this.c = new ShoesPairs();
    }

    @Test
    public void calc1() {
        assertEquals(1, c.calc("RL"));
    }

    @Test
    public void calc2() {
        assertEquals(1, c.calc("RRLRLRLRLRLL"));
    }

    @Test
    public void calc3() {
        assertEquals(1, c.calc("LLLRRR"));
    }

    @Test
    public void calc4() {
        assertEquals(2, c.calc("RLRL"));
    }

    @Test
    public void calc5() {
        assertEquals(4, c.calc("RLLRLLLRRRRL"));
    }

}
