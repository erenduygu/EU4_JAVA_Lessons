package day16_ClassObjects;

public class BestBuy {

	public static void main(String[] args) {

CellPhone cellPhone1=new CellPhone();
CellPhone cellPhone2=new CellPhone();

System.out.println(cellPhone1.brand);
System.out.println(cellPhone1.color);
System.out.println(cellPhone1.price);
System.out.println(cellPhone1.screenSize);




cellPhone1.brand="Apple";
cellPhone1.color="Grey";
cellPhone1.price=50.0;
cellPhone1.screenSize=7.0;


System.out.println(cellPhone1.brand);
System.out.println(cellPhone1.color);
System.out.println(cellPhone1.price);
System.out.println(cellPhone1.screenSize);


cellPhone2.brand="Samsung";
cellPhone2.color="Black";
cellPhone2.price=40.0;
cellPhone2.screenSize=5.0;

System.out.println("brand : "+cellPhone2.brand);
System.out.println("color : "+cellPhone2.color);
System.out.println("color : "+cellPhone2.price);
System.out.println("screenSize : "+cellPhone2.screenSize);

cellPhone1.message();
cellPhone1.takeAphoto();
	}

}
