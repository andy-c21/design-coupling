import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UpdateCommandTest {

    @Test
    public void hasAllFields() {
        UpdateCommand updateCommand = new UpdateCommand("param");

        assertEquals("param", updateCommand.param());
        assertEquals("Update", updateCommand.name());
    }
}
