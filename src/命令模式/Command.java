package 命令模式;

public class Command extends AbstractCommand {  // 这里的Command分别为Copy、Paste、Modify
	void update() {
	}

	void clear() {
	}

	@Override
	public boolean dosth() { // 执行命令和重做
		update();
		return true;
	}

	@Override
	public boolean undo() { // 执行撤销操作
		clear();
		return true;
	}
}
