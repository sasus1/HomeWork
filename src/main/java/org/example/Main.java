//1
public class HomeWork1 {
    public static void main (String [] args)
    public static void printThreeWords() {
    System.out.println("Orаnge");
    System.out.println("Banana");
    System.out.println("Applе");
        }
//2
public static void checkSumSign() {
    int a = 5;
    int b = 1;
    int c = a + b;
    if (c >= 0)
    {
        System.out.println("Cумма положительная");
    }
    else
    {
        System.out.println("Cумма отрицательная");
    }
}
//3
public static void printCol() {
    int value = 101;
    if (value <=0)
    {
        System.out.println("Крacный");
    } if (value>0 && value<100)
    {
        System.out.println("Желтый");
    } if (value>100)
    {
        System.out.println("Зеленый");
    }
}
//4
public static void compareNumbers()
{
    int a = 5;
    int b = 7;
    if  (a>=b)
    {
        System.out.println("а>=b");
    }
    if (a<b)
    {
        System.out.println("а<b");
    }
}

}
//5
public static boolean expressionCheck(int a, int b) {
    return a >= 10 && b <= 20;
//6
    public static void checkPositiveNegative(int a) {

        System.out.println(a >= 0 ? "Positive/n" : "Negative/n");
    }
//7
    public static boolean checkNegative(int a)
    {

        return a < 0;
    }
//8
    public static void printWordNTimes(String str, int n){
        for (int i = 1; i <= n; i++){
            System.out.println("[" + i + "]" + str);
        }
    }
//9
    public static boolean checkLeapYear (int year){
        if (year % 400 == 0){
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }

    }
//10
public static void invertArrayVar1(int[] arr) {
    for (int i = 0; i < arr.length; i++)
    {
        arr[i] = (arr[i] == 1) ? 0 : 1;
    }
}
//11

//12
int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
for (int i = 0; i < array.length; i++)
{
        if (array[i] < 6)
        {
array[i] *= 2;
        }
        }
//13
public static void fillDiagonal1(int[][] arr)
    {
    for (int i = 0; i < arr.length; i++)
    {
        for (int j = 0, z = arr.length - 1; j < arr.length; j++, z--)
        {
            if (i == j || i == z) {
                arr[i][j] = 1;
            } else {
                arr[i][j] = 0;
            }
        }
    }