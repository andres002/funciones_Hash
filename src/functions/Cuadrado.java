package hash_functions;

import java.io.*;
import java.util.*;
public class Cuadrado{
	public static void main(String[] args) {

		Scanner x=new Scanner (System.in);
		int opc;
		int cont=0;
		int k,d=0,p;
		char u,v,w,y,z;
		//int [] n={1001, 1005, 1007, 1025, 1030, 1039, 7259, 1049, 1057, 9359};
		int [] n={1001, 1005, 1007, 1025, 1030, 1039, 1049, 1057, 1090, 1095, 1098, 1099, 1100, 1127, 1136, 1145, 1148, 
			1158, 1165, 1191, 1194, 1197, 1200, 1202, 1208, 1227, 1233, 1240, 1254, 1299, 1302, 1325, 1329, 1343, 1352, 
			1360, 1373, 1376, 1382, 1389, 1407, 1415, 1423, 1433, 1443, 1453, 1456, 1461, 1487, 1494, 1501, 1505, 1507, 
			1512, 1513, 1525, 1526, 1532, 1551, 1578, 1581, 1585, 1610, 1615, 1622, 1633, 1635, 1646, 1651, 1684, 1692, 
			1711, 1716, 1717, 1720, 1722, 1726, 1752, 1759, 1791, 1812, 1816, 1843, 1847, 1857, 7259, 1891, 1892, 1893, 
			1894, 1905, 1909, 1911, 1919, 1930, 9359, 1957, 1960, 1969, 1971};
		/* int [] n={1001, 1005, 1007, 1025, 1030, 1039, 1049, 1057, 1090, 1095, 1098, 1099, 1100, 1127, 1136, 1145, 1148, 
			1158, 1165, 1191, 1194, 1197, 1200, 1202, 1208, 1227, 1233, 1240, 1254, 1299, 1302, 1325, 1329, 1343, 1352, 
			1360, 1373, 1376, 1382, 1389, 1407, 1415, 1423, 1433, 1443, 1453, 1456, 1461, 1487, 1494, 1501, 1505, 1507, 
			1512, 1513, 1525, 1526, 1532, 1551, 1578, 1581, 1585, 1610, 1615, 1622, 1633, 1635, 1646, 1651, 1684, 1692, 
			1711, 1716, 1717, 1720, 1722, 1726, 1752, 1759, 1791, 1812, 1816, 1843, 1847, 1857, 7259, 1891, 1892, 1893, 
			1894, 1905, 1909, 1911, 1919, 1930, 9359, 1957, 1960, 1969, 1971, 1001, 1005, 1007, 1025, 1030, 1039, 1049, 
			1057, 1090, 1095, 1098, 1099, 1100, 1127, 1136, 1145, 1148, 1158, 1165, 1191, 1194, 1197, 1200, 1202, 1208, 
			1227, 1233, 1240, 1254, 1299, 1302, 1325, 1329, 1343, 1352, 
			1360, 1373, 1376, 1382, 1389, 1407, 1415, 1423, 1433, 1443, 1453, 1456, 1461, 1487, 1494, 1501, 1505, 1507, 
			1512, 1513, 1525, 1526, 1532, 1551, 1578, 1581, 1585, 1610, 1615, 1622, 1633, 1635, 1646, 1651, 1684, 1692, 
			1711, 1716, 1717, 1720, 1722, 1726, 1752, 1759, 1791, 1812, 1816, 1843, 1847, 1857, 7259, 1891, 1892, 1893, 
			1894, 1905, 1909, 1911, 1919, 1930, 9359, 1957, 1960, 1969, 1971};*/
		float h;
		System.out.print("\nNumero a buscar: ");
		k=x.nextInt();
	String k1;
				 k=(int) Math.pow(k,2);
				 k1=k+"";
				 System.out.println(k);
				while(k>0){
					k=k/10;
					cont++;
				}
				System.out.println("cont: "+cont);
				if (n.length<100){
					z= k1.charAt(cont/2);
					String sB = String.valueOf(z);
					d= Integer.parseInt(sB); 
					System.out.println("Digito Central: "+d);
				}
				if(n.length>=100 && n.length<1000){ 
					y= k1.charAt((cont/2)-1);
					z= k1.charAt(cont/2);
					String sB = String.valueOf(z);
					String sA = String.valueOf(y);
					String res = sA + sB;   
					d= Integer.parseInt(res); 
					System.out.println("Digito Central: "+d);
				}else{
					if (n.length>=1000 && n.length<10000){
						w= k1.charAt((cont/2)-1);
						z= k1.charAt(cont/2);
						y= k1.charAt((cont/2)+1);
						String sC = String.valueOf(w);
						String sB = String.valueOf(z);
						String sA = String.valueOf(y);
						
						String res = sC + sB + sA;   
						d= Integer.parseInt(res); 
						System.out.println("Digito Central: "+d);
					}
					else{
						if (n.length>=10000 && n.length<100000){
							v= k1.charAt((cont/2)-2);
							w= k1.charAt((cont/2)-1);
							z= k1.charAt(cont/2);
							y= k1.charAt((cont/2)+1);
							String sD = String.valueOf(v);
							String sC = String.valueOf(w);
							String sB = String.valueOf(z);
							String sA = String.valueOf(y);
						
							String res = sD + sC + sB + sA;   
							d= Integer.parseInt(res); 
							System.out.println("Digito Central: "+d);
						}
						else{
							if (n.length>=100000 && n.length<1000000){
								v= k1.charAt((cont/2)-2);
								w= k1.charAt((cont/2)-1);
								z= k1.charAt(cont/2);
								y= k1.charAt((cont/2)+1);
								u= k1.charAt((cont/2)+2);
								String sD = String.valueOf(v);
								String sC = String.valueOf(w);
								String sB = String.valueOf(z);
								String sA = String.valueOf(y);
								String sE = String.valueOf(y);
							
								String res = sD + sC + sB + sA + sE;   
								d= Integer.parseInt(res); 
								System.out.println("Digito Central: "+d);
							}
						}
					}
					
				}
				h=d+1;
				System.out.println(h);
}
}