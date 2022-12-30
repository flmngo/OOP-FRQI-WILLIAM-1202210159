public class Calculation implements Runnable{
    
    public double radius, sisi, area;

    public double Jari2 = 3.14;

    @Override
    public void run(){
        System.out.println("====Program Will Start In====");
        System.out.println("");

        for (int i = 3; i > 0; i--){
            System.out.println("Starting with thread" + i);
        }
        try {
           Thread.sleep(1000);
        } catch (Exception e) {
            
        }
        
    }
        public double getSquare(){
            return this.area;
    }

        public void setSquare(){
            if (sisi < 1) {
                throw new IllegalArgumentException();
            }
            else{
                this.area = sisi*sisi;
            } 
    }

        public double getCircle(){
            return this.area;
    }

        public void setCircle(){
            if (this.radius <= 1) {

                throw new IllegalArgumentException();
        }
            else {
                this.area = this.Jari2 * this.radius * this.radius;
        }            
    }
        public double getTrapezoid(){
            return this.area;
    }
        public void setTrapezoid(double x, double y, double a){
            if ((x < 1 || y < 1)) {
                throw new IllegalArgumentException();
            }else{
                this.area = (x + y) * a;
            }
    }


}