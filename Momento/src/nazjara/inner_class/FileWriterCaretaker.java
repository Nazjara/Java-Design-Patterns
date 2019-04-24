package nazjara.inner_class;

public class FileWriterCaretaker {
    private Object object;

    public void save(FileWriterUtil fileWriter) {
        this.object = fileWriter.save();
    }

    public void undo(FileWriterUtil fileWriter) {
        fileWriter.undoToLastSave(object);
    }
}
