public class Set_Get {
    
    static String language;
    static int version;

    public static void set(String lang , int ver){
        language = lang;
        version = ver;
    }

    public static void get(){
        System.out.println("Language: " + language + ", Version: " + version);
    }

    public static void main(String[] args) {
        Set_Get.set("Java", 17);
        Set_Get.get();
    }
}
