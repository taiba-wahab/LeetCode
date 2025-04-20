/*
        If Any rabbit says that there are X people like him 
        this means that total X + 1 are there 
        and also they belong to the same group

        So we will try to figure them out one by one and
        try to maintain sorted order so that the calculation becomes much
        easier.. why sorted ??
        if any rabbit says that there are x identical rabbit like him
        so my resultant would be incremented by x + 1
        and for the next x values they can be a part of the same
        group for eg = [2,2,2,2] this means at maz there are 3 person in 
        same group so rabbit 1 , 2, 3 can be part of same group and
        rabbit 4 is part of some another which adds up to 6 rabbits in total
        */
class Solution {
    public int numRabbits(int[] answers) {
        Arrays.sort(answers);
        int size = answers.length;
        int resultant = 0;
        int groupSize = 0;
        for(int i = 0; i < size; i++) {
            if(answers[i] == 0) {
                resultant++;
            }
            else if(i==0 || groupSize == 0 || answers[i] != answers[i - 1]) {
                resultant += 1 + answers[i];
                groupSize = answers[i];
            }
            else {
                groupSize--;
            }
        }
        return resultant;
    }
}