import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Calculadora {

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = Display.getDefault();
		Shell shell = new Shell();
		shell.setSize(186, 213);
		shell.setText("Calculadora");
		
		Button btnNum1 = new Button(shell, SWT.NONE);
		btnNum1.setBounds(10, 92, 31, 34);
		btnNum1.setText("1");
		
		Button btnNum2 = new Button(shell, SWT.NONE);
		btnNum2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNum2.setText("2");
		btnNum2.setBounds(47, 92, 31, 34);
		
		Button btnNum3 = new Button(shell, SWT.NONE);
		btnNum3.setText("3");
		btnNum3.setBounds(84, 92, 31, 34);
		
		Button btnNum4 = new Button(shell, SWT.NONE);
		btnNum4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNum4.setText("4");
		btnNum4.setBounds(10, 52, 31, 34);
		
		Button btnNum5 = new Button(shell, SWT.NONE);
		btnNum5.setText("5");
		btnNum5.setBounds(47, 52, 31, 34);
		
		Button btnNum6 = new Button(shell, SWT.NONE);
		btnNum6.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNum6.setText("6");
		btnNum6.setBounds(84, 52, 31, 34);
		
		Button btnNum7 = new Button(shell, SWT.NONE);
		btnNum7.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNum7.setText("7");
		btnNum7.setBounds(10, 10, 31, 34);
		
		Button btnNum8 = new Button(shell, SWT.NONE);
		btnNum8.setText("8");
		btnNum8.setBounds(47, 10, 31, 34);
		
		Button btnNum9 = new Button(shell, SWT.NONE);
		btnNum9.setText("9");
		btnNum9.setBounds(84, 10, 31, 34);
		
		Button btnNum0 = new Button(shell, SWT.NONE);
		btnNum0.setText("0");
		btnNum0.setBounds(10, 132, 31, 34);
		
		Button btnIgual = new Button(shell, SWT.NONE);
		btnIgual.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnIgual.setText("=");
		btnIgual.setBounds(47, 132, 69, 34);
		
		Button btnOpSuma = new Button(shell, SWT.NONE);
		btnOpSuma.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnOpSuma.setText("+");
		btnOpSuma.setBounds(128, 92, 31, 34);
		
		Button btnOpProd = new Button(shell, SWT.NONE);
		btnOpProd.setText("*");
		btnOpProd.setBounds(128, 52, 31, 34);
		
		Button btnOpDivi = new Button(shell, SWT.NONE);
		btnOpDivi.setText("/");
		btnOpDivi.setBounds(128, 10, 31, 34);
		
		Button btnOpDifer = new Button(shell, SWT.NONE);
		btnOpDifer.setText("-");
		btnOpDifer.setBounds(128, 132, 31, 34);

		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
