package Penao_Kurve;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class View extends Application{
	
	public static void main(String[] arg){
		
		launch();
	}

	@Override
	public void start(Stage prista) throws Exception {
		// TODO Auto-generated method stub
		//Button kurve =new Button("Penao_Kurve");
		//CheckBox kurve=new CheckBox("");
		 RadioButton kur01=new RadioButton(" Hilbert Kurve");
		 Label lak01=new Label("Tief von Hilbert Kurve");
		 TextField tfk01=new TextField();
		 RadioButton kur02=new RadioButton(" Penao Kurve");
		 Label lak02=new Label("Tief von Penao Kurve ");
		 TextField tfk02=new TextField();
		 
		
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.TOP_LEFT);
		
		grid.setHgap(10);
		grid.setVgap(10);
		
		Scene  sc=new Scene(grid,640,600);
		HBox bo1 = new HBox(250,kur01,kur02);
		HBox bo2=new HBox(30, lak01,tfk01,lak02,tfk02);
		
	    grid.add(bo1,1,2);
	    grid.add(bo2, 1, 4);
		
		//kur01.setOnAction(e->System.out.println("die Kurve wird hier angezeigt"));
		
		prista.setTitle("Penao_Hilbert_Kurve");
		prista.setScene(sc);
		prista.show();
		
		
		
	}

}
