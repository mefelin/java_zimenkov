package lab4_1.Inheritance;

class Matrix {
    private double[][] data; // Двумерный массив вещественных чисел
    private int rows;        // Количество строк
    private int cols;        // Количество столбцов

    // Конструктор для создания матрицы с указанным количеством строк и столбцов
    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = new double[rows][cols];
    }

    // Метод для сложения с другой матрицей
    public Matrix add(Matrix other) {
        if (this.rows != other.rows || this.cols != other.cols) {
            throw new IllegalArgumentException("Матрицы должны иметь одинаковые размеры для сложения.");
        }

        Matrix result = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.data[i][j] = this.data[i][j] + other.data[i][j];
            }
        }
        return result;
    }

    // Метод для умножения на число
    public Matrix multiply(double scalar) {
        Matrix result = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.data[i][j] = this.data[i][j] * scalar;
            }
        }
        return result;
    }

    // Метод для умножения матриц
    public Matrix multiply(Matrix other) {
        if (this.cols != other.rows) {
            throw new IllegalArgumentException("Количество столбцов первой матрицы должно быть равно количеству строк второй матрицы.");
        }

        Matrix result = new Matrix(this.rows, other.cols);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < other.cols; j++) {
                double sum = 0;
                for (int k = 0; k < this.cols; k++) {
                    sum += this.data[i][k] * other.data[k][j];
                }
                result.data[i][j] = sum;
            }
        }
        return result;
    }

    // Метод для вывода матрицы на печать
    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(2, 2);
        matrix1.data[0][0] = 1;
        matrix1.data[0][1] = 2;
        matrix1.data[1][0] = 3;
        matrix1.data[1][1] = 4;

        Matrix matrix2 = new Matrix(2, 2);
        matrix2.data[0][0] = 5;
        matrix2.data[0][1] = 6;
        matrix2.data[1][0] = 7;
        matrix2.data[1][1] = 8;

        // Пример использования методов
        System.out.println("Матрица 1:");
        matrix1.print();

        System.out.println("Матрица 2:");
        matrix2.print();

        Matrix sumMatrix = matrix1.add(matrix2);
        System.out.println("Сумма матриц:");
        sumMatrix.print();

        Matrix scalarMatrix = matrix1.multiply(2.0);
        System.out.println("Умножение матрицы на число 2:");
        scalarMatrix.print();

        Matrix productMatrix = matrix1.multiply(matrix2);
        System.out.println("Умножение матриц:");
        productMatrix.print();
    }
}
