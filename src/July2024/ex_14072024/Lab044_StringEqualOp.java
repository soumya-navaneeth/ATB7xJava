package July2024.ex_14072024;

public class Lab044_StringEqualOp {
    public static void main(String[] args) {
//  Reference Examples in SCP
        String s1 = "Soumya"; // 1 instance ,In SCP
        s1 = "Dhyaan"; // 2 instance ,In SCP
        s1 = "Rao"; // 3 instance ,In SCP
        s1 = "Soumya";
        /* 3 instance ,In SCP -> Still 3 bcoz "Soumya" is already present in SCP
        & s1 is now referred to same */
    }
}
