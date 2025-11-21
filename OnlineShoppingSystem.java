class OutOfStockException extends Exception{
    public OutOfStockException(String message){
        super(message);
    }
}

class OnlineShoppingSystem {
    public static void checkStock(int quantity) throws OutOfStockException{
        int stock = 100;
        if (quantity > stock){
            throw new OutOfStockException("Out of Stock!, No products left in stock.");
        }
        else{
            stock = stock-quantity;
            System.out.println("Product is ready to deliver. " + "Only "+ stock + " are available now.");
        }
    }
    public static void main(String[] args){
        try {
            checkStock(90);
            checkStock(105);
        }
        catch(OutOfStockException e){
            System.out.println(e.getMessage());
        }
    }
}