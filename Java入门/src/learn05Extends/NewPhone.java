package learn05Extends;

public class NewPhone  extends  OldPhone{

    @Override
    public void Show() {
        super.Show();
        System.out.println("显示姓名");
        System.out.println("显示头像");
    }
}
