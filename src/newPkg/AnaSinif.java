package newPkg;

public class AnaSinif {

	public static void main(String[] args) {
		DugumSinif ogr1=new DugumSinif(); // bellekte düğüm oluşturduk
		DugumSinif ogr2=new DugumSinif();
		DugumSinif ogr3=new DugumSinif();
		
		ogr1.yas=12; //düğümlere değerler atadık
		ogr2.yas=21;
		ogr3.yas=23;
		
		ogr1.next=ogr2;
		ogr2.next=ogr3;
		ogr3.next=null;
		DugumSinif temp=ogr1;
		
		
		while(temp!=null) {  // düğümlerin üzerinde dolaştık
			System.out.println(temp.yas);
			temp=temp.next;
		}
	}

}
