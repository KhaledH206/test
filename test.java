
public class test {
	public static void main(String[] args){
		search s = new search();
		int[] a = new int[] {10,9,8,7,6,5,4,3,2,1,0};
		//s.sort(a);
		Sort sort = new Sort();
		sort.arrange(a,0,a.length - 1);
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		//System.out.println(s.find(a, 11));
		//System.out.println(s.s(a,11,0, a.length));
		//comment
	}
}

