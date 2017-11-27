package diplom;

public enum Command {
   CHECKDISKSPACE("checkdiskspace", 0),
    CHECKOPERSPAE("", 1);

    private String commandName;
    private int id;

    Command(String s, int id) {
        this.commandName = s;
        this.id = id;
    }

    public String getCommandName() {
        return commandName;
    }

    public int getId() {
        return id;
    }
}
