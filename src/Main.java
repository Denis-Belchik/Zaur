import generics.Generics;

public class Main {
    public static void main(String[] args) {
        Generics<String> test = new Generics<>();
//        for (int i = 0; i < 101; i++) {
//            System.out.println("test.add(\" \" + " + i + ") = " + test.add("a"));
//        }
        test.add("0");
        test.add("1");
        test.add("2");
        test.add("3");
        System.out.println("test.size() = " + test.size());
//        test.remove(4);
        test.add("4",3);

        for (int i = 0; i < test.size(); i++) {
            System.out.println(test.get(i));
        }

    }
}