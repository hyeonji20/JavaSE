package section10.access1;

public class MountainBike extends Bicycle {
	
	public boolean isSuspension;
	
	@Override
	public void getInfo() {
		super.getInfo();   // �θ� getInfo() ȣ��
		System.out.println("isSuspension: " + isSuspension);
	}
	
	

}
