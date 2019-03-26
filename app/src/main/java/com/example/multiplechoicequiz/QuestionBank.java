package com.example.multiplechoicequiz;

public class QuestionBank {
    private String mQuestionS[]={
            "1.Where was Madam Curie Born?",
    "2.What is the value of 1 radians in approximate degrees?"
    ,"3.Which programming language supports the use of Explicit Dynamic Binding of variable?"
    ,"4.What is the only equivalent of optimisation problem when the constraints and objectives are generic?"
    ,"5.In which language is the compiler architecture of C that translates it into machine code?",
    "6.In subprograms we use pointers as parameters to pass onto the function,in C it will be called by?",
            "7.The concept of extended BNF in the parsing grammar was earliest introduced by?",
    "8.In Merge Sorting we use the concept of ________  as recursion and backtracking.",
    "9.The Greedy Approach Algorithm is based on _________ productives ensures best optimal solution.",
    "10.Which is the most predominant search engine available as open source project?"
    };
    private String mChoices[][]={
            {"Germany","France","Poland","Russia"},
            {"20","40","60","80"},
            {"C","JavaScript","Java","C#"},
            {"Langrange's Multipliers","Dual","Feasible Sets","Gaussian Equivalent"},
            {"Ada","ALGOL","Lex","Yacc."},
            {"Call by Reference","Call by Value","Call by Reference and Value","None of the above"},
            {"Niklaus Wirth","James Gosling","Allen Newel","Beckus Naur"},
            {"Greedy Approach","Divide and Conquer","Knapsack Optimization","Parse Trees"},
            {"Space Optimality","Time Optimality","Profit Maximization","Both 1 and 3"},
            {"GitHub","Google","Facebook","DuckDuckGo"}
    };
    private String mCorrectAnswers[]={
            "Poland",
            "60","JavaScript","Dual","Lex","Call by Reference","Niklaus Wirth","Divide and Conquer","Both 1 and 3","DuckDuckGo"
    };
    //Public Getter methods
    public String getQuestion(int index){
        return mQuestionS[index];
    }
    public String getChoice1(int index){
        return mChoices[index][0];
    }
    public String getChoice2(int index){
        return mChoices[index][1];
    }
    public String getChoice3(int index){
        return mChoices[index][2];
    }
    public String getChoice4(int index){
        return mChoices[index][3];
    }
    public String getCorrectAnswer(int index){
        return mCorrectAnswers[index];
    }
//Here index denotes the specified question index or index = (question number-1)
// Setter Function Code goes here in case of any update in the application
}
