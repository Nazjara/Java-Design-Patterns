package nazjara.class_adapter;

public class Client {

    public static void main(String[] args) {
        ClassAdapter classAdapter = new ClassAdapter();
        System.out.println(classAdapter.getInteger());

        ObjectAdapter objectAdapter = new ObjectAdapter(new IntegerValue());
        System.out.println(objectAdapter.getInteger());
    }
}
