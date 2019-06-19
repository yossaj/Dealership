import Components.Engine;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void before(){
        engine = new Engine("Zooter Plus", "Zooter");
    }

    @Test
    public void canGetMake(){
        assertEquals("Zooter Plus", engine.getModel());
    }


}
