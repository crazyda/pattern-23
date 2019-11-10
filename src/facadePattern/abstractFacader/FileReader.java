package facadePattern.abstractFacader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 
 * @ClassName: FileReader
 * @Description: 文件读取类,充当子系统 
 * @Author Crazy
 * @DateTime 2019年11月4日 下午9:14:51
 */
public class FileReader {
	
	public String read(String fileNameSrc) {
		System.out.println("读取文件,获取明文");
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
			System.out.println("文件不存在");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("文件操作错误");
		}
		return sb.toString();
	}

}
