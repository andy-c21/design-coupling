public class UpdateCommand extends Command {
    private String param;

    public UpdateCommand(String param) {
        this.param = param;
    }

    public String name() {
        return "Update";
    }

    public String param() {
        return param;
    }
}
