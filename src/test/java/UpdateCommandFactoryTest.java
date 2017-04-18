import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UpdateCommandFactoryTest {

    @Test
    public void shouldCreateUpdateCommand() {
        UpdateCommandFactory commandFactory = new UpdateCommandFactory();

        Command command = commandFactory.build("anyparam");

        assertTrue(command instanceof UpdateCommand);
        assertEquals("anyparam", ((UpdateCommand)command).param());
    }
}
