import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double s = Double.parseDouble(scanner.nextLine());

       double commission;

      if (s < 0) {
          System.out.println("error");
      } else if (!"Sofia".equals(city) && !"Plovdiv".equals(city) && !"Varna".equals(city)) {
          System.out.println("error");

      }
      switch (city) {
          case "Sofia":
        if (s >= 0 && s <= 500) {
              commission = s * 0.05;
            System.out.printf("%.2f", commission);
          } else if (s > 500 && s <= 1000) {
              commission = s * 0.07;
            System.out.printf("%.2f", commission);
          } else if (s > 1000 && s <= 10000) {
              commission = s * 0.80;
            System.out.printf("%.2f", commission);
          } else if (s > 10000) {
            commission = s * 0.12;
            System.out.printf("%.2f", commission);
        }break;

          case "Varna":
              if (s >= 0 && s <= 500) {
                  commission = s * 0.045;
                  System.out.printf("%.2f", commission);
              } else if (s > 500 && s <= 1000) {
                  commission = s * 0.075;
                  System.out.printf("%.2f", commission);
              } else if (s > 1000 && s <= 10000) {
                  commission = s * 0.10;
                  System.out.printf("%.2f", commission);
              } else if (s > 10000) {
                  commission = s * 0.13;
                  System.out.printf("%.2f", commission);

              }break;
          case "Plovdiv":
              if (s >= 0 && s <= 500) {
                  commission = s * 0.055;
                  System.out.printf("%.2f", commission);
              } else if (s > 500 && s <= 1000) {
                  commission = s * 0.08;
                  System.out.printf("%.2f", commission);
              } else if (s > 1000 && s <= 10000) {
                  commission = s * 0.12;
                  System.out.printf("%.2f", commission);
              } else if (s > 10000) {
                  commission = s * 0.145;
                  System.out.printf("%.2f", commission);

                  }break;

                  }

              }
          }




