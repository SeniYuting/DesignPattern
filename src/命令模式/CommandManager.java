package 命令模式;

import java.util.List;

// 这里仅有redo、undo部分

public class CommandManager {
	private List<AbstractCommand> undoList;
	private List<AbstractCommand> redoList;

	public void executeCommand(Command command) {
		command.dosth();
		undoList.add(command);
		redoList.clear(); // 执行新操作后，redo里的操作不能重做了
	}

	public void undo() {
		Command command = (Command) undoList.get(undoList.size() - 1);
		command.undo();
		undoList.remove(command);
		redoList.add(command);
	}

	public void redo() {
		Command command = (Command) redoList.get(redoList.size() - 1);
		command.dosth();
		redoList.remove(command);
		undoList.add(command);
	}
}
