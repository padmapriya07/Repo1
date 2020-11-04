package accountholder;

public class bankaccount {
		
		String firstName;
		String lastName;
		int age;
		float accountBalance;
		boolean checkCredit;
		String address = "Vivekananda St";
		public void checkCredit(){
			checkCredit =false;
		if(age>20 && accountBalance>=20000)
		{
		checkCredit =true;
		System.out.println("This account holder is eligible for credit-"+checkCredit+"- addtess -"+ address);
		}
		else 
			System.out.println("This account holder is not eligible for credit-"+checkCredit);
		
		
		}
		}

