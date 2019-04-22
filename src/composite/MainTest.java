package composite;

import java.util.List;

public class MainTest {

	public static void main(String[] args) {
		IFile rootFolder = new Folder("C:");
		IFile beifengFolder = new Folder("beifeng");
		rootFolder.add(new File("haha.txt"));
		beifengFolder.add(new File("qq.txt"));
		rootFolder.add(beifengFolder);
		displayTree(rootFolder);
	}
	
	public static void displayTree(IFile rootFolder) {
		rootFolder.display();
		List<IFile> child = rootFolder.getChild();
		for(IFile iFile: child){
			if(iFile instanceof File){
				iFile.display();
			}else {
				iFile.display();
				displayTree(iFile);
			}
		}
		
	}
	
	public static void getParentFolder(IFile iFile) {
		IFile parentFolder = iFile.getParentFolder(iFile);
	}
}
