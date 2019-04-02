import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Aplikasi {
    public static void main(String[] args) {
        List<String> data = new LinkedList<String>();
        data.add("Ayam goreng");
        data.add("Nasi goreng");
        data.add("Telur goreng");
        data.add("Ikan goreng");
        data.add("Goreng goreng");

        System.out.println("data");
        for (String s : data) {
            System.out.println(s);
        }

        Collections.sort(data);
        System.out.println("Setelah di sort");
        for (String s : data) {
            System.out.println(s);
        }

        int res = Collections.binarySearch(data, "Mie goreng");
        System.out.println("migoreng" + res);
        res = Collections.binarySearch(data, "Ikan goreng");
        System.out.println("ikan goreng " + res);
    }
}