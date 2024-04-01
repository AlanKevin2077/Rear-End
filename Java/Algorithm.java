           //求绝对值的方法
           
double getAbsNum(double input) {\n        if(input >=0)
{
  //如果是非负数\n            
  return input; 
}
else
{
  //如果是负数\n           
return -input;//则值取反\n        
}



         //求最大公因数和最小公倍数方法
         
private static int zdgys(int a, int b) {
      int min = a<b ? 
   private static long zxgbs(int a, int b) {
      int max = a>b? a : b;
      for(long i=max; ;i+=max) {
         //i能同时被a和b整除
         if(i%a==0 && i%b==0) {
            return i;
         }
      }
   }

}
