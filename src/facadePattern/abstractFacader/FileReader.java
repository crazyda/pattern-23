package facadePattern.abstractFacader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 
 * @ClassName: FileReader
 * @Description: �ļ���ȡ��,�䵱��ϵͳ 
 * @Author Crazy
 * @DateTime 2019��11��4�� ����9:14:51
 */
public class FileReader {
	
	public String read(String fileNameSrc) {
		System.out.println("��ȡ�ļ�,��ȡ����");
		StringBuffer sb = new StringBuffer();
		try {
			FileInputStream inFS = new FileInputStream(fileNameSrc);
			int data;
			while((data = inFS.read()) != -1) {
				sb = sb.append(data);
			}
			inFS.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("�ļ�������");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("�ļ���������");
		}
		return sb.toString();
	}

}
