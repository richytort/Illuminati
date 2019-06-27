package GUI;
import GUI.GameFrame;
import java.awt.*;
import java.util.LinkedList;

public class Handler {
    LinkedList<GameObject> object = new LinkedList<GameObject>();
    private GameObject tempObject;

    public void tick(){
        for(int i = 0 ; i < object.size(); i++){
            tempObject = object.get(i);

            tempObject.tick();
        }

    }

    public void render(Graphics g){
        for(int i = 0 ; i < object.size() ; i++){
            GameObject tempObject = object.get(i);

            tempObject.render(g);
        }
    }

    public void addObject(GameObject object){
        this.object.add(object);
    }

    public void removeObject(GameObject object){
        this.object.remove(object);
    }

    public void createBoard(){
        for(int xx = 0 ; xx < GameFrame.WIDTH + 64; xx++){
            addObject(new GUICard(xx, GameFrame.HEIGHT - 64 , ID.PlayerOneCard ));

        }

    }
}
