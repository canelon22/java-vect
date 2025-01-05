public class Vector {
  int componentX;
  int componentY;

  public Vector(int comx, int comy) {
    componentX = comx;
    componentY = comy;

  }

  public Vector sumar(Vector attr) {
    return new Vector(componentX + attr.componentX, componentY + attr.componentY);
  }

  public Vector restar(Vector attr) {
    return new Vector(componentX - attr.componentX, componentY - attr.componentY);
  }

  public Vector escalar(int attr) {
    return new Vector(componentX * attr, componentY * attr);
  }

  public String Show() {
    return String.format("(%d,%d)", componentX, componentY);
  }

  public static void main(String[] args) {
    Vector Vec1 = new Vector(2, 5);
    Vector Vec2 = new Vector(4, 6);

    Vector suma = Vec1.sumar(Vec2);
    Vector rest = Vec1.restar(Vec2);
    Vector esc = Vec1.escalar(-3);

    Vec1 = Vec1.sumar(Vec2);

    System.out.println(Vec1.Show());
    System.out.println(suma.Show());
    System.out.println(rest.Show());
    System.out.println(esc.Show());
  }
}
