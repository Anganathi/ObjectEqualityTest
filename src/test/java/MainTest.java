import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public  void objectEquals(){
        Person p1 = new Person("Anganathi", "Ngodwane", 23, "Male");
        Person p2 = new Person("Anga", "Lize", 23, "Male");
        boolean result = p1.objectEquals(p2);
        Assert.assertEquals(false, result);
    }

}