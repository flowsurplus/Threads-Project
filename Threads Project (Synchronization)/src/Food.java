//Michael Jay Marajas    
//COP 2805C
//The video "Java Threads" by Colin Archibald really guided me in this project
//The video link is https://www.youtube.com/watch?v=VuahrRY0TgU&feature=youtu.be 
//(for the advanced threads)
//FOr the basic threads, the link is https://www.youtube.com/watch?v=zr-gFTKyLYs&feature=youtu.be

public class Food{
	private int food;
	
	//The integer parameter eating describes the "rest" period 
	public Food (int food) {
		this.food = food;
		
	}
	
	//The eat method as described by the assignment
	public void eat() {
		System.out.println("I am starting to eat");
		  try {
          	 int rest = this.food;
              Thread.sleep(rest);
              
              System.out.println();

          } catch (InterruptedException e) {
              e.printStackTrace();
          }
		  System.out.println("I am done eating now.");
	}
	
	//The Getters and Setters for the parameters
	public int getFood() {
		return food;
	}
	public void setFood(int food) {
		this.food = food;
	}
	

}
