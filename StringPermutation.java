package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

 class StringPermutation {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			String s = br.readLine();
		char[] c = s.toCharArray();
		Arrays.sort(c);
		HashMap<Character,Integer> m = new HashMap<Character,Integer>();
			for(int i=0;i<s.length();i++) {
				if(m.containsKey(c[i])) {
					m.put(c[i], m.get(c[i])+1);
				}
				
				else
					m.put(c[i],1);
			}
			
			Set s1 = m.entrySet();
			Iterator itr = s1.iterator();
			char[] str = new char[s1.size()];
			int[] count = new int[s1.size()];
			char[] res = new char[s.length()];
			int index=0;
			while(itr.hasNext()) {
				Map.Entry m1 = (Map.Entry) itr.next();
				str[index] = (char)m1.getKey();
				count[index] = (int)m1.getValue();
				index++;

			}
			
			permute(str,count,res,0);

			System.out.println();
		}

	}

	private static void permute(char[] str, int[] count, char[] res, int level) {
		if(level==res.length) {
			printRes(res);
			return;
		}
		for (int i = 0; i < str.length; i++) {
			if (count[i]==0) {
				continue;
			}
			res[level]=str[i];
			count[i]--;
			permute(str,count,res,level+1);
			count[i]++;
		}
		
		
	}

	private static void printRes(char[] res) {
		for(char ch:res) {
			System.out.print(ch);
		}
		System.out.print(" ");
		
		
	}

}
