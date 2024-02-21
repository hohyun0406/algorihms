package memberOOP;

public class MemberMain {
    private String id;
    private String pw;
    private String pwCheck;
    private String name;
    private String jmNumber;
    private String callNumber;
    private String address;
    private String job;

    public MemberMain(String id, String pw, String pwCheck, String name, String jmNumber, String callNumber, String address, String job) {
        this.id = id;
        this.pw = pw;
        this.pwCheck = pwCheck;
        this.name = name;
        this.jmNumber = jmNumber;
        this.callNumber = callNumber;
        this.address = address;
        this.job = job;
    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getId() {
//        return this.id;
//    }
//
//    public void setPw(String pw) {
//        this.pw = pw;
//    }
//
//    public String getPw() {
//        return this.pw;
//    }
//
//    public void setPwCheck(String pwCheck) {
//        this.pwCheck = pwCheck;
//    }
//
//    public String getPwCheck() {
//        return this.pwCheck;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return this.name;
//    }
//
//    public void setJmNumber(String jmNumber) {
//        this.jmNumber = jmNumber;
//    }
//
//    public String getJmNumber() {
//        return this.jmNumber;
//    }
//
//    public void setCallNumber(String callNumber) {
//        this.callNumber = callNumber;
//    }
//
//    public String getCallNumber() {
//        return this.callNumber;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public String getAddress() {
//        return this.address;
//    }
//
//    public void setJob(String job) {
//        this.job = job;
//    }
//
//    public String getJob() {
//        return this.job;
//    }
//

    @Override
    public String toString() {
        return "MemberMain{" +
                "id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", pwCheck='" + pwCheck + '\'' +
                ", name='" + name + '\'' +
                ", jmNumber='" + jmNumber + '\'' +
                ", callNumber='" + callNumber + '\'' +
                ", address='" + address + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}