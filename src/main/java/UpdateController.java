public class UpdateController extends BaseController {

    private CommandFactory commandFactory;

    public UpdateController(SomeService someService) {
        super(someService, new UpdateCommandFactory());
        this.commandFactory = new UpdateCommandFactory();
    }
}
