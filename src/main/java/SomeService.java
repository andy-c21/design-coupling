public class SomeService {
    public String getOutcome(Command command) {
        return "outcomeOf" + command.name();
    }
}
