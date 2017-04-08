package chapter08;

/**
 * Created by jotaiwan on 26/03/2017.
 */
public abstract class Report {
    void runReport() {
        // setup report
        System.out.println("Setup report");
    }
    void printReport() {
        // generate report
        System.out.println("Generate report");
    }
}
