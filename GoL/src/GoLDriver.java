import javax.swing.JFrame;

public class GoLDriver {

	 public static void main(String[] args) {
	        String title = "Conway's Game of Life";
	        Conway game = new Conway();
	        JFrame frame = new JFrame(title);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setResizable(false);
	        frame.add(game.getGrid());
	        frame.pack();
	        frame.setVisible(true);
	        game.mainloop();
	    }
}
