import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class TestSimplemethods {
    public SimpleMethods s = new SimpleMethods();

    @Test
    public void PassedAddTest(){
        int result = s.SimpleAdd(2,3);
        int exp = 5;
        Assertions.assertEquals(exp,result);
    }
    @Test
    public void FailedAddTest(){
        int result = s.SimpleAdd(2,3);
        int exp = 6;
        Assertions.assertEquals(exp,result);
    }
    @RepeatedTest(3)
    public void RepeatDivideTest(){
        int result = s.SimpleDivide(5,2);
        int exp = 3;
        Assertions.assertEquals(exp,result);
    }
}
