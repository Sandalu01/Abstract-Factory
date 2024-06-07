package Process;

import Enums.BrandType;
import Process.Product.ApplePhone;
import Process.Product.GooglePhone;
import Process.Product.HtcPhone;

public class AndroidFactory implements osFactory{
    @Override
    public Phone build(BrandType brand) {
        switch (brand){
            case HTC:
                return new HtcPhone();
            case GOOGLE:
                return new GooglePhone();
            default:
                return null;

        }
    }
}
