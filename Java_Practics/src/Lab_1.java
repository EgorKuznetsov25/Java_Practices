import java.util.Scanner;

public class Lab_1 {
    public static void main(String[] args) {
        // 1 Задание:
        System.out.println("1.1: " + fraction(5.25));
        System.out.println("1.2: " + sumLastNums(4568));
        System.out.println("1.6: " + isUpperCase('D'));
        System.out.println("1.7: " + islnRange(5, 1, 3));
        System.out.println("1.10: " + lastNumSum(lastNumSum(lastNumSum(lastNumSum(5, 11), 123), 14), 1));
        System.out.println();

        // 2 Задание:
        System.out.println("2.1: " + abs(-5));
        System.out.println("2.4: " + makeDecision(25, 233));
        System.out.println("2.5: " + max3(123, 45, 67));
        System.out.println("2.8: " + age(12));
        System.out.println("2.9: " + day(123));
        System.out.println();

        // 3 Задание:
        System.out.println("3.2: " + reverseListNums(5));
        System.out.println("3.3: " + chet(9));
        System.out.println("3.7:");
        square(4);
        System.out.println("3.8:");
        leftTringle(4);
        System.out.println("3.10:");
        guessGame();
        System.out.println();

        // 4 Задание:
        int[] arr = {1, -2, -7, 4, 2, 2, 5};
        System.out.print("Задание 3: ");
        System.out.println(maxAbs(arr));

        int[] arr4 = {1, 2, 3, 4, 5};
        int[] res4 = add(arr4, 9, 3);
        System.out.print("Задание 4: ");
        printArray(res4);

        int[] arr5 = {1, 2, 3, 4, 5};
        int[] ins = {7, 8, 9};
        int[] res5 = add(arr5, ins, 3);
        System.out.print("Задание 5: ");
        printArray(res5);

        int[] arr6 = {1, 2, 3, 4, 5};
        reverse(arr6);
        System.out.print("Задание 6: ");
        printArray(arr6);

        int[] arr9 = {1, 2, 3, 8, 2, 2, 9};
        int[] res9 = findAll(arr9, 2);
        System.out.print("Задание 9: ");
        printArray(res9);


    }

    static double fraction(double x) {
        return x - (int) x;
    }

    static public int sumLastNums(int x) {
        int p = x % 10;
        int b = x / 10;
        int pr = b % 10;
        return p + pr;
    }

    static public boolean isUpperCase(char x) {
        return x >= 'A' && x <= 'Z';
    }

    static public boolean islnRange(int a, int b, int num) {
        boolean y = (a <= num && num <= b) || (a >= num && num >= b);
        return y;
    }

    static public int lastNumSum(int a, int b) {
        return (a % 10) + (b % 10);
    }


    static public int abs(int x) {
        if (x < 0) {
            return -x;
        } else {
            return x;
        }
    }

    static public String makeDecision(int x, int y) {
        if (x > y) {
            return x + ">" + y;
        } else if (x < y) {
            return x + "<" + y;
        } else {
            return x + "=" + y;
        }
    }

    static public int max3(int x, int y, int z) {
        int max = x;
        if (y > max) {
            max = y;
        }
        if (z > max) {
            max = z;
        }
        return max;
    }

    static public String age(int x) {
        if (x % 10 == 1 && x != 11) {
            return x + " год";
        } else if ((x % 10 == 2 || x % 10 == 3 || x % 10 == 4) && (x != 12 && x != 13 && x != 14)) {
            return x + " года";
        } else {
            return x + " лет";
        }
    }

    static public String day(int x) {
        switch (x) {
            case 1:
                return "понедельник";
            case 2:
                return "вторник";
            case 3:
                return "среда";
            case 4:
                return "четверг";
            case 5:
                return "пятница";
            case 6:
                return "суббота";
            case 7:
                return "воскресенье";
            default:
                return "Это не день недели";
        }
    }

    static public String reverseListNums(int x) {
        String res = "";
        for (int i = x; i > 0; i--) {
            res = res + i + " ";
        }
        return res;
    }

    static public String chet(int x) {
        String res = "";
        for (int i = 0; i <= x; i += 2) {
            res = res + i + " ";
        }
        return res;
    }

    static public void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    static public void leftTringle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    static public void guessGame() {
        Scanner h = new Scanner(System.in);
        int sicret = (int) (Math.random() * 10);
        for (int i = 1; i <= 10; i++) {
            System.out.println("Ведите число от 0 до 9: ");
            int hislo = h.nextInt();
            if (hislo == sicret) {
                System.out.println("Вы угадали!");
                System.out.print("Вы отгадали число за " + i + " попытки(у)");
                return;
            } else {
                System.out.println("Вы не угадали");
            }

        }
    }

    public static int maxAbs(int[] arr) {
        int maxE = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i]) > Math.abs(maxE)) {
                maxE = arr[i];
            }
        }
        return maxE;
    }

    public static int[] add(int[] arr, int x, int pos) {
    int[] res = new int[arr.length + 1];
    for (int i = 0; i < pos; i++) {
        res[i] = arr[i];
    }
    res[pos] = x;
    for (int i = pos; i < arr.length; i++) {
        res[i + 1] = arr[i];
    }
    return res;
}

    // Задание 5: вставить массив ins в позицию pos
    public static int[] add(int[] arr, int[] ins, int pos) {
        int[] res = new int[arr.length + ins.length];
        for (int i = 0; i < pos; i++) {
            res[i] = arr[i];
        }
        for (int i = 0; i < ins.length; i++) {
            res[pos + i] = ins[i];
        }
        for (int i = pos; i < arr.length; i++) {
            res[i + ins.length] = arr[i];
        }
        return res;
    }

    // Задание 6: развернуть массив на месте
    public static void reverse(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    // Задание 9: найти все индексы вхождений x
    public static int[] findAll(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) count++;
        }
        int[] res = new int[count];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                res[idx] = i;
                idx++;
            }
        }
        return res;
    }


    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}