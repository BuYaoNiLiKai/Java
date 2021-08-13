package learn05Extends;

public class Phone {
    public static void main(String[] args) {
        System.out.println("OldPhone");
        OldPhone oldPhone=new OldPhone();
        oldPhone.Call();
        oldPhone.SendMessage();
        oldPhone.Show();
        System.out.println("==========");
        System.out.println("NewPhone");
        NewPhone newPhone=new NewPhone();
        newPhone.Call();
        newPhone.SendMessage();
        newPhone.Show();
    }
}
