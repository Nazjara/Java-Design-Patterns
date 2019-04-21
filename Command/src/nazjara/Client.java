package nazjara;

public class Client {

    public static void main(String[] args) {
        FileSystemReceiver fileSystemReceiver = FileSystemReceiverUtil.getUnderlyingFileSystem();

        OpenFileCommand openFileCommand = new OpenFileCommand(fileSystemReceiver);
        FileInvoker invoker = new FileInvoker(openFileCommand);
        invoker.execute();

        System.out.println("-------------------------------------------------------");

        WriteFileCommand writeFileCommand = new WriteFileCommand(fileSystemReceiver);
        invoker = new FileInvoker(writeFileCommand);
        invoker.execute();

        System.out.println("-------------------------------------------------------");

        CloseFileCommand closeFileCommand = new CloseFileCommand(fileSystemReceiver);
        invoker = new FileInvoker(closeFileCommand);
        invoker.execute();
    }
}
