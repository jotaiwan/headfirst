package chapter18;
import javax.swing.*;
import java.io.*;

/**
 * Created by jotaiwan on 29/04/2017.
 */
public interface Service extends Serializable { 
    public JPanel getGuiPanel();
}