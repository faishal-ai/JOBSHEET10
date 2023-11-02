public class Bioskop09 {
    public static void main(String[] args) {
String[][] penonton = new String[4][2]; 
penonton[0][0] = "Rahma";
penonton[0][1] = "Daniel"; 
penonton[1][0] = "Arda"; 
penonton[1][1] = "Faishal";
penonton[2][0] = "Harist"; 
penonton[2][1] = "Briliant"; 
penonton[3][0] = "Reza";
penonton[3][1] = "Nur";


System.out.printf("%s \t %s \n", penonton[0][0], penonton[0][1]);
System.out.printf("%s \t %s \n", penonton[1][0], penonton[1][1]);
System.out.printf("%s \t %s \n", penonton[2][0], penonton[2][1]);
System.out.printf("%s \t %s \n", penonton[3][0], penonton[3][1]);

System.out.println(penonton.length);

for (String[] barisPenonton : penonton){ System.out.println("Panjang baris : " + barisPenonton.length);
}
for (int i = 0; i < penonton.length; i++){ System.out.println("Penonton pada baris ke-" + (i+1) + ": "+ String.join(", ", penonton[i]));
}
}
}




// public static void main(String[] args) { String[][] 
// penonton = new String[4][2]; 
// penonton[0][0] = "Rahma";
// penonton[0][1] = "Daniel"; 
// penonton[1][0] = "Arda"; 
// penonton[1][1] = "Faishal";
// penonton[2][0] = "Harist"; 
// penonton[2][1] = "Briliant"; 
// penonton[3][0] = "Reza";

// System.out.printf("%s \t %s \n", penonton[0][0], penonton[0][1]);
// System.out.printf("%s \t %s \n", penonton[1][0], penonton[1][1]);
// System.out.printf("%s \t %s \n", penonton[2][0], penonton[2][1]);
// System.out.printf("%s \t %s \n", penonton[3][0], penonton[3][1]);
// }
// }