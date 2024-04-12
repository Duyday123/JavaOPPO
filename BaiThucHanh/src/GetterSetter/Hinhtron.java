package GetterSetter;

public class Hinhtron {
    private final float PI = 3.14f;
    private float bankinh;

    public float getbankinh() {
        return bankinh;
    }
    public void setbankinh(float bankinh){
        this.bankinh = bankinh;

    }
    public float tinhChuVi() {
        return  2 * PI * bankinh;

    }
    public float tinhDienTich() {
        return PI * bankinh * bankinh;
    }

}
