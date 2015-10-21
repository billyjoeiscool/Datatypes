/*
 * Private void drawcricle(GraphicsContext gc, int x,int y,int d) {
gc.setFill(Color.blue);
gc.fillOval(x,y, d,d);
 */
package vasquez_7_methodsmadness.java;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;

import javafx.stage.Stage;

public class Vasquez_7_MethodsMadessjava extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Drawing Operations Test");
        Group root = new Group();
            Canvas canvas= new Canvas(300, 250);
            GraphicsContext gc = canvas.getGraphicsContext2D();
            drawShapes(gc);
            root.getChildren().add(canvas);
            primaryStage.setScene(new Scene(root));
            primaryStage.show();
    }
    
    private void drawShapes(GraphicsContext gc) {
   {
         gc.setFill(Color.BLACK);
        gc.setStroke(Color.RED);
        gc.setLineWidth(20);
        
        gc.fillOval(80, 60, 30, 30);
        
    
    
    }
    
  
         gc.setFill(Color.BLACK);
        
        gc.setLineWidth(20);
        gc.strokeLine(40, 10, 10, 40);
        gc.fillOval(150, 60, 30, 30);
        gc.strokeOval(90,80, 90,90); 
    
    
        gc.setFill(Color.YELLOW);
     
        gc.setLineWidth(10);
        gc.strokeLine(300, 45, 10, 70);
        gc.fillOval(30, 80, 30, 30);
        int i = 0;
       

 
    
     
    
        for (i =0; i < 51000; i++) {
if (i/6==0){
            
   gc.setFill(Color.BLACK);   
        gc.fillOval(100, 200, 100, 30);
   

    }
    }
    }
    public void cheeks(GraphicsContext gc ) {
        gc.setFill(Color.RED);   
            gc.fillOval(30, 80, 30, 30);
   gc.fillOval(200,200, 100, 30);
        }
        }
    }
    public void neacklace(GraphicsContext gc) {
        gc.setfill(Color.BLACK);
        gc.fillOval(150,200,30,30);
        gc.fillOval(200,200,30,50);
        gc.fillOval(250,200,30,30);
        gc.fillOval(300,200,30,30);
        gc.fillOval(350,200,30,30);
}
}
 }
 public void M3(GraphicsContext gc) {
 gc.setfill(Color.White);
 gc.fillOval(150,200,15,30);
 gc.fillOval(200,200,15,30);
 gc.fillOval(250,200,15,30);
 gc.fillOval(300,200,15,30);
 gc.fillOval(350,200,15,30)
 }
    }
}
 public void M4(GraphicsContext gc) {
     gc.setfill(Color.White);
     gc.fillOval(80, 60, 20, 20);
    gc.fillOval(30, 80, 20, 20);
 }   
}
}
public void M5(GraphicsContext gc) {
  gc.fillstroke(Color.black); 
  gc.strokeOval(90,120, 500,500); 
}
