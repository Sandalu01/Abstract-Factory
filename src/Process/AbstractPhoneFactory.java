package Process;

import Enums.osType;

public abstract class AbstractPhoneFactory {
    public static Object OsFactory(osType type){
        switch (type){
            case IOS:
                return new IosFactory();
            case ANDROID:
                return new AndroidFactory();
            default:
                return null;
        }

    }

}
