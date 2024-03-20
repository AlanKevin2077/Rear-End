 #关键字
'False', 'None', 'True', 'and', 'as', 'assert', 
'break', 'class', 'continue', 'def', 'del', 'elif',
'else', 'except', 'finally', 'for', 'from', 'global', 
'if', 'import', 'in', 'is', 'lambda', 'nonlocal', 'not',
'or', 'pass', 'raise', 'return', 'try', 'while', 'with', 'yield'

#第一个字符必须是字母表中字母或下划线 _

#在 Python 3 中，可以用中文作为变量名，非 ASCII 标识符也是允许的了。

'''
第三注释
第四注释
'''
 
"""
第五注释
第六注释
"""

 #print ("Answer")
   #print ("False")       #缩进不一致，会导致运行错误
                         #IndentationError: unindent does not match any outer indentation level


                              #多行语句
item_one = 1
item_two = 2
item_three = 3

total = item_one + \
        item_two + \
        item_three

print(total)

# 在 [], {}, 或 () 中的多行语句，不需要使用反斜杠\

total = ['item_one', 'item_two', 'item_three',
        'item_four', 'item_five']


                          # 数字(Number)类型
# python中数字有四种类型：整数、布尔型、浮点数和复数。


                            #字符串(String)
#使用三引号(''' 或 """)可以指定一个多行字符串。
paragraph = """这是一个段落，   
可以由多行组成"""

str='123456789'
print(str[0:-1])           # 输出第一个到倒数第二个的所有字符
print(str[2:5])            # 按理来说是3--6  实则3--5
print(str[2:])             # 输出从第三个开始后的所有字符
print(str[1:5:2])          # 从2开始，隔2个位置取个值  结果为24
print(str * 2)             # 输出字符串两次
print(str + '你好')         # 连接字符串
print('hello\nrunoob')      # 使用反斜杠(\)+n转义特殊字符
print(r'hello\nrunoob')     # 在字符串前面添加一个 r，表示原始字符串，不会发生转义
                    
                                         #等待用户输入
input("\n\n按下 enter 键后退出。")  #\n\n 在结果输出前会输出两个新的空行。一旦用户按下 enter 键时，程序将退出
 
import sys; x = 'runoob'; sys.stdout.write(x + '\n')  #sys.stdout.write()打印语句  x是一个变量，其值将被打印出来，\n是一个换行符，表示打印后将光标移动到下一行
                                                      #runoob 有 6 个字符，\n 表示一个字符，加起来 7 个字符。
                                        
                                        
                                        #多个语句构成代码组
#像if、while、def和class这样的复合语句，首行以关键字开始，以冒号( : )结束
'''
if expression : 
   suite
elif expression : 
   suite 
else : 
   suite

'''
                              
                               #print输出
#print 默认输出是换行的，如果要实现不换行需要在变量末尾加上 end=""
x="a"
y="b"
# 换行输出
print( x )
print( y )

print('---------')
# 不换行输出
print( x, end=" " )
print( y, end=" " )
print()
                           
                            
                            #导入模块
#import somemodule  将整个模块(somemodule)导入
#from somemodule import firstfunc, secondfunc  从某个模块中导入某个函数
#from somemodule import *     将某个模块中的全部函数导入

import sys
print('================Python import mode==========================')
print ('命令行参数为:')
for i in sys.argv:  #for...in循环语句  在sys.argv用变量遍历全部元素
    print (i)
print ('\n python 路径为',sys.path)  #如导入path成员，所以此处引用时不需要加sys.path，直接path



                          #命令行参数的使用
#https://www.runoob.com/python3/python3-command-line-arguments.html
































