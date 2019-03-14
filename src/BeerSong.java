public class BeerSong {
	public static void main (String[] args) {
		int beerNum = 99;
		String word = "bottles";

		while(beerNum > 0) {

			if(beerNum == 1) {
				word = "bottle"; // Singular, as in One bottle of beer
			}

			System.out.println(beerNum + word + "of beer on the wall");
			System.out.println(beerNum + word + "of beer.");
			System.out.println("Take on down.");
			System.out.println("Pass it around.");

			beerNum -= 1;

			System.out.println(beerNum + word + "of beer on the wall.");

		} // Close while loop
	} // Close main method
} // Close class
