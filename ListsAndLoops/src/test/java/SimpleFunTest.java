import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleFunTest {
    @Test
    void testGetSeconds(){
        Assertions.assertEquals(300, SimpleFun.getSeconds(5));
        Assertions.assertEquals(180, SimpleFun.getSeconds(3));
        Assertions.assertEquals(120, SimpleFun.getSeconds(2));
    }

    @Test
    void testInchesToFeet(){
        Assertions.assertEquals(27, SimpleFun.inchesToFeet(324));
        Assertions.assertEquals(3, SimpleFun.inchesToFeet(36));
        Assertions.assertEquals(1, SimpleFun.inchesToFeet(12));
        Assertions.assertEquals(0, SimpleFun.inchesToFeet(7));
    }

    @Test
    void testEqualNumberOfXsAndOs(){
        Assertions.assertEquals(true, SimpleFun.equalNumberOfXsAndOs("xxoo"));
        Assertions.assertEquals(false, SimpleFun.equalNumberOfXsAndOs("xooxx"));
        Assertions.assertEquals(true, SimpleFun.equalNumberOfXsAndOs("ooxXm"));
        Assertions.assertEquals(true, SimpleFun.equalNumberOfXsAndOs("zpzpzpp"));
        Assertions.assertEquals(false, SimpleFun.equalNumberOfXsAndOs("zzoo"));
    }
}
