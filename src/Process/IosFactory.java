package Process;

import Enums.BrandType;
import Process.Product.ApplePhone;

public class IosFactory implements osFactory{
    @Override
    public Phone build(BrandType brand) {
        switch (brand){
            case APPLE:
                return new ApplePhone();
            default:
                return null;
        }

    }
}
