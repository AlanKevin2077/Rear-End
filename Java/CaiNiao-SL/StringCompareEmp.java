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