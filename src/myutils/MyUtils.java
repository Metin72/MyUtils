
package myutils;


public class MyUtils {
    
    public static float ucgenCevre(float a, float b, float c) {
		
		return a+b+c;	
	}
	
	public static float ucgenAlan(float a,float b, float c) {
		float u=(a+b+c)/2;
	        float alan=(float) Math.sqrt(u*(u-a)*(u-b)*(u-c));
		return alan;
	}
	
	public static float cokgenCevre(float k_uzun,float kenar) {
		
		return kenar*k_uzun;
	}
	
	public static float cokgenAlan(float k_uzun,float kenar, float y_cap) {
		
		return ((kenar*k_uzun)*y_cap)/2;
	}
        public static double[] fonkHesapla() {
		
		int[] x=new int[200];
		double[] dizi=new double[200];
		
		for(int i=0;i<x.length;i++) {
			
                        dizi[i]=3*i*i-2*Math.exp(i)+Math.sqrt(i);
                        System.out.println("Sonuc1:"+dizi[i]);
		  
		}
		for(int j=0;j<x.length;j++) {
			
			 dizi[j]=1/(1+Math.exp(j));
			 System.out.println("Sonuc2:"+dizi[j]);
		}
		
		return dizi;
 	}
    public static void main(String[] args) {
        
             float alan_U= MyUtils.ucgenAlan(5, 7, 9);
	     float cevre_U= MyUtils.ucgenCevre(5, 7, 9);
	     
	     float alan_C=MyUtils.cokgenAlan(4, 5, 3);
	     float cevre_C=MyUtils.cokgenCevre(4, 5);
	  
	     
	     System.out.println("Üçgenin Çevresi= "+cevre_U);
	     System.out.println("Üçgenin Alanı= "+alan_U);
	     
	     System.out.println("Çokgenin Çevresi= "+cevre_C);
	     System.out.println("Çokgenin Alanı= "+alan_C);
	     
	     MyUtils.fonkHesapla();
	 	
	     
    }
    
}
