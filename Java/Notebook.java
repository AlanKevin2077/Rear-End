               //关键字
               
@Override  
//覆写，接入接口的类或继承父类的子类，对他们的上一级进行修改

interface  
//接口，只定义方法，方法里没有算法
//例：武器有开火和换弹2种方法
           
implements 
//接入接口，写在具体的实例（AK47）的声明中，然后通过覆写修改方法

extends    
//继承，存在于子类的声明中，public a extends b

super(name);
//调用父类参数名为name的方法，父，子，super（三者参数要一致）

this.name=name 
//this.name来指代传入的形参


import java.util.Scanner;   
//导入java.util包中的Scanner类


Object 
//是所有Java类的父类,（除了基本数据类型定义的）可以直接这样写Object obj = 基本数据类型或者其他类的方法

final   
//修饰常量，在程序运行时是不能被修改的
        final double PI = 3.1415927;
        
        

        








                                        //方法

equals


          //字符串的常用方法
          
 //字符串方法是静态方法，而不是某个实例的方法。这意味着您应该直接调用它们，而不是创建实例调用它们。

.compareTo()
//比较这两个字符串的字典顺序 /*调用对象（this）小于参数对象，返回负整数
                  大于返回正整数
                  等于返回0*/
                  
//用法：a.compareTo(b)   a ， b一般均为字符串类型变量 ，b位置还可以是获取对象值的方法 objStr.toString()
  
  
                  
.lastIndexOf("")        //一个字符串在另一个字符串中最后出现的位置0123456这样开始数
  //用法：int a = b.lastIndexOf("Runoob");  a保存返回值，b为字符串类型变量


.substring(7, 12); // 从索引7开始到索引11结束                  
 //用法：删除一个字符 return s.substring(0, pos) + s.substring(pos + 1);  返回字符区间索引为[0,pos)U[pos+1,字符串末尾]
 // 删除一个字符后所有字符 return s.substring(0, pos)   返回字符区间索引为[0,pos)  
 
 
 
 
 
                  
           //数组方法
           
           
java.util.Arrays类能方便地操作数组，它提供的所有方法都是静态的 

           导入方法并使用           
import java.util.Arrays;
//用Arrays类的sort方法对自定义数组array进行升序排序。
Arrays.sort(array);
int index Arrays.binarySearch(array, 2);
        System.out.println("元素 2  在第 " + index + " 个位置");

数组变量.length
//获取数组长度，a[3] 长度为3
           
           
           
           
           
  值的来源–变量 变量.方法  对象.方法             
                  
  使用import导入类时，必须创建一个类对象才能使用这个类的方法
  
  
  
                  
 在表达式MyClass obj = new MyClass();中：                 
 MyClass 是对象的类型，而 obj 是引用这个新创建对象的变量。new MyClass()是创建对象的动作。                 
                  
                  
                  
-1是一个特殊的返回值，用来指示搜索失败或子字符串不存在于字符串中。


访问变量–讲变量赋值，返回变量，修改变量


                 继承
 /* Child 类继承了 Parent 类，并且重写了 show 方法。当我们创建 Child 类的实例并调用 show 方法时，将会执行Child 类中重写后的 show 方法。

  继承的主要好处是它可以帮助我们减少代码重复，并且可以建立类之间的层次关系，使得代码更加组织化和模块化。通过继承，我们可以创建一个通用的父类，然后在子类中实现更具体的行为。*/

// 父类
class Parent {
    // 父类的成员变量
    protected String name;

    // 父类的构造方法
    public Parent(String name) {
        this.name = name;
    }

    // 父类的方法
    public void show() {
        System.out.println("这是父类的show方法，名字是：" + name);
    }
}

// 子类
class Child extends Parent {
    // 子类的构造方法，可以调用父类的构造方法
    public Child(String name) {
        super(name); // 调用父类的构造方法
    }

    // 子类可以重写父类的方法
    @Override
    public void show() {
        System.out.println("这是子类的show方法，名字是：" + name);
    }
}

// 测试代码
public class Main {
    public static void main(String[] args) {
        Child child = new Child("小明");
        child.show(); // 输出：这是子类的show方法，名字是：小明
    }
}






               Object类
//obj变量是一个Object类型的引用，它指向一个 String 对象。
Object obj = new String("Hello, World!");

//向下转型使用特定类的方法
String str = (String) obj; // 向下转型为String类型
System.out.println(str.length()); // 现在可以调用String类的length()方法



             switch穿透应用
//1 2 3都是苹果          
Mth mth = new Mth() //方法定义在另外一个类创建实例调用非静态函数            
switch(num)
case 1:
case 2:
case 3:mth.function();
  break;
  
    
  






