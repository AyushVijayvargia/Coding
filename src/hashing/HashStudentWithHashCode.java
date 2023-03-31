package hashing;

import java.util.Objects;

public class HashStudentWithHashCode {

    private String name;
    private Long rollNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getRollNo() {
        return rollNo;
    }

    public void setRollNo(Long rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashStudentWithHashCode that = (HashStudentWithHashCode) o;
        return Objects.equals(name, that.name) && Objects.equals(rollNo, that.rollNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rollNo);
    }
}
