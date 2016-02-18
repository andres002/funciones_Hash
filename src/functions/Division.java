package functions;
import hash_functions.Suit;
import static hash_functions.FXMLDocumentController.panel1;
import java.io.*;
import java.util.*;
public class Division{
    Suit suit = new Suit();
	int [] n={1001, 1005, 1007, 1025, 1030, 1039, 1049, 1057, 1090, 1095, 1098, 1099, 1100, 1127, 1136, 1145, 1148, 
			1158, 1165, 1191, 1194, 1197, 1200, 1202, 1208, 1227, 1233, 1240, 1254, 1299, 1302, 1325, 1329, 1343, 1352, 
			1360, 1373, 1376, 1382, 1389, 1407, 1415, 1423, 1433, 1443, 1453, 1456, 1461, 1487, 1494, 1501, 1505, 1507, 
			1512, 1513, 1525, 1526, 1532, 1551, 1578, 1581, 1585, 1610, 1615, 1622, 1633, 1635, 1646, 1651, 1684, 1692, 
			1711, 1716, 1717, 1720, 1722, 1726, 1752, 1759, 1791, 1812, 1816, 1843, 1847, 1857, 7259, 1891, 1892, 1893, 
			1894, 1905, 1909, 1911, 1919, 1930, 9359, 1957, 1960, 1969, 1971};
	int [] k = new int [n.length];

	public static void main(String[] args) {
		Division d= new Division();
		d.calcula();
		d.imprime();	
	}
        public void setArray(int[] n){
            this.n = n;
        }

	public void calcula(){
		int k;
		int h;
		for (int i=0; i<n.length; i++){
				h= (n[i]%n.length) + 1;
				System.out.println("num: "+n[i]+ " id: "+h);
				acomodar(n[i],h);
			}
	}

	public void acomodar(int num,int id){
		suit.acomodar(id,num);
	
	}
        

	public void imprime(){
		int x=0;
		for (int i=0; i<n.length;i++){
			x++;
			System.out.println(x+" num: "+k[i]);
		}
	}
}