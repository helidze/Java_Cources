package second_week.phone;

import java.util.ArrayList;

/**
 * Created by George on 24.05.2017.
 */
public class Phone {
    private String model;
    private boolean simCard;
    Contact contact;
    SimCard simCa;
    ArrayList<Contact> arrayList = new ArrayList<>();

    public void refillBalance(Integer money){
        if (simCa.getBalance()<0){
            simCa.setBalance(100);
        }
    }

    public void newContact(String name, Long phone){

        arrayList.add(new Contact(name,phone));
    }

    public void showContacts(){

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i).getFIO());
            System.out.println(arrayList.get(i).getPhoneNumber());
            System.out.println();
        }

    }

    public void call(){
        if (this.simCard){
            System.out.println("Звоним на " + arrayList.get((int) Math.round( Math.random()*arrayList.size())).getPhoneNumber());
        }
        else {
            System.out.println("Sim Card doesn't exist");
        }

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isSimCard() {
        return simCard;
    }

    public boolean setSimCard(boolean simCard) {
        this.simCard = simCard;
        return simCard;
    }
}

