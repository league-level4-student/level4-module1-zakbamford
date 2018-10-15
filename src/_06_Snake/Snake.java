package _06_Snake;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Snake {
	public static final Color SNAKE_COLOR = Color.BLUE;
	public static final int BODY_SIZE = 50;

	private SnakeSegment head;
	private ArrayList<SnakeSegment> snake;

	private Direction currentDirection;

	private boolean canMove = true;

	public Snake(Location location) {
		snake = new ArrayList<SnakeSegment>();
		head = new SnakeSegment(location, BODY_SIZE);
		snake.add(head);

		currentDirection = Direction.RIGHT;
	}

	public void feed() {
		// 1. add a new SnakeSegment object to the snake
		snake.add(new SnakeSegment(snake.get(0).getLocation(), BODY_SIZE));
	}

	public Location getHeadLocation() {
		// 2. return the location of the snake's head
		return head.getLocation();
	}

	public void update() {
		// 1. use a switch statement to check on the currentDirection
		// of the snake and calculate its next x and y position.
		System.out.println(head.getLocation().x + ", " + head.getLocation().y);
		Location newHead = null;
		switch (currentDirection) {
		case UP:
			newHead = (new Location(getHeadLocation().x, getHeadLocation().y - 1));
			break;
		case RIGHT:
			newHead = (new Location(getHeadLocation().x + 1, getHeadLocation().y));
			break;
		case DOWN:
			newHead = (new Location(getHeadLocation().x, getHeadLocation().y + 1));
			break;
		case LEFT:
			newHead = (new Location(getHeadLocation().x - 1, getHeadLocation().y));
			break;
		default:
			System.out.println("Something went wrong");
			break;
		}

		// 2. Iterate through the SnakeSegments in reverse order
		for (int i = snake.size() - 1; i > 0; i--) {

			// 2a. Update each snake segment to the location of the segment
			// in front of it.
			SnakeSegment s1 = snake.get(i);
			SnakeSegment s2 = snake.get(i - 1);
			s1.setLocation(s2.getLocation());

			// 3. set the location of the head to the new location calculated in step 1
			head.setLocation(newHead);

			// 4. set canMove to true
			canMove = true;
		}
	}

	public void setDirection(Direction d) {
		// 1. set the current direction equal to the passed in Direction only if canMove
		// is true.
		// set canMove equal to false.
		// make sure the snake cannot completely reverse directions.
		if ((!((d == Direction.DOWN && currentDirection == Direction.UP)
				|| (d == Direction.LEFT && currentDirection == Direction.RIGHT)
				|| (d == Direction.UP && currentDirection == Direction.DOWN)
				|| (d == Direction.RIGHT && currentDirection == Direction.LEFT))) && canMove)
			canMove = false;
	}

	public void reset(Location loc) {
		// 1. clear the snake
		snake = new ArrayList<SnakeSegment>();

		// 2. set the location of the head
		head.setLocation(loc);

		// 3. add the head to the snake
		snake.add(head);
	}

	public boolean isOutOfBounds() {
		// 1. complete the method so it returns true if the head of the snake is outsize
		// of the window
		// and false otherwise
		int x = head.getLocation().x;
		int y = head.getLocation().y;
		if (x < 0 || y < 0 || x >= _00_SnakeGame.WIDTH || y >= _00_SnakeGame.HEIGHT) {
			return true;
		}
		return false;
	}

	public boolean isHeadCollidingWithBody() {
		// 1. complete the method so it returns true if the head is located
		// in the same location as any other body segment
		for (int i = 1; i < snake.size(); i++) {
			if (head.getLocation().equals(snake.get(i).getLocation()))
				return true;
		}
		return false;
	}

	public boolean isLocationOnSnake(Location loc) {
		// 1. complete the method so it returns true if the passed in
		// location is located on the snake
		for (SnakeSegment s : snake) {
			if (s.getLocation().equals(loc))
				return true;
		}
		return false;
	}

	public void draw(Graphics g) {
		for (SnakeSegment s : snake) {
			s.draw(g);
		}
	}
}
