public class Salesperson implements Comparable {
    private String firstName, lastName;
    private int totalSales;

    public Salesperson(String first, String last, int sales) {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    public String toString() {
        return lastName + ", " + firstName + ":\t" + totalSales;
    }
 
    public boolean equals(Object other) {
        return (lastName.equals(((Salesperson) other).getLastName()) &&
                firstName.equals(((Salesperson) other).getFirstName()));
    }
 
    public int compareTo(Object other) {
        Salesperson s = (Salesperson) other;

        if (this.totalSales != s.totalSales) {
            return this.totalSales - s.totalSales;
        }
 
        int lastCmp = this.lastName.compareTo(s.lastName);
        if (lastCmp != 0) {
            return lastCmp;
        }
 
        return this.firstName.compareTo(s.firstName);
    }
 
    public String getFirstName() {
        return firstName;
    }
 
    public String getLastName() {
        return lastName;
    }
 
    public int getSales() {
        return totalSales;
    }
}