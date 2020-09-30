import java.util.Scanner;
import java.util.ArrayList;



public class Main {
    public static void main(String[] args){
    /*    Shapes.Circle a=new Shapes.Circle(10,"white",true);
        System.out.println(a.toString());
        System.out.println(a.getPerimeter(10));

        Shapes.Square b = new Shapes.Square(13,"black", false);
        System.out.println(b.toString());
        System.out.println(b.getArea(1));

        проверка задания 2 */



                Furniture.Bed bed_1 = new Furniture.Bed( "Black", "Wood", 2, 7000,"Black_Wooden_Bed");

                Furniture.Table table_1 = new Furniture.Table( "Red", "Metal", "Square", 3500,"Red_metal_table");

                Furniture.Wardrobe wardrobe_1 = new Furniture.Wardrobe( "Black", "Wood", "120X50", 6920,"Black_wooden_wardrobe");

                ArrayList<Furniture> catalog = new ArrayList<Furniture>();
                catalog.add(new Furniture.Bed("Pink","Metal",13,8951,"Pink_Metal_Bed"));
                catalog.add(new Furniture.Wardrobe("White", "Combined", "350X110", 10000, "White_combined_table"));
                catalog.add(new Furniture.Table("Green", "Plastic", "Circle", 1500,"Green_Plastic_table"));
                catalog.add(bed_1);
                catalog.add(table_1);
                catalog.add(wardrobe_1);

                System.out.print("Enter your amount of money: ");
                Scanner in = new Scanner(System.in);
                int amountOfMoney = in.nextInt();

                Loader.showCommand();

                while(true){
                    int command = in.nextInt();
                    if(command == 1){
                        FurnitureShop.printCatalog(catalog);
                    }
                    else if(command == 2){
                        System.out.print("Enter the number,you want to buy: ");
                        int numbProduct = in.nextInt()-1;
                        FurnitureShop.buy(catalog, numbProduct, amountOfMoney);
                        Loader.showCommand();
                    }
                    else if(command == 3){
                        Loader.showCommand();
                    }
                    else if(command == 4){
                        System.out.println("Exit");
                        break;
                    }
                    else{
                        System.out.print("Error 404, not found >_<. List of commands: ");
                        Loader.showCommand();
                    }
                }
            }
        }


