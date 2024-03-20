//创建一个scanner对象，它会从标准输入（通常是键盘）读取数据。
//nexLline();方法会读取一行文本，直到遇到换行符。
import Package_Name.Class_Address

public class Main {
    public static void main(String[] args) {
        system.out.print("请输入一些文本: ");
        Scanner scanner = new Scanner(System.in );
        string input = scanner.nexLline();
        system.out.println("你输入的是: " + input);
        scanner.close();  //释放系统资源
    }
}




   //让用户输入一个0到9之间的整数，你可以这样使用nextInt(10)

Scanner scanner = new Scanner(System.in );
int number = scanner.nexIint(10);
