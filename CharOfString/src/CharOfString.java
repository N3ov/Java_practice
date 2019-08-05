public class CharOfString {

    private String sent;

    public CharOfString() {
        sent = "";
    }

    public CharOfString(String sent) {
        this.sent = sent;
    }

    public String getCharOfString() {
        return sent;
    }

    public void setCharOfString(String sent){
        this.sent = sent;
    }

    public void CharOfString(){
        char cha[] = new char[this.sent.length()];
        for (int i = 0; i < this.sent.length(); i++){

            cha[i] = this.sent.charAt(i);
            System.out.print(cha[i]+ " ");
        }
    }

}
