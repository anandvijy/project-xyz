class Father {
  int x = 100;
}
class Son extends Father {
  void disp() {
    System.out.println("Get out of my House");
  }
}
class Real {
  public static void main(String[] args) {
    Son s1 = new Son();
    s1.disp();
    System.out.println(s1.x);
}
