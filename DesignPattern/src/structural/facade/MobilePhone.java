package structural.facade;

public class MobilePhone {
	private Phone mPhone = new PhoneImpl();
    private Camera mCamera = new CameraImpl();

    public void deil(){
        mPhone.dail();
    }

    public void close(){
        mPhone.hangup();
    }

    public void takePicture(){
        mCamera.takePicture();
    }
}
