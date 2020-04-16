package designModel.composite;

import java.util.List;

public interface IFile {

	public void display();
	
	public boolean add(IFile iFile);
	
	public boolean remove(IFile iFile);
	
	public List<IFile> getChild();
	
	public IFile getParentFolder(IFile iFile);
}
