package GUI;

import Game.Player;
import java.awt.Canvas;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.util.Random;

import static GUI.ID.Block;

public class GameFrame extends JFrame implements Runnable {
    private boolean running = false ;
    private Thread thread ;

    private BufferedImage board ;

    private Player one;
    private Player two ;




    private Handler handler ;




    public GameFrame(Player one , Player two ){
        this.one = one ;
        this.two = two ;
        //handler = new Handler();
        init();
        this.addKeyListener(new KeyInput(this.handler));
        this.addMouseListener(new MouseInput(this.handler));
        this.addMouseMotionListener( new MouseInput(this.handler));

        //handler.addObject(new GUICard(WIDTH/2 - 32, HEIGHT /2 -32, ID.PlayerOneCard));
        //handler.addObject(new GUICard(WIDTH/2 + 64, HEIGHT /2 -32, ID.PlayerTwoCard));


        this.setTitle("Illuminati Game!");
        this.setSize(800, 600);
        this.setVisible(true);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.start();
    }

    public void init(){

        BufferedImageLoader loader = new BufferedImageLoader();
        board = loader.loadImage("Board.png"); //loading the board

        handler = new Handler();

        loadImageLevel(board);
        //handler.addObject(new GUICard(100, 100, ID.PlayerOneCard));

        //handler.createBoard();
    }

    public synchronized void start(){
        if(running)
            return;
        running = true ;
        thread = new Thread(this);
        thread.start() ;
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
        //init();
        this.requestFocus();
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
            this.createBufferStrategy(3);
            return;
        }

        Graphics g = bs.getDrawGraphics();
        ///////////////////////////////////DRAW UNDER
        g.setColor(Color.black);
        g.fillRect(0,0, WIDTH, HEIGHT);

        handler.render(g);


        /////////////////////////////////////DRAW UPPER
        g.dispose();
        bs.show();
    }

    private void loadImageLevel(BufferedImage image){
        int w = image.getWidth();
        int h = image.getHeight();

        System.out.println("width, height: " + w + " " + h );

        for(int xx = 0 ; xx < h; xx++ ){
            for( int yy = 0 ; yy < w; yy++){
                int pixel = image.getRGB(xx, yy);
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel)& 0xff;

                if( red == 255  && green == 255 && blue == 255) handler.addObject(new Block(xx* 32, yy * 32, ID.Block));

            }
        }
    }

}
