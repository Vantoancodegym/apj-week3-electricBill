public class ElectricBill {
    private Costumer costumer;
    private int oldIndex;
    private int newIndex;

    public ElectricBill(int oldIndex, int newIndex,String name,int houseNumber,int clientId) {
        this.oldIndex = oldIndex;
        this.newIndex = newIndex;
        this.costumer=new Costumer(name,houseNumber,clientId);
    }
    public ElectricBill(){};

    public int getNewIndex() {
        return newIndex;
    }

    public int getOldIndex() {
        return oldIndex;
    }
    public  int getClentId(){
        return this.costumer.getClientId();
    }
    public int getTaltolMoney(){
        return (newIndex-oldIndex)*750;
    }

    @Override
    public String toString() {
        return "ElectricBill{" +
                "costumer=" + costumer.toString() +
                ", oldIndex=" + oldIndex +
                ", newIndex=" + newIndex +
                '}';
    }
}
