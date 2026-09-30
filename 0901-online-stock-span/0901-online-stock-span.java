class StockSpanner {
    ArrayList<Integer> prices;
    public StockSpanner() {
        prices = new ArrayList<>();
    }
    
    public int next(int price) {
        prices.add(price);
        int span = 1;
        for(int i = prices.size() - 2; i >= 0; i--) {
            if(prices.get(i) <= price) {
                span++;
            }
            else {
                break;
            }
        }
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */