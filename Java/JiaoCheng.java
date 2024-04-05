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



            源文件声明规则

如果你有两个类ClassA和ClassB在同一个源文件中，你不能一个类放在package com.example下，另一个类放在package com.other下。它们都必须在同一个包下，或者没有包声明。      
// 正确的做法，两个类都在同一个包下
package com.example;

public class ClassA {
    // 类的内容
}

public class ClassB {
    // 类的内容
}

// 或者没有包声明
public class ClassC {
    // 类的内容
}




非静态内部类是一个类中嵌套着另外一个类。 它有访问外部类成员的权限， 通常被称为内部类。
由于内部类嵌套在外部类中，因此必须首先实例化外部类，然后创建内部类的对象来实现。

class OuterClass {
int x = 10;

 class InnerClass {
 int y = 5;
}
}

public class MyMainClass {
 public static void main(String[] args) {
OuterClass myOuter = new OuterClass();
 OuterClass.InnerClass myInner = myOuter.new InnerClass();
System.out.println(myInner.y + myOuter.x);
 }
}


静态内部类可以使用static关键字定义，静态内部类我们不需要创建外部类来访问，可以直接访问
class OuterClass {
int x = 10;

static class InnerClass {
int y = 5;
  
}
}

public class MyMainClass {
public static void main(String[] args) {
OuterClass.InnerClass myInner = new OuterClass.InnerClass();
 System.out.println(myInner.y);
}
}




    静态内部类访问外部类的静态成员和非静态成员

public class OuterClass {
    // 非静态成员变量
    private int nonStaticVar = 10;
    
        // 静态成员变量
    private static int staticVar = 20;


    // 静态内部类
    public static class StaticInnerClass {
        public void accessMembers() {
          
          //通过外部类的实例来访问非静态成员变量
            OuterClass outer = new OuterClass();
            System.out.println(ou.nonStaticVar );
            
        //直接访问静态成员变量，这是允许的
            System.out.println(staticVar);

        }
    }
}



如果你不希望内部类被外部类访问可以使用private修饰符





            基本数据类型
\r  回车


局部变量在声明时需要初始化，否则会导致编译错误。
public void exampleMethod() {
    int localVar = 10; // 局部变量
    // ...
}



实例变量（成员变量）属于类的实例，每个类的实例都有自己的副本，如果不明确初始化，实例变量会被赋予默认值（数值类型为0，boolean类型为false，对象引用类型为null）
public class ExampleClass {
    int instanceVar; // 实例变量
}


静态变量或者类变量有static属于类。静态变量是与类相关的，因此可以通过类名来访问静态变量，也可以通过实例名来访问静态变量，静态变量是属于类的，它被所有该类的实例共享。
public class ExampleClass {
  public static int count; // 类变量
}
MyClass.count = 10; // 通过类名访问
MyClass obj = new MyClass();
obj.count = 20; // 通过实例名访问


count1 要先于 count2初始化，否则编译时会报错。
public class MyClass {
public static int count1 = 0;
public static int count2 = count1 + 1;
// 其他成员变量和方法
}
 
 
        
通过引用传递，我们可以在方法内部改变对象的状态。
public class Example {
    private String value;

    public Example(String value) {
        this.value = value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static void main(String[] args) {
        Example obj= new Example("Original Value");
        System.out.println("Before method call: " + obj.getValue());

        changeValue(obj);

        System.out.println("After method call: " + obj.getValue());
    }
    
//在这个例子里，当你调用 changeValue 方法并传递一个 Example 类型的对象时，你实际上是在传递一个引用给这个方法，这样方法内部就可以通过这个引用来修改对象的状态。
    public static void changeValue(Example obj) {
        obj.setValue("New Value");
    }
}

常量和静态变量的区别
都是与类相关，常量不能改，静态变量可以更改


静态变量的访问权限与实例变量不同，因为静态变量是与类相关的，不依赖于任何实例。


静态变量通常用于以下场景：

存储全局状态或配置信息
计数器或统计信息
缓存数据或共享资源
工具类的常量或方法
单例模式中的实例变量


//staticVariable是一个静态变量，它不需要在构造器中重新定义。
public class MyClass {
    // 静态变量
    public static int staticVariable = 10;

    // 构造器
    public MyClass() {
        // 这里不需要重新定义静态变量
    }
}



类名用大写字母开头，其他的小写开头





            访问修饰符
            
            private
            
类和接口不能声明为 private

//声明为私有访问类型的变量只能通过类中公共的 getter 方法被外部类访问。
public class Logger {
   private String format;
   public String getFormat() {
      return this.format;
   }
   public void setFormat(String format) {
      this.format = format;//this.format＝成员变量format
   }
}

Java 程序的 main() 方法必须设置成公有的，否则，Java 解释器将不能运行该类。





             protected

package derived;
import base.BaseClass;//导入base包的类
public class DerivedClass extends BaseClass {
    public void accessProtectedMethod() {
        protectedMethod(); // 子类可以访问基类的受保护方法
    }
}


protected 可以修饰数据成员，构造方法，方法成员，不能修饰类（内部类除外）。接口及接口的成员变量和成员方法不能声明为 protected

             访问控制和继承
请注意以下方法继承的规则：
父类中声明为 public 的方法在子类中也必须为 public。

父类中声明为 protected 的方法在子类中要么声明为 protected，要么声明为 public，不能声明为 private。

父类中声明为 private 的方法，不能够被子类继承。
       
   
   
       
             非访问修饰符
               static
静态变量也被称为类变量。局部变量不能被声明为
static 变量

静态方法无法通过非静态类变量访问

对静态变量和静态方法的访问可以直接使用 类名.静态变量 和 类名.静态方法 的方式访问。



               final
被final修饰的变量一旦赋值后，不能被重新赋值

public class Test{
  final int value = 10;
  // 下面是声明常量的实例
  public static final int BOXWIDTH = 6;
  static final String TITLE = "Manager";
 
  public void changeValue(){
     value = 12; //将输出一个错误
  }
}

父类中的 final方法可以被子类继承，但是不能被子类重写。

final 类不能被继承，没有类能够继承final类的任何特性。

       
       
             abstract
       
抽象类不能用来实例化对象，声明抽象类的唯一目的是为了将来对该类进行扩充。

有抽象类方法该类必须为抽象类

抽象方法是一种没有任何实现的方法，该方法的具体实现由子类提供

任何继承抽象类的子类必须实现父类的所有抽象方法，除非该子类也是抽象类。

public abstract class SuperClass{
    abstract void m(); //抽象方法
}
 
class SubClass extends SuperClass{
     //实现抽象方法
      void m(){
          .........
      }
}




             Java运算符
             
             
        条件运算符也被称为三元运算符             
// 如果 a 等于 1 成立，则设置 b 为 20，否则为 30
b = (a == 1) ? 20 : 30;


            运算符优先级
同级从左到右，条件和赋值的从右往左


            Java 循环结构 
            
             while 循环
while( 布尔表达式 ) {
  //循环内容
}  


public class Test {
   public static void main(String[] args) {
      int x = 10;
      while( x < 20 ) {
         System.out.print("value of x : " + x );
         x++;
         System.out.print("\n");
      }
   }
}


            do…while 循环

do {
       //代码语句
}while(布尔表达式);


              for循环
for(初始化; 布尔表达式; 更新) {
    //代码语句
}

             增强 for 循环（数组专用）
for(声明语句 : 表达式)
{
   //代码句子
}

int [] numbers = {10, 20, 30, 40, 50};
 
      for(int x : numbers ){
         System.out.print( x );
         System.out.print(",");
      }
      
      
             continue
             
for循环从 1 迭代到10。在每次迭代中，程序检查当前的数字i 是否为3。如果是3执行continu语句，这将导致循环立即跳到下一个迭代4并且忽略剩余循环体内的代码     
    
    
    
       Java Number & Math 类
所有的包装类（Integer、Long、Byte、Double、Float、Short）都是抽象类 Number 的子类。

// 原始字符 'a' 装箱到 Character 对象 ch 中
Character ch = 'a';
// 原始字符 'x' 用 test 方法装箱
// 返回拆箱的值到 'c'
char c = test('x');



Math 的方法都被定义为 static 形式，通过 Math 类可以在主函数中直接调用

 Math.ceil(num);  



            Java String 类
            




             Java 条件语句
if(布尔表达式 1){
   //如果布尔表达式 1的值为true执行代码
}else if(布尔表达式 2){
   //如果布尔表达式 2的值为true执行代码
}else if(布尔表达式 3){
   //如果布尔表达式 3的值为true执行代码
}else {
   //执行false
}


if嵌套，多级选择


           Java switch case 语句
           
switch(expression){
    case value :
       //语句
       break; //可选
    case value :
       //语句
       break; //可选
    //你可以有任意数量的case语句
    default : //显示不属于以上情况
       //语句
}           
      
              Java数组
              
              

array[3]  array.length为3  实际[0][1][2]没有三   


        使用new操作符来创建数组
//方法一
int size=10;
//数组变量的声明和创建数组
String [] array1=new String[size];
myList[0] = 5.6;
myList[1] = 4.5;
myList[2] = 3.3;

//方法二
String []array1 ={"jzjj"，"hshh"};

//创建了一个二维数组s，它有两行，但是每行的长度是未指定的（没有列行的长度不确定）
String[][] s = new String[2][];
//这行代码相当于创建列为第一行分配了两个字符串空间
s[0] = new String[2];
s[1] = new String[3];
s[0][0] = new String("Good");
s[0][1] = new String("Luck");
s[1][0] = new String("to");
s[1][1] = new String("you");
s[1][2] = new String("!");
       
       
       
       
       
       




            
























