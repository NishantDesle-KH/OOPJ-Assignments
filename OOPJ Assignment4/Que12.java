class Que12{

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Please read - Do not disturb");
		//delete method of StringBuilder
		
		
        sb.delete(11, sb.length());
		
        System.out.println(sb.toString());
    }
}