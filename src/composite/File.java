package composite;

import java.util.List;

public class File implements IFile{

	private String name;
	
	public File(String name) {
		super();
		this.name = name;
	}

	@Override
	public void display() {
		System.out.println("文件的名称" + name);
	}

	@Override
	public boolean add(IFile iFile) {
		return false;
	}

	@Override
	public boolean remove(IFile iFile) {
		return false;
	}

	@Override
	public List<IFile> getChild() {
		return null;
	}

	@Override
	public IFile getParentFolder(IFile iFile) {
		
		return iFile;
	}

}
