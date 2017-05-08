package lambda;

import sun.security.mscapi.KeyStore;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by jotaiwan on 8/05/2017.
 */
public class _lambdaPractice {

    public static void main(String[] args) {
        goMyLabmdaMap1();
    }

    private static void goMyLabmdaMap1() {
        Map<String, Map<String, List<MyFirstLambda>>> lambdas = createMyLambdaMaps();

        Map<String, List<MyFirstLambda>> listLambdas = new HashMap<>();
//        listLambdas.entrySet().stream().flatMap()

        lambdas.entrySet().stream().flatMap(x -> x.getValue().values().stream()).collect(Collectors.toList());
//                .collect(Collectors.toMap(Map.Entry::getKey, e->new ArrayList<>()).groupingBy(Map.Entry::getKey, Function.identity()));

//        lambdas.entrySet().stream().flatMap(l -> l.getValue().values().stream()).collect(Collectors.groupingBy(Map.Entry::getKey));

//        lambdas.entrySet().stream().flatMap(e -> Stream.of(e.getValue().values())).collect(Collectors.toList());
//
//        lambdas.entrySet().stream().flatMap(e -> Stream.of(e.getValue().values())).collect(Collectors.toList());
//
//        for (Map.Entry<String, Map<String, List<MyFirstLambda>>> entry : lambdas.entrySet()) {
//            String b = "";
//            List<MyFirstLambda> k = Stream.of(entry.getValue().values()).collect(Collectors.toList());
//        }

        String a = "";
    }

    private static  Map<String, Map<String, List<MyFirstLambda>>> createMyLambdaMaps() {
        Map<String, Map<String, List<MyFirstLambda>>> lambdas = new HashMap<>();

        for (int i = 1; i <= 3; i++) {
            lambdas.put("s"+i, createMyLambdas("s"+i));
        }
        return lambdas;
    }

    private static Map<String, List<MyFirstLambda>> createMyLambdas(String id) {
        Map<String, List<MyFirstLambda>> lambdas = new HashMap<>();

        List<MyFirstLambda> listLambdas = new ArrayList<>();
        MyFirstLambda listLambda1 = new MyFirstLambda(id, "p1", "c1");
        MyFirstLambda listLambda2 = new MyFirstLambda(id, "p2", "c2");
        MyFirstLambda listLambda3 = new MyFirstLambda(id, "p3", "c3");

        lambdas.put("p1", Arrays.asList(new MyFirstLambda(id, "p1", "c1")));
        lambdas.put("p2", Arrays.asList(new MyFirstLambda(id, "p2", "c2")));
        lambdas.put("p3", Arrays.asList(new MyFirstLambda(id, "p3", "c3")));
        return lambdas;
    }
}
