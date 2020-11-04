package accountholder;

public class dataforbank {
	public static void main(String[] args)
	{
     bankaccount yaswin = new bankaccount();
     bankaccount kannan = new bankaccount();
     bankaccount madhu = new bankaccount();
     
     yaswin.firstName="yaswin";
     yaswin.lastName="kannan";
     yaswin.age=5;
     yaswin.accountBalance=15246.32f;
     System.out.println("yaswin account balance is "+yaswin.accountBalance);
     System.out.println("yaswin age is "+yaswin.age);yaswin.checkCredit();
     System.out.println("yaswin = "+yaswin.checkCredit);
     
     System.out.println();

     kannan.firstName="kannan";
     kannan.lastName="arjunan";
     kannan.age=35;
     kannan.accountBalance=1215246.32f;
     System.out.println("kannan account balance is "+kannan.accountBalance);
     System.out.println("kannan age is "+kannan.age);
     kannan.checkCredit();
     System.out.println("kannan = "+kannan.checkCredit);
     
     System.out.println();
     
     madhu.firstName="madhu";
     madhu.lastName="kannan";
     madhu.age=30;
     madhu.accountBalance=2021601.20f;
     System.out.println("madhu account balance is "+madhu.accountBalance);
     System.out.println("madhu age is "+madhu.age);madhu.checkCredit();
     System.out.println("madhu =" +madhu.checkCredit);
     
}
}