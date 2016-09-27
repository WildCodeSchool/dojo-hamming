class Hamming{


	public static int distance(String o1,String o2){
        char[] charArray1 = o1.toCharArray();
        char[] charArray2 = o2.toCharArray();

        // 1- Calcul de la difference des longueurs
        int result = Math.abs(charArray2.length - charArray1.length);

        // 2- Calcul de la valeur minimale des longueurs
        int min = charArray1.length > charArray2.length ? charArray2.length : charArray1.length;

        // 3- Comptage des différences caractère par caractère
    	for (int i = 0;i< min;i++){
    		if(charArray1[i] != charArray2[i]){
    			result++;
    		}
    	}
    	return result;

    }        
}