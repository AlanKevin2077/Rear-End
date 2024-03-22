//基本语法
大小写敏感

如果类名由若干单词组成，那么每个单词的首字母应该大写，例如 MyFirstJavaClass 。

方法名含有若干单词，开头小写，openFire

合法标识符举例：age、$salary、_value、__1_value

标识符是大小写敏感的

   /**
 * 这是一个文档注释示例
 * 它通常包含有关类、方法或字段的详细信息
 */
    
空白行或者有注释的行，Java 编译器都会忽略掉


类包括状态和方法


成员变量：成员变量是定义在类中，方法体之外的变量。这种变量在创建对象的时候实例化。成员变量可以被类中方法、构造方法和特定类的语句块访问。


public class MyClass {
    // 成员变量
    private int memberVar;

    // 构造方法
    public MyClass(int value) {
        memberVar = value; // 在构造方法中初始化成员变量
    }

    // 实例方法
    public void setMemberVar(int value) {
        memberVar = value; // 在方法中访问和修改成员变量
    }

    // 实例方法
    public int getMemberVar() {
        return memberVar; // 在方法中访问成员变量
    }

    // 实例初始化块
    {
        memberVar = 0; // 在初始化块中初始化成员变量
    }
}



在类中，方法体之外，static类型的变量一定是类变量，能被静态方法，构造方法和类名访问（修改或者返回了值也算访问）

public class Counter {
    // 静态变量，用于计数
    private static int count = 0;

    // 构造方法
    public Counter() {
        // 每次创建Counter类的实例时，count都会增加1
        count++;
        System.out.println("当前计数: " + count);
    }

    // 静态方法，用于获取当前计数
    public static int getCount() {
        return count;
    }

    // 静态方法，用于重置计数
    public static void resetCount() {
        count = 0;
    }
}

// 测试类
public class Main {
    public static void main(String[] args) {
        // 创建Counter类的两个实例
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();

        // 访问静态变量（特：方法），即使没有创建Counter类的实例也可以
        System.out.println("当前计数: " + Counter.getCount());

        // 重置计数
        Counter.resetCount();

        // 再次访问静态变量count
        System.out.println("当前计数: " + Counter.getCount());
    }
}

静态变量属于类本身：count 是一个静态变量，它属于 Counter 类，而不是 Counter类的任何特定实例。

通过类名直接访问：在Main类的 main 方法中，我们通过 Counter.getCount()直接访问了 count变量（特：方法），而没有创建 Counter类的实例。

在静态方法中访问：getCount和 resetCount 都是静态方法，它们可以直接访问静态变量 count。

在构造方法中访问：每次创建 Counter 类的实例时，构造方法 Counter 都会被调用，并且 count 的值会增加1。



构造方法的名称必须与类同名，一个类可以有多个构造方法（只是参数不同）这种情况称为构造方法的重载



创建对象需要以下三步：

声明：声明一个对象，包括对象名称和对象类型。

实例化：使用关键字 new 来创建一个对象。

初始化：使用 new 创建对象时，会调用构造方法初始化对象。

//创建一个Puppy对象并使用构造方法实例化对象
Puppy myPuppy = new Puppy( "tommy" );


非静态成员方法

可以访问和修改类的非静态成员变量。
可以调用类中的其他非静态成员方法。
*需要创建类的实例才能调用。


静态成员方法


只能访问和修改类的静态成员变量。
可以调用类中的其他静态成员方法。
*可以直接通过类名调用，无需创建类的实例。
public class Calculator {
  
}
 Calculator.multiply(3, 4); 





















