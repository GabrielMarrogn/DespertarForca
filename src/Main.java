import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int l = sc.nextInt();
        int linha = 0;
        int coluna = 0;

        int[][] arr = new int[a][l];

        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr[i].length; k++) {
                int entrada = sc.nextInt();
                arr[i][k] = entrada;

            }
        }

        for (int i = 1; i < arr.length - 1; i++) {
            for (int k = 1; k < arr[i].length - 1; k++) {
                if (arr[i][k] == 42) {
                    if ((arr[i - 1][k - 1] == 7) && (arr[i - 1][k] == 7) && (arr[i - 1][k + 1] == 7)
                            && (arr[i + 1][k - 1] == 7) && (arr[i + 1][k]) == 7 && (arr[i + 1][k + 1] == 7)
                            && (arr[i][k - 1] == 7) && (arr[i][k + 1] == 7)) {
                        linha = i + 1;
                        coluna = k + 1;
                    }

                }

            }
        }

        sc.close();

        System.out.println(linha + " " + coluna);

    }
}