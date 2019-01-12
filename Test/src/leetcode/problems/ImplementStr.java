package leetcode.problems;

public class ImplementStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementStr validstr = new ImplementStr();
		String haystack = new String("mississippi");
		String needle = new String("pi");
		int index1 = validstr.strStr(haystack, needle);
		System.out.println(index1);

	}
	
	public int strStr(String haystack, String needle){
		char[] haystackChar = haystack.toCharArray();
		char[] needleChar = needle.toCharArray();
		int startChar = 0;
		System.out.println(haystackChar.length);
		System.out.println(needleChar.length);
		
		for(int i=0; i < haystackChar.length-needleChar.length+1; i++ ){
			startChar = i;
			for(int j=0; j < needleChar.length; j++ ){
				if(haystackChar[startChar] == needleChar[j]){
					startChar++;
				}else{
					j=needleChar.length+1;
				}
				if (j==needleChar.length-1){
					return i;
				}
			}
		}
		if(needleChar.length == 0 || haystack.equals(needle)){
			return 0;
		}
		return -1;
	}

}
