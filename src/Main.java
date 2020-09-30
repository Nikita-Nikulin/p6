public class Main {
    public static void main(String[] args){
        Shapes.Circle a=new Shapes.Circle(10,"white",true);
        System.out.println(a.toString());
        System.out.println(a.getPerimeter(10));

        Shapes.Square b = new Shapes.Square(13,"black", false);
        System.out.println(b.toString());
        System.out.println(b.getArea(1));

    }
}
