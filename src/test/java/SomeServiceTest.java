import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SomeServiceTest {

    @Test
    public void shouldDoUpdateCommand() {
        SomeService someService = new SomeService();

        String outcome = someService.getOutcome(new UpdateCommand("param"));

        assertEquals("outcomeOfUpdate", outcome);
    }
}
