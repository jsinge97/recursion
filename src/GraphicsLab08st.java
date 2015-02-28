// GraphicsLab08st.java
// The student, starting version of the GraphicsLab08 assignment.


import java.awt.*;
import java.applet.*;


public class GraphicsLab08st extends Applet
{	
	
	public void paint (Graphics g)
	{
		drawSquare1(g,1280,800);
		
		
	}
	
	public void drawSquare1(Graphics g, int maxX, int maxY)
	{
		int midX = maxX/2;
		System.out.println("midx:" + midX);
		int midY = maxY/2;
		System.out.println("midy:" + midY);
		int startWidth = maxX/4;
		System.out.println("startwidth:" + startWidth);
		int startHeight = maxY/4;
		System.out.println("startheight:" + startHeight);
		int tlX = midX - (startWidth/2);
		System.out.println("tlx" + tlX);
		int tlY = midY - (startHeight/2);
		System.out.println("tly" + tlY);
		g.fillRect(tlX,tlY,startWidth,startHeight);
		drawSquare2(g,midX + startWidth, midY + startHeight);
	}
	
	public void drawSquare2(Graphics g, int maxX, int maxY)
	{ 
		int midX = maxX/2;
		System.out.println("midx2:" + midX);
		int midY = maxY/2;
		System.out.println("midy2:" + midY);
		int startWidth = maxX/4;
		System.out.println("startwidth2:" + startWidth);
		int startHeight = maxY/4;
		System.out.println("startheight2:" + startHeight);
		int tlX = startWidth;
		System.out.println("tlx2:" + tlX);
		int tlY = startHeight;
		System.out.println("tly2:" + tlY);
		
		g.fillRect(tlX,tlY,startWidth,startHeight);
		
		
		if (startWidth >= 2) {
			drawSquare2(g,midX, midY);
			
		}
	}
	
	
	
	public void delay(long n)
	{
		n *= 1000;
		long startDelay = System.nanoTime();
		long endDelay = 0;
		while (endDelay - startDelay < n)
			endDelay = System.nanoTime();
	}
			
}


