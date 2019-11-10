package facadePattern.abstractFacader;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 * @ClassName: FileWriter
 * @Description: 文件保存类, 充当子系统类
 * @Author Crazy
 * @DateTime 2019年11月4日 下午9:25:42
 */
public class FileWriter {
	public void write(String encryptStr,String fileNameDes) {
		// TODO Auto-generated method stub
		System.out.println("保存密文,写入文件");
		try {
			FileOutputStream outFS = new FileOutputStream(fileNameDes);
			outFS.write(encryptStr.getBytes());
			outFS.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("文件不存在");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("文件操作错误");
		}
		
	}
}
