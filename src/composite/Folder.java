package composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IFile{

	private String name;
	private List<IFile> chldren;
	
	public Folder(String name) {
		super();
		this.name = name;
		this.chldren = new ArrayList<>();
	}

	@Override
	public void display() {
		System.out.println(name);
	}

	@Override
	public boolean add(IFile iFile) {
		return chldren.add(iFile);
	}

	@Override
	public boolean remove(IFile iFile) {
		return chldren.remove(iFile);
	}

	@Override
	public List<IFile> getChild() {
		
		return chldren;
	}

	@Override
	public IFile getParentFolder(IFile iFile) {
		
		return null;
	}

}
