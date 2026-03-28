public class SomaAteZero {
    public static void main(String[] args) {
	int z = 10;
	int sum = 0;
        while (z >= 0) {
	    sum += z;
	    z--;
	}
	System.out.println(sum);
    }
}
