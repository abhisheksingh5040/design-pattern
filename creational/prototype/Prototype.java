package creational.prototype;

public class Prototype implements Cloneable{

    private String ipAddress;
    private String importantData;

    @Override
    public String toString() {
       return this.ipAddress + " : " + this.importantData ;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getImportantData() {
        return importantData;
    }

    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }

    public void generateImportantData(){
        try {
            this.importantData =  "Generating important data!!!!!";
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public Object clone() throws CloneNotSupportedException {
            return super.clone();
    }
}
