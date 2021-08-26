package GroupPracticeMeeting;

public class Pc {
    public static void main(String[] args) {
        System.out.println("this is list 1");
        System.out.println("----------------");
        PcParts pc1 = new PcParts();
        pc1.ram = "3200Mb";
        pc1.processor = "Radeon 3700x";
        pc1.graphics = "RTX 3080";

        pc1.list();

        System.out.println();
        System.out.println("this is list 2");
        System.out.println("----------------");
        PcParts pc2 = new PcParts();
        pc2.ram = "16000";
        pc2.processor = "Radeon 3000x";
        pc2.graphics = "VTY 4200";

        pc2.list();

        System.out.println(pc1.psu.replace(pc1.psu, "850"));
        System.out.println(pc1.ram.indexOf("M"));
        System.out.println(pc1.processor.substring(2, 9));
    }

}
