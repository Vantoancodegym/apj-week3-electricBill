import java.util.Scanner;

public class Main {
    public final static BillManage billManage=new BillManage();
    public final static Scanner scanner=new Scanner(System.in);
    public final static Scanner scanner2=new Scanner(System.in);
    public static final int MIN_INDEX = 0;

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("1. add new bill");
            System.out.println("2. get taltol money by clientId");
            System.out.println("3. display all client 's information");
            System.out.println("0. exit");
            choice=scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("enter how many bill you want to add");
                    int amountOfBill=scanner.nextInt();
                    for (int i = 0; i < amountOfBill; i++) {
                        addNewBill();
                    }
                    break;
                case 2:
                    System.out.println("enter client electric id");
                    int clientId=scanner.nextInt();
                    int taltolMoney=billManage.getTatolMoneyById(clientId);
                    System.out.println(taltolMoney);
                    break;
                case 3:
                    billManage.displayAll();
                    break;
                case 0:
                    System.exit(0);
            }

        }while (choice!=0);

    }
    public static void addNewBill(){
        System.out.println("enter client 's name");
        String name=scanner2.nextLine();
        System.out.println("enter client 's house 's number");
        int houseNumber=scanner.nextInt();
        System.out.println("enter client 's electric id");
        int clientId=scanner.nextInt();
        int oldIndex;
        do {
        System.out.println("enter old index");
        oldIndex=scanner.nextInt();
        }while (oldIndex< MIN_INDEX);
        int newIndex;
        do {
            System.out.println("enter new index");
            newIndex=scanner.nextInt();
        }while (newIndex<oldIndex);
        ElectricBill electricBill=new ElectricBill(oldIndex,newIndex,name,houseNumber,clientId);
        billManage.addNewBill(electricBill);
    }
}
