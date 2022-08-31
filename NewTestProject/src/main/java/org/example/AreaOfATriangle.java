package org.example;

public class AreaOfATriangle {


    public static void main(String[] args) throws MySideOfTriangleException, MyFigureNotTriangleException {

        System.out.println(countTriangleArea(3,7,5));
       // System.out.println(Math.round((countTriangleArea(3,5,7))));
      //  System.out.format("%.2f", countTriangleArea(3,5,7));
      //  System.out.println();
      //  double X = Math.round(countTriangleArea(3,5,7)*100.0)/100.0;
      //  System.out.println(X);

    }
        static double countTriangleArea ( int sideA, int sideB, int sideC) throws
        MySideOfTriangleException, MyFigureNotTriangleException {
            if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
                throw new MySideOfTriangleException("Используются некорректные значения. Каждое значение должно быть больше 0!!! sideA = " + sideA
                        + "; sideB = " + sideB + "; sideC = " + sideC);
            }
            float P = (sideA + sideB + sideC);
            int maxFrom2Side = Math.max(sideA, sideB);
            int maxFrom3Side = Math.max(maxFrom2Side, sideC);
            if (maxFrom3Side > (P - maxFrom3Side)) {
                throw new MyFigureNotTriangleException("Данная фигура не является треугольником!!!");
            }
            double p = P / 2;
            double s =  Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
            double S = Math.round(s*100.0)/100.0;
            return S;


        }
    }

