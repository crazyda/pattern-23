/**
 * @Title: AbstractIterator.java
 * @Package iteratorPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019年11月8日 下午10:45:27
 * @version V1.0
 */

package iteratorPattern;

/**
 * @ClassName: AbstractIterator
 * @Description:  抽象迭代器
 * @Author Crazy
 * @DateTime 2019年11月8日 下午10:45:27 
 */

public interface AbstractIterator {
		public void next();// 移至下一个元素
		public boolean isLast(); //判断是否是最后一个元素
		public void previous(); //移至上一个元素
		public boolean isFirst(); // 判断是否是第一个元素
		public Object getNextItem();//获取下一个元素
		public Object getPreviousItem() ;// 获取上一个元素
}
