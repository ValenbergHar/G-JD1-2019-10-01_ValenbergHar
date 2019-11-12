package by.academy.java.maskevich.homework.task4.task41;
public class State {
    City city = new City();
    Region regions = new Region();
    public void square() {
        System.out.println("Belarus, occupies an area of 207,600 square kilometers");
    }
    public void writeCapital() {
        System.out.printf("%s is a capital of the Republic of Belarus", city.getCapital());
    }
//    public void writeRegions() {
//        System.out.println(regions.getRegionList);
//    }
//    public void writeAmountOfDistricts() {
//        System.out.printf("%n - is a number of district", getDistrictList());
//    }
}