import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChildrenTest {
    @Test
    public void deveRetornarNomeFamilyFilho() {
        Children children = new Son();
        assertEquals(children.getFamilyName(), "Obi Wan");
    }
    @Test
    public void deveRetornarNomeFamilyFilha() {
        Children children = new Daughter();
        assertEquals(children.getFamilyName(), "Obi Wan");
    }
    @Test
    public void deveRetornarNomeFamilyPai() {
        Children children = new Dad(new Daughter());
        assertEquals(children.getFamilyName(), "Obi Wan Skywalker");
    }

}
