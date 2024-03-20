//Getter和Setter方法的简单例子
public class Person {
    private String name;
    private int age;

    // 构造方法
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter方法 - name
    public String getName() {
        return name;
    }

    // Setter方法 - name
    public void setName(String name) {
        this.name = name;
    }

    // Getter方法 - age
    public int getAge() {
        return age;
    }

    // Setter方法 - age
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }
}

// 使用Person类的示例
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);

        // 使用Getter方法获取属性值
        System.out.println("Name: " + person.getName()); // 输出: Name: Alice
        System.out.println("Age: " + person.getAge());  // 输出: Age: 30

        // 使用Setter方法修改属性值
        person.setName("Bob");
        person.setAge(25);

        // 再次使用Getter方法获取修改后的属性值
        System.out.println("Updated Name: " + person.getName()); // 输出: Updated Name: Bob
        System.out.println("Updated Age: " + person.getAge());  // 输出: Updated Age: 25
    }
}
