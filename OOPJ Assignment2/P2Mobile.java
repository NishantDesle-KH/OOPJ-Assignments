 class P2Mobile {
    private String model;
    private static int totalMobiles = 0;
    
    public P2Mobile(String model) {
        this.model = model;
        totalMobiles++;
    }
    
    public String getModel() {
        return model;
    }
    
    public static void showTotalMobiles() {
        System.out.println("Total mobiles in stock: " + totalMobiles);
    }
    
    public static void main(String[] args) {
        P2Mobile mobile1 = new P2Mobile("Samsung Galaxy M32");
        P2Mobile mobile2 = new P2Mobile("Redmi Note 12");
        
        System.out.println("Mobile1 model: " + mobile1.getModel());
        System.out.println("Mobile2 model: " + mobile2.getModel());
        
        P2Mobile.showTotalMobiles();
    }
}