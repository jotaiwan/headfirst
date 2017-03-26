package chapter08;

/**
 * Created by jotaiwan on 26/03/2017.
 */
public class BuzzwordsReport extends Report {
    void runReport() {
        super.runReport();
        buzzwordCompliance();
        printReport();
    }

    void buzzwordCompliance() {
        System.out.println("Buzzword Compliance");
    }
}
