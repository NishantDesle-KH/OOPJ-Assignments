 class P1TeaCup {
    public String teaType;
    public static int totalCups = 0;
    
    public P1TeaCup(String teaType) {
        this.teaType = teaType;
        totalCups++;
    }
    
    public String getTeaType() {
        return teaType;
    }
    
    public static void showTotalCups() {
        System.out.println("Total cups made: " + totalCups);
    }
    
    public static void main(String[] args) {
        P1TeaCup cup1 = new P1TeaCup("Masala Tea");
		P1TeaCup cup2 = new P1TeaCup("Green Tea");
        P1TeaCup cup3 = new P1TeaCup("Ginger Tea");
        
        System.out.println("Cup1 type: " + cup1.getTeaType());
        System.out.println("Cup2 type: " + cup2.getTeaType());
        System.out.println("Cup3 type: " + cup3.getTeaType());
        
        P1TeaCup.showTotalCups();
    }
}