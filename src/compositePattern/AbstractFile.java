package compositePattern;

/**
 * 
 * @ClassName: AbstractFile
 * @Description: �����ļ���, �䵱���󹹼��� 
 * @Author Crazy
 * @DateTime 2019��11��3�� ����11:43:50
 */
public abstract class AbstractFile {
	public abstract void add(AbstractFile file);
	public abstract void remove(AbstractFile file);
	public abstract  AbstractFile getChild(int i) ;
	public abstract void killVirus();
}
