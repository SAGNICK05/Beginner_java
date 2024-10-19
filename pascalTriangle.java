import java.io.*;

public class pascalTriangle {
    public static void main(String[] args) throws IOException {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number of rows");
        int n = Integer.parseInt(obj.readLine());

        int p, c;
        int arr1[] = new int[100];
        int arr2[] = new int[100];
        for (int i = 1; i <= n; i++) {
            p = 0;
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            for (int k = 0; k < i; k++) {
                if (k == 0 || k == i - 1) {
                    System.out.print(1 + " ");
                    arr2[k] = 1;
                } else {
                    c = arr1[p] + arr1[p + 1];
                    System.out.print(c + " ");
                    arr2[k] = c;
                    p++;
                }
            }
            for (int j = 0; j < arr2.length; j++)
                arr1[j] = arr2[j];
            System.out.println();
        }

    }
}
