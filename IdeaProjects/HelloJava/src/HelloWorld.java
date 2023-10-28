// Tính giai thừa x!
/*
public class HelloWorld {
    public static int FirstFactorial(int num) {
        // code goes here
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(FirstFactorial(s.nextLine()));
    }
}
 */

// Đảo ngược chuỗi ký tự - First Reverse:
/*
public class HelloWorld {
    public static String FirstReverse(String str) {
        // code goes here
        String reverse = "";
        for (int i = str.length()- 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        return reverse;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(FirstReverse(s.nextLine()));
    }
}
 */

// Tìm năm nhuận:
/*
Cách xác định năm nhuận: Những năm chia hết cho 4 là năm nhuận, ngoại trừ những năm chia hết cho 100 mà không chia hết cho 400.
Từ đó, có thể rút gọn thành các quy tắc xác định năm nhuận:
Những năm chia hết cho 4 mà không chia hết cho 100 là năm nhuận
Những năm chia hết cho 100 mà không chia hết cho 400 thì KHÔNG PHẢI là năm nhuận
Những năm chia hết đồng thời cho 100 và 400 là năm nhuận

public class HelloWorld {
    public static void printYear(int n){
        if (n % 4 == 0 && n % 100 !=0 || n % 400 == 0) {
            System.out.println(n + " is Leap year");
        } else {
            System.out.println(n + " is Common year");
        }
    }
    public static void main(String[] args){
        printYear(2000);
        printYear(2100);
        printYear(2012);
        printYear(2013);
    }
}
 */

// Trả về số ngẫu nhiên:
/*
Trong chương trình của bạn, tạo một số ngẫu nhiên trong khoảng từ 0 đến 100. Bạn có năm cơ hội để đoán số ngẫu nhiên là gì.
Đối với mỗi lần thử, nếu câu trả lời của bạn không phải là số ngẫu nhiên, hãy cho biết câu trả lời của bạn lớn hơn hay nhỏ hơn

You have 5 chances to guess.
Input a number: 50
Your answer is bigger, 4 chances left.
Input a number: 25
Your answer is bigger, 3 chances left.
Input a number: 13
Your answer is smaller, 2 chances left.
Input a number: 18
Your answer is smaller, 1 chances left.
Input a number: 22
Your answer is bigger, 0 chances left.
Sorry, you didn't get it, right answer is 20.

import java.util.Scanner;

public class HelloWorld {
    // Function that implements the
    // number guessing game
    public static void guessingNumberGame() {
        // Scanner Class
        Scanner sc = new Scanner(System.in);

        // Generate the numbers
        int number = 1 + (int) (100 * Math.random());

        // Given K trials
        int K = 5;
        int i, guess;
        System.out.println("You have 5 chances to guess");

        // Iterate over K Trials
        for (i = 0; i < K; i++) {
            System.out.println("Guess the number:");
            // Take input for guessing
            guess = sc.nextInt();
            // If the number is guessed
            if (number == guess) {
                System.out.println("Congratulations!" + " You guessed the number.");
                break;
            } else if (number > guess && i != K - 1) {
                System.out.println("Your answer is bigger " + guess + ", " + i + " chances left.");
            } else if (number < guess && i != K - 1) {
                System.out.println("our answer is smaller " + guess + ", " + i + " chances left.");
            }
        }

        if (i == K) {
            System.out.println("You have exhausted " + K + " trials.");
            System.out.println("Sorry, you didn't get it, right answer is " + number);
        }
    }

    // Driver Code
    public static void main(String[] args) {
        // Function Call
        guessingNumberGame();
    }
}
 */

// Kiểm tra email hợp lệ:

// Sắp xếp mảng theo Bubble Sort:
/*
public class HelloWorld {

    // Hàm sắp xếp nổi bọt
    void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] và arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    // In các phần tử của arr
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        HelloWorld ob = new HelloWorld();
        int arr[] = { 5, 1, 4, 2, 8 };
        System.out.println("Mảng ban đầu:");
        ob.printArray(arr);
        ob.bubbleSort(arr);
        System.out.println("Mảng sau khi sắp xếp:");
        ob.printArray(arr);
    }
}
 */

// Access Modifiers:
/*
default: Visible to the package, the default one. No modifiers are needed.
private: Visible only to the defining class.
public: Visible to the Java Universe (all the types). You can access them anywhere.
protected: Visible to the package and all subclasses (even those in other packages).

static: This modifier is used to create variables or methods that will exist independently of any instances of class. Only one copy of the static variable exists for the class regardless of the number of instances created.
final: A final variable can be explicitly initialized only once. A final method cannot be overridden by any subclasses. A class is declared as final to prevent the class from being subclassed.
abstract: An abstract class can never be instantiated. An abstract method is a method declared without any implementation.
synchronized/volatile: The synchronized and volatile modifiers are used in connection with threads.
 */

public class HelloWorld {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.method2();
        cat.method3();
    }
}

class Cat implements myInterface3 {
    // In this class, we must implement the abstract method, or the subclass must stay abstract.
    public void method2() {
        System.out.println("I'm cat, I grow up.");
    }
    public void method3() {
        System.out.println("I'm cat, I grow up.");
    }
}



