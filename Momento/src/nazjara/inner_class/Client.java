package nazjara.inner_class;

public class Client {

    public static void main(String[] args) {
        FileWriterCaretaker caretaker = new FileWriterCaretaker();
        FileWriterUtil fileWriterUtil = new FileWriterUtil("data.txt");

        System.out.println("Writing first set of data");
        fileWriterUtil.write("First set of data");
        System.out.println(fileWriterUtil);
        System.out.println("------------------------------------");

        System.out.println("Saving progress");
        caretaker.save(fileWriterUtil);
        System.out.println("------------------------------------");

        System.out.println("Writing second set of data");
        fileWriterUtil.write("\nSecond set of data");
        System.out.println(fileWriterUtil);
        System.out.println("------------------------------------");

        System.out.println("Restoring state");
        caretaker.undo(fileWriterUtil);
        System.out.println("------------------------------------");
        System.out.println(fileWriterUtil);
    }
}
