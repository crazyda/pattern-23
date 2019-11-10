package compositePattern;

/**
 * 
 * @ClassName: TextFile
 * @Description: 文本文件夹, 充当叶子构件 
 * @Author Crazy
 * @DateTime 2019年11月3日 上午11:47:12
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
		System.out.println("不支持该方法 add");
	}

	@Override
	public void remove(AbstractFile file) {
		// TODO Auto-generated method stub
		System.out.println("不支持该方法 remove");
	}

	@Override
	public AbstractFile getChild(int i) {
		// TODO Auto-generated method stub
		System.out.println("不支持该方法 getChild");
		return null;
	}

	@Override
	public void killVirus() {
		// TODO Auto-generated method stub
		System.out.println("对文本文件"+name+"杀毒");
	}

}
