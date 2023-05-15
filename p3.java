//WAP to print first 10 3 digit numbers.



class P3{
	public static void main(String[] args){
		int count=0;
		for(int i=100;i<=999;i++){
			System.out.println(i);
			count++;

			if(count==10)
				break;
		}
	}
}

/*or
 int x=100
 for(int i=1;i<=10;i++){
 sop(x);
 x++;
 }
 */
