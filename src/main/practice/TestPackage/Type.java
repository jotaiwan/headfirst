package practice.TestPackage;

/**
 * Created by jotaiwan on 5/04/2017.
 */
public enum Type {
    TYPE_QA("Noway"),
    TYPE_QB("Noway"),
    TYPE_QC("QC");


    private String text;

    Type(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public String getName() {
        return name();
    }

    public static Type of(String text) {
        return text != null ? Type.valueOf(text) : null;
    }
}