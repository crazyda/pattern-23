package bridgePattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Image image ;
		ImageImp imp ;
		image = new JPGImage();
		imp = new WindowsImp();
		image.setImageImp(imp);
		image.parseFile("Ð¡ÁúÅ®");
	}

}
