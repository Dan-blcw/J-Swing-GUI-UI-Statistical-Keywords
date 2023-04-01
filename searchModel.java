package searchWord;

public class searchModel {
    private String paRagraph; 
    private String keyWord;
    private String reSult;
    public searchModel(){
        this.paRagraph = "";
        this.keyWord = "";
        this.reSult = "";
    }
    public String getkeyWord() {
        return keyWord;
    }
    public String getReSult() {
        return reSult;
    }
    public String getWoRd() {
        return paRagraph;
    }
    public void setkeyWord(String keyWord) {
        this.keyWord = keyWord;
    }
    public void setReSult(String reSult) {
        this.reSult = reSult;
    }
    public void setWoRd(String paRagraph) {
        this.paRagraph = paRagraph;
    }
    public void countWord(){
        int cnt = 0;
        int inDex=0;
        while(true){
            int i = this.paRagraph.indexOf(this.keyWord,inDex);
            if(i==-1){// không tìm thấy
                break;
            }else{
                cnt++;inDex = i+1;
                
            }

        }
        this.reSult = " there are "+cnt+ " keywords of "+this.keyWord;
    }
}
