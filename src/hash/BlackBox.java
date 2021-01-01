package hash;

public class BlackBox {
    int varA;
    int varB;

    BlackBox(int varA, int varB){
        this.varA = varA;
        this.varB = varB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BlackBox blackBox = (BlackBox) o;

        if (varA != blackBox.varA) return false;
        if (varB != blackBox.varB) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = varA;
        result = 31 * result + varB;
        return result;
    }


}
