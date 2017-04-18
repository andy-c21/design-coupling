public class UpdateCommandFactory extends CommandFactory {

    public Command build(String param) {
        return new UpdateCommand(param);
    }
}
