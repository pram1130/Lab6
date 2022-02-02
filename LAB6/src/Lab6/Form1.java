package Lab6;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;

import java.util.Stack;
import org.eclipse.wb.swt.SWTResourceManager;
public class Form1 {

	protected Shell fm1;
	public static int num;
	public static int i = 0;
	public boolean backward = true;
	public boolean start = true;
	public int ans;
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Form1 window = new Form1();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		fm1.open();
		fm1.layout();
		while (!fm1.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */

	public static void getNum(int fm2num) {
		num = fm2num;
		i = num;
	}
	public int fac(int n) {
		if(n > 1) return n * fac(n - 1);
		else return 1;
	}
	protected void createContents() {
		fm1 = new Shell();
		fm1.setSize(450, 300);
		fm1.setText("Form1");
		
		Label label_line1 = new Label(fm1, SWT.SEPARATOR | SWT.HORIZONTAL);
		label_line1.setBounds(178, 236, 64, 2);
		
		Label label_line2 = new Label(fm1, SWT.SEPARATOR | SWT.VERTICAL);
		label_line2.setBounds(178, 127, 2, 111);
		
		Label label_line3 = new Label(fm1, SWT.SEPARATOR | SWT.VERTICAL);
		label_line3.setBounds(240, 127, 2, 111);
		
		Label lbStack1 = new Label(fm1, SWT.NONE);
		lbStack1.setAlignment(SWT.CENTER);
		lbStack1.setBounds(187, 215, 48, 15);
		
		Label lbStack2 = new Label(fm1, SWT.NONE);
		lbStack2.setAlignment(SWT.CENTER);
		lbStack2.setBounds(186, 194, 48, 15);
		
		Label lbStack3 = new Label(fm1, SWT.NONE);
		lbStack3.setAlignment(SWT.CENTER);
		lbStack3.setBounds(186, 173, 48, 15);
		
		Label lbStack4 = new Label(fm1, SWT.NONE);
		lbStack4.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lbStack4.setAlignment(SWT.CENTER);
		lbStack4.setBounds(186, 152, 48, 15);
		
		Label lbStack5 = new Label(fm1, SWT.NONE);
		lbStack5.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lbStack5.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		lbStack5.setAlignment(SWT.CENTER);
		lbStack5.setBounds(186, 131, 48, 15);
		
		Label lbPush = new Label(fm1, SWT.NONE);
		lbPush.setAlignment(SWT.RIGHT);
		lbPush.setBounds(110, 106, 70, 15);
		
		Label lbPop = new Label(fm1, SWT.NONE);
		lbPop.setBounds(240, 106, 70, 15);
		
		Label facAns = new Label(fm1, SWT.NONE);
		facAns.setBounds(248, 127, 176, 111);
		
		Button btnRun = new Button(fm1, SWT.NONE);
		btnRun.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(backward) {
					if(i > 1) {
						lbPush.setText((i-1) + "! Push");
					} else {
						lbPush.setText("");
					}
					lbPop.setText("");
				} else {
					lbPush.setText("");
					lbPop.setText("Pop " + (i-1) + "!");
					switch(i-1) {
					case 1:
						facAns.setText("Fac\t= 1\n\t= " + (ans = fac(i-1)));
						break;
					case 2:
						facAns.setText("Fac\t= 1x2\n\t= " + (ans = fac(i-1)));
						break;
					case 3:
						facAns.setText("Fac\t= 1x2x3\n\t= " + (ans = fac(i-1)));
						break;
					case 4:
						facAns.setText("Fac\t= 1x2x3x4\n\t= " + (ans = fac(i-1)));
						break;
					case 5:
						facAns.setText("Fac\t= 1x2x3x4x5\n\t= " + (ans = fac(i-1)));
						break;
					}
				}
				
				switch(num) {
				case 1:
					switch(i) {
					case 1:
						lbStack5.setText("1");
						lbStack4.setText("");
						lbStack3.setText("");
						lbStack2.setText("");
						lbStack1.setText("");
						break;
					case 2:
						lbStack5.setText("");
						lbStack4.setText("");
						lbStack3.setText("");
						lbStack2.setText("");
						lbStack1.setText("");
						break;
					case 3:
						fm1.close();
						break;
					}
					break;
				case 2:
					switch(i) {
					case 1:
						lbStack5.setText("1");
						lbStack4.setText("2");
						lbStack3.setText("");
						lbStack2.setText("");
						lbStack1.setText("");
						break;
					case 2:
						lbStack5.setText("2");
						lbStack4.setText("");
						lbStack3.setText("");
						lbStack2.setText("");
						lbStack1.setText("");
						break;
					case 3:
						lbStack5.setText("");
						lbStack4.setText("");
						lbStack3.setText("");
						lbStack2.setText("");
						lbStack1.setText("");
						break;
					case 4:
						fm1.close();
						break;
					}
					break;
				case 3:
					switch(i) {
					case 1:
						lbStack5.setText("1");
						lbStack4.setText("2");
						lbStack3.setText("3");
						lbStack2.setText("");
						lbStack1.setText("");
						break;
					case 2:
						lbStack5.setText("2");
						lbStack4.setText("3");
						lbStack3.setText("");
						lbStack2.setText("");
						lbStack1.setText("");
						break;
					case 3:
						lbStack5.setText("3");
						lbStack4.setText("");
						lbStack3.setText("");
						lbStack2.setText("");
						lbStack1.setText("");
						break;
					case 4:
						lbStack5.setText("");
						lbStack4.setText("");
						lbStack3.setText("");
						lbStack2.setText("");
						lbStack1.setText("");
						break;
					case 5:
						fm1.close();
						break;
					}
					break;
				case 4:
					switch(i) {
					case 1:
						lbStack5.setText("1");
						lbStack4.setText("2");
						lbStack3.setText("3");
						lbStack2.setText("4");
						lbStack1.setText("");
						break;
					case 2:
						lbStack5.setText("2");
						lbStack4.setText("3");
						lbStack3.setText("4");
						lbStack2.setText("");
						lbStack1.setText("");
						break;
					case 3:
						lbStack5.setText("3");
						lbStack4.setText("4");
						lbStack3.setText("");
						lbStack2.setText("");
						lbStack1.setText("");
						break;
					case 4:
						lbStack5.setText("4");
						lbStack4.setText("");
						lbStack3.setText("");
						lbStack2.setText("");
						lbStack1.setText("");
						break;
					case 5:
						lbStack5.setText("");
						lbStack4.setText("");
						lbStack3.setText("");
						lbStack2.setText("");
						lbStack1.setText("");
						break;
					case 6:
						fm1.close();
						break;
					}
					break;
				case 5:
					switch(i) {
					case 1:
						lbStack5.setText("1");
						lbStack4.setText("2");
						lbStack3.setText("3");
						lbStack2.setText("4");
						lbStack1.setText("5");
						break;
					case 2:
						lbStack5.setText("2");
						lbStack4.setText("3");
						lbStack3.setText("4");
						lbStack2.setText("5");
						lbStack1.setText("");
						break;
					case 3:
						lbStack5.setText("3");
						lbStack4.setText("4");
						lbStack3.setText("5");
						lbStack2.setText("");
						lbStack1.setText("");
						break;
					case 4:
						lbStack5.setText("4");
						lbStack4.setText("5");
						lbStack3.setText("");
						lbStack2.setText("");
						lbStack1.setText("");
						break;
					case 5:
						lbStack5.setText("5");
						lbStack4.setText("");
						lbStack3.setText("");
						lbStack2.setText("");
						lbStack1.setText("");
						break;
					case 6:
						lbStack5.setText("");
						lbStack4.setText("");
						lbStack3.setText("");
						lbStack2.setText("");
						lbStack1.setText("");
						break;
					case 7:
						fm1.close();
						break;
					}
					break;
				}
				if(i == 1) {
					backward = !backward;
				}
				if(backward) {
					i--;
				} else {
					i++;
				}
			}
		});
		btnRun.setBounds(54, 213, 75, 25);
		btnRun.setText("Run");
		
		label_line1.setVisible(false);
		label_line2.setVisible(false);
		label_line3.setVisible(false);
		lbStack1.setVisible(false);
		lbStack2.setVisible(false);
		lbStack3.setVisible(false);
		lbStack4.setVisible(false);
		lbStack5.setVisible(false);
		lbPush.setVisible(false);
		lbPop.setVisible(false);
		facAns.setVisible(false);
		btnRun.setVisible(false);
		
		Button btn1 = new Button(fm1, SWT.NONE);
		btn1.setFont(SWTResourceManager.getFont("TH Sarabun New", 14, SWT.NORMAL));
		btn1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				btn1.setVisible(false);
				Form2 window2 = new Form2();
				window2.open();
				lbPush.setText(num + "! Push");
				label_line1.setVisible(true);
				label_line2.setVisible(true);
				label_line3.setVisible(true);
				lbStack1.setVisible(true);
				lbStack2.setVisible(true);
				lbStack3.setVisible(true);
				lbStack4.setVisible(true);
				lbStack5.setVisible(true);
				lbPush.setVisible(true);
				lbPop.setVisible(true);
				facAns.setVisible(true);
				btnRun.setVisible(true);
			}
		});
		btn1.setBounds(142, 24, 168, 25);
		btn1.setText("Enter Factorial Number");
		
		
	}
}


