package Penao_Kurve;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Model {
	
	
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
		
		angle-=orient*90;
		angle=Hilbert(orient,angle,level);
		step(angle);
		
		angle=Hilbert(-orient,angle,level);
		angle+=orient*90;
		
		return angle;
		
		
	}
	public int Penao(int orginal,int angle, int level){
		return 0;
	}
	public void step(int angel){
		
		Canvas ca=new Canvas(300,500);
	
	   GraphicsContext gc= ca.getGraphicsContext2D();
	     // Pfad definieren
	     gc.setStroke(Color.FIREBRICK);
	     gc.beginPath();
	     gc.moveTo(110, 30);
	     gc.lineTo(170, 20);
	     gc.bezierCurveTo(150, 110, 130, 30, 110, 40);
	     gc.closePath();
	    // Pfad malen
	     gc.stroke();
	}
   
}
