class Solution {
    public boolean areSentencesSimilar(String s1, String s2) {
    //     Set <String> one = new HashSet<>(Arrays.asList(sentence1.toLowerCase().split("\\s+")));
    //     Set <String>  two = new HashSet<>(Arrays.asList(sentence2.toLowerCase().split("\\s+")));
    //     if(one.retainAll(two) || two.retainAll(one)){
    //         return true;
    //     }
    //     return false;
    // }

    //  String str1 = sentence1.toLowerCase();
    // String str2 = sentence2.toLowerCase();
    //     String[] str1words = sentence1.split(" ");
    //     String[] str2words = sentence2.split(" ");
    //     int ctr =0;
    //     for(int i=0;i<str1words.length;i++){
    //         for(int j=0;j<str2words.length;j++){
    //             if(str1words[i]== str2words[j]){
    //                 ctr++;
    //             }
    //         }
    //     }
    //     if(ctr==1 && str1words[0]!=str2words[0] || str1words[str1words.length-1]!=str2words[str2words.length-1]){
    //         return false;
    //     }
    //     return true;
        if (s1.length() < s2.length()) {
            String temp = s1;
            s1 = s2;
            s2 = temp;
        }
        String[] arr1 = s1.split(" ");
        String[] arr2 = s2.split(" ");
        int i1 = 0, i2 = 0, j1 = arr1.length - 1, j2 = arr2.length - 1;
		
        while (i2 <= j2) {
            if (arr1[i1].equals(arr2[i1])) {
                i1++; 
                i2++;
            } else if (arr1[j1].equals(arr2[j2])) {
                j1--;
                j2--;
            } else {
                return false;
            }
        }
        return true;
    
    }
}
