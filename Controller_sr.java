package searchWord;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller_sr implements ActionListener{
    private searchView srView;
    public Controller_sr(searchView srView){
        this.srView = srView;
    }
    public void setSrView(searchView srView) {
        this.srView = srView;
    }
    public searchView getSrView() {
        return srView;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if(src.equals("Statistical")){
            this.srView.countWord();
        }        
    }

}
