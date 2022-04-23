import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void body_in_Equilibrium(){
        Main equilibrium = new Main();
        double test [][]= {{3 ,-1, 7},{-5, 2 ,-4},{2, -1, -3}};
        assertEquals("Yes",equilibrium.main(3,test));
    }
    @Test
    public void body_in_Equilibrium4(){
        Main equilibrium = new Main();
        double test [][]= {{4, 1, 7},{-2 ,4 ,-1},{1 ,-5 ,-3}};
        assertEquals("NO",equilibrium.main(3,test));
    }
}