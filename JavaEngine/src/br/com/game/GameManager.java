package br.com.game;

import java.awt.event.KeyEvent;

import br.com.engine.AbstractGame;
import br.com.engine.GameContainer;
import br.com.engine.Renderer;
import br.com.engine.audio.SoundClip;
import br.com.engine.gfx.Image;
import br.com.engine.gfx.ImageTile;

public class GameManager extends AbstractGame
{
	private Image image;
	private Image image2;
	private SoundClip clip;
	
	public GameManager()
	{
		image = new Image("/test.png");
		image2 = new Image("/test2.png");
		image2.setAlpha(true);
		clip = new SoundClip("/audio/test.wav");
	}
	
	@Override
	public void update(GameContainer gc, float dt)
	{
		if(gc.getInput().isKeyDown(KeyEvent.VK_A))
			{
				clip.play();
				System.out.println("Comeca a musica");
			}
		
		if(gc.getInput().isKeyDown(KeyEvent.VK_B))
		{
			System.out.println("Termina a musica");
			clip.stop();
		}
		
		
		temp += dt * 20;
		
		if (temp >3)
		{
			temp = 0;
		}
	}

	float temp = 0;
	
	@Override
	public void render(GameContainer gc, Renderer r)
	{

		r.drawImage(image, 10, 10);
		r.drawImage(image2, gc.getInput().getMouseX() , gc.getInput().getMouseY());
	}
	
	public static void main(String args[]) 
	{
		GameContainer gc = new GameContainer(new GameManager());
		gc.setWidth(320);
		gc.setHeight(240);
		gc.setScale(3f);
		gc.start();
	}

}
