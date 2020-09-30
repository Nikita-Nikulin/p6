public class Furnitures {
    public static abstract class Furniture {
        public String color, material;

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

        public abstract String toString();
    }
    static class Bed extends Furniture{
        int square;

        Bed(String color, String material, int square){
            this.color = color;
            this.material = material;
            this.square = square;
        }
        public String toString(){
            return "Size of the bed -" + square + ", color - "+color+", material - "+material;
        }

    }
    static class Table extends Furniture{
        String shape;

        Table(String color, String material, String shape){
            this.color=color;
            this.material=material;
            this.shape=shape;
        }
        public String toString(){
            return "Shape - "+ shape+", color - "+ color+ ", material - "+ material;
        }

    }
}
