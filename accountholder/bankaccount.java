package accountholder;

public class bankaccount {
		
		String firstName;
		String lastName;
		int age;
		float accountBalance;
		boolean checkCredit;
		public void checkCredit(){
			checkCredit =false;
		if(age>20 && accountBalance>=20000)
		{
		checkCredit =true;
		System.out.println("This account holder is eligible for credit-"+checkCredit);
		}
		else 
			System.out.println("This account holder is not eligible for credit-"+checkCredit);
		
		
		}
		}

