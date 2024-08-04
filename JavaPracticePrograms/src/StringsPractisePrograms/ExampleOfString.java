package StringsPractisePrograms;

public class ExampleOfString {

    public ExampleOfString(){
    }
    public static void main(String[]args){
        String flowerName="SunFlower";
        int number=9;
        System.out.println("returnscharactervalueforparticularIndex");
        System.out.println(flowerName.charAt(2));
        System.out.println("returnsStringlength");
        System.out.println(flowerName.length());
        System.out.println("Checkstheequalityoftheobjectwiththegivenstringobject");
        System.out.println(flowerName.equals("Rose"));
        System.out.println(flowerName.equals(flowerName));
        System.out.println("CheckstheequalityoftheobjectwiththegivenstringobjectwithoutCaseSens itivity");
                System.out.println(flowerName.equalsIgnoreCase("sunflower"));
        System.out.println("CheckiftheStringisemptyornot");
        System.out.println(flowerName.isEmpty());
        System.out.println("returnstrueorfalsebasedonthegivenvalueispresentornot");
        System.out.println(flowerName.contains("S"));
        System.out.println(flowerName.contains("v"));
        System.out.println("takeaparticularportionofastring");
        System.out.println(flowerName.substring(2));
        System.out.println("takeaparticularportionofastringbeginandendIndex");
        System.out.println(flowerName.substring(2,8));
        System.out.println(flowerName.substring(2,8));
        System.out.println("appendsthestringtothegivenstring");
        System.out.println(flowerName.concat("Daisy"));
        System.out.println("replacestheexistingcharwithnewchar");
        System.out.println(flowerName.replace("F","f"));
        System.out.println(flowerName.replace("Sun","Jasmin"));
        System.out.println("findthepositionofthecharacterinthestring");
        System.out.println(flowerName.indexOf("W"));
        System.out.println("findthecharacterspecifiedfromtheindexposition");
        System.out.println(flowerName.indexOf("e",1));
        System.out.println("findsthestringspecifiedintheindexpositionrange");
        System.out.println(flowerName.indexOf("Flo",0));
        System.out.println("Trimwillremovethecharacterspacesbeforeandafter");
        System.out.println(flowerName.trim());
        System.out.println("uppercasetolowercase");
        System.out.println(flowerName.toLowerCase());
        System.out.println("lowercasetouppercase");
        String lowercase="daisy";
        System.out.println(lowercase.toUpperCase());
        System.out.println("Convertthegivendatatypetostring");
        System.out.println(String.valueOf(number));
        System.out.println("Returnsthejoinedstringwithgivendelimiter");
        System.out.println(String.join("/","20","11","1995"));
        System.out.println("Split");
        System.out.println();
        String Splitthis="I,am,writing";
        String[]splitwords=Splitthis.split(",");
        String[]var6=splitwords;
        int var7=splitwords.length;
        for(int var8=0;var8<var7;++var8){
            String words=var6[var8];
            System.out.println(words);
        }
    }
}




