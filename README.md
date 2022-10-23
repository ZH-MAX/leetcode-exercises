## 面向对象

#### 设计对象并使用

###### 类和对象

- 类（设计图）：是对象共同特征的描述

- 对象：是真实存在的具体东西

- 在Java中，必须先设计类，才能获得对象

  ```java
  public class 类名{
  	1.成员变量（代表属性，一般是名词）
  	2.成员方法（代表行为，一般是动词）
  	3.构造器
  	4.代码块
  	5.内部类
  }
  ```

  ```java
  public class Phone{
  	//属性（成员变量）
      String brand;
      double price;
  	//行为（方法）
      public void call(){
          
      }
      public void playGame(){
          
      }
  }
  ```

  ```java
  //如何得到类的对象
  类名 对象名 = new 类名();
  Phone p = new Phone();
  //如何使用对象
  //访问属性：对象名.成员变量
  p.brand = "小米";
  p.price = 1999.98;
  //访问行为：对象名.方法名(...)
  p.call();
  p.playGame();
  ```

###### 类的几个补充注意事项

- 用来描述一类事物的类，专业叫做：**JavaBean类**

  在JavaBean类中，是不写main方法的

- 在以前，编写main方法的类，叫做**测试类**

  在测试类中创建JavaBean类的对象并进行赋值调用

- 类名大写，见名知意，驼峰命名

- 成员变量完整定义格式：修饰符   数据类型 变量名称  = 初始化值；

  一般无需指定初始化值，存在默认值

  |   数据类型   |          明细          | 默认值 |
    | :----------: | :--------------------: | :----: |
  |              | byte、short、int、long |   0    |
  | 基本数据类型 |     float、double      |  0.0   |
  |              |        boolean         | false  |
  |   引用类型   | 类、接口、数组、String |  null  |



#### 封装
ps：对象代表什么，就得封装对应的数据，并提供数据对应的行为（人关门）

###### private关键字

- 是一个权限修饰符
- 可以修饰成员（成员变量和成员方法）
- 被private修饰的成员只能在本类中才能访问
- 针对private修饰的成员变量，如果要被其他类使用，提供相应的操作
  - 提供setXxx(参数)方法，用于给成员变量赋值，方法用public修饰
  - 提供getXxx()方法，用于获取成员变量的值，方法用public修饰

#### this关键字
this的作用：区分成员变量和局部变量

this的本质：所在方法调用者的地址值
#### 构造方法
###### 构造方法的作用

- 在创建对象的时候给成员变量进行赋值
- 特点：
  - 方法名与类名相同，大小写也要一致
  - 没有返回值类型，连void都没有
  - 没有具体的返回值（不能由return带返回结果）
- 执行时机：
  - 创建对象的时候由虚拟机调用，不能手动调用构造方法
  - 每创建一次对象，就会调用一次构造方法

```java
Student s1 = new Student();//空参构造方法
```

###### 构造方法的格式

```java
public class Student{
    修饰符 类名(参数){
        方法体;
    }
}
```

```java
public class Student{
    private String name;
    private int age;
    //空参构造方法
    public Student(){
        ...
    }
    //带全部参数构造方法
    public Student(String name,int age){
        ...
    }
}
```

###### 构造方法注意事项

- 构造方法的定义
  - 如果没定义构造方法，系统将会给出一个默认的无参数构造方法
  - 如果定义了构造方法，系统将不再提供默认的构造方法
- 构造方法的重载
  - 带参构造方法，和无参数构造方法，两者方法名相同，但是参数不同，这叫构造方法的重载
- 推荐的使用方式
  - 无论是否使用，都手动书写无参数构造方法，和带全部参数的构造方法

###### 构造方法总结

- 构造方法的作用？
  - 创建对象的时候，由虚拟机自动调用，给成员变量进行初始化的
- 构造方法有几种？各自的作用是什么？
  - 无参数构造方法：初始化对象时，成员变量的数据均采用默认值
  - 有参数构造方法：初始化对象时，同时可以为对象进行赋值

#### 标准JavaBean

#### 对象内存图

#### 补充知识：成员变量、局部变量
# 字符串

#### String

java.lang.String类代表字符串。Java程序中的所有字符串文字("abc")都为此类的对象。

【注意】字符串的内容是不会发生改变的，它的对象在创建后不能被改变
#### ==

基本数据类型：==比较的是值

```java
int a = 10;
int b = 10;
System.out.println(a==b);//true
```

引用数据类型：==比较的是地址值

```java
String str1 = "qwe";
String str2 = "qwe";
System.out.println(str1==str2);//true	地址复用

String str3 = new String("asd");
String str4 = new String("asd");
System.out.println(str3==str4);//false	每一次new出来的都是新的空间
```

