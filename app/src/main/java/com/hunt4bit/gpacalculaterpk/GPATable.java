package com.hunt4bit.gpacalculaterpk;

public class GPATable { // This class is holding the Gpa Calculation Table  for the Universities

   double foundation_GPA(int gradeScore){
        double basegradePointfor50 = 1.50;
        double basegradePointfor60 = 2.00;
        double calculatedGradepoint  = 0.0;
      if (gradeScore >= 50 && gradeScore <=59){ // will iterate and add 0.05 as written in grade table for 50 to 59
          calculatedGradepoint = basegradePointfor50;
          for (int i = 50 ; i < gradeScore ;i++){
              calculatedGradepoint += 0.05;
          }

      }
     else if(gradeScore >= 60 && gradeScore <=100){// will iterate and add 0.08 as written in grade table for 60 to 100
         calculatedGradepoint = basegradePointfor60;
          for (int i = 60 ; i < gradeScore ; i++){
              if(i > 85){
                  break;
              }
              calculatedGradepoint += 0.08;

          }
      }
return  calculatedGradepoint;
    }
    // end of grade table for Foundation University


}
