package facadePattern.abstractFacader;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 * @ClassName: FileWriter
 * @Description: �ļ�������, �䵱��ϵͳ��
 * @Author Crazy
 * @DateTime 2019��11��4�� ����9:25:42
 */
public class FileWriter {
	public void write(String encryptStr,String fileNameDes) {
		// TODO Auto-generated method stub
		System.out.println("��������,д���ļ�");
		try {
			FileOutputStream outFS = new FileOutputStream(fileNameDes);
			outFS.write(encryptStr.getBytes());
			outFS.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("�ļ�������");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("�ļ���������");
		}
		
	}
}
