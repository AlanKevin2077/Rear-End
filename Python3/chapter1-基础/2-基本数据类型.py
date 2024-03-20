# Python 中的变量不需要声明。每个变量在使用前都必须赋值，变量赋值以后该变量才会被创建

# Python 中，变量就是变量，它没有类型

a, b, c = 1, 2, "runoob" #整型对象 1 和 2 的分配给变量 a 和 b，字符串对象 "runoob" 分配给变量 c

"""
在C中不能向上面一样
int a, b, c;
a = 1;
b = 2;
c = "runoob"; 
"""
                                      #不可变数据

# 不可变数据（3 个）：Number（数字）、String（字符串）、Tuple（元组）；
# 可变数据（3 个）：List（列表）、Dictionary（字典）、Set（集合）
# 不可变数据的特点是一旦创建，其值就不能被修改。例如，你不能改变一个已经存在的字符串中的任何一个字符，也不能改变一个元组中的任何元素。

#不违反不可变数据的规则
a=5
a=6
print(a)   #创建了两个不同的变量a，每个都指向内存中的不同位置，分别包含5和6。这并不违反不可变数据的规则，因为您并没有试图修改已经存在的数据。

#违反规则了  
# str1 = "Hello, World!"  
# str1[3] = '!'   

# num = 5
# num[0] = 6  将第一个字符改为6

#判断类型
a = 111
isinstance(a, int)
#或者type(a)==int
#>>>True


                                       #del  语法

x = 5                   #del x将删除变量x的引用，del y将删除列表y的引用。
y = [1, 2, 3]           #del语句并不会删除对象本身，它只是删除了对象的引用，使得Python解释器不再持有对该对象的引用，从而让Python的垃圾回收机制有机会清除这些对象。
del x
del y

my_list = [1, 2, 3, 4, 5]           #请注意，对于字典和集合，del删除的是键，而不是值。
del my_list[2]                      # 删除列表中索引为2的元素
                  
          
                                     #数值运算
# 在混合计算时，Python会把整型转换成为浮点数。

2 / 4  # 除法，得到一个浮点数0.5
2 // 4 # 除法，得到一个整数0
2 ** 5 #2的5次幂32



#变量首先指向一个整数，然后通过赋值改变为字符串（一个变量可以通过赋值指向不同类型的对象。）
var = 10               # 整数类型
var = "Hello, world!"  # 字符串类型
print(var)              # 输出 "Hello, world!"
  


                                     # 对象  变量  引用  值  键之间的关系

# 对象：对象是Python中存储数据的基本单位，可以是整数、字符串、列表、字典、集合等。
# 变量：变量是存储对象引用的容器。变量本身不存储数据，它只是指向内存中的对象。
# 引用：引用是指向对象的指针。当变量指向一个对象时，该变量就持有了对象的引用。
# 值：值是存储在对象中的实际数据。例如，一个整数对象的值就是它的整数数值，一个字符串对象的值就是它的字符串内容。
# 键：键是字典中的一个特殊属性，用于索引字典中的值。键通常为不可变类型，如字符串、元组等。

dict_obj = {'key1': 'value1', 'key2': 'value2'}        # 创建一个字典对象
var = dict_obj                                          # 创建一个变量，该变量指向字典对象
print(var['key1'])                                    # #通过变量访问字典对象的值  输出 'value1'
dict_obj['key1'] = 'new_value'                        # 更改字典对象中的值


                                            #复数
#复数由实数部分和虚数部分构成，可以用 a + bj
#complex(a,b) 表示， 复数的实部 a 和虚部 b 都是浮点型。


                                       #String（字符串）
#索引和截取区别见img-1.png
str='Runoob'
print (str * 2)      # 输出字符串两次，也可以写成 print (2 * str)  输出：RunoobRunoob
print (str + "TEST") # 连接字符串  输出：RunoobTEST



print('Ru\noob')   #输出：Ru
                   #     oob

print(r'Ru\noob')  #输出：Ru\noob
                                   #字符  字符类型  字符串

#字符（character）：字符是单个的字母、数字或符号
c = 'a'
d = '1'
e = '+'

#字符类型（character type）：字符类型是字符的数据类型
#在Python中，字符的类型是str。
c = 'a'
print(type('a'))  # 输出 <class 'str'>

#字符串（string）：字符串是由多个字符组成的序列
h = "I am 'a string with a single' quote!" #创建一个包含单引号的字符串
i = 'I am "a string with a double" quote!' #创建一个包含双引号的字符串
   


                                    #布尔型
# 布尔类型即 True 或 False。
# 在 Python 中，True 和 False 都是关键字，表示布尔值。
#Python 会将 True 视为 1，False 视为 0。
#  and有一个错就错   ory有一个对就对
a = True
b = False
print(not a)    # False
# 类型转换
print(int(a))   # 1
print(float(b)) # 0.0
print(str(a))   # "True"
#只有 0、空字符串、空列表、空元组等被视为 False。
#因此，在进行布尔类型转换时，需要注意数据类型的真假性是true 还是 false。


                                    #List（列表）
#列表是写在方括号 [] 之间、用逗号分隔开的元素列表。
list = [ 'abcd', 786 , 2.23, 'runoob', 70.2 ]
 
a=[1,2,3,4,5]   #a[-1]=a[4]=5
print(a[1:4])   #真实n+1=2号到4号   （】
                #索引1位到n-1=3位   【）

#逆向读取
list = [1, 2, 3, 4, 5]      # 原始列表
reverse_list = list[-1::-1] # 从-1开始（包括-1）逆向读取
print(reverse_list)           #输出：[5, 4, 3, 2, 1]


                                      #元组
#元组写在小括号 () 里，元素之间用逗号隔开。
tuple = ( 'abcd', 786 , 2.23, 'runoob', 70.2  )


#在计算机科学中，"序列"(sequence) 是一个有序的集合，其中的元素按照特定的顺序排列
#在Python中，序列是一类数据结构，包括字符串、列表、元组和范围等。


                                  #集合
#在 Python 中，集合使用大括号 {} 表示，元素之间用逗号 , 分隔。
parame = {value01,value02,...}
#创建一个空集合必须用 set() 而不是 { }，因为 { } 是用来创建一个空字典。
set(value)  #创了value的集合


                                  #Dictionary（字典）
#键(key)必须使用不可变类型。不可变类型包括字符串（str）、数字（int、float、bool等）和元组（tuple）等。
#字典的关键字必须为不可变类型，且不能重复
#在同一个字典中，键(key)必须是唯一的。
tinydict = {'name': 'runoob','code':1, 'site': 'www.runoob.com'}   #创建了字典且给了键，值

dict = {}                          #创建空字典
dict[2]     = "2 - 菜鸟工具"        #给了键和值

#dict()函数创造字典
dict_with_items = dict([('name', 'Alice'), ('age', 30)])
print(dict_with_items)                                   # 输出：{'name': 'Alice', 'age': 30}



                                  #bytes 类型
#bytes 类型通常用于处理二进制数据，比如图像文件、音频文件、视频文件等等。在网络编程中，也经常使用 bytes 类型来传输二进制数据。

#创建 bytes 对象的方式有多种，最常见的方式是使用 b 前缀：
x = b"hello"
y = x[1:3]  # 切片操作，得到 b"el"
z = x + b"world"  # 拼接操作，得到 b"helloworld"

#bytes 类型中的元素是整数值，因此在进行比较操作时需要使用相应的整数值
x = b"hello"
if x[0] == ord("h"):  #ord("h")=10
 print("The first element is 'h'")















