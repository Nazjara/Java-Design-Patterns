package nazjara;

public class OpenFileCommand implements Command {
    private FileSystemReceiver fileSystemReceiver;
    // store previous state for undo command

    public OpenFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        // save previous state for undo command
        fileSystemReceiver.openFile();
    }
}
