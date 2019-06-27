package GUI;

import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class MouseInput extends MouseAdapter {
    private Handler handler ;
    private int x ;
    private int y ;

    public MouseInput(Handler handler){
        this.handler = handler;
    }
    public void mousePressed( MouseEvent e){
        System.out.println("Click!");
        x = e.getX();
        y = e.getY();




    }

    public void mouseReleased(MouseEvent e){
        System.out.println("Unclick!");
        for(int i = 0 ; i < handler.object.size(); i++){
            GameObject tempObject = handler.object.get(i);

            if(tempObject.getId() == ID.PlayerOneCard) {
                //key events for player 1
                if (       ( x <= tempObject.getX() + 32  && x >= tempObject.getX()  )
                        && ( y <= tempObject.getY() + 32  && y >= tempObject.getY()  ) ) {
                    setCoordinates( e.getX() , e.getY() , i);

                }

            }


        }
    }

    public void mouseDragged(MouseEvent e){
        for(int i = 0 ; i < handler.object.size(); i++){
            GameObject tempObject = handler.object.get(i);

            if(tempObject.getId() == ID.PlayerOneCard) {
                //key events for player 1
                if (       ( e.getX() <= tempObject.getX() + 32  && e.getX() >= tempObject.getX()  )
                        && ( e.getY() <= tempObject.getY() + 32  && e.getY() >= tempObject.getY()  ) ) {
                    System.out.println("MouseDragged" );

                    tempObject.setX(e.getX() - 16);
                    tempObject.setY(e.getY() -16);
                }

            }
        }
    }
    public void setCoordinates(int x , int y , int index){
        GameObject tempObject = handler.object.get(index);
        tempObject.setX(x -16);
        tempObject.setY(y-16);

    }
}
