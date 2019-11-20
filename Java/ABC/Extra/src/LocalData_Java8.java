import java.time.LocalDate;

public class LocalData_Java8 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();              // Here we create a object of Localdate class type reference and get current date.

        LocalDate ldd = LocalDate.of(2019,11,19); // Here we get paticular define date

        System.out.println(ld.getDayOfWeek());       // Here we get day name in particular date(String)
        System.out.println(ld.getDayOfMonth());      //Here we get date(int)
        System.out.println(ld.getDayOfYear()+" \n"); // Here we get number of date in 365 day(int)


        System.out.println(ld.getMonth());           //Here we get month name(String)
        System.out.println(ld.getYear());            //Here we get year(int)
        System.out.println(ld.getMonthValue());      //Here we get month(int)
        System.out.println(ld.lengthOfMonth());      //Here we get month lengthin day(int)
        System.out.println(ld.lengthOfYear()+" \n"); // Here we get length of year in day(int)


        System.out.println(ld.hashCode());
        System.out.println(ld.isLeapYear());          //Here we get this year is leaf year or not(boolean);
        System.out.println(ld.toEpochDay());
        System.out.println(ld.getClass());
    }
}
