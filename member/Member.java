
package De2_dai;

import java.io.Serializable;

public class Member implements Serializable{
    private String memberID;
    private String memberName;
    private String address;

    public Member(String memberID, String memberName, String address) {
        this.memberID = memberID;
        this.memberName = memberName;
        this.address = address;
    }

    public Member() {
    }

    public String getMemberID() {
        return memberID;
    }

    public String getMemberName() {
        return memberName;
    }

    public String getAddress() {
        return address;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Member{" + "memberID=" + memberID + ", memberName=" + memberName + ", address=" + address + '}';
    }
    
}
