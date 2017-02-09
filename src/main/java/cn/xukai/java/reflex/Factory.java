package cn.xukai.java.reflex;

/**
 * Created by xukai on 2017/1/20.
 */
public class Factory {
    public static Fruit getInstance(String className){
        Fruit f = null;
        try{
            f = (Fruit) Class.forName(className).newInstance() ;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return f ;
    }
}
