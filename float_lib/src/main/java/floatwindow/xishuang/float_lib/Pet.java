package floatwindow.xishuang.float_lib;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Pet {
   private static String petName;
   private static ArrayList<String> petMotion;
   private static Map<String,String> petPath;
   private static String petToPath;
   Pet(String petName,ArrayList<String> petMotion,Map<String,String> petPath){
       this.petName=petName;
       this.petMotion=petMotion;
       this.petPath=petPath;
   }

    public static void setPetName(String petName) {
        Pet.petName = petName;
    }

    public static String getPetName() {
        return petName;
    }

    public static void setPetMotion(ArrayList<String> petMotion) {
        Pet.petMotion = petMotion;
    }

    public static List<String> getPetMotion() {
        return petMotion;
    }

    public static void setPetPath(Map<String, String> petPath) {
        Pet.petPath = petPath;
    }

    public static Map<String,String> getPetPath(){return petPath;}

    public static String getPetMotionPath(String petMotionStr) {
       petToPath=petPath.get(petMotionStr);
       return petToPath;
    }

}
