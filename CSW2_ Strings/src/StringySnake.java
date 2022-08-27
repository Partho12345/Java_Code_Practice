
public class StringySnake {
	public static String Snakestr(String s) {
        StringBuilder snake = new StringBuilder();
        for(int i=1; i<s.length(); i+=4)
            snake.append(s.charAt(i));
        for(int i=0; i<s.length(); i+=2)
            snake.append(s.charAt(i));
        for(int i=3; i<s.length(); i+=4)
            snake.append(s.charAt(i));
        return snake.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "Siksha_'O'_Anusandhan";
		System.out.println("Given String: "+s+"\nSnake String: "+Snakestr(s));
	}
}
