import Enums.BrandType;
import Enums.osType;
import Process.AbstractPhoneFactory;
import Process.osFactory;
import Process.Phone;



public class Appnizilizer {
    public static void main(String[] args) {

        // first phone that you want ;
        osFactory osfactory = (osFactory) AbstractPhoneFactory.OsFactory(osType.IOS);
        Phone phone = osfactory.build(BrandType.APPLE);
        phone.print();

        // Second  phone that you want ;
        osFactory osfactory1 = (osFactory) AbstractPhoneFactory.OsFactory(osType.ANDROID);
        Phone phone1 = osfactory1.build(BrandType.GOOGLE);
        phone1.print();


        // which types of os do you want? -Android (check os factory)

        // then which types of brand do you want? -google (check Brand types)

        //
    }
}
