package nazjara.inner_class;

public class FileWriterUtil {
    private String filename;
    private StringBuilder content;

    public FileWriterUtil(String filename) {
        this.filename = filename;
        this.content = new StringBuilder();
    }

    @Override
    public String toString() {
        return this.content.toString();
    }

    public void write(String s) {
        content.append(s);
    }

    // save object's state in momento
    public Momento save() {
        return new Momento(this.filename, this.content);
    }

    // restore object's state
    public void undoToLastSave(Object o) {
        Momento momento = (Momento) o;
        this.filename = momento.filename;
        this.content = momento.content;
    }

    private class Momento {
        private String filename;
        private StringBuilder content;

        public Momento(String filename, StringBuilder content) {
            this.filename = filename;
            this.content = new StringBuilder(content);
        }
    }
}
