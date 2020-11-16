public class empwage2 {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    private final String company;
    private final int emprateperhour;
    private final int numofworkingdays;
    private final int maxhourspermonth;
    private int totalempwage;

    public empwage2(String company,int emprateperhour,int numofworkingdays,int maxhourpermonth) {
        this.company=company;
        this.emprateperhour=emprateperhour;
        this.numofworkingdays=numofworkingdays;
        this.maxhourspermonth=maxhourpermonth;
    }
    public void computeempwage() {
        int emphrs = 0;
        int totalemphrs = 0;
        int totalworkingdays = 0;
        while(totalemphrs<=maxhourspermonth && totalworkingdays<numofworkingdays) {
            totalworkingdays++;
            int empcheck = (int) Math.floor(Math.random()*10)%3;
            switch(empcheck) {
                case IS_PART_TIME:
                    emphrs = 4;
                    break;
                case IS_FULL_TIME:
                    emphrs = 8;
                    break;
                default:
                    emphrs = 0;
            }
            totalemphrs+=emphrs;
            System.out.println("Day:"+totalworkingdays+"emp hr:"+emphrs);
        }
        totalempwage = totalemphrs * emprateperhour;
    }

    public String toString() {
        return "Total emp wage for company:" + company + " is: " + totalempwage;
    }
    public static void main(String[] args) {
        empwage2 dmart= new empwage2("dmart", 20, 2, 10);
        empwage2 reliance =new empwage2("reliance", 10, 4, 20);
        dmart.computeempwage();
        System.out.println(dmart);
        reliance.computeempwage();
        System.out.println(reliance);
    }

}
