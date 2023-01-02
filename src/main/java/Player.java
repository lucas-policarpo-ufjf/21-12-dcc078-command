import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Command> commands = new ArrayList<Command>();

    public void runCommand(Command command) {
        this.commands.add(command);
        command.run();
    }

    public void cancelLastCommand() {
        if (this.commands.size() == 0)
            return;

        int lastIndex = this.commands.size() - 1;
        Command command = this.commands.get(lastIndex);
        command.cancel();
        this.commands.remove(lastIndex);
    }

}
