package nazjara;

public class WriteFileCommand implements Command {
    private FileSystemReceiver fileSystemReceiver;
    // store previous state for undo command

    public WriteFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        // save previous state for undo command
        fileSystemReceiver.writeFile();
    }
}
