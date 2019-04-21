package nazjara;

public class FileSystemReceiverUtil {

    public static FileSystemReceiver getUnderlyingFileSystem() {
        String osName = System.getProperty("os.name");
        System.out.println("Operating System: " + osName);

        if(osName.contains("Windows")) {
            return new WindowsFileSystemReceiver();
        } else  {
            return new UnixFileSystemReceiver();
        }
    }
}
