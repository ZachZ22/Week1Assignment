
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		double itemPrice = 2.00;
		double amountOfMoneyInWallet = 100.00;
		int age = 31;
		int numberOfFriends = 31;
		String firstName = "Zachary";		
		String middleInitial = "C";		
		String lastName = "Zerbst";
		
		//A. Will show amount of money after buying Item.
		System.out.println(itemPrice - amountOfMoneyInWallet);
		
		//B. Will show the number of friend I have made each year.
		System.out.println(age / numberOfFriends);
		
		//C. Will print out my full name.
		System.out.println("My name is: " + firstName + " " + middleInitial + " " + lastName );
		
		
		
		//Will print my name
		System.out.println("My name is " + firstName + " " + middleInitial + " " + lastName  );
		//Will print my age
		System.out.println("I am " + age + "" +" years old.");
		//Will print number of friends
		System.out.println("I have " + numberOfFriends + " " + "friends.");
		//Will print amount of money i have
		System.out.println("I have " + amountOfMoneyInWallet + " " + "dollars in my wallet.");
		//Will print item price
		System.out.println("I am gonna buy my friend an item for " + itemPrice + " " + "dollars.");
		//Will print amount of money after buying item
		System.out.println("I will then have " + ( amountOfMoneyInWallet -  itemPrice )+  " "  + "dollars left over.");
		
		
	

		
		//System.out.println(age / numberOfFriends);
		
		
		
		
		
		
	}
		}

