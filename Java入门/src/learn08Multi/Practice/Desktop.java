package learn08Multi.Practice;

public class Desktop {

    public void powerOn(){
        System.out.println("笔记本开机");
    }

    public void powerOff(){
        System.out.println("笔记本关机");
    }
    public void UseDevice(Usb usb){
        usb.open();  //打开设备
        if(usb instanceof Mouse){
           ((Mouse) usb).click();
        }
       else if(usb instanceof Keyboard){
            ((Keyboard) usb).type();
        }
        usb.close();   //关闭设备
    }
}
