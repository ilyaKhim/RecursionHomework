class RecursionDegrees {

        static double calculate(double number, int degree){
            if(degree<0){
                return RoundAvoid(1/number * (calculate(number, degree+1)),Math.abs(degree));
            }
            if(degree == 0) return 1;
            if(degree == 1){
                return number;
            }
            return number * (calculate(number, degree-1));
        }

        private static long RoundAvoid(double value, int places) {
            double scale = Math.pow(10, places);
            return (long) (Math.round(value * scale) / scale);

        }
    }
