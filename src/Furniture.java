
    abstract class Furniture {
        public String color, material,name;
        int price;

        Furniture() {}

        public void setColor(String color) {
            this.color = color;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public String getColor() {
            return color;
        }

        public String getMaterial() {
            return material;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {this.price = price;}

        public abstract String toString();

        public String getName(){
            return name;
    }
    static class Bed extends Furniture{
        int square;

        Bed(String color, String material, int square,int price,String name){
            this.color = color;
            this.material = material;
            this.square = square;
            this.price=price;
            this.name=name;
        }
        public String toString(){
            return "Size of the bed -" + square + ", color - "+color+", material - "+material;
        }

    }
    static class Table extends Furniture{
        String shape;

        Table(String color, String material, String shape,int price,String name){
            this.color=color;
            this.material=material;
            this.shape=shape;
            this.price=price;
            this.name=name;
        }
        public String toString(){
            return "Shape - "+ shape+", color - "+ color+ ", material - "+ material;
        }

    }
    static class Wardrobe extends Furniture{
            String size;
            Wardrobe(String color, String material, String size,int price,String name){
                this.color=color;
                this.material=material;
                this.size=size;
                this.price=price;
                this.name=name;
            }
        public String toString(){
            return "Size - "+ size+", color - "+ color+ ", material - "+ material;
        }
    }
}
