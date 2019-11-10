package compositePattern;

/**
 * 
 * @ClassName: TextFile
 * @Description: �ı��ļ���, �䵱Ҷ�ӹ��� 
 * @Author Crazy
 * @DateTime 2019��11��3�� ����11:47:12
 */
public class TextFile extends AbstractFile {

	private String name;
	
	public TextFile(String name) {
		super();
		this.name = name;
	}

	@Override
	public void add(AbstractFile file) {
		// TODO Auto-generated method stub
		System.out.println("��֧�ָ÷��� add");
	}

	@Override
	public void remove(AbstractFile file) {
		// TODO Auto-generated method stub
		System.out.println("��֧�ָ÷��� remove");
	}

	@Override
	public AbstractFile getChild(int i) {
		// TODO Auto-generated method stub
		System.out.println("��֧�ָ÷��� getChild");
		return null;
	}

	@Override
	public void killVirus() {
		// TODO Auto-generated method stub
		System.out.println("���ı��ļ�"+name+"ɱ��");
	}

}
