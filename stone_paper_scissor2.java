public class shuffler {
    public String shuffle() {
        double value = Math.random()*3;
        int final_val = (int)value + 1;
        //System.out.println(final_val);

        String cp_answer = " ";

        if ( final_val == 1)
        cp_answer = "stone";
        if (final_val == 2)
        cp_answer = "Scissor";
        if(final_val == 3)
        cp_answer = "paper";

        return cp_answer;




    }
}
