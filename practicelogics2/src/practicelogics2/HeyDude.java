package practicelogics2;
class HeyDude {
	 public static String number_maker = "";
    public static void main(String[] args) {
    	

        String input = "apple1234A";
        StringBuilder output_string = new StringBuilder("");

        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                number_maker = number_maker + input.charAt(i);
                int j = i + 1;
                while (j < input.length() && Character.isDigit(input.charAt(j)) ) {
                    number_maker = number_maker + input.charAt(j);
                    j++;
                }
                i = j-1;
                StringBuilder to_be_rev_string = new StringBuilder(number_maker);
                to_be_rev_string.reverse();
                output_string.append(to_be_rev_string) ;
                number_maker = "";
            }else{
                output_string.append(input.charAt(i)) ;
            }
        }
        System.out.println(output_string);
    }
}