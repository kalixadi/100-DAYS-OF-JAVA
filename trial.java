
    class pen {
        String color;String Type;
        public void write(){
            System.out.println("This pen can write");
        }
        public void writec(){
            System.out.println("Color of the pen is :- "+this.color);
        }
        public void writes(){
            System.out.println("Type of pen is :- "+this.Type);
        }
    }
    public class trial {
        public static void main(String check[]) {
            pen p1 = new pen();
            p1.Type = "ball pen";
            p1.color = "red";
            p1.write();
            p1.writes();
            p1.writec();
        }
    }
