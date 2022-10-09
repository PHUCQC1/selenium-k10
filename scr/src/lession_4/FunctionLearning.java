package lession_4;

import java.security.SecureRandom;

        public class FunctionLearning {
            public static void main(String[] args) {
                int maximumValue = getMaximumValue(2, 1);
                System.out.println(maximumValue);
            }

            private static int getMaximumValue(int first, int second1) {
                int maximumValue =first;
                if(second1>=maximumValue){
                    maximumValue=second1;
                }
                return maximumValue;
            }
        }
