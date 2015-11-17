
public class Example 
{
	public static void isLeap(int [] month,int y)
	{
		if(y % 4 == 0 || (y % 100 == 0)&& y%400 == 0)
		{
			
			month[2] = 29;
		}
		else
			month[2] = 28;
	}
	public static String date(int d,int m,int y,int dayNum)
	{
		int[] month = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		int day = month[m]-d;
		int dd = dayNum - day-1;
		d = 1;
		d--;
		m++;
		loops:
		while(dd > 0)
		{
			isLeap(month,y);
			for(int i = d;i<month[m];i++)
			{
				d++;
				dd--;
				if(dd < 0)
					break loops;
			}
			m++;
			d = 1;
			dd--;
			if(m>12)
			{
				m = 1;
				y++;
			}
		}
		return d+"/"+m+"/"+y;
	}
	public static void main(String[]args)
	{
		
		int d = 17;
		int m = 3;
		int y = 2011;
		//ติดคุก 1300 วัน
		System.out.println(date(d,m,y,1300));
		
		for(int i = 1;i<=1300;i++)
		{
			
			if(date(d,m,y,i).equals("18/8/2012"))
			{
				System.out.println(i*100/1300);
				break;
			}
		}
	}
}
