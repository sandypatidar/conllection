public class OurCatch {
	public static void main(String[] args){
		int x = 100;
		int y = 0;
		try{
		System.out.println(" succesfull: "+(x/y));
		System.out.println("the current amount : "+ x);
		}
		catch (NullPointerException e){
			System.out.println("exception"+e.getMessage());
		}
        catch (ArithmeticException e){
			System.out.println("exception"+e.getMessage());
		}
		System.out.println("program countinue.....");
	}
}