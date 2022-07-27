package Basic.string;

public class string_ex {
	public static void main(String[] args) {
		String[] strs =new String[2];// <-- strs={null,null};
		
		int idx=0;
		for(String s: strs) {
			strs[idx].concat("element"+idx);  //<-- null不可 concat 串接，但空字串可以 <-- java.lang.NullPointerException
			idx++;
		}
		for(idx=0;idx<strs.length;idx++) {
			System.out.println(strs[idx]);
		}
		
		//-------------------------------------------//
		int idx2=0;
		StringBuilder[] strs2 =new StringBuilder[2];
		for(StringBuilder s: strs2) {
				strs2[idx2].append("element"+idx);  //<-- null不可 append 串接，但空字串可以 <-- java.lang.NullPointerException
				idx2++;
			}
		for(idx2=0;idx2<strs2.length;idx2++) {
			System.out.println(strs2[idx2]);
		}
	}
}
