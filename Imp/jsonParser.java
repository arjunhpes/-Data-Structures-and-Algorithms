//package Imp;
//
//public class jsonParser {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//	public static int maxDept(String s) {
//		
//		int currentCount = 0;
//		int max = 0;
//		int n = s.length();
//		
//		for(int i = 0; i < n; i++) {
//			if (s[i] == '('  || s[i] == '{' || s[i] == '[') {
//				currentCount++;
//				if ( currentCount > max) {
//					max = currentCount;
//				}
//			}
//			else if (s[i] == ')'  || s[i] == '}' || s[i] == ']') {
//				if (currentCount>0) {
//					currentCount--;
//				}
//				else {
//					return -1;
//				}
//			}
//		}
//		
//	}
//}
