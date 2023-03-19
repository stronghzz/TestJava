public class Main {
    //冒泡排序
    public static void main(String[] args) {
        MyTools t = new MyTools();
        int[] rr = {10, -2, 15, 2, 3, 5, 20};
        //System.out.println(arr.length);
        t.bubble(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
//Variable 'temp' initializer '0' is redundant
//创建一个类Tools,实现冒泡排序
class MyTools {
    public void bubble(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}