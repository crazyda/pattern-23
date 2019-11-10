package compositePattern;

/**
 * 
 * @ClassName: AbstractFile
 * @Description: 抽象文件类, 充当抽象构件类 
 * @Author Crazy
 * @DateTime 2019年11月3日 上午11:43:50
 */
public abstract class AbstractFile {
	public abstract void add(AbstractFile file);
	public abstract void remove(AbstractFile file);
	public abstract  AbstractFile getChild(int i) ;
	public abstract void killVirus();
}
