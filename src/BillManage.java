import java.util.Map;
import java.util.TreeMap;

public class BillManage {
    private Map<Integer,ElectricBill> billLists=new TreeMap<>();
    public void addNewBill(ElectricBill electricBill){
        int key=electricBill.getClentId();
        billLists.put(key,electricBill);
    }
    public int getTatolMoneyById(int clientId){
        ElectricBill electricBill=billLists.get(clientId);
        if (electricBill==null)return 0;
        else return electricBill.getTaltolMoney();
    }
    public void displayAll(){
        System.out.println(billLists);
    }
}
