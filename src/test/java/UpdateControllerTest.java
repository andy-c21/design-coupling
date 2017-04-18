import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class UpdateControllerTest {

    UpdateController someController = new UpdateController(new SomeService());

    @Test
    public void controllerDestWhatItShouldDo() {
        // given
        String param = "param1";

        // when
        String result = someController.doSomething(param);

        // then
        assertEquals("outcomeOfUpdate", result);
    }
}
