/*//Protected
//package basics;

public class ProtectedA1 {

	protected void msg()
	{
		System.out.println("Protected method");
	}

}

//=================== ================== =====================================   =================

//package basics;

public class ProtectedEx {

	public static void main(String[] args) {
		

		ProtectedA1 obj = new ProtectedA1();
		obj.msg();

	}

}

//******************************* ***************************==*****************************************************

//package intermediate;

//import basics.ProtectedA1;

public class PProtectedInDiffPkg extends ProtectedA1 {

	public static void main(String[] args) {
		
		ProtectedInDiffPkg obj = new ProtectedInDiffPkg();
		obj.msg();

	}

}*/