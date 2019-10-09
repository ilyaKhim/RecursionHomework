class RecursionDegrees {

        static double calculate(double number, int degree){
            if(degree<0){
                return roundAvoid(1/number * (calculate(number, degree+1)),Math.abs(degree));
            }
            if(degree == 0) return 1;
            if(degree == 1){
                return number;
            }
            return number * (calculate(number, degree-1));
        }

        private static double roundAvoid(double value, int places) {
            double scale = Math.pow(10, places);
            return Math.round(value * scale) / scale;
        }
    }
