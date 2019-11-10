package compositePattern;

import java.util.ArrayList;

/**
 * 
 * @ClassName: Folder
 * @Description: �ļ�����, �䵱���������� 
 * @Author Crazy
 * @DateTime 2019��11��3�� ����11:50:25
 */
public class Folder extends AbstractFile {
	private String name ;
	
	private ArrayList<AbstractFile> fileList = new ArrayList<AbstractFile>();
	
	
	public Folder(String name) {
		super();
		this.name = name;
	}

	@Override
	public void add(AbstractFile file) {
		// TODO Auto-generated method stub
		fileList.add(file);

	}

	@Override
	public void remove(AbstractFile file) {
		// TODO Auto-generated method stub
		fileList.remove(file);

	}

	@Override
	public AbstractFile getChild(int i) {
		// TODO Auto-generated method stub
		return fileList.get(i);
	}

	@Override
	public void killVirus() {
		// TODO Auto-generated method stub
		System.out.println("���ļ���"+name+"ɱ��");
		for(AbstractFile obj : fileList) {
			obj.killVirus();
		}
	}

}
