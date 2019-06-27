package thisisjava.chap11.Object;

import java.util.Objects;

public class Member {
    public String id;

    public Member(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Member member = (Member) o;
        return Objects.equals(id, member.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    //    @Override
//    public boolean equals(Object obj) {
//        if (obj instanceof Member) {
//            Member member = (Member) obj;
//            if (id.equals(member.id)) {
//                return true;
//            }
//        }
//        return false;
//    }
}
