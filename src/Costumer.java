public class Costumer {
    private String name;
    private int houseNumber;
    private int clientId;
    public Costumer(){};
    public Costumer(String name, int houseNumber, int clientId) {
        this.name = name;
        this.houseNumber = houseNumber;
        this.clientId = clientId;
    }

    public String getName() {
        return name;
    }

    public int getClientId() {
        return clientId;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return "Costumer{" +
                "name='" + name + '\'' +
                ", houseNumber=" + houseNumber +
                ", clientId=" + clientId +
                '}';
    }
}
