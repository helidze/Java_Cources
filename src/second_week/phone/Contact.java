package second_week.phone;

/**
 * Created by George on 24.05.2017.
 */
public class Contact {
    private String FIO;
    private Long phoneNumber;

    public Contact(String name, Long phone) {
        this.FIO = name;
        this.phoneNumber = phone;
    }


    public String getFIO() {
        return FIO;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }
}

