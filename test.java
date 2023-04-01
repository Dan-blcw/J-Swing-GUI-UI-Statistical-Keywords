package searchWord;

import javax.swing.UIManager;

public class test {
    public static void main(String[] args) {
        try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new searchView();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
