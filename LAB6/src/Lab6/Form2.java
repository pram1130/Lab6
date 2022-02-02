package Lab6;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.wb.swt.SWTResourceManager;

public class Form2 {

	protected Shell fm2;
	private Text text;
	public int num;

	/**
	 * Launch the application.
	 * @param args
	 */
//	public static void main(String[] args) {
//		try {
//			form2 window = new form2();
//			window.open();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		fm2.open();
		fm2.layout();
		while (!fm2.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 * @wbp.parser.entryPoint
	 */
	protected void createContents() {
		fm2 = new Shell();
		fm2.setSize(450, 300);
		fm2.setText("Form2");
		
		text = new Text(fm2, SWT.BORDER);
		text.setFont(SWTResourceManager.getFont("TH Sarabun New", 24, SWT.NORMAL));
		text.setBounds(99, 34, 247, 66);
		
		Button btn = new Button(fm2, SWT.NONE);
		btn.setFont(SWTResourceManager.getFont("TH Sarabun New", 24, SWT.NORMAL));
		btn.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				num = Integer.valueOf(text.getText());
				Form1.getNum(num);
				fm2.close();
			}
		});
		btn.setBounds(99, 109, 247, 66);
		btn.setText("Enter");
		
	}
}



