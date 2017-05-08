package lambda;

/**
 * Created by jotaiwan on 8/05/2017.
 */
public class MyFirstLambda {

    private String id;
    private String code;
    private String text;

    public MyFirstLambda() {

    }

    public MyFirstLambda(String id, String code, String text) {
        setId(id);
        setCode(code);
        setText(text);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
