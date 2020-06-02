//Michael Jay Marajas    
//COP 2805C
//The video "Java Threads" by Colin Archibald really guided me in this project
//The video link is https://www.youtube.com/watch?v=VuahrRY0TgU&feature=youtu.be 
//(for the advanced threads)
//FOr the basic threads, the link is https://www.youtube.com/watch?v=zr-gFTKyLYs&feature=youtu.be

public class MainRace {
	 
	
	public static void main(String[] args) {
		//Racing Exercise
		//The start method should run the run method as well as the eat method
		//I set the Food int parameter to be run after the race has finished. 
		Thread Rabbit = new Thread(new Animal("Rabbit", 5, 150, 8000));
		Rabbit.start();
		Thread Tortoise = new Thread(new Animal("Tortoise", 3, 100, 3000));
		Tortoise.start();
		
		
	}
	
}
