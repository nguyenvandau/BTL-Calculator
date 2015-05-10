import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.Transferable;

public class CopyPaste implements ClipboardOwner {

// interface ClipboardOwner chỉ rõ interface cho các class..
// ..mà sẽ cung cấp data tới một clipboard.

	Clipboard clip;
	String ctxt;
	
	CopyPaste()
	{
  		clip = new Clipboard("clip");
        	ctxt = null;
	}
 
    	void doCopy(String txt)
    	{
        	StringSelection trans = new StringSelection(txt);
        	clip.setContents(trans, this);
    	}
	void doPaste() {
		ctxt = null;
		Transferable toPaste = clip.getContents(this);
		if (toPaste != null) {
			try {
				ctxt = (String) toPaste
						.getTransferData(DataFlavor.stringFlavor);
			} catch (Exception e) {
				System.out.println("Error -- " + e.toString());
			}
		}

	}
	
	// phương thức khai báo object này ko còn sở hữu clipboard nữa.
	@Override
	public void lostOwnership(Clipboard clipboard, Transferable contents) {
		
	}

}
