package GetterSetter;

public class Sinhvien {
    private String Ten;
    private String Tuoi;

    public String getTen() {
        return Ten;
    }
    public void setTen(String Ten) {
        if (Ten == null || Ten.isEmpty()) {
            this.Ten = "Khong biet";
        }else {
            this.Ten= Ten;
        }
        

    }
    public String getTuoi() {
        if(Integer.valueOf(Tuoi) != -1) {
            return Tuoi;
        }else {
            return "Tuoi khong hop le";
        }
    }
    public void setTuoi(int Tuoi){
        if (Tuoi>18) {
            this.Tuoi = String.valueOf(Tuoi);
            
        } else {
            this.Tuoi = String.valueOf(-1);
        }


    }
}
