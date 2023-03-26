import javax.print.DocFlavor.READER;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.html.StyleSheet;
import javax.xml.catalog.Catalog;
import javax.xml.stream.events.NotationDeclaration;

// import java.util.Scanner;
import java.util.*;// 导入Java.util 下所有包

public class hello_world {
public static void main(String[] args) {
    double a=1236.6;
    System.out.println((int)a); 
}

}




//图书管理系统










// //clonable 接口
// //要实现深拷贝要拷贝对象
// //深拷贝:修改拷贝的对象不会影响被拷贝的对象(简单类型)
// //复杂数据类型要实现深拷贝,要用接口,继承clonable 接口

// class money {
//     int a = 100;
// }

// class person implements Cloneable {
//     // 复杂类型浅拷贝例子

//     public int age;
//     money m = new money();// 新对象在栈区

//     protected Object clone() throws CloneNotSupportedException {
//         // return super.clone();
//         // 如何进行深拷贝
//         person p = (person) super.clone();// 克隆persom
//         p.m = (money) this.m.clone();// 克隆money
//         return p;
//     }
// }

// public class hello_world {
//     public static void main(String[] args) throws CloneNotSupportedException {
//         person person1 = new person();
//         person person2 = (person) person1.clone();// peeson2没有克隆person中的money

//     }

// }
// 接口怎么使用

// interface iswimming {// 接口
// // 默认成员类型是public

// void swim();

// }

// interface ieat {

// void eat();

// }

// abstract class animal {
// String name;

// public animal(String name) {
// this.name = name;

// }

// }

// class cat extends animal implements ieat ,iswimming
// {
// public cat (String name )
// {
// super (name );

// }
// public void swim ()
// {

// }
// public void eat ()
// {

// }

// }

// 接口

// interface Shape
// {
// 接口之中方法都是抽象方法
// 接口中定义的量默认为常量
// 接口默认成员变量是public
// 接口不可以被实例化
// 接口与类要用implements
// 接口为了解决单继承问题
// public int a=10;//常量
// public abstract void draw();

// }

// 抽象类
// 方法被abstract 修饰
// 可以没有具体实现
// 类也需要用abstract修饰
// 不可以被实例化
// abstract class Shape
// {//抽象类不可以被实例化
// //如果一个类继承了这个抽象类,这个类要重写父类的方法
// public int a;
// public abstract void draw ();

// }

// //多态
// class Animal {
// public String name;

// // 如果是默认权限,只可以在包内使用//包访问权限
// // 同一个包中可以访问
// public Animal(String name) {
// // 构造方法
// this.name = name;
// System.out.println("Animal.Animal(String )");
// }

// public void eat() {
// System.out.println(this.name + "Animal.eat()");

// }
// }

// class bird extends Animal {

// public bird(String name) {
// super(name);
// // 父类有构造函数,子类也要有构造函数
// System.out.println("bird.bird()");

// }

// public void fly() {
// System.out.println("bird.fly()");

// }

// }

// class Cat extends Animal {
// // 只可以继承一个父类
// // 继承除了父类的构造方法
// // 如果父类有构造方法,子类要帮父类完成构造方法
// // 如果不想被继承了,用final修饰
// public Cat(String name) {
// // 如果父类有构造方法,子类帮父类完成构造方法
// super(name);// 调用父类的构造方法
// // 继承不包括父类构造方法
// System.out.println("cat.(string )");
// }
// }

// public class hello_world {
// public static void main1(String[] args) {
// Animal animal = new Animal("haha");
// Cat cat = new Cat("咪咪");// 调用了父类构造方法,和子类构造方法

// }

// public static void main2(String[] args) {
// // 多态(有向上转型,和有同名方法)
// // 被重写对象不可以被final修饰
// // 被重写方法不可以是私用的
// // 被重写方法,子类修饰限定符要大于父类
// // 向上转型
// // 如果子类重写了父类的方法,创建父类对象(调用子类构造方法),可以调用子类重写的方法
// Animal animal = new Cat("mm");
// // 父类调用子类的构造方法
// // 但是父类调用子类的构造方法创建的对象无法访问子类属性
// }

// public static void main(String[] args) {
// Animal animal = new bird("mm");// 向下转型
// animal.eat();// 没有向下转型时只可以调用父类方法
// bird bird1 = (bird) animal;// animal强转为bird类型
// bird1.fly();

// }
// }
// 继承

// class Animal {
// public String name;
// //如果是默认权限,只可以在包内使用//包访问权限
// //同一个包中可以访问
// public Animal(String name) {
// // 构造方法
// this.name = name;
// System.out.println("Animal.Animal(String )");
// }

// public void eat() {
// System.out.println(this.name + "Animal.eat()");

// }

// public void sleep() {
// System.out.println(this.name + "Animal.sleep()");

// }

// }

// class Cat extends Animal {
// //只可以继承一个父类
// //继承除了父类的构造方法
// //如果父类有构造方法,子类要帮父类完成构造方法
// //如果不想被继承了,用final修饰
// public Cat(String name) {
// // 如果有构造方法,帮父类完成构造方法
// super(name);//调用父类的构造方法
// //继承不包括父类构造方法
// System.out.println("cat.(string )");
// }

// }

// public class hello_world {
// public static void main(String[] args) {
// Cat cat = new Cat("22");
// cat.eat();

// };
// }

// 包

// 数据结构

// 双向链表
// class Node {

// public int data;
// public Node prev;
// public Node next;

// Node(int mydata) {
// this.data = mydata;
// this.prev = null;
// this.prev = null;

// }

// }

// public class hello_world {
// public Node head;
// public Node tail;

// public void FirstAdd(int myData) {
// if (head == null)// 第一次插入
// {
// Node node = new Node(myData);
// this.head = node;
// this.tail = this.head;

// } else {
// Node node = new Node(myData);
// head.prev = node;
// node.next = this.head;
// head = node;
// }

// }

// public void LastAdd(int myData) {// 尾插
// if (head == null)// 第一次插入
// {
// Node node = new Node(myData);
// this.head = node;
// this.tail = this.head;

// } else {
// Node node = new Node(myData);
// this.tail.next = node;
// node.prev = this.tail;
// this.tail = node;

// }

// }

// public void display() // 打印
// {
// Node cur = this.head;
// while (cur != null) {
// System.out.println(cur.data + " ");
// cur = cur.next;

// }

// }

// public boolean contains(int Mydata) {
// Node cur = this.head; // 临时节点
// while (cur != null) {
// if (cur.data == Mydata) {
// return true;

// }
// cur = cur.next;
// }
// return false;

// }

// public int size() // 有多少个元素
// {
// int count = 0;
// Node cur = this.head; // 临时节点
// while (cur != null) {
// count++;

// cur = cur.next;// 下一个节点
// }
// return count;

// }

// // 任意位置插入数据
// public void insert(int site, int MyData) {
// if (site < 0 || site > size()) {
// System.out.println("插入位置不合法");
// return;
// }
// Node cur = this.head;
// if (this.head == null || site == 0) {
// // 插入位置为0,或还没有插入任何数据
// FirstAdd(MyData);
// return;
// }
// if (site == size()) {
// // 插入位置为最后
// LastAdd(MyData);
// return;
// }
// for (int i = 0; i < site - 1; i++) {
// cur = cur.next;

// }
// Node node = new Node(MyData);
// node.next = cur;// 先修改新节点的数据
// node.prev = cur.prev;
// cur.prev.next = node;

// cur.prev = node;

// }

// public void remove(int Mydata) {
// // 是否是头节点//是否是尾节点

// Node cur = head;// 临时节点是头节点

// if (this.head == null) {// 链表为空
// System.out.println("单链表为空");
// return;
// }

// while (cur.next != null && head != null) {
// if (this.head.data == Mydata) {
// // 如果删的是头节点
// head.next.prev = null;
// head = head.next;

// }
// if (this.tail.data == Mydata) {
// // 如果删的是尾节点
// tail.prev.next = null;
// tail = tail.prev;

// }

// if (cur.data == Mydata) {
// cur.next.prev = cur.prev;
// cur.prev.next = cur.next;

// }
// cur = cur.next;
// }
// // System.out.println("没有找到节点");
// }

// public void clear()// 清除双链表
// {// 一个一个节点释放
// while (head != null) {
// Node cur = head.next;
// head.prev = null;
// head.next = null;
// head = cur;

// }
// this.tail=null;

// }

// }

// class test {
// public static void main(String[] args) {
// hello_world hello_world = new hello_world();

// hello_world.LastAdd(82);
// hello_world.LastAdd(22);
// hello_world.LastAdd(22);
// hello_world.LastAdd(23);
// hello_world.LastAdd(88);
// hello_world.LastAdd(23);
// hello_world.display();

// System.out.println("删除后");
// hello_world.remove(22);
// hello_world.display();

// }

// }
// //单链表
// class Node {
// // 节点类型
// public int data;
// public Node next;// 指向下个节点

// Node(int data) {// 构造函数
// this.data = data;
// this.next = null;// 默认为0

// }
// }

// public class hello_world {
// public Node head;// 保存单链表头节点的地址//没有固定头节点的单链表

// public void FirstAdd(int data) {// 头插法
// Node node = new Node(data);// 创建节点对象
// if (head == null)// 如果开始没有任何节点
// {
// this.head = node;
// node.next = null;// 指向下一个节点为空
// return;

// }
// node.next = this.head;// 把新建节点设为头节点//地址
// this.head = node;// 把新建节点设为头节点
// }

// public void MyDisplay() {
// Node cur = this.head;// 创建临时节点
// while (cur != null) // 不是尾节点
// {// 如果是cur.next,最后一个无法打印
// System.out.println(cur.data + " ");
// cur = cur.next;// 下一个节点

// }

// }

// public void Addlast(int MyData) {
// Node node = new Node(MyData);// 创建新节点
// Node cur = this.head;// 临时节点
// if (head == null)// 如果开始没有任何节点
// {
// this.head = node;
// node.next = null;// 指向下一个节点为空
// return;

// }
// while (cur.next != null) {
// cur = cur.next;// 非空,下一个

// }
// cur.next = node;// 最后一个为空
// }

// public boolean contains(int Mydata) {
// Node cur = this.head; // 临时节点
// while (cur != null) {
// if (cur.data == Mydata) {
// return true;

// }
// cur = cur.next;
// }
// return false;

// }

// public int size() {
// int count = 0;
// Node cur = this.head; // 临时节点
// while (cur != null) {
// count++;

// cur = cur.next;// 下一个节点
// }
// return count;

// }

// public void addIndex(int index, int Mydata) {
// // index==2,在2之前插入
// Node node = new Node(Mydata);
// Node cur = this.head; // 临时节点
// if (index == 0)// 头插
// {
// node.next = this.head;// 把新建节点设为头节点//地址
// this.head = node;// 把新建节点设为头节点
// return;
// }
// if (index >= size()) {// 尾插

// Addlast(Mydata);
// return;

// }
// for (int i = 0; i < index - 1; i++) {
// cur = cur.next;

// }
// node.next = cur.next;
// cur.next = node;

// }

// // 删除一个节点
// public void remove(int Mydata) {// 只删除一个
// Node prve = head;// 临时节点是头节点

// if (this.head == null) {// 链表为空
// System.out.println("单链表为空");
// return;
// }
// while (prve.next != null) {
// if (this.head.data == Mydata) {
// head = head.next;

// }

// if (prve.next.data == Mydata) {
// Node del = prve.next;
// prve.next = del.next;
// return;
// }
// prve = prve.next;

// }
// // System.err.println("没有找到节点");
// }

// public void allremove(int Mydata)

// {
// // 删除所有数据为key节点
// // 先删除头节点之后的节点,最后判断头节点
// //
// Node pre = new Node(Mydata);// 头节点
// Node cur = new Node(Mydata);// 要删除的节点
// pre = this.head;
// cur = pre.next;
// while (cur != null) {// 因为cur = cur.next;
// if (cur.data == Mydata) {
// pre.next = cur.next;// 跳过目标节点
// cur = cur.next;// 要删除的节点指向下一个

// }

// else {
// pre = cur;
// cur = cur.next;
// }
// }

// if (this.head.data == Mydata) {
// // 判断头节点
// this.head = this.head.next;

// }
// }

// public void clear() {
// // jvm在回收内存时,当该对象没有被引用,才会被回收
// this.head = null;

// }

// // 练习,翻转单链表
// public Node turn() {// 111 222 333

// // 2 3 5

// // 222 333 null

// // cur cur.next
// // curNext
// Node cur = this.head;// 要翻转的节点 首先,cur 指向this.head
// Node curNext = null;
// Node pre = null;
// Node newHead = null;
// while (cur != null)

// {
// curNext = cur.next;// 首先,保存cur.next
// if (curNext == null) {

// newHead = cur;

// }
// cur.next = pre;// null //前驱 后继 //核心
// pre = cur;// 前驱 后继
// //
// cur = curNext;
// }
// return newHead;
// }

// public void MyDisplay1(Node newHead) {
// Node cur = newHead;// 创建临时节点
// while (cur != null) // 不是尾节点
// {// 如果是cur.next,最后一个无法打印
// System.out.println(cur.data + " ");
// cur = cur.next;// 下一个节点

// }

// }

// // 找中间节点
// public Node middleNode() {
// Node fast = this.head;
// Node slow = this.head;

// // 10000000020000030000000000400000005006
// // low
// // fast
// // 0000000low000fast
// // 000000000000low00000000000fast
// // 000000000000000000low000000000000000000000fast
// while (fast != null && fast.next != null) {
// fast = fast.next.next;
// slow = slow.next;

// }
// return slow;

// }

// // 寻找倒数第n个元素
// public Node find(int myData) {
// Node fast = this.head;
// Node slow = this.head;
// if (myData <= 0) {
// System.out.println("k不合法,请重新输入");
// return null;
// }

// for (int i = 0; i < myData - 1; i++) {
// fast = fast.next;
// if (fast.next == null) {
// System.out.println("k不合法,请重新输入");
// return null;
// }
// }
// while (fast.next != null)
// // 如果是fast 会导致空指针
// {
// fast = fast.next;
// slow = slow.next;

// }
// return slow;
// }

// // 删除重复节点,重复节点不保留//节点是有序的
// public Node Deletesame() {
// // 创建一个新节点作为头节点
// Node newHead = new Node(0);
// Node cur = new Node(0);// 遍历原链表
// Node tmp = new Node(0);// 记录新链表
// cur = this.head;
// tmp = newHead;

// while (cur != null) {
// if (cur.next != null && cur.data == cur.next.data) {
// while (cur.next != null && cur.data == cur.next.data) {
// cur = cur.next;

// }
// cur = cur.next;

// }

// else {
// tmp.next = cur;
// tmp = tmp.next;
// cur = cur.next;

// }
// }
// return newHead;

// }

// public boolean chapalindrome() {// 是否是回文结构
// // 只可以判断奇数 / // 找中间节点,中间后的节点倒序
// Node fast = this.head;
// Node slow = this.head;

// // 10000000020000030000000000400000005006
// // low
// // fast
// // 0000000low000fast
// // 000000000000low00000000000fast
// // 000000000000000000low000000000000000000000fast
// while (fast != null && fast.next != null) {
// fast = fast.next.next;
// slow = slow.next;

// }

// Node pre = slow;
// Node cur = new Node(0);// 遍历从中间开始的链表
// cur = pre;
// while (cur != null)

// {

// Node curNEXT = cur.next;
// cur.next = pre;
// pre = cur;
// cur = curNEXT;

// }
// // 分别从前,后向中间中间移动
// Node fro = this.head;
// while (fro.data == fast.data) {
// fro = fro.next;
// fast = fast.next;
// if (fro == fast || fro.next == fast) {// 判断偶数
// return true;
// }

// }
// return false;
// }

// // 判断链表是否有环
// public boolean hasCycle() {
// Node fast = this.head;// 一次走两步
// Node slow = this.head;// 一次走一步
// while (fast != null && fast.next != null) {
// fast = fast.next.next;
// slow = slow.next;
// if (fast == slow) {

// return true;

// }

// }

// return false;
// }

// public Node hasCycleSite() {// 在环中寻找入环节点

// // 设起点到入环节点距离为X,
// // 设两节点相遇距离入环节点为y
// // 设环长度为c
// // 有2x+2y=NC+x+Y
// // x=Nc-Y}
// Node fast = this.head;// 一次走两步
// Node slow = this.head;// 一次走一步
// Node ret = this.head;// 找到快慢节点相遇位置后,从头节点开始走

// while (fast != null && fast.next != null) {
// fast = fast.next.next;
// slow = slow.next;
// if (fast == slow) {
// while (ret != slow) {
// slow = slow.next;
// ret = ret.next;
// }
// return ret;
// }

// }

// return null;

// }

// public Node combine(Node heatA, Node heatB) {
// // 合并两个有序链表
// Node newHeat = new Node(-1);
// Node tmp = null;// 记录新节点
// tmp = newHeat;
// while (heatA != null || heatB != null) {
// if (heatA.data < heatB.data) {
// tmp.next = heatA;
// heatA = heatA.next;
// tmp = tmp.next;

// } else {
// tmp.next = heatB;
// heatB = heatB.next;
// tmp = tmp.next;

// }

// if (heatA == null) {
// tmp.next = heatB;
// break;
// } else {
// tmp.next = heatA;
// break;
// }
// }
// return newHeat;
// }
// }

// class start {
// public static void main(String[] args) {
// hello_world Myhello_world = new hello_world();

// Myhello_world.Addlast(60);
// Myhello_world.Addlast(70);
// Myhello_world.Addlast(90);
// Myhello_world.Addlast(60);
// Myhello_world.Addlast(60);
// Myhello_world.Addlast(60);

// Myhello_world.MyDisplay();
// System.out.println("1111");

// Node ret = Myhello_world.turn();

// Myhello_world.MyDisplay1(ret);

// }

// }

// 线型表

// class MyArrayList {
// public int[] elem;
// public int usedSize;
// public static final int capacity = 10;

// public MyArrayList() {
// this.elem = new int[capacity];
// this.usedSize = 0;

// }

// // 遍历数组
// public void display() {
// for (int i = 0; i < this.elem.length; i++) {
// System.err.println(elem[i] + " ");
// }

// }

// // 查找是否存在一个元素

// public boolean contains(int Tofind) {
// for (int i = 0; i < this.usedSize; i++) {
// if (Tofind == this.elem[i]) {
// return true;

// }

// }
// return false;
// }

// // 返回存在元素下标
// public int search(int Tofind) {
// for (int i = 0; i < this.usedSize; i++) {
// if (Tofind == this.elem[i]) {
// return i;

// }

// }
// return -1;
// }

// // 删除顺序表,指定位置
// public void remove(int toremove) {
// if (usedSize != 0) {
// for (int i = toremove; i < (usedSize - toremove); i++) {
// elem[i] = elem[i + 1];

// }

// }
// }

// // 插入数据(pos位置)
// public boolean isfull() {
// if (this.usedSize == this.elem.length) {
// return true;

// } else {
// return false;

// }
// }

// public void add(int pos, int data) {
// if (isfull())// kuorong
// {
// this.elem = Arrays.copyOf(this.elem, 2 * this.elem.length);

// }
// if (pos < 0 || pos > this.usedSize) {
// return;

// }
// for (int i = this.usedSize - 1; i >= pos; i++) {
// this.elem[i + 1] = this.elem[i];

// }
// this.elem[pos] = data;
// this.usedSize++;

// }

// }

// public class hello_world // public 只有一个
// {

// public static void main(String[] args) {
// MyArrayList MyArrayList1 = new MyArrayList();
// }

// }

// public static int myMax(int a,int b){

// return a>b?a:b;

// }
// class Test
// {

// public int a;
// public static int count ;

// }
// class hello_world {

// public static void main(String[] args) {

// Test t1=new Test();
// t1.a++;
// Test.count ++;
// System.out .println(t1.a);
// System.out .println(Test.count);
// Test t2=new Test();
// t2.a++;
// t2.count ++;//只有一份
// System.out .println(t2.a);
// System.out .println(t2.count);
// }
// public static void main27(String[] args) {
// // 找出数组中只出现一次的数字
// // 相同数字异或=0
// // 0异或任何数字等于本身
// int[] array = { 5, 2, 2, 3, 3,3,3 ,5,5};
// int ret = 0;

// for (int i = 0; i < array.length; i++) {
// ret ^= array[i];

// }
// System.err.println(ret);
// }

// public static void main26(String[] args) {
// // 二位数组
// int[][] array = { { 1, 2, 3 }, { 1, 2, 3 } };// 前面不可以出现几行几列
// int[][] array1 = new int[][] { { 1, 2, 3 }, { 1, 2, 3 } };
// int[][] array2 = new int[2][3];
// for (int i = 0; i < array.length; i++)// 二维数组中一维数组个数
// {
// for (int j = 0; j < array[i].length; j++) {
// System.err.print(array[i][j] + " ");
// }
// System.out.println();
// }
// System.err.println(Arrays.deepToString(array));
// for (int[] a : array) {
// for (int x : a) {
// System.err.print(x);

// }
// System.err.println();
// }
// }

// public static void main24(String[] args) {
// // 冒泡排序
// int[] arr = { 51, 2, 31, 4, 65, 54, 6, 7 };
// for (int i = 0; i < arr.length - 1; i++) {
// for (int j = 0; j < arr.length - i - 1; j++) {

// if (arr[j] > arr[j + 1]) {
// int ret = arr[j];
// arr[j] = arr[j + 1];
// arr[j + 1] = ret;
// }
// }
// }
// for (int i : arr) {
// System.out.println(i);
// }
// }

// public static int[] func(int[] array) {
// int[] arr = new int[array.length];
// for (int i = 0; i < array.length; i++) {
// arr[i] = array[i] + 3;

// }
// return arr;
// }

// public static void main23(String[] args) {
// int[] arr = { 1, 2, 3, 4, 5, 5, 6, 7 };
// Arrays.sort(arr);
// System.err.println(Arrays.toString(arr));
// }

// public static void main22(String[] args) {
// // 二分查找
// int[] arr = { 1, 2, 3, 4, 5, 5, 6, 7 };
// int key = 3;
// int l = 0;
// int r = arr.length - 1;
// while (l <= r) {
// int mid = (l + r) / 2;
// if (arr[mid] < key) {
// l = mid + 1;

// } else if (arr[mid] > key) {
// r = mid - 1;

// }

// else if (arr[mid] == key) {
// System.out.println(mid);
// break;
// }
// }
// }

// public static void main21(String[] args) {
// // 浅拷贝//引用类型
// // 深拷贝//两空间不受影响
// }

// public static void main20(String[] args) {
// int[] array = { 1, 2, 3, 4 };
// int[] ret = func(array);
// for (int i : ret) {
// System.err.println(i);
// }
// }

// public static void printarr(int[] arr) {
// for (int i : arr) {
// System.err.println(i);
// }

// }

// public static void main19(String[] args) {
// int[] arr = { 12, 19 };
// // printarr(arr);//引用//同一地址
// System.err.println(Arrays.toString(arr));// 把数组以字符串形式输出
// }

// public static void main18(String[] args) {
// int[] arr = { 1, 2, 2 };

// int len = arr.length;
// System.err.println(len);
// for (int val : arr) // foreach
// {
// System.err.println(val + " ");
// }
// }

// public static void main17(String[] args) {
// int[] arr = { 1, 2 };// 栈
// int[] arr1 = new int[] { 1, 2 };// 堆
// int[] arr2 = new int[5];

// }

// // 方法重载
// // 返回类型不同//参数个数不同
// // 递归
// public static void fun1(int n)// 123
// {// 取出数的每一位
// if (n > 9) {
// fun1(n / 10);// 12//1

// }
// System.out.println(n % 10);// 1

// }

// public static int fun2(int n)// 123
// {// 取出数的每一位
// if (n < 10) {
// return n; // 12//1

// }
// // 1
// return n % 10 + fun2(n / 10);
// }

// public static void main16(String[] args) {
// fun1(123);
// }

// public static void swap(int[] arr) {
// int tmp = arr[0];
// arr[0] = arr[1];
// arr[1] = tmp;

// }

// public static void main15(String[] args) {

// // System.out.println(factor(5));
// int[] arr = { 10, 20 };
// swap(arr);
// System.out.println("a=" + arr[0] + "B=" + arr[1]);

// }

// public static int factor(int n)

// {
// int sum = 0;
// // 阶乘相加

// for (int i = 1; i <= n; i++) {
// int ret = 1;
// for (int j = 1; j <= i; j++) {
// ret *= j;

// }
// sum += ret;
// }
// return sum;
// }

// public static void main14(String[] args) {
// // 方法(函数)与包
// // 小陀峰 只有一个单词 都小写
// // 多个 第一小写,第二大写
// int a = 10;
// int b = 15;
// // int c= myMax (10,15);
// // System.out .println(c);
// }

// public static void main13(String[] args) {
// // 返回二进制1的数目
// Scanner sc = new Scanner(System.in);
// int num = sc.nextInt();// 四个字节
// int count = 0;
// while (num != 0) {// 0111&0110=0110
// // 0110&0101=0100
// // 0100&0011=0000

// num = num & (num - 1);
// count++;

// }
// System.out.println(count);
// }

// public static void main12(String[] args) {
// // 返回二进制1的数目
// Scanner sc = new Scanner(System.in);
// int num = sc.nextInt();// 四个字节
// int conut = 0;

// for (int i = 0; i < 32; i++) {
// if (((num >> i) & 1) == 1) {
// conut++;
// if (num == 0) {

// break;
// }
// }

// }
// System.out.println(conut);
// }

// public static void main11(String[] args) {
// // 密码锁

// Scanner sc = new Scanner(System.in);

// int count = 0;
// for (int i = 2; i > count; i--) {
// System.out.println("请输入密码");
// String num = sc.nextLine();
// if (num.equals("123456")) {
// System.out.println("正确");
// break;
// } else {
// System.out.println("err");
// System.out.println("err" + "你还有" + i);
// }

// }
// }

// public static void main10(String[] args) {
// // 水仙花数
// // 自幂数
// System.out.println("请输入数字");
// Scanner sc = new Scanner(System.in);
// int num = sc.nextInt();
// int ret = num;
// int count = 0;

// for (int i = 1; i < num; i++) {
// while (ret != 0)

// {
// count++;

// ret = ret / 10;// 1/10=0,1%10=1

// }

// int sun = 0;
// ret = num;

// while (ret != 0) {
// sun += Math.pow(ret % 10, count);
// ret /= 10;
// }
// if (sun == num) {

// System.out.println(num + "my");
// }
// }

// }

// public static void main7(String[] args) {
// for (int i = 0; i < 100; i++) {
// if (i % 10 == 9 || i / 10 == 9) {
// System.out.println(i);

// }

// }

// }

// public static void main6(String[] args) {
// {
// // 1/1-1/2+1/3......
// Scanner sc1 = new Scanner(System.in);
// int num1 = sc1.nextInt();
// double c = 0;
// int flag = 1;

// for (int i = 1; i < num1; i++) {
// c += (1.0 / i * flag);
// flag = -flag;

// }
// System.out.println(c);
// }
// }

// public static void main5(String[] args) {
// {// 找两个数的最大公约数
// Scanner sc1 = new Scanner(System.in);
// Scanner sc2 = new Scanner(System.in);
// int num1 = sc1.nextInt();
// int num2 = sc1.nextInt();
// int c = 0;

// while (num1 % num2 != 0) {
// c = (num1 % num2);
// num1 = num2;
// num2 = c;

// }
// System.out.println(c);
// }
// }

// public static void main4(String[] args) {// 判断一个数是否是素数
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();

// for (int i = 2; i <= (int) (Math.sqrt(n)); i++) // 类型是staice,直接使用不用new
// {
// if (n % i == 0) {
// System.out.println("不是素数");

// }

// }
// }

// public static void main3(String[] args) {
// Random ran = new Random();// 类型 方法
// // 如果给定一个数字,随机数一样
// Scanner sc = new Scanner(System.in);

// int num = ran.nextInt(100);// 生成一个整形,0-99

// // System.out.println(num);
// while (true) {
// System.out.println("请输入数字");
// int num1 = sc.nextInt();
// if (num1 > num) {
// System.out.println("大了");
// } else if (num1 < num) {
// System.out.println("小了");
// } else {
// System.out.println("对了");
// System.out.println(num);
// break;
// }

// }
// }

// public static void main2(String[] args) {
// // 循环读入数字
// Scanner sc = new Scanner(System.in);

// while (sc.hasNextLine()) // 可以读入空格

// {
// int num = sc.nextInt();
// System.out.println(num);

// }

// }

// public static void main1(String[] args)// shuzhu
// {
// // for (byte a=0;a<130;a++)
// // {
// // System.out.println(a);

// Scanner sc = new Scanner(System.in);

// System.out.println("请输入名字");
// String name = sc.nextLine();// 会读入空格

// System.out.println("请输入年龄");
// int age = sc.nextInt();

// System.out.println("请输入性别");
// String sex = sc.next();// 不会读入空格

// System.out.println("信息如下");
// System.out.println("名字:" + name + "年龄:" + age + "性别:" + sex);
// sc.close();// 使用后要关闭方法

// }

// Scanner scan = new Scanner(System.in);

// int num = scan.nextInt();

// while (scan.hasNextLine()) {

// if (num % 15 == 0) {
// System.out.println(num);
// // continue;
// //break;只可以在swich,或循环中用69

// }
// else {
// num++;

// }

// }

// int num = 5;
// int i = 1;
// int ret = 1;
// int b = 0;

// for (num = 5; num >= i; num--)

// {
// for (int k = 1; k <= num; k++) {
// ret *= k;

// }
// b += ret;
// ret = 1;
// }
// System.out.println(b);

// ctr +c 中止
// ctr +d 退出
// Scanner scan = new Scanner(System.in);
// while (scan.hasNextLine())

// {int a = scan.nextInt();
// if ((a % 4 == 0) && (a % 100 != 0)) {
// System.out.println("闰年");

// } else {
// System.out.println("不是闰年");
// }}
// int a=10;
// if (a==10)
// {}

// Scanner scan = new Scanner(System.in);
// string a = scan.nextLine();
// System.out.println(a);//有空格也输出

// Scanner scan = new Scanner(System.in);
// sting d = scan.next();//遇到空格停止
// System.out.println(d);

// Scanner sca = new Scanner(System.in);
// int a = sca.nextInt();// 从键盘获取整形
// System.out.println(a);

// int i=10;
// i=i++;
// System.out.println(i);
// System.out.println(5/2);
// System.out.println(5.0/2);
// System.out.println((float)5/2);
// System.out.println((float)(5/2));
// 2
// 2.5
// 2.5
// 2.0
// System.out.println();

// int a=10;
// int b=++a; //a=a+1,b=a
// System.out.println(b);
// int c=a++;//b=a,a=a+1
// System.out.println(c);
// System.out.println(a);//12

// int a=10;
// // string b=a+"";
// string b=String .valueOf(a);
// System.out.println(b);
// int a=10;
// long b=a;//隐式类型转换,小类型给大类型

// System.err.println(b)
// long a=10;
// int b=a;//显式类型转换,大类型给小类型

// System.err.println(b);
// {

// int a=100;
// a=200;
// a=300;
// System.err.println(a);

// byte a=10;
// byte b=10;
// byte c=(byte)(a+b);//小于四个字节会发生整形提升
// System.err.println(c);

// String a="wo";
// System.err.println(a);

// boolean a=true;

//
// short a=12;//2字节，-32768-32768

// byte b=12;//127 - -128
// byte c=127;
// System.err.println(b+c);//以整形输出

//
// char ch='c';//2字节 0-655535 没有负数
// System.err.println( ch);
// char c='高';
// char k=566;
// System.err.println( ch);
// System.err.println( c);
// System.err.println( k);

// double 8
// float 4
// float a=12.3f;//加个f
// System.err.println(a);

// double a=10.5;
// System.err.println(a);
// System.err.println(Double.MAX_VALUE);
// for (int i=0;i<=args.length;i++)
// {
// System.err.println(args[i]);

// }
// System.err.println("hh");
// long a=10L;//8字节2^63
// System.err.println(a);
// System.err.println("最大值"+Long.MAX_VALUE);
// int b=10;
// int c=20;
// System.err.println(b+c);

// int max =Integer.MAX_VALUE+1;
// System.err.println(max);

// int a=10;

// System.out.println(a);//打印切换行
// System.out.print(a);//打印但不换行
// System.out.printf("%d\n",a);//格式化输出
// }