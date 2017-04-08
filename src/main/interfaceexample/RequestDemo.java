package interfaceexample;

/**
 * Created by jotaiwan on 25/03/2017.
 */
public class RequestDemo {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            int n = (int) (Math.random() * 10) % 2; // random
            switch (n) {
                case 0:
                    doRequest(new HelloRequest("Hello Request"));
                    break;
                case 1:
                    doRequest(new WelcomeRequest("Welcome request"));
            }
        }
    }

    public static void doRequest(IRequest request) {
        request.execute();
    }
}
