class Solution {
    public double average(int[] salary) {
        double max = salary[0];
        double length = salary.length;
        for(int i =1;i<salary.length;i++){
            if(salary[i]>max){
                max = salary[i];
            }
        }
        double min = salary[0];
        for(int i=1;i<salary.length;i++){
            if(salary[i]<min){
                min = salary[i];
            }
        }
        double sum = 0;
        for(int i =0;i<salary.length;i++){
            sum += salary[i];
        }
        sum = sum - max - min;
        return sum/(length-2);
    }
}