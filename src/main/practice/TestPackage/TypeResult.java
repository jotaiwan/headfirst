package practice.TestPackage;

/**
 * Created by jotaiwan on 5/04/2017.
 */
public class TypeResult {
    private String text;
    private String result;

    public TypeResult(String text, String result) {
        this.text = text;
        this.result = result;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
