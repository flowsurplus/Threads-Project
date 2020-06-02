import java.util.Random;
//Michael Jay Marajas    
//COP 2805C

//The video "Java Threads" by Colin Archibald really guided me in this project
//The video link is https://www.youtube.com/watch?v=VuahrRY0TgU&feature=youtu.be 
//(for the advanced threads)
//FOr the basic threads, the link is https://www.youtube.com/watch?v=zr-gFTKyLYs&feature=youtu.be

public class Animal extends Food implements Runnable {
	private String name;
	int position = 0;
	private int speed; 
	private int restMax;
	static boolean winner = false;
	int finishline = 100;
	//I made it equal to restMax to better integrate with the code. 
	Food food = new Food(this.restMax);
	
	//This is needed to make the random statement work for later
	//I couldn't use Math.random()
	private Random random = new Random();
	
	public Animal (String name, int speed, int restMax, int food) {
		super(food);
		this.name = name;
		this.speed = speed;
		this.restMax = restMax;
		
	}
	//I learned that every implements Runnable class only has the run method to be called on while the 
	//extends Thread class has run, start, etc methods to be called on
	//This run method is a secondary user thread in comparison to the 
	//primary thread, the main class in MainRace
	
	//This run method is truly a beauty. I called the run method using start() in the main, which only 
	//works since it's converted to a thread in main
	//This is also the first time I used multi-threading concepts as well
	public void run() {
		while (this.position <= finishline && !winner) {

            System.out.println(this.name + " : " + this.position + " yards");
            
            //I also learned that every sleep method call needs to be surrounded by
            //a try-catch block
            try {
            	int rest = this.random.nextInt(this.restMax);
                Thread.sleep(rest);
                
                this.position += this.speed;

                System.out.println();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (this.position >= finishline) {

                winner = true;

                System.out.println("The race is over!");
                System.out.println(this.name + " wins!");
            }
		}
		
		System.out.println();
		System.out.println(this.name + ":");
		//The eat method call is enclosed within the run method of the Animal class
		//after the while loop is finished with its run
	    food.eat();
	}

	//These are the Getters and Setters for the parameters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getRestMax() {
		return restMax;
	}
	public void setRestMax(int restMax) {
		this.restMax = restMax;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}
	

}
