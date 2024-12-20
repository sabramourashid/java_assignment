public class date {
    private int memberMonth;
    private int memberYr;
    private int memberDay;

    public date (int memberMonth, int memberYr, int memberDay) {
       // this.memberMonth = memberMonth;
        this.memberYr = memberYr;
        this.memberDay = memberDay;
        if (memberMonth >=1 && memberMonth <= 12) {
           this. memberMonth = memberMonth;

        }else{
           this.memberMonth = 1;
        }
    
    }

    public int displayDate() {
        System.out.println(memberDay + "/" + memberMonth + "/" + memberYr);
        return memberYr;}

    public static void main(String[] args) {
        date time = new date(20,12,2024);
        System.out.println(time.displayDate());
    }
}
