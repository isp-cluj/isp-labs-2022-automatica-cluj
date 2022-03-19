package isp.lab3;

import isp.lab3.exercise1.Tree;
import org.junit.Assert;
import org.junit.Test;

public class TreeTest {
    
    @Test
    public void testGrow(){
       Tree x = new Tree();
       x.grow(3);
        Assert.assertEquals("Height must be 18",18,x.getHeight());
    }
}
