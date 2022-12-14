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
# static

###### static表示静态，可以修饰成员变量和成员方法

###### 被static修饰的成员变量，叫做静态变量

- 特点：
  - 被该类所有对象共享
- 调用方式：
  - 类名调用（推荐）
  - 对象名调用

###### 被static修饰的成员方法，叫做静态方法

- 特点：
  - 多用在测试类和工具类中（工具类：帮助我们做一些事情，但是不描述任何事物的类）
  - JavaBean类中很少会用
- 调用方式：
  - 类名调用（推荐）
  - 对象名调用
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
# 进程和线程

进程：一个程序独立运行的过程，具有独立的运行空间

线程：进程当中的一条执行路径，一个进程可以有多个线程，一个进程最少有一个线程

并行：就是两个任务同时运行（多个cpu）

并发：是指两个任务同时请求运行，而处理器一次只能接受一个任务，就会把这两个任务安排轮流执行，由于cpu时间片运行时间短，就会感觉这两个任务在同时执行。

## 设计模式7大原则

好处：代码的复用性、扩展性、维护性，解耦（耦合度）

1. 开闭原则：一个软件实体应当对扩展开放，对修改关闭。

  1. 好处
    - 可以使原来的测试代码依旧可以运行，只需要对扩展的代码进行测试即可
    -  可以提高代码的复用性
    - 可以提高系统的维护性
  2. 抽象约束
    - 通过接口或者抽象类约束扩展，对扩展进行边界限定，不允许出现在接口或抽象类中不存在的public方法；
    - 参数类型、引用对象尽量使用接口或者抽象类，而不是实现类；（针对抽象编程）
    - 抽象层尽量保持稳定，一旦确定即不允许修改。
  3. 元数据控制模块行为

   举例： 某公司开发的租车系统有一个押金支付功能，支付方式有支付宝、阿里支付，后期可能还有银联支付、易支付等等，原始的设计方案如下：

   ```java
   // 客户端调用-押金支付选择支付手段
   public class DepositPay {
   	void pay(String type){
   		if(type.equals("ali")){
   			AliPay aliPay = new AliPay();
   			aliPay.pay();
   		}else if(type.equals("wx")){
   			WXPay wxPay = new WXPay();
   			wxPay.pay();
   		}
   	}
   }
   // 支付宝支付
   public class AliPay {
       public void pay() {
       	System.out.println("正在使用支付宝支付");
       }
   }
   // 微信支付
   public class WXPay{
       public void pay() {
       	System.out.println("正在使用微信支付");
       }
   }
   ```

   使用接口设计

   ```java
   public interface Pay {
       // 支付
       void pay();
   }
   public class AliPay implements Pay {
       @Override
       public void pay() {
       	System.out.println("正在使用支付宝支付");
       }
   }
   public class WXPay implements Pay{
       @Override
       public void pay() {
       	System.out.println("正在使用微信支付");
       }
   }
   // 客户端调用-押金支付选择支付手段
   public class DepositPay {
   // 支付方式 (这边可以通过依赖注入的方式来注入)
   // 支付方式可以写在配置文件中
   // 现在不管你选用何种方式，我都不需要更改
       @Autowired
       Pay payMode;
       void pay(Pay payMode){
       	payMode.pay();
       }
   }
   ```



2. 单一原则

3. 里氏代换原则

4. 依赖倒转原则

5. 接口隔离原则

6. 合成复用原则

7. 迪米特原则

