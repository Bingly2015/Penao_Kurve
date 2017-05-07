package Penao_Kurve;



public class Peano_kurve 
{
	 private Turtle turtle;
  public Peano_kurve(int level)
  {
	  turtle = new Turtle(0.5, 0.5, 0.0);
      double max = Math.pow(3, level);
     
      turtle.setXscale(0, max);
      turtle.setYscale(0, max);
      Peano(1,0,level);
 
  }

	 private int Peano(int orient, int angle, int level)
	  {
	    if (level-- == 0){ return angle; }
		
		angle=Peano(orient,angle,level); //  1. mal
		step(angle);
		
		
		angle=Peano(-orient,angle,level);//  2. mal
		step(angle);
		
		
		angle=Peano(orient,angle,level);//  3. mal
		angle+=90*orient;
		step(angle);
		
		angle+=90*orient;
		angle=Peano(-orient,angle,level);//  4. mal
		step(angle);
		
		
		angle=Peano(orient,angle,level);//  5. mal
		step(angle);
		
		
		angle=Peano(-orient,angle,level);//  6. mal
		angle-=90*orient;
		step(angle);
		
		angle-=90*orient;
		angle=Peano(orient,angle,level);//  7. mal
		step(angle);
		
		
		angle=Peano(-orient,angle,level);//  8. mal
		step(angle);
		
		angle=Peano(orient,angle,level);
		
		
		
		
		
		return angle;
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

  public static void main(String[] args)
  {
    new Peano_kurve(7);
  }
}
