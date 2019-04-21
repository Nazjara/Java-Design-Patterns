package nazjara;

public class CloseFileCommand implements Command {
    private FileSystemReceiver fileSystemReceiver;
    // store previous state for undo command

    public CloseFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        // save previous state for undo command
        fileSystemReceiver.closeFile();
    }
}
