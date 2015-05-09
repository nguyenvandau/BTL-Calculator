import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.Transferable;

public class CopyPaste implements ClipboardOwner {

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

	@Override
	public void lostOwnership(Clipboard clipboard, Transferable contents) {
		
	}

}
