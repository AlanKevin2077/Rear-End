               //关键字
               
@Override  //覆写，接入接口的类或继承父类的子类，对他们的上一级进行修改

interface  //接口，只定义方法，方法里没有算法
           //例：武器有开火和换弹2种方法
           
implements //接入接口，写在具体的实例（AK47）的声明中，然后通过覆写修改方法

extends    //继承，存在于子类的声明中，public a extends b

super(name);//调用父类参数名为name的方法，父，子，super（三者参数要一致）

this.name=name //this.name来指代传入的形参


import  //










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




