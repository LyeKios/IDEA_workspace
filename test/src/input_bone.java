

import java.util.Scanner;

public class input_bone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) { // 1
            String command = scanner.next();
            System.out.println(command);

            if (command.equals("exit")) { // 2
                break; // 3
            } else if (command.equals("create")) {
                // ���������͵��߼�
            } else if (command.equals("list")) {
                // ������ʾ�����б���߼�
            } else if (command.equals("show")) {
                // ������ʾ�������ݵ��߼�
            } else if (command.equals("delete")) {
                // ����ɾ�����͵��߼�
            } else {
                continue; // 4
            }
        }
        scanner.close();
    }
}
