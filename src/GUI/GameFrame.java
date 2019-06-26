package GUI;

import Game.Player;
import java.awt.Canvas;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;
import java.util.Random;

public class GameFrame extends JFrame implements Runnable {
    private JPanel panel ;
    private Player one;
    private Player two ;

    private final int WIDTH = 1080, HEIGHT = WIDTH / 12 * 9 ;

    private Thread thread ;
    private boolean running = false ;

    private Handler handler ;



    public GameFrame(Player one , Player two ){
        this.one = one ;
        this.two = two ;
        handler = new Handler();
        Random r = new Random();
        for(int i = 0 ; i < 50 ;i++){
            handler.addObject(new GUICard(r.nextInt(WIDTH), r.nextInt(HEIGHT), ID.PlayerOneCard));

        }

        this.setTitle("Illuminati Game!");
        this.setSize(WIDTH, HEIGHT);
        this.setVisible(true);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.start();
    }



    public synchronized void start(){
        thread = new Thread(this);
        thread.start() ;
        running = true ;
    }

    public synchronized void stop(){
        try{
            thread.join();
            running = false ;
        }catch(Exception e){
            e.printStackTrace() ;
        }
    }

    public void run()
    {
        long lastTime = System.nanoTime();
        double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        long timer = System.currentTimeMillis();
        int frames = 0;
        while(running)
        {
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            while(delta >=1)
            {
                tick();
                delta--;
            }
            if(running)
                render();
            frames++;

            if(System.currentTimeMillis() - timer > 1000)
            {
                timer += 1000;
                System.out.println("FPS: "+ frames);
                frames = 0;
            }
        }
        stop();
    }
    private void tick(){
        handler.tick();
    }

    private void render(){
        BufferStrategy bs = this.getBufferStrategy();
        if(bs == null){
            System.out.println("In Null");
            this.createBufferStrategy(3);
            return;
        }

        Graphics g = bs.getDrawGraphics();

        g.setColor(Color.blue);
        g.fillRect(0,0, WIDTH, HEIGHT);

        handler.render(g);

        g.dispose();
        bs.show();
    }

}
