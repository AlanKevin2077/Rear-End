//字符串比较
public class StringCompareEmp{
   public static void main(String args[]){
      String str = "Hello World";
      String anotherString = "hello world";
      Object objStr = str;
 //因为 'H' 的 Unicode 码点值小于 'h' 的 Unicode 码点值且相差32，所以输出为-32
      System.out.println( str.compareTo(anotherString) );
      System.out.println( str.compareToIgnoreCase(anotherString) );  //忽略大小写
      System.out.println( str.compareTo(objStr.toString()));
   }
}




//字符串最后出现的位置
public class SearchlastString {
   public static void main(String[] args) {
      String strOrig = "Hello world ,Hello Runoob";
      int lastIndex = strOrig.lastIndexOf("Runoob");
      if(lastIndex == - 1){
         System.out.println("没有找到字符串 Runoob");
      }else{
         System.out.println("Runoob 字符串最后出现的位置： "+ lastIndex);
      }
   }
}



//字符串中字符的的替换
public class StringReplaceEmp{
   public static void main(String args[]){
      String str="Hello World";
      //方法用于替换字符串中第一个出现的指定子字符串 "H" 为 "W"，多个字符串可能不得
      System.out.println( str.replace( 'H','W' ) );
      //将第一个he替换为wa
      System.out.println( str.replaceFirst("He", "Wa") );
      System.out.println( str.replaceAll("He", "Ha") );
   }
}



//字符串反转
//使用了StringBuffer类来反转一个字符串。在 Java 中StringBuffer类的 reverse() 方法可以用来反转字符串中的字符顺序
/*.toString()：调用 StringBuffer 对象的 toString() 方法，将 StringBuffer 对象转换回 String 类型。由于 StringBuffer 是可变的，而 String 是不可变的，所以 toString() 方法是必要的，以获取反转后的字符串。 */
public class StringReverseExample{
   public static void main(String[] args){
      String string="runoob";
      String reverse = new StringBuilder(string).reverse().toString();
      System.out.println("字符串反转前:"+string);
      System.out.println("字符串反转后:"+reverse);
   }
}
