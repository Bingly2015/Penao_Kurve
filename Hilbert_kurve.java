package Penao_Kurve;



public class Hilbert_kurve {
    private Turtle turtle;
   
    public Hilbert_kurve(int level) {
    	 turtle = new Turtle(0.5, 0.5, 0.0);
         double max = Math.pow(2, level);
        
         turtle.setXscale(0, max);
         turtle.setYscale(0, max);
    //  hilbert(level, 1);
      Hilbert(1,0,level);
     
                            }

    public void hilbert(int n, int parity) {
        if (n--== 0) return;
        turtle.turnLeft(parity * 90);
        hilbert(n, -parity);
        turtle.goForward(1.0);
        turtle.turnLeft(-parity * 90);
        hilbert(n, +parity);
        turtle.goForward(1.0);
        hilbert(n, +parity);
        turtle.turnLeft(-parity * 90);
        turtle.goForward(1.0);
        hilbert(n, -parity);
        turtle.turnLeft(parity * 90);
    }
    
    public void step(int angle){
         double x = turtle.getX();
         double y=  turtle.getY();
    	 double oldx = turtle.getX();
         double oldy = turtle.getY();
         x += 1.0 * Math.cos(Math.toRadians(angle));
         y += 1.0 * Math.sin(Math.toRadians(angle));
         StdDraw.line(oldx, oldy, x, y);
		 turtle.setX(x);
		 turtle.setY(y);
	 }   
   
    
    /**orient...enterder +1 oder -1 Drehrichtung
	 * angle... 0,90,180,270,(Grad)
	 * level  rekursiv berechnen
	 */
	 public int Hilbert(int orient,int angle,int level){
		if(level--==0) return angle;
		
		angle+=orient*90;
		angle=Hilbert(-orient,angle,level);
		step(angle);
		
		angle-=orient*90;
		angle=Hilbert(orient,angle,level);
		step(angle);
		
		
		angle=Hilbert(orient,angle,level);
		angle-=orient*90;
		step(angle);
		
		angle=Hilbert(-orient,angle,level);
		angle+=orient*90;
		
		return angle;
		
		
	}
	 

	 
    
    
    public static void main(String[] args) {
    	
      //  int n = Integer.parseInt(args[0]);
        new Hilbert_kurve(7);
    
    }
}
