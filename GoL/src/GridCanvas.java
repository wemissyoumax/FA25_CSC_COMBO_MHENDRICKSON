import java.awt.Canvas;
import java.awt.Graphics;

public class GridCanvas extends Canvas{
	private Cell[][] array;
	
	public GridCanvas (int rows, int cols, int size) {
		array = new Cell[rows][cols];
		for (int r = 0; r < rows; r ++) {
			int y = r * size;
			for (int c = 0; c < cols; c++) {
				int x = c * size;
				array[r][c] = new Cell(x, y, size);
			}
		}
	// set the canvas size
	setSize(cols * size, rows * size);
	}
	// draw the grid & each cell
	public void draw(Graphics g) {
		for (Cell[] row: array) {
			for (Cell cell : row) {
				cell.draw(g);
			}
		}
	}
	// call paint method for GridCanvas
	public void paint(Graphics g) {
		draw(g);
	}
	// return number of rows & cols using length
	public int numRows() {
		return array.length;
	}
	public int numCols() {
		return array[0].length;
	}
	// get cell at given location & turn it on
	public Cell getCell(int r, int c) {
		return array[r][c];
	}
	// start the board with "alive" cells
	public void turnOn(int r, int c) {
		array[r][c].turnOn();
	}
	public int test(int r, int c) {
	    try {
	        if (array[r][c].isOn()) {
	            return 1;
	        }
	    } catch (ArrayIndexOutOfBoundsException e) {
	        // cell doesn't exist
	    }
	    return 0;
	}
}

