public abstract class BaseController {

    private SomeService someService;
    private CommandFactory commandFactory;

    public BaseController(SomeService someService, CommandFactory commandFactory) {
        this.someService = someService;
        this.commandFactory = commandFactory;
    }

    public String doSomething(String param) {
        Command command = commandFactory.build(param);

        return someService.getOutcome(command);
    }
}
