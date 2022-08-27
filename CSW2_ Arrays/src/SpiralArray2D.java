import java.util.ArrayList;

public class SpiralArray2D {

    public static void printSpiral(ArrayList<ArrayList> mat) {
        int i, k = 0, l = 0;
        int lastrow = mat.size() - 1;
        int lastcol = mat.get(0).size() - 1;
        while (k <= lastrow && l <= lastcol) {
            for (i = l; i <= lastcol; i++)
                System.out.print(mat.get(k).get(i) + " ");
            k++;
            for (i = k; i <= lastrow; i++)
                System.out.print(mat.get(i).get(lastcol) + " ");
            lastcol--;
            if (k <= lastrow) {
                for (i = lastcol; i >= l; i--)
                    System.out.print(mat.get(lastrow).get(i) + " ");
                lastrow--;
            }
            if (l <= lastcol) {
                for (i = lastrow; i >= k; i--)
                    System.out.print(mat.get(i).get(l) + " ");
                l++;
            }
        }
    }

    public static void printArray(ArrayList<ArrayList> mat) {
        mat.forEach((row) -> {
            row.forEach((elem) -> {
                System.out.print(elem + " ");
            });
            System.out.println();
        });

    }

    public static void main(String[] args) {
        int x = 4, y = 4;
        ArrayList<ArrayList> mat = new ArrayList<ArrayList>();
        int counter = 1;
        for (int i = 0; i < x; i++) {
            ArrayList temp = new ArrayList<>();
            for (int j = 0; j < y; j++) {
                temp.add(counter++);
            }
            mat.add(temp);
        }
        printArray(mat);
        System.out.println("Spiral: ");
        printSpiral(mat);
        System.out.println("\nCharacter: \n");
        mat = new ArrayList<ArrayList>();
        counter = 0;
        for (int i = 0; i < x; i++) {
            ArrayList temp = new ArrayList<>();
            for (int j = 0; j < y; j++) {
                temp.add((char) (97 + counter++));
            }
            mat.add(temp);
        }
        printArray(mat);
        System.out.println("Spiral: ");
        printSpiral(mat);
    }
}