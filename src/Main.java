import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
class Arraylist {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> g = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Input jumlah data yang akan di proses: ");
        int u = Integer.parseInt(reader.readLine());

        int counters;
        for (int index = 0; index < u; index++) {
            System.out.print("Masukkan Rana counter: ");
            String name = reader.readLine();
            counters = CountWords(name);

            System.out.print("Huruf Yang Akan Dihitung: ");
            char s = reader.readLine().charAt(0);

            int result = CountOccurrences(name, s);
            g.add(result);
        }

        System.out.print("Hasil: ");
        for (int count : g) {
            System.out.print(count + " ");
        }
    }

    public static int CountWords(String str) {
        String[] words = str.split("\\s+");
        return words.length;
    }

    public static int CountOccurrences(String str, char ch) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == ch) {
                count++;
            }
        }
        return count;
    }
}