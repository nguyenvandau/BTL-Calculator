import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.Transferable;

public class CopyPaste implements ClipboardOwner {

	Clipboard clip;
	String ctxt;

	@Override
	public void lostOwnership(Clipboard clipboard, Transferable contents) {
		
	}

}
