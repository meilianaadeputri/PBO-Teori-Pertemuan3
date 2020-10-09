import java.util.Scanner;

class hadiah3 {
	public static void main (String args[]){
		int aa=5;
		int bb=6;
		float cc=0.5f;
		
		System.out.println("aa + bb = " + (aa+bb));
		System.out.println("aa x bb x cc = " + (aa*bb*cc));
		System.out.println("bb / cc = " + (bb/cc));
		System.out.println("----------------------------");
		
		Scanner input =  new Scanner (System.in);
		String nama, alamat, umur;
		System.out.print("Nama   : ");
			nama = input.nextLine();
		System.out.print("Alamat : ");
			alamat = input.nextLine();
		System.out.print("Umur   : ");
			umur = input.nextLine();
		System.out.println("Saudara " + nama + " tinggal di " + alamat + " berumur " + umur + " tahun.");;
	}
}